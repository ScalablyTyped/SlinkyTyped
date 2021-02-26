package typingsSlinky.reactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentLength extends StObject {
  
  var contentLength: Double = js.native
  
  var renderedRows: Double = js.native
  
  var totalRows: Double = js.native
  
  var visibleRows: Double = js.native
}
object ContentLength {
  
  @scala.inline
  def apply(contentLength: Double, renderedRows: Double, totalRows: Double, visibleRows: Double): ContentLength = {
    val __obj = js.Dynamic.literal(contentLength = contentLength.asInstanceOf[js.Any], renderedRows = renderedRows.asInstanceOf[js.Any], totalRows = totalRows.asInstanceOf[js.Any], visibleRows = visibleRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentLength]
  }
  
  @scala.inline
  implicit class ContentLengthMutableBuilder[Self <: ContentLength] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentLength(value: Double): Self = StObject.set(x, "contentLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderedRows(value: Double): Self = StObject.set(x, "renderedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalRows(value: Double): Self = StObject.set(x, "totalRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleRows(value: Double): Self = StObject.set(x, "visibleRows", value.asInstanceOf[js.Any])
  }
}
