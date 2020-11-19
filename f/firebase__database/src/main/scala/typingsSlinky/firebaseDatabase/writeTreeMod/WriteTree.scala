package typingsSlinky.firebaseDatabase.writeTreeMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.firebaseDatabase.cacheNodeMod.CacheNode
import typingsSlinky.firebaseDatabase.childrenNodeMod.ChildrenNode
import typingsSlinky.firebaseDatabase.indexMod.Index
import typingsSlinky.firebaseDatabase.nodeMod.NamedNode
import typingsSlinky.firebaseDatabase.nodeMod.Node
import typingsSlinky.firebaseDatabase.pathMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/database/dist/src/core/WriteTree", "WriteTree")
@js.native
class WriteTree () extends js.Object {
  
  /**
    * Record a new merge from user code.
    *
    * @param {!Path} path
    * @param {!Object.<string, !Node>} changedChildren
    * @param {!number} writeId
    */
  def addMerge(path: Path, changedChildren: StringDictionary[Node], writeId: Double): Unit = js.native
  
  /**
    * Record a new overwrite from user code.
    *
    * @param {!Path} path
    * @param {!Node} snap
    * @param {!number} writeId
    * @param {boolean=} visible This is set to false by some transactions. It should be excluded from event caches
    */
  def addOverwrite(path: Path, snap: Node, writeId: Double): Unit = js.native
  def addOverwrite(path: Path, snap: Node, writeId: Double, visible: Boolean): Unit = js.native
  
  /**
    * A list of all pending writes, regardless of visibility and shadowed-ness.  Used to calculate arbitrary
    * sets of the changed data, such as hidden writes (from transactions) or changes with certain writes excluded (also
    * used by transactions).
    *
    * @type {!Array.<!WriteRecord>}
    * @private
    */
  var allWrites_ : js.Any = js.native
  
  /**
    * Returns a complete child for a given server snap after applying all user writes or null if there is no
    * complete child for this ChildKey.
    *
    * @param {!Path} treePath
    * @param {!string} childKey
    * @param {!CacheNode} existingServerSnap
    * @return {?Node}
    */
  def calcCompleteChild(treePath: Path, childKey: String, existingServerSnap: CacheNode): Node | Null = js.native
  
  /**
    * Given optional, underlying server data, and an optional set of constraints (exclude some sets, include hidden
    * writes), attempt to calculate a complete snapshot for the given path
    *
    * @param {!Path} treePath
    * @param {?Node} completeServerCache
    * @param {Array.<number>=} writeIdsToExclude An optional set to be excluded
    * @param {boolean=} includeHiddenWrites Defaults to false, whether or not to layer on writes with visible set to false
    * @return {?Node}
    */
  def calcCompleteEventCache(treePath: Path): Node | Null = js.native
  def calcCompleteEventCache(
    treePath: Path,
    completeServerCache: Null,
    writeIdsToExclude: js.UndefOr[scala.Nothing],
    includeHiddenWrites: Boolean
  ): Node | Null = js.native
  def calcCompleteEventCache(treePath: Path, completeServerCache: Null, writeIdsToExclude: js.Array[Double]): Node | Null = js.native
  def calcCompleteEventCache(
    treePath: Path,
    completeServerCache: Null,
    writeIdsToExclude: js.Array[Double],
    includeHiddenWrites: Boolean
  ): Node | Null = js.native
  def calcCompleteEventCache(treePath: Path, completeServerCache: Node): Node | Null = js.native
  def calcCompleteEventCache(
    treePath: Path,
    completeServerCache: Node,
    writeIdsToExclude: js.UndefOr[scala.Nothing],
    includeHiddenWrites: Boolean
  ): Node | Null = js.native
  def calcCompleteEventCache(treePath: Path, completeServerCache: Node, writeIdsToExclude: js.Array[Double]): Node | Null = js.native
  def calcCompleteEventCache(
    treePath: Path,
    completeServerCache: Node,
    writeIdsToExclude: js.Array[Double],
    includeHiddenWrites: Boolean
  ): Node | Null = js.native
  
  /**
    * With optional, underlying server data, attempt to return a children node of children that we have complete data for.
    * Used when creating new views, to pre-fill their complete event children snapshot.
    *
    * @param {!Path} treePath
    * @param {?ChildrenNode} completeServerChildren
    * @return {!ChildrenNode}
    */
  def calcCompleteEventChildren(treePath: Path): Node = js.native
  def calcCompleteEventChildren(treePath: Path, completeServerChildren: ChildrenNode): Node = js.native
  
