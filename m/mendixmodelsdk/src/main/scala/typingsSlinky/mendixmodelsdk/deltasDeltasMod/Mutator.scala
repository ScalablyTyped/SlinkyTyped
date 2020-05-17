package typingsSlinky.mendixmodelsdk.deltasDeltasMod

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
  implicit def apply(value: IAddMutator): Mutator = value.asInstanceOf[Mutator]
  @scala.inline
  implicit def apply(value: IChangeMutator): Mutator = value.asInstanceOf[Mutator]
  @scala.inline
  implicit def apply(value: IRemoveMutator): Mutator = value.asInstanceOf[Mutator]
}

