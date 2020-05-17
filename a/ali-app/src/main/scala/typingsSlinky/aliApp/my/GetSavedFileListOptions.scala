package typingsSlinky.aliApp.my

import typingsSlinky.aliApp.anon.FileList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSavedFileListOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_GetSavedFileListOptions: js.UndefOr[js.Function1[/* res */ FileList, Unit]] = js.native
}

object GetSavedFileListOptions {
  @scala.inline
  def apply(): GetSavedFileListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSavedFileListOptions]
  }
  @scala.inline
  implicit class GetSavedFileListOptionsOps[Self <: GetSavedFileListOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSuccess(value: /* res */ FileList => Unit): Self = {
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

