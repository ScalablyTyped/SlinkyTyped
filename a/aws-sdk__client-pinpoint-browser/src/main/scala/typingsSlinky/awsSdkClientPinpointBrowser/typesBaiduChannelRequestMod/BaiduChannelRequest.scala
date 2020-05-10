package typingsSlinky.awsSdkClientPinpointBrowser.typesBaiduChannelRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaiduChannelRequest extends js.Object {
  /**
    * Platform credential API key from Baidu.
    */
  var ApiKey: js.UndefOr[String] = js.native
  /**
    * If the channel is enabled for sending messages.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  /**
    * Platform credential Secret key from Baidu.
    */
  var SecretKey: js.UndefOr[String] = js.native
}

object BaiduChannelRequest {
  @scala.inline
  def apply(): BaiduChannelRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaiduChannelRequest]
  }
  @scala.inline
  implicit class BaiduChannelRequestOps[Self <: BaiduChannelRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApiKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApiKey")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
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
    @scala.inline
    def withSecretKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecretKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecretKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecretKey")(js.undefined)
        ret
    }
  }
  
}

