package typingsSlinky.mendixmodelsdk

import typingsSlinky.mendixmodelsdk.abstractModelMod.AbstractModel
import typingsSlinky.mendixmodelsdk.deltasDeltasMod.Delta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deltaReverserMod {
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/deltas/DeltaReverser", "DeltaReverser")
  @js.native
  class DeltaReverser protected () extends StObject {
    def this(model: AbstractModel) = this()
    
    var getUnit: js.Any = js.native
    
    var model: AbstractModel = js.native
    
    def reverse(delta: Delta): Delta = js.native
    
    var reverseAttachElementDelta: js.Any = js.native
    
    var reverseCreateElementTreeDelta: js.Any = js.native
    
    var reverseCreateUnitTreeDelta: js.Any = js.native
    
    var reverseDeleteElementDelta: js.Any = js.native
    
    var reverseDeleteUnitDelta: js.Any = js.native
    
    var reverseDetachElementDelta: js.Any = js.native
    
    var reverseUpdatePropertyValueDelta: js.Any = js.native
  }
}
