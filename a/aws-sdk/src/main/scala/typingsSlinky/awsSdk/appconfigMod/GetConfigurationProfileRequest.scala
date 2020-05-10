package typingsSlinky.awsSdk.appconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConfigurationProfileRequest extends js.Object {
  /**
    * The ID of the application that includes the configuration profile you want to get.
    */
  var ApplicationId: Id = js.native
  /**
    * The ID of the configuration profile you want to get.
    */
  var ConfigurationProfileId: Id = js.native
}

object GetConfigurationProfileRequest {
  @scala.inline
  def apply(ApplicationId: Id, ConfigurationProfileId: Id): GetConfigurationProfileRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], ConfigurationProfileId = ConfigurationProfileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConfigurationProfileRequest]
  }
  @scala.inline
  implicit class GetConfigurationProfileRequestOps[Self <: GetConfigurationProfileRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigurationProfileId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationProfileId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

