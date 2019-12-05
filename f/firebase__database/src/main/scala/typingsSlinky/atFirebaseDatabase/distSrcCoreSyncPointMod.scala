package typingsSlinky.atFirebaseDatabase

import typingsSlinky.atFirebaseDatabase.distSrcApiQueryMod.Query
import typingsSlinky.atFirebaseDatabase.distSrcApiReferenceMod.ReferenceConstructor
import typingsSlinky.atFirebaseDatabase.distSrcCoreOperationOperationMod.Operation
import typingsSlinky.atFirebaseDatabase.distSrcCoreSnapNodeMod.Node
import typingsSlinky.atFirebaseDatabase.distSrcCoreUtilPathMod.Path
import typingsSlinky.atFirebaseDatabase.distSrcCoreViewEventMod.Event
import typingsSlinky.atFirebaseDatabase.distSrcCoreViewEventRegistrationMod.EventRegistration
import typingsSlinky.atFirebaseDatabase.distSrcCoreViewViewMod.View
import typingsSlinky.atFirebaseDatabase.distSrcCoreWriteTreeMod.WriteTreeRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/SyncPoint", JSImport.Namespace)
@js.native
object distSrcCoreSyncPointMod extends js.Object {
  @js.native
  class SyncPoint () extends js.Object {
    /**
      * The Views being tracked at this location in the tree, stored as a map where the key is a
      * queryId and the value is the View for that query.
      *
      * NOTE: This list will be quite small (usually 1, but perhaps 2 or 3; any more is an odd use case).
      */
    val views: js.Any = js.native
    def addEventRegistration(
      query: Query,
      eventRegistration: EventRegistration,
      writesCache: WriteTreeRef,
      serverCache: Null,
      serverCacheComplete: Boolean
    ): js.Array[Event] = js.native
    /**
      * Add an event callback for the specified query.
      *
      * @param {!Query} query
      * @param {!EventRegistration} eventRegistration
      * @param {!WriteTreeRef} writesCache
      * @param {?Node} serverCache Complete server cache, if we have it.
      * @param {boolean} serverCacheComplete
      * @return {!Array.<!Event>} Events to raise.
      */
    def addEventRegistration(
      query: Query,
      eventRegistration: EventRegistration,
      writesCache: WriteTreeRef,
      serverCache: Node,
      serverCacheComplete: Boolean
    ): js.Array[Event] = js.native
    def applyOperation(operation: Operation, writesCache: WriteTreeRef): js.Array[Event] = js.native
    def applyOperation(operation: Operation, writesCache: WriteTreeRef, optCompleteServerCache: Node): js.Array[Event] = js.native
    /**
      * @param path The path to the desired complete snapshot
      * @return A complete cache, if it exists
      */
    def getCompleteServerCache(path: Path): Node | Null = js.native
    def getCompleteView(): View | Null = js.native
    def getQueryViews(): js.Array[View] = js.native
    def hasCompleteView(): Boolean = js.native
    def isEmpty(): Boolean = js.native
    def removeEventRegistration(query: Query): Anon_Events = js.native
    def removeEventRegistration(query: Query, eventRegistration: Null, cancelError: js.Error): Anon_Events = js.native
    /**
      * Remove event callback(s).  Return cancelEvents if a cancelError is specified.
      *
      * If query is the default query, we'll check all views for the specified eventRegistration.
      * If eventRegistration is null, we'll remove all callbacks for the specified view(s).
      *
      * @param {!Query} query
      * @param {?EventRegistration} eventRegistration If null, remove all callbacks.
      * @param {Error=} cancelError If a cancelError is provided, appropriate cancel events will be returned.
      * @return {{removed:!Array.<!Query>, events:!Array.<!Event>}} removed queries and any cancel events
      */
    def removeEventRegistration(query: Query, eventRegistration: EventRegistration): Anon_Events = js.native
    def removeEventRegistration(query: Query, eventRegistration: EventRegistration, cancelError: js.Error): Anon_Events = js.native
    def viewExistsForQuery(query: Query): Boolean = js.native
    def viewForQuery(query: Query): View | Null = js.native
  }
  
  /* static members */
  @js.native
  object SyncPoint extends js.Object {
    var __referenceConstructor: ReferenceConstructor = js.native
  }
  
}

