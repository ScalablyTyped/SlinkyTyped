package typingsSlinky.baiduApp.swan

import typingsSlinky.baiduApp.baiduAppStrings.doc
import typingsSlinky.baiduApp.baiduAppStrings.docx
import typingsSlinky.baiduApp.baiduAppStrings.pdf
import typingsSlinky.baiduApp.baiduAppStrings.ppt
import typingsSlinky.baiduApp.baiduAppStrings.pptx
import typingsSlinky.baiduApp.baiduAppStrings.xls
import typingsSlinky.baiduApp.baiduAppStrings.xlsx
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class OpenDocumentOptionsMutableBuilder[Self <: OpenDocumentOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileType(value: doc | xls | ppt | pdf | docx | xlsx | pptx): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
  }
}
