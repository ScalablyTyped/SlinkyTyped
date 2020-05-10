package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GCMChannelRequest extends js.Object {
  /**
    * The Web API Key, also referred to as an API_KEY or server key, that you received from Google to communicate with Google services.
    */
  var ApiKey: string = js.native
  /**
    * Specifies whether to enable the GCM channel for the application.
    */
  var Enabled: js.UndefOr[boolean] = js.native
}

object GCMChannelRequest {
  @scala.inline
  def apply(ApiKey: string): GCMChannelRequest = {
    val __obj = js.Dynamic.literal(ApiKey = ApiKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[GCMChannelRequest]
  }
  @scala.inline
  implicit class GCMChannelRequestOps[Self <: GCMChannelRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiKey(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApiKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabled(value: boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(js.undefined)
        ret
    }
  }
  
}

