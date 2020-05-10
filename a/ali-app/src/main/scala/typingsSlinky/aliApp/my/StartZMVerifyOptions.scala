package typingsSlinky.aliApp.my

import typingsSlinky.aliApp.AnonPassed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 芝麻认证 https://docs.alipay.com/mini/api/zm-service
@js.native
trait StartZMVerifyOptions
  extends BaseOptions[js.Any, js.Any] {
  var bizNo: String = js.native
  	// 认证标识
  @JSName("success")
  var success_StartZMVerifyOptions: js.UndefOr[js.Function1[/* res */ AnonPassed, Unit]] = js.native
}

object StartZMVerifyOptions {
  @scala.inline
  def apply(bizNo: String): StartZMVerifyOptions = {
    val __obj = js.Dynamic.literal(bizNo = bizNo.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartZMVerifyOptions]
  }
  @scala.inline
  implicit class StartZMVerifyOptionsOps[Self <: StartZMVerifyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBizNo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bizNo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: /* res */ AnonPassed => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
  }
  
}

