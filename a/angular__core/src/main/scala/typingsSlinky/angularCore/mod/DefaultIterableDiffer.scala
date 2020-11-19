package typingsSlinky.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "DefaultIterableDiffer")
@js.native
class DefaultIterableDiffer[V] ()
  extends IterableDiffer[V]
     with IterableChanges[V] {
  def this(trackByFn: TrackByFunction[V]) = this()
  
  var _addToRemovals: js.Any = js.native
  
  var _additionsHead: js.Any = js.native
  
  var _additionsTail: js.Any = js.native
  
  var _identityChangesHead: js.Any = js.native
  
  var _identityChangesTail: js.Any = js.native
  
  var _itHead: js.Any = js.native
  
  var _itTail: js.Any = js.native
  
  var _linkedRecords: js.Any = js.native
  
  var _movesHead: js.Any = js.native
  
  var _movesTail: js.Any = js.native
  
  var _previousItHead: js.Any = js.native
  
  var _removalsHead: js.Any = js.native
  
  var _removalsTail: js.Any = js.native
  
  var _trackByFn: js.Any = js.native
  
  var _unlinkedRecords: js.Any = js.native
  
  def check(collection: NgIterable[V]): Boolean = js.native
  
  val collection: js.Array[V] | js.Iterable[V] | Null = js.native
  
  def isDirty: Boolean = js.native
  
  val length: Double = js.native
  
  def onDestroy(): Unit = js.native
}
