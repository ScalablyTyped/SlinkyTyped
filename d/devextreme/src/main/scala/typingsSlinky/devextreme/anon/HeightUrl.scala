package typingsSlinky.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeightUrl extends StObject {
  
  var height: js.UndefOr[Double | RangeMaxPoint] = js.native
  
  var url: js.UndefOr[String | RangeMinPoint] = js.native
  
  var width: js.UndefOr[Double | RangeMaxPoint] = js.native
}
object HeightUrl {
  
  @scala.inline
  def apply(): HeightUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeightUrl]
  }
  
  @scala.inline
  implicit class HeightUrlMutableBuilder[Self <: HeightUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double | RangeMaxPoint): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setUrl(value: String | RangeMinPoint): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | RangeMaxPoint): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
