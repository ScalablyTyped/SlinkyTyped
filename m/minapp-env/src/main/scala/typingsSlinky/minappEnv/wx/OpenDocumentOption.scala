package typingsSlinky.minappEnv.wx

import typingsSlinky.minappEnv.minappEnvStrings.doc
import typingsSlinky.minappEnv.minappEnvStrings.docx
import typingsSlinky.minappEnv.minappEnvStrings.pdf
import typingsSlinky.minappEnv.minappEnvStrings.ppt
import typingsSlinky.minappEnv.minappEnvStrings.pptx
import typingsSlinky.minappEnv.minappEnvStrings.xls
import typingsSlinky.minappEnv.minappEnvStrings.xlsx
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenDocumentOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[OpenDocumentCompleteCallback] = js.native
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[OpenDocumentFailCallback] = js.native
  /** 文件路径，可通过 downloadFile 获得 */
  var filePath: String = js.native
  /** 文件类型，指定文件类型打开文件
    *
    * 可选值：
    * - 'doc': doc 格式;
    * - 'docx': docx 格式;
    * - 'xls': xls 格式;
    * - 'xlsx': xlsx 格式;
    * - 'ppt': ppt 格式;
    * - 'pptx': pptx 格式;
    * - 'pdf': pdf 格式;
    *
    * 最低基础库： `1.4.0` */
  var fileType: js.UndefOr[doc | docx | xls | xlsx | ppt | pptx | pdf] = js.native
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[OpenDocumentSuccessCallback] = js.native
}

object OpenDocumentOption {
  @scala.inline
  def apply(filePath: String): OpenDocumentOption = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenDocumentOption]
  }
  @scala.inline
  implicit class OpenDocumentOptionOps[Self <: OpenDocumentOption] (val x: Self) extends AnyVal {
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
    def withComplete(value: /* res */ GeneralCallbackResult => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.undefined)
        ret
    }
    @scala.inline
    def withFail(value: /* res */ GeneralCallbackResult => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.undefined)
        ret
    }
    @scala.inline
    def withFileType(value: doc | docx | xls | xlsx | ppt | pptx | pdf): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileType")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = {
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

