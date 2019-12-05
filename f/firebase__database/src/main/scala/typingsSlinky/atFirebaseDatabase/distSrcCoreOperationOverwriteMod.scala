package typingsSlinky.atFirebaseDatabase

import typingsSlinky.atFirebaseDatabase.distSrcCoreOperationOperationMod.Operation
import typingsSlinky.atFirebaseDatabase.distSrcCoreOperationOperationMod.OperationSource
import typingsSlinky.atFirebaseDatabase.distSrcCoreOperationOperationMod.OperationType
import typingsSlinky.atFirebaseDatabase.distSrcCoreSnapNodeMod.Node
import typingsSlinky.atFirebaseDatabase.distSrcCoreUtilPathMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/operation/Overwrite", JSImport.Namespace)
@js.native
object distSrcCoreOperationOverwriteMod extends js.Object {
  @js.native
  class Overwrite protected () extends Operation {
    def this(source: OperationSource, path: Path, snap: Node) = this()
    /**
      * @type {!Path}
      */
    /* CompleteClass */
    override var path: Path = js.native
    var snap: Node = js.native
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

