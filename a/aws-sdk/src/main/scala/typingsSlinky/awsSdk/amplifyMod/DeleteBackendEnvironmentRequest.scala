package typingsSlinky.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBackendEnvironmentRequest extends js.Object {
  /**
    *  Unique Id of an Amplify App. 
    */
  var appId: AppId = js.native
  /**
    *  Name of a backend environment of an Amplify App. 
    */
  var environmentName: EnvironmentName = js.native
}

object DeleteBackendEnvironmentRequest {
  @scala.inline
  def apply(appId: AppId, environmentName: EnvironmentName): DeleteBackendEnvironmentRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], environmentName = environmentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBackendEnvironmentRequest]
  }
  @scala.inline
  implicit class DeleteBackendEnvironmentRequestOps[Self <: DeleteBackendEnvironmentRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppId(value: AppId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironmentName(value: EnvironmentName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

