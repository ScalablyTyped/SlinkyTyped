package typingsSlinky.baiduApp.swan

import typingsSlinky.baiduApp.baiduAppStrings.doc
import typingsSlinky.baiduApp.baiduAppStrings.docx
import typingsSlinky.baiduApp.baiduAppStrings.pdf
import typingsSlinky.baiduApp.baiduAppStrings.ppt
import typingsSlinky.baiduApp.baiduAppStrings.pptx
import typingsSlinky.baiduApp.baiduAppStrings.xls
import typingsSlinky.baiduApp.baiduAppStrings.xlsx
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenDocumentOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 文件路径，可通过 downFile 获得
  		 */
  var filePath: String = js.native
  /**
  		 * 文件类型，指定文件类型打开文件，有效值 doc, xls, ppt, pdf, docx, xlsx, pptx
  		 */
  var fileType: js.UndefOr[doc | xls | ppt | pdf | docx | xlsx | pptx] = js.native
}

object OpenDocumentOptions {
  @scala.inline
  def apply(filePath: String): OpenDocumentOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenDocumentOptions]
  }
  @scala.inline
  implicit class OpenDocumentOptionsOps[Self <: OpenDocumentOptions] (val x: Self) extends AnyVal {
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
    def withFileType(value: doc | xls | ppt | pdf | docx | xlsx | pptx): Self = {
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
  }
  
}

