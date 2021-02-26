package typingsSlinky.mapsjs.mod

import typingsSlinky.mapsjs.mod.geometry.polygon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait beginDigitizeOptions extends StObject {
  
  var circleEndAction: js.UndefOr[js.Function1[/* circle */ polygon, Unit]] = js.native
  
  var envelopeEndAction: js.UndefOr[js.Function1[/* env */ envelope, Unit]] = js.native
  
  var geometryStyle: js.UndefOr[typingsSlinky.mapsjs.mod.geometryStyle] = js.native
  
  var key: js.UndefOr[String] = js.native
  
  var leavePath: js.UndefOr[Boolean] = js.native
  
  var nodeMoveAction: js.UndefOr[js.Function3[/* x */ Double, /* y */ Double, /* actionType */ String, _]] = js.native
  
  var nodeTapAndHoldAction: js.UndefOr[js.Function2[/* setIdx */ Double, /* idx */ Double, Boolean]] = js.native
  
  var shapeChangeAction: js.UndefOr[js.Function0[Unit]] = js.native
  
  var shapeType: String = js.native
  
  var styledGeometry: js.UndefOr[typingsSlinky.mapsjs.mod.styledGeometry] = js.native
  
  var suppressNodeAdd: js.UndefOr[Boolean] = js.native
}
object beginDigitizeOptions {
  
  @scala.inline
  def apply(shapeType: String): beginDigitizeOptions = {
    val __obj = js.Dynamic.literal(shapeType = shapeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[beginDigitizeOptions]
  }
  
  @scala.inline
  implicit class beginDigitizeOptionsMutableBuilder[Self <: beginDigitizeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCircleEndAction(value: /* circle */ polygon => Unit): Self = StObject.set(x, "circleEndAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCircleEndActionUndefined: Self = StObject.set(x, "circleEndAction", js.undefined)
    
    @scala.inline
    def setEnvelopeEndAction(value: /* env */ envelope => Unit): Self = StObject.set(x, "envelopeEndAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnvelopeEndActionUndefined: Self = StObject.set(x, "envelopeEndAction", js.undefined)
    
    @scala.inline
    def setGeometryStyle(value: geometryStyle): Self = StObject.set(x, "geometryStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometryStyleUndefined: Self = StObject.set(x, "geometryStyle", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setLeavePath(value: Boolean): Self = StObject.set(x, "leavePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeavePathUndefined: Self = StObject.set(x, "leavePath", js.undefined)
    
    @scala.inline
    def setNodeMoveAction(value: (/* x */ Double, /* y */ Double, /* actionType */ String) => _): Self = StObject.set(x, "nodeMoveAction", js.Any.fromFunction3(value))
    
    @scala.inline
    def setNodeMoveActionUndefined: Self = StObject.set(x, "nodeMoveAction", js.undefined)
    
    @scala.inline
    def setNodeTapAndHoldAction(value: (/* setIdx */ Double, /* idx */ Double) => Boolean): Self = StObject.set(x, "nodeTapAndHoldAction", js.Any.fromFunction2(value))
    
    @scala.inline
    def setNodeTapAndHoldActionUndefined: Self = StObject.set(x, "nodeTapAndHoldAction", js.undefined)
    
    @scala.inline
    def setShapeChangeAction(value: () => Unit): Self = StObject.set(x, "shapeChangeAction", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShapeChangeActionUndefined: Self = StObject.set(x, "shapeChangeAction", js.undefined)
    
    @scala.inline
    def setShapeType(value: String): Self = StObject.set(x, "shapeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyledGeometry(value: styledGeometry): Self = StObject.set(x, "styledGeometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyledGeometryUndefined: Self = StObject.set(x, "styledGeometry", js.undefined)
    
    @scala.inline
    def setSuppressNodeAdd(value: Boolean): Self = StObject.set(x, "suppressNodeAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressNodeAddUndefined: Self = StObject.set(x, "suppressNodeAdd", js.undefined)
  }
}
