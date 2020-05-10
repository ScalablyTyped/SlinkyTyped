package typingsSlinky.aliApp.my

import typingsSlinky.aliApp.AnonHeader
import typingsSlinky.aliApp.aliAppStrings.audio
import typingsSlinky.aliApp.aliAppStrings.image
import typingsSlinky.aliApp.aliAppStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadFileOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 文件名，即对应的 key, 开发者在服务器端通过这个 key 可以获取到文件二进制内容 */
  var fileName: String = js.native
  /** 要上传文件资源的本地定位符 */
  var filePath: String = js.native
  /**
  		 * 文件类型
  		 */
  var fileType: image | video | audio = js.native
  /** HTTP 请求中其他额外的 form 数据 */
  var formData: js.UndefOr[js.Any] = js.native
  /** HTTP 请求 Header */
  var header: js.UndefOr[RequestHeader] = js.native
  @JSName("success")
  var success_UploadFileOptions: js.UndefOr[js.Function1[/* res */ AnonHeader, Unit]] = js.native
  /** 开发者服务器地址 */
  var url: String = js.native
}

object UploadFileOptions {
  @scala.inline
  def apply(fileName: String, filePath: String, fileType: image | video | audio, url: String): UploadFileOptions = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], fileType = fileType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadFileOptions]
  }
  @scala.inline
  implicit class UploadFileOptionsOps[Self <: UploadFileOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileType(value: image | video | audio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formData")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: RequestHeader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: /* res */ AnonHeader => Unit): Self = {
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

