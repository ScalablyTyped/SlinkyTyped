package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaiduChannelRequest extends js.Object {
  /**
    * The API key that you received from the Baidu Cloud Push service to communicate with the service.
    */
  var ApiKey: string = js.native
  /**
    * Specifies whether to enable the Baidu channel for the application.
    */
  var Enabled: js.UndefOr[boolean] = js.native
  /**
    * The secret key that you received from the Baidu Cloud Push service to communicate with the service.
    */
  var SecretKey: string = js.native
}

object BaiduChannelRequest {
  @scala.inline
  def apply(ApiKey: string, SecretKey: string): BaiduChannelRequest = {
    val __obj = js.Dynamic.literal(ApiKey = ApiKey.asInstanceOf[js.Any], SecretKey = SecretKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaiduChannelRequest]
  }
  @scala.inline
  implicit class BaiduChannelRequestOps[Self <: BaiduChannelRequest] (val x: Self) extends AnyVal {
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
    def withSecretKey(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecretKey")(value.asInstanceOf[js.Any])
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

