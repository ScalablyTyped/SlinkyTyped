package typingsSlinky.firebaseDatabase

import typingsSlinky.firebaseDatabase.eventMod.Event
import typingsSlinky.firebaseDatabase.pathMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/database/dist/src/core/view/EventQueue", JSImport.Namespace)
@js.native
object eventQueueMod extends js.Object {
  
  @js.native
  class EventList protected () extends js.Object {
    def this(path_ : Path) = this()
    
    /**
      * @param {!Event} eventData
      */
    def add(eventData: Event): Unit = js.native
    
    /**
      * @type {!Array.<Event>}
      * @private
      */
    var events_ : js.Any = js.native
    
    /**
      * @return {!Path}
      */
    def getPath(): Path = js.native
    
    val path_ : js.Any = js.native
    
    /**
      * Iterates through the list and raises each event
      */
    def raise(): Unit = js.native
  }
  
  @js.native
  class EventQueue () extends js.Object {
    
    /**
      * @private
      * @type {!Array.<EventList>}
      */
    var eventLists_ : js.Any = js.native
    
    /**
      * @param {!Array.<Event>} eventDataList The new events to queue.
      */
    def queueEvents(eventDataList: js.Array[Event]): Unit = js.native
    
    /**
      * Queues the specified events and synchronously raises all events (including previously queued ones)
      * for the specified path.
      *
      * It is assumed that the new events are all for the specified path.
      *
      * @param {!Path} path The path to raise events for.
      * @param {!Array.<Event>} eventDataList The new events to raise.
      */
    def raiseEventsAtPath(path: Path, eventDataList: js.Array[Event]): Unit = js.native
    
    /**
      * Queues the specified events and synchronously raises all events (including previously queued ones) for
      * locations related to the specified change path (i.e. all ancestors and descendants).
      *
      * It is assumed that the new events are all related (ancestor or descendant) to the specified path.
      *
      * @param {!Path} changedPath The path to raise events for.
      * @param {!Array.<!Event>} eventDataList The events to raise
      */
    def raiseEventsForChangedPath(changedPath: Path, eventDataList: js.Array[Event]): Unit = js.native
    
    /**
      * @param {!function(!Path):boolean} predicate
      * @private
      */
    var raiseQueuedEventsMatchingPredicate_ : js.Any = js.native
    
    /**
      * Tracks recursion depth of raiseQueuedEvents_, for debugging purposes.
      * @private
      * @type {!number}
      */
    var recursionDepth_ : js.Any = js.native
  }
}
