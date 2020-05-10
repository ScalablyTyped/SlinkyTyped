package typingsSlinky.awsSdk.pinpointsmsvoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateConfigurationSetRequest extends js.Object {
  /**
    * The name that you want to give the configuration set.
    */
  var ConfigurationSetName: js.UndefOr[WordCharactersWithDelimiters] = js.native
}

object CreateConfigurationSetRequest {
  @scala.inline
  def apply(): CreateConfigurationSetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateConfigurationSetRequest]
  }
  @scala.inline
  implicit class CreateConfigurationSetRequestOps[Self <: CreateConfigurationSetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigurationSetName(value: WordCharactersWithDelimiters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationSetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationSetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationSetName")(js.undefined)
        ret
    }
  }
  
}