  /**
    * Given that the underlying server data has updated, determine what, if anything, needs to be
    * applied to the event cache.
    *
    * Possibilities:
    *
    * 1. No writes are shadowing. Events should be raised, the snap to be applied comes from the server data
    *
    * 2. Some write is completely shadowing. No events to be raised
    *
    * 3. Is partially shadowed. Events
    *
    * Either existingEventSnap or existingServerSnap must exist
    *
    * @param {!Path} treePath
    * @param {!Path} childPath
    * @param {?Node} existingEventSnap
    * @param {?Node} existingServerSnap
    * @return {?Node}
    */
  def calcEventCacheAfterServerOverwrite(treePath: Path, childPath: Path): Node | Null = js.native
  def calcEventCacheAfterServerOverwrite(treePath: Path, childPath: Path, existingEventSnap: Null, existingServerSnap: Node): Node | Null = js.native
  def calcEventCacheAfterServerOverwrite(treePath: Path, childPath: Path, existingEventSnap: Node): Node | Null = js.native
  def calcEventCacheAfterServerOverwrite(treePath: Path, childPath: Path, existingEventSnap: Node, existingServerSnap: Node): Node | Null = js.native
  
  def calcIndexedSlice(
    treePath: Path,
    completeServerData: Null,
    startPost: NamedNode,
    count: Double,
    reverse: Boolean,
    index: Index
  ): js.Array[NamedNode] = js.native
  /**
    * This method is used when processing child remove events on a query. If we can, we pull in children that were outside
    * the window, but may now be in the window.
    */
  def calcIndexedSlice(
    treePath: Path,
    completeServerData: Node,
    startPost: NamedNode,
    count: Double,
    reverse: Boolean,
    index: Index
  ): js.Array[NamedNode] = js.native
  
  /**
    * Create a new WriteTreeRef for the given path. For use with a new sync point at the given path.
    *
    * @param {!Path} path
    * @return {!WriteTreeRef}
    */
  def childWrites(path: Path): WriteTreeRef = js.native
  
  /**
    * Return a complete snapshot for the given path if there's visible write data at that path, else null.
    * No server data is considered.
    *
    * @param {!Path} path
    * @return {?Node}
    */
  def getCompleteWriteData(path: Path): Node | Null = js.native
  
  /**
    * @param {!number} writeId
    * @return {?WriteRecord}
    */
  def getWrite(writeId: Double): WriteRecord | Null = js.native
  
  var lastWriteId_ : js.Any = js.native
  
  var recordContainsPath_ : js.Any = js.native
  
  /**
    * Remove a write (either an overwrite or merge) that has been successfully acknowledge by the server. Recalculates
    * the tree if necessary.  We return true if it may have been visible, meaning views need to reevaluate.
    *
    * @param {!number} writeId
    * @return {boolean} true if the write may have been visible (meaning we'll need to reevaluate / raise
    * events as a result).
    */
  def removeWrite(writeId: Double): Boolean = js.native
  
  /**
    * Re-layer the writes and merges into a tree so we can efficiently calculate event snapshots
    */
  var resetTree_ : js.Any = js.native
  
  /**
    * Returns a node if there is a complete overwrite for this path. More specifically, if there is a write at
    * a higher path, this will return the child of that write relative to the write and this path.
    * Returns null if there is no write at this path.
    */
  def shadowingWrite(path: Path): Node | Null = js.native
  
  /**
    * A tree tracking the result of applying all visible writes.  This does not include transactions with
    * applyLocally=false or writes that are completely shadowed by other writes.
    *
    * @type {!CompoundWrite}
    * @private
    */
  var visibleWrites_ : js.Any = js.native
}
/* static members */
@JSImport("@firebase/database/dist/src/core/WriteTree", "WriteTree")
@js.native
object WriteTree extends js.Object {
  
  /**
    * The default filter used when constructing the tree. Keep everything that's visible.
    */
  var DefaultFilter_ : js.Any = js.native
  
  /**
    * Static method. Given an array of WriteRecords, a filter for which ones to include, and a path, construct the tree of
    * event data at that path.
    */
  var layerTree_ : js.Any = js.native
}
