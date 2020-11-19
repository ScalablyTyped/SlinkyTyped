package typingsSlinky.firebaseDatabase

import typingsSlinky.firebaseDatabase.immutableTreeMod.ImmutableTree
import typingsSlinky.firebaseDatabase.nodeMod.Node
import typingsSlinky.firebaseDatabase.operationMod.Operation
import typingsSlinky.firebaseDatabase.operationMod.OperationSource
import typingsSlinky.firebaseDatabase.pathMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/database/dist/src/core/operation/Merge", JSImport.Namespace)
@js.native
object mergeMod extends js.Object {
  
  @js.native
  class Merge protected () extends Operation {
    def this(
      /** @inheritDoc */ source: OperationSource,
      /** @inheritDoc */ path: Path,
      /** @inheritDoc */ children: ImmutableTree[Node]
    ) = this()
    
    /** @inheritDoc */ var children: ImmutableTree[Node] = js.native
  }
}
