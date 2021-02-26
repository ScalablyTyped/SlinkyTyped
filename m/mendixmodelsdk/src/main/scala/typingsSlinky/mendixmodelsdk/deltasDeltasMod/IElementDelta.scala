package typingsSlinky.mendixmodelsdk.deltasDeltasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IElementDelta extends IDelta {
  
  var elementId: String = js.native
}
object IElementDelta {
  
  @scala.inline
  def apply(elementId: String, unitId: String): IElementDelta = {
    val __obj = js.Dynamic.literal(elementId = elementId.asInstanceOf[js.Any], unitId = unitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IElementDelta]
  }
  
  @scala.inline
  implicit class IElementDeltaMutableBuilder[Self <: IElementDelta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElementId(value: String): Self = StObject.set(x, "elementId", value.asInstanceOf[js.Any])
  }
}
