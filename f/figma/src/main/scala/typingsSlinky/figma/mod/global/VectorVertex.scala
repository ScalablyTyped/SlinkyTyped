package typingsSlinky.figma.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VectorVertex extends StObject {
  
  val cornerRadius: js.UndefOr[Double] = js.native
  
  val handleMirroring: js.UndefOr[HandleMirroring] = js.native
  
  val strokeCap: js.UndefOr[StrokeCap] = js.native
  
  val strokeJoin: js.UndefOr[StrokeJoin] = js.native
  
  val x: Double = js.native
  
  val y: Double = js.native
}
object VectorVertex {
  
  @scala.inline
  def apply(x: Double, y: Double): VectorVertex = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorVertex]
  }
  
  @scala.inline
  implicit class VectorVertexMutableBuilder[Self <: VectorVertex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
    
    @scala.inline
    def setHandleMirroring(value: HandleMirroring): Self = StObject.set(x, "handleMirroring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandleMirroringUndefined: Self = StObject.set(x, "handleMirroring", js.undefined)
    
    @scala.inline
    def setStrokeCap(value: StrokeCap): Self = StObject.set(x, "strokeCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeCapUndefined: Self = StObject.set(x, "strokeCap", js.undefined)
    
    @scala.inline
    def setStrokeJoin(value: StrokeJoin): Self = StObject.set(x, "strokeJoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeJoinUndefined: Self = StObject.set(x, "strokeJoin", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
