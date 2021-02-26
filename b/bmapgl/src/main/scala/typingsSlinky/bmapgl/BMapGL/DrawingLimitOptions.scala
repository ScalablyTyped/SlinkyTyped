package typingsSlinky.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawingLimitOptions extends StObject {
  
  var area: js.UndefOr[Double] = js.native
  
  var distance: js.UndefOr[Double] = js.native
}
object DrawingLimitOptions {
  
  @scala.inline
  def apply(): DrawingLimitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawingLimitOptions]
  }
  
  @scala.inline
  implicit class DrawingLimitOptionsMutableBuilder[Self <: DrawingLimitOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArea(value: Double): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
  }
}
