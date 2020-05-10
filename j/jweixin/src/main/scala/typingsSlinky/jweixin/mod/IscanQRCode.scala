package typingsSlinky.jweixin.mod

import typingsSlinky.jweixin.AnonResultStr
import typingsSlinky.jweixin.jweixinNumbers.`0`
import typingsSlinky.jweixin.jweixinNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IscanQRCode extends BaseParams {
  var needResult: `0` | `1` = js.native
   // 默认为0，扫描结果由微信处理，1则直接返回扫描结果，
  var scanType: js.Array[typingsSlinky.jweixin.mod.scanType] = js.native
   // 可以指定扫二维码还是一维码，默认二者都有
  // 当needResult 为 1 时，扫码返回的结果
  @JSName("success")
  def success_MIscanQRCode(res: AnonResultStr): Unit = js.native
}

object IscanQRCode {
  @scala.inline
  def apply(needResult: `0` | `1`, scanType: js.Array[scanType], success: AnonResultStr => Unit): IscanQRCode = {
    val __obj = js.Dynamic.literal(needResult = needResult.asInstanceOf[js.Any], scanType = scanType.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[IscanQRCode]
  }
  @scala.inline
  implicit class IscanQRCodeOps[Self <: IscanQRCode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNeedResult(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScanType(value: js.Array[scanType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: AnonResultStr => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

