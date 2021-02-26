package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.Matrix4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeometryLength extends StObject {
  
  var geometry: typingsSlinky.cesium.mod.Geometry = js.native
  
  var length: js.UndefOr[Double] = js.native
  
  var modelMatrix: js.UndefOr[Matrix4] = js.native
}
object GeometryLength {
  
  @scala.inline
  def apply(geometry: typingsSlinky.cesium.mod.Geometry): GeometryLength = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryLength]
  }
  
  @scala.inline
  implicit class GeometryLengthMutableBuilder[Self <: GeometryLength] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeometry(value: typingsSlinky.cesium.mod.Geometry): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setModelMatrix(value: Matrix4): Self = StObject.set(x, "modelMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelMatrixUndefined: Self = StObject.set(x, "modelMatrix", js.undefined)
  }
}
