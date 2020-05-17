package typingsSlinky.jweixin.anon

import typingsSlinky.jweixin.mod.jsApiList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppId extends js.Object {
   // 开启调试模式,调用的所有api的返回值会在客户端alert出来，若要查看传入的参数，可以在pc端打开，参数信息会通过log打出，仅在pc端时才会打印。
  var appId: String = js.native
  var debug: js.UndefOr[Boolean] = js.native
   // 必填，签名，见附录1
  var jsApiList: typingsSlinky.jweixin.mod.jsApiList = js.native
   // 必填，生成签名的时间戳
  var nonceStr: String = js.native
   // 必填，生成签名的随机串
  var signature: String = js.native
   // 必填，公众号的唯一标识
  var timestamp: Double = js.native
}

object AppId {
  @scala.inline
  def apply(appId: String, jsApiList: jsApiList, nonceStr: String, signature: String, timestamp: Double): AppId = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], jsApiList = jsApiList.asInstanceOf[js.Any], nonceStr = nonceStr.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppId]
  }
  @scala.inline
  implicit class AppIdOps[Self <: AppId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJsApiList(value: jsApiList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsApiList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNonceStr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonceStr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignature(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
  }
  
}

