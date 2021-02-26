package typingsSlinky.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VertexModeEnumValues extends EmbindEnum {
  
  var TriangleFan: VertexMode = js.native
  
  var Triangles: VertexMode = js.native
  
  var TrianglesStrip: VertexMode = js.native
}
object VertexModeEnumValues {
  
  @scala.inline
  def apply(
    TriangleFan: VertexMode,
    Triangles: VertexMode,
    TrianglesStrip: VertexMode,
    values: js.Array[Double]
  ): VertexModeEnumValues = {
    val __obj = js.Dynamic.literal(TriangleFan = TriangleFan.asInstanceOf[js.Any], Triangles = Triangles.asInstanceOf[js.Any], TrianglesStrip = TrianglesStrip.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[VertexModeEnumValues]
  }
  
  @scala.inline
  implicit class VertexModeEnumValuesMutableBuilder[Self <: VertexModeEnumValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTriangleFan(value: VertexMode): Self = StObject.set(x, "TriangleFan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriangles(value: VertexMode): Self = StObject.set(x, "Triangles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrianglesStrip(value: VertexMode): Self = StObject.set(x, "TrianglesStrip", value.asInstanceOf[js.Any])
  }
}
