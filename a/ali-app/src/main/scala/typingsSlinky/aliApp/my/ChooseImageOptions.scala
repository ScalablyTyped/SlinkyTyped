package typingsSlinky.aliApp.my

import typingsSlinky.aliApp.AnonApFilePaths
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChooseImageOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 最大可选照片数，默认1张 */
  var count: Double = js.native
  /** 相册选取或者拍照，默认 [‘camera’,‘album’] */
  var sourceType: js.Array[ImageSourceType] = js.native
  /** 成功则返回图片的本地文件路径列表 tempFilePaths */
  @JSName("success")
  def success_MChooseImageOptions(res: AnonApFilePaths): Unit = js.native
}

object ChooseImageOptions {
  @scala.inline
  def apply(count: Double, sourceType: js.Array[ImageSourceType], success: AnonApFilePaths => Unit): ChooseImageOptions = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[ChooseImageOptions]
  }
  @scala.inline
  implicit class ChooseImageOptionsOps[Self <: ChooseImageOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceType(value: js.Array[ImageSourceType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: AnonApFilePaths => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

