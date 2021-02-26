package typingsSlinky.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BarValue extends StObject {
  
  var marker: js.UndefOr[String | js.Array[String]] = js.native
  
  var x: js.UndefOr[Double] = js.native
  
  var y: js.UndefOr[Double | js.Array[Double]] = js.native
}
object BarValue {
  
  @scala.inline
  def apply(): BarValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarValue]
  }
  
  @scala.inline
  implicit class BarValueMutableBuilder[Self <: BarValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarker(value: String | js.Array[String]): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    @scala.inline
    def setMarkerVarargs(value: String*): Self = StObject.set(x, "marker", js.Array(value :_*))
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double | js.Array[Double]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    @scala.inline
    def setYVarargs(value: Double*): Self = StObject.set(x, "y", js.Array(value :_*))
  }
}
