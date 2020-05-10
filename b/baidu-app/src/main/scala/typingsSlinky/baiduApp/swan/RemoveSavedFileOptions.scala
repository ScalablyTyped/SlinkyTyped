package typingsSlinky.baiduApp.swan

import typingsSlinky.baiduApp.AnonFilePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveSavedFileOptions
  extends BaseOptions[js.Any, js.Any] {
  var filePath: String = js.native
  /** 接口调用成功的回调函数 */
  @JSName("success")
  var success_RemoveSavedFileOptions: js.UndefOr[js.Function1[/* res */ AnonFilePath, Unit]] = js.native
}

object RemoveSavedFileOptions {
  @scala.inline
  def apply(filePath: String): RemoveSavedFileOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveSavedFileOptions]
  }
  @scala.inline
  implicit class RemoveSavedFileOptionsOps[Self <: RemoveSavedFileOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: /* res */ AnonFilePath => Unit): Self = {
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

