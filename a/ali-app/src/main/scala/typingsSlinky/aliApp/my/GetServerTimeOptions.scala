package typingsSlinky.aliApp.my

import typingsSlinky.aliApp.anon.Time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 获取服务器时间 https://docs.alipay.com/mini/api/get-server-time
@js.native
trait GetServerTimeOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_GetServerTimeOptions: js.UndefOr[js.Function1[/* res */ Time, Unit]] = js.native
}

object GetServerTimeOptions {
  @scala.inline
  def apply(): GetServerTimeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetServerTimeOptions]
  }
  @scala.inline
  implicit class GetServerTimeOptionsOps[Self <: GetServerTimeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSuccess(value: /* res */ Time => Unit): Self = {
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

