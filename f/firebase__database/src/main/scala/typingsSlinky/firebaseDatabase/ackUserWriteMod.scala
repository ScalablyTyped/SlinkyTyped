package typingsSlinky.firebaseDatabase

import typingsSlinky.firebaseDatabase.immutableTreeMod.ImmutableTree
import typingsSlinky.firebaseDatabase.operationMod.Operation
import typingsSlinky.firebaseDatabase.pathMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/database/dist/src/core/operation/AckUserWrite", JSImport.Namespace)
@js.native
object ackUserWriteMod extends js.Object {
  
  @js.native
  class AckUserWrite protected () extends Operation {
    /**
      *
      * @param {!Path} path
      * @param {!ImmutableTree<!boolean>} affectedTree A tree containing true for each affected path. Affected paths can't overlap.
      * @param {!boolean} revert
      */
    def this(
      /** @inheritDoc */ path: Path,
      /** @inheritDoc */ affectedTree: ImmutableTree[Boolean],
      /** @inheritDoc */ revert: Boolean
    ) = this()
    
    /** @inheritDoc */ var affectedTree: ImmutableTree[Boolean] = js.native
    
    /** @inheritDoc */ var revert: Boolean = js.native
  }
}
