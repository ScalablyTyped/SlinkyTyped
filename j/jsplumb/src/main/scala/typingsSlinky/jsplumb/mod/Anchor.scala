package typingsSlinky.jsplumb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Anchor extends StObject {
  
  var cssClass: String = js.native
  
  var elementId: String = js.native
  
  var id: String = js.native
  
  var locked: Boolean = js.native
  
  var offsets: js.Tuple2[Double, Double] = js.native
  
  var orientation: js.Tuple2[AnchorOrientationHint, AnchorOrientationHint] = js.native
  
  var `type`: AnchorId = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object Anchor {
  
  @scala.inline
  def apply(
    cssClass: String,
    elementId: String,
    id: String,
    locked: Boolean,
    offsets: js.Tuple2[Double, Double],
    orientation: js.Tuple2[AnchorOrientationHint, AnchorOrientationHint],
    `type`: AnchorId,
    x: Double,
    y: Double
  ): Anchor = {
    val __obj = js.Dynamic.literal(cssClass = cssClass.asInstanceOf[js.Any], elementId = elementId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], offsets = offsets.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anchor]
  }
  
  @scala.inline
  implicit class AnchorMutableBuilder[Self <: Anchor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementId(value: String): Self = StObject.set(x, "elementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsets(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "offsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: js.Tuple2[AnchorOrientationHint, AnchorOrientationHint]): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: AnchorId): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
