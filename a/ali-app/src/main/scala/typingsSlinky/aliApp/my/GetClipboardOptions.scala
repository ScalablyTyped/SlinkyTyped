package typingsSlinky.aliApp.my

import typingsSlinky.aliApp.anon.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 剪贴板 https://docs.alipay.com/mini/api/clipboard
@js.native
trait GetClipboardOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_GetClipboardOptions: js.UndefOr[js.Function1[/* res */ Text, Unit]] = js.native
}

object GetClipboardOptions {
  @scala.inline
  def apply(): GetClipboardOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetClipboardOptions]
  }
  @scala.inline
  implicit class GetClipboardOptionsOps[Self <: GetClipboardOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSuccess(value: /* res */ Text => Unit): Self = {
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

