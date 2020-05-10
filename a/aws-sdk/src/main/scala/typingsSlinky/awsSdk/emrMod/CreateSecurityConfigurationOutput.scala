package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSecurityConfigurationOutput extends js.Object {
  /**
    * The date and time the security configuration was created.
    */
  var CreationDateTime: js.Date = js.native
  /**
    * The name of the security configuration.
    */
  var Name: XmlString = js.native
}

object CreateSecurityConfigurationOutput {
  @scala.inline
  def apply(CreationDateTime: js.Date, Name: XmlString): CreateSecurityConfigurationOutput = {
    val __obj = js.Dynamic.literal(CreationDateTime = CreationDateTime.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSecurityConfigurationOutput]
  }
  @scala.inline
  implicit class CreateSecurityConfigurationOutputOps[Self <: CreateSecurityConfigurationOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: XmlString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

