package typingsSlinky.awsSdk.pinpointsmsvoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConfigurationSetEventDestinationsRequest extends js.Object {
  /**
    * ConfigurationSetName
    */
  var ConfigurationSetName: _String = js.native
}

object GetConfigurationSetEventDestinationsRequest {
  @scala.inline
  def apply(ConfigurationSetName: _String): GetConfigurationSetEventDestinationsRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConfigurationSetEventDestinationsRequest]
  }
  @scala.inline
  implicit class GetConfigurationSetEventDestinationsRequestOps[Self <: GetConfigurationSetEventDestinationsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigurationSetName(value: _String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationSetName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

