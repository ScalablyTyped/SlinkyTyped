package typingsSlinky.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Line extends StObject {
  
  /** The category of the line. It matches the `category` specified in CreateLineRequest, and can be updated with UpdateLineCategoryRequest. */
  var lineCategory: js.UndefOr[String] = js.native
  
  /** The properties of the line. */
  var lineProperties: js.UndefOr[LineProperties] = js.native
  
  /** The type of the line. */
  var lineType: js.UndefOr[String] = js.native
}
object Line {
  
  @scala.inline
  def apply(): Line = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Line]
  }
  
  @scala.inline
  implicit class LineMutableBuilder[Self <: Line] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLineCategory(value: String): Self = StObject.set(x, "lineCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineCategoryUndefined: Self = StObject.set(x, "lineCategory", js.undefined)
    
    @scala.inline
    def setLineProperties(value: LineProperties): Self = StObject.set(x, "lineProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinePropertiesUndefined: Self = StObject.set(x, "lineProperties", js.undefined)
    
    @scala.inline
    def setLineType(value: String): Self = StObject.set(x, "lineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineTypeUndefined: Self = StObject.set(x, "lineType", js.undefined)
  }
}
