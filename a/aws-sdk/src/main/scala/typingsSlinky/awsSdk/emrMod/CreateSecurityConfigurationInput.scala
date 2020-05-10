package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSecurityConfigurationInput extends js.Object {
  /**
    * The name of the security configuration.
    */
  var Name: XmlString = js.native
  /**
    * The security configuration details in JSON format. For JSON parameters and examples, see Use Security Configurations to Set Up Cluster Security in the Amazon EMR Management Guide.
    */
  var SecurityConfiguration: String = js.native
}

object CreateSecurityConfigurationInput {
  @scala.inline
  def apply(Name: XmlString, SecurityConfiguration: String): CreateSecurityConfigurationInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SecurityConfiguration = SecurityConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSecurityConfigurationInput]
  }
  @scala.inline
  implicit class CreateSecurityConfigurationInputOps[Self <: CreateSecurityConfigurationInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: XmlString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecurityConfiguration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

