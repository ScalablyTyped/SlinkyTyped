package typingsSlinky.fancybox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FancyBoxGetFitPosResults extends StObject {
  
  var height: js.UndefOr[Double] = js.native
  
  var left: js.UndefOr[Double] = js.native
  
  var top: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object FancyBoxGetFitPosResults {
  
  @scala.inline
  def apply(): FancyBoxGetFitPosResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FancyBoxGetFitPosResults]
  }
  
  @scala.inline
  implicit class FancyBoxGetFitPosResultsMutableBuilder[Self <: FancyBoxGetFitPosResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
