package typingsSlinky.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSavedFileInfoOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 文件路径 */
  var apFilePath: String = js.native
  /** 接口调用成功的回调函数 */
  @JSName("success")
  var success_GetSavedFileInfoOptions: js.UndefOr[js.Function1[/* res */ SavedFileInfoData, Unit]] = js.native
}

object GetSavedFileInfoOptions {
  @scala.inline
  def apply(apFilePath: String): GetSavedFileInfoOptions = {
    val __obj = js.Dynamic.literal(apFilePath = apFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSavedFileInfoOptions]
  }
  @scala.inline
  implicit class GetSavedFileInfoOptionsOps[Self <: GetSavedFileInfoOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApFilePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apFilePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: /* res */ SavedFileInfoData => Unit): Self = {
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

