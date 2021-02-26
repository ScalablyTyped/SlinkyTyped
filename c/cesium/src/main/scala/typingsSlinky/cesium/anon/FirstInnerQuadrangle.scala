package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.Quaternion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirstInnerQuadrangle extends StObject {
  
  var firstInnerQuadrangle: js.UndefOr[Quaternion] = js.native
  
  var lastInnerQuadrangle: js.UndefOr[Quaternion] = js.native
  
  var points: js.Array[Quaternion] = js.native
  
  var times: js.Array[Double] = js.native
}
object FirstInnerQuadrangle {
  
  @scala.inline
  def apply(points: js.Array[Quaternion], times: js.Array[Double]): FirstInnerQuadrangle = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any], times = times.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstInnerQuadrangle]
  }
  
  @scala.inline
  implicit class FirstInnerQuadrangleMutableBuilder[Self <: FirstInnerQuadrangle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirstInnerQuadrangle(value: Quaternion): Self = StObject.set(x, "firstInnerQuadrangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstInnerQuadrangleUndefined: Self = StObject.set(x, "firstInnerQuadrangle", js.undefined)
    
    @scala.inline
    def setLastInnerQuadrangle(value: Quaternion): Self = StObject.set(x, "lastInnerQuadrangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastInnerQuadrangleUndefined: Self = StObject.set(x, "lastInnerQuadrangle", js.undefined)
    
    @scala.inline
    def setPoints(value: js.Array[Quaternion]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsVarargs(value: Quaternion*): Self = StObject.set(x, "points", js.Array(value :_*))
    
    @scala.inline
    def setTimes(value: js.Array[Double]): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimesVarargs(value: Double*): Self = StObject.set(x, "times", js.Array(value :_*))
  }
}
