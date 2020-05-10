package typingsSlinky.mendixmodelsdk.deltasDeltasMod

import typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.ADD
import typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.CHANGE
import typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.REMOVE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mendixmodelsdk.deltasDeltasMod.IChangeMutator
  - typingsSlinky.mendixmodelsdk.deltasDeltasMod.IAddMutator
  - typingsSlinky.mendixmodelsdk.deltasDeltasMod.IRemoveMutator
*/
trait Mutator extends js.Object

object Mutator {
  @scala.inline
  def IChangeMutator(mutatorType: CHANGE): Mutator = {
    val __obj = js.Dynamic.literal(mutatorType = mutatorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mutator]
  }
  @scala.inline
  def IAddMutator(mutatorType: ADD, value: PrimitiveValue): Mutator = {
    val __obj = js.Dynamic.literal(mutatorType = mutatorType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mutator]
  }
  @scala.inline
  def IRemoveMutator(mutatorType: REMOVE, removalIndex: Double): Mutator = {
    val __obj = js.Dynamic.literal(mutatorType = mutatorType.asInstanceOf[js.Any], removalIndex = removalIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mutator]
  }
}

