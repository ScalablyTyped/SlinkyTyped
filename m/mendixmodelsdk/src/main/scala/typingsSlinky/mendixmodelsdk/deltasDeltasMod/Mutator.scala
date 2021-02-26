package typingsSlinky.mendixmodelsdk.deltasDeltasMod

import typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.ADD
import typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.CHANGE
import typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.REMOVE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mendixmodelsdk.deltasDeltasMod.IChangeMutator
  - typingsSlinky.mendixmodelsdk.deltasDeltasMod.IAddMutator
  - typingsSlinky.mendixmodelsdk.deltasDeltasMod.IRemoveMutator
*/
trait Mutator extends StObject
object Mutator {
  
  @scala.inline
  def IAddMutator(mutatorType: ADD, value: PrimitiveValue): typingsSlinky.mendixmodelsdk.deltasDeltasMod.IAddMutator = {
    val __obj = js.Dynamic.literal(mutatorType = mutatorType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mendixmodelsdk.deltasDeltasMod.IAddMutator]
  }
  
  @scala.inline
  def IChangeMutator(mutatorType: CHANGE): typingsSlinky.mendixmodelsdk.deltasDeltasMod.IChangeMutator = {
    val __obj = js.Dynamic.literal(mutatorType = mutatorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mendixmodelsdk.deltasDeltasMod.IChangeMutator]
  }
  
  @scala.inline
  def IRemoveMutator(mutatorType: REMOVE, removalIndex: Double): typingsSlinky.mendixmodelsdk.deltasDeltasMod.IRemoveMutator = {
    val __obj = js.Dynamic.literal(mutatorType = mutatorType.asInstanceOf[js.Any], removalIndex = removalIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mendixmodelsdk.deltasDeltasMod.IRemoveMutator]
  }
}
