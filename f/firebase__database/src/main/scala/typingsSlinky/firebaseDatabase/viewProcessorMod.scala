package typingsSlinky.firebaseDatabase

import typingsSlinky.firebaseDatabase.changeMod.Change
import typingsSlinky.firebaseDatabase.childChangeAccumulatorMod.ChildChangeAccumulator
import typingsSlinky.firebaseDatabase.nodeFilterMod.NodeFilter
import typingsSlinky.firebaseDatabase.nodeMod.Node
import typingsSlinky.firebaseDatabase.operationMod.Operation
import typingsSlinky.firebaseDatabase.pathMod.Path
import typingsSlinky.firebaseDatabase.viewCacheMod.ViewCache
import typingsSlinky.firebaseDatabase.writeTreeMod.WriteTreeRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/database/dist/src/core/view/ViewProcessor", JSImport.Namespace)
@js.native
object viewProcessorMod extends js.Object {
  
  @js.native
  class ProcessorResult protected () extends js.Object {
    /**
      * @param {!ViewCache} viewCache
      * @param {!Array.<!Change>} changes
      */
    def this(viewCache: ViewCache, changes: js.Array[Change]) = this()
    
    val changes: js.Array[Change] = js.native
    
    val viewCache: ViewCache = js.native
  }
  
  @js.native
  class ViewProcessor protected () extends js.Object {
    /**
      * @param {!NodeFilter} filter_
      */
    def this(filter_ : NodeFilter) = this()
    
    /**
      * @param {!ViewCache} viewCache
      * @param {!Path} ackPath
      * @param {!ImmutableTree<!boolean>} affectedTree
      * @param {!WriteTreeRef} writesCache
      * @param {?Node} completeCache
      * @param {!ChildChangeAccumulator} accumulator
      * @return {!ViewCache}
      * @private
      */
    var ackUserWrite_ : js.Any = js.native
    
    /**
      * @param {!Node} node
      * @param {ImmutableTree.<!Node>} merge
      * @return {!Node}
      * @private
      */
    var applyMerge_ : js.Any = js.native
    
    /**
      * @param {!ViewCache} oldViewCache
      * @param {!Operation} operation
      * @param {!WriteTreeRef} writesCache
      * @param {?Node} completeCache
      * @return {!ProcessorResult}
      */
    def applyOperation(oldViewCache: ViewCache, operation: Operation, writesCache: WriteTreeRef): ProcessorResult = js.native
    def applyOperation(oldViewCache: ViewCache, operation: Operation, writesCache: WriteTreeRef, completeCache: Node): ProcessorResult = js.native
    
    /**
      * @param {!ViewCache} viewCache
      * @param {!Path} path
      * @param {!ImmutableTree.<!Node>} changedChildren
      * @param {!WriteTreeRef} writesCache
      * @param {?Node} serverCache
      * @param {boolean} filterServerNode
      * @param {!ChildChangeAccumulator} accumulator
      * @return {!ViewCache}
      * @private
      */
    var applyServerMerge_ : js.Any = js.native
    
    def applyServerOverwrite_(
      oldViewCache: ViewCache,
      changePath: Path,
      changedSnap: Node,
      writesCache: WriteTreeRef,
      completeCache: Null,
      filterServerNode: Boolean,
      accumulator: ChildChangeAccumulator
    ): ViewCache = js.native
    /**
      * @param {!ViewCache} oldViewCache
      * @param {!Path} changePath
      * @param {!Node} changedSnap
      * @param {!WriteTreeRef} writesCache
      * @param {?Node} completeCache
      * @param {boolean} filterServerNode
      * @param {!ChildChangeAccumulator} accumulator
      * @return {!ViewCache}
      * @private
      */
    def applyServerOverwrite_(
      oldViewCache: ViewCache,
      changePath: Path,
      changedSnap: Node,
      writesCache: WriteTreeRef,
      completeCache: Node,
      filterServerNode: Boolean,
      accumulator: ChildChangeAccumulator
    ): ViewCache = js.native
    
    /**
      * @param {!ViewCache} viewCache
      * @param {!Path} path
      * @param {ImmutableTree.<!Node>} changedChildren
      * @param {!WriteTreeRef} writesCache
      * @param {?Node} serverCache
      * @param {!ChildChangeAccumulator} accumulator
      * @return {!ViewCache}
      * @private
      */
    var applyUserMerge_ : js.Any = js.native
    
    def applyUserOverwrite_(
      oldViewCache: ViewCache,
      changePath: Path,
      changedSnap: Node,
      writesCache: WriteTreeRef,
      completeCache: Null,
      accumulator: ChildChangeAccumulator
    ): ViewCache = js.native
    /**
      * @param {!ViewCache} oldViewCache
      * @param {!Path} changePath
      * @param {!Node} changedSnap
      * @param {!WriteTreeRef} writesCache
      * @param {?Node} completeCache
      * @param {!ChildChangeAccumulator} accumulator
      * @return {!ViewCache}
      * @private
      */
    def applyUserOverwrite_(
      oldViewCache: ViewCache,
      changePath: Path,
      changedSnap: Node,
      writesCache: WriteTreeRef,
      completeCache: Node,
      accumulator: ChildChangeAccumulator
    ): ViewCache = js.native
    
    /**
      * @param {!ViewCache} viewCache
      */
    def assertIndexed(viewCache: ViewCache): Unit = js.native
    
    val filter_ : js.Any = js.native
    
    /**
      * @param {!ViewCache} viewCache
      * @param {!Path} changePath
      * @param {!WriteTreeRef} writesCache
      * @param {!CompleteChildSource} source
      * @param {!ChildChangeAccumulator} accumulator
      * @return {!ViewCache}
      * @private
      */
    var generateEventCacheAfterServerEvent_ : js.Any = js.native
    
    /**
      * @param {!ViewCache} viewCache
      * @param {!Path} path
      * @param {!WriteTreeRef} writesCache
      * @param {!ChildChangeAccumulator} accumulator
      * @return {!ViewCache}
      * @private
      */
    var listenComplete_ : js.Any = js.native
    
    /**
      * @param {!ViewCache} viewCache
      * @param {!Path} path
      * @param {!WriteTreeRef} writesCache
      * @param {?Node} completeServerCache
      * @param {!ChildChangeAccumulator} accumulator
      * @return {!ViewCache}
      * @private
      */
    var revertUserWrite_ : js.Any = js.native
  }
  /* static members */
  @js.native
  object ViewProcessor extends js.Object {
    
    /**
      * @param {!ViewCache} viewCache
      * @param {string} childKey
      * @return {boolean}
      * @private
      */
    var cacheHasChild_ : js.Any = js.native
    
    /**
      * @param {!ViewCache} oldViewCache
      * @param {!ViewCache} newViewCache
      * @param {!Array.<!Change>} accumulator
      * @private
      */
    var maybeAddValueEvent_ : js.Any = js.native
  }
}
