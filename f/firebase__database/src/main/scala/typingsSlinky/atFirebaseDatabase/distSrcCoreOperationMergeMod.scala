package typingsSlinky.atFirebaseDatabase

import typingsSlinky.atFirebaseDatabase.distSrcCoreOperationOperationMod.Operation
import typingsSlinky.atFirebaseDatabase.distSrcCoreOperationOperationMod.OperationSource
import typingsSlinky.atFirebaseDatabase.distSrcCoreOperationOperationMod.OperationType
import typingsSlinky.atFirebaseDatabase.distSrcCoreSnapNodeMod.Node
import typingsSlinky.atFirebaseDatabase.distSrcCoreUtilImmutableTreeMod.ImmutableTree
import typingsSlinky.atFirebaseDatabase.distSrcCoreUtilPathMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/operation/Merge", JSImport.Namespace)
@js.native
object distSrcCoreOperationMergeMod extends js.Object {
  @js.native
  class Merge protected () extends Operation {
    def this(
      /**@inheritDoc */ source: OperationSource,
      /**@inheritDoc */ path: Path,
      /**@inheritDoc */ children: ImmutableTree[Node]
    ) = this()
    /**@inheritDoc */ var children: ImmutableTree[Node] = js.native
    /**
      * @type {!Path}
      */
    /* CompleteClass */
    override var path: Path = js.native
    /**
      * @type {!OperationSource}
      */
    /* CompleteClass */
    override var source: OperationSource = js.native
    /**
      * @type {!OperationType}
      */
    /* CompleteClass */
    override var `type`: OperationType = js.native
    /**
      * @param {string} childName
      * @return {?Operation}
      */
    /* CompleteClass */
    override def operationForChild(childName: String): Operation | Null = js.native
  }
  
}

