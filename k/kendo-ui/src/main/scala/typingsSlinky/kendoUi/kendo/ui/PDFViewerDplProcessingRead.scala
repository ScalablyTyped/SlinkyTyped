package typingsSlinky.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDFViewerDplProcessingRead extends StObject {
  
  var dataType: js.UndefOr[String] = js.native
  
  var pageField: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object PDFViewerDplProcessingRead {
  
  @scala.inline
  def apply(): PDFViewerDplProcessingRead = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFViewerDplProcessingRead]
  }
  
  @scala.inline
  implicit class PDFViewerDplProcessingReadMutableBuilder[Self <: PDFViewerDplProcessingRead] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    @scala.inline
    def setPageField(value: String): Self = StObject.set(x, "pageField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageFieldUndefined: Self = StObject.set(x, "pageField", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
