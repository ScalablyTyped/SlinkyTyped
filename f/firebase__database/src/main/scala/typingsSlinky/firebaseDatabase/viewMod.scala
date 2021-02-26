package typingsSlinky.firebaseDatabase

import typingsSlinky.firebaseDatabase.changeMod.Change
import typingsSlinky.firebaseDatabase.eventMod.Event
import typingsSlinky.firebaseDatabase.eventRegistrationMod.EventRegistration
import typingsSlinky.firebaseDatabase.nodeMod.Node
import typingsSlinky.firebaseDatabase.operationMod.Operation
import typingsSlinky.firebaseDatabase.pathMod.Path
import typingsSlinky.firebaseDatabase.queryMod.Query
import typingsSlinky.firebaseDatabase.viewCacheMod.ViewCache
import typingsSlinky.firebaseDatabase.writeTreeMod.WriteTreeRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewMod {
  
  @JSImport("@firebase/database/dist/src/core/view/View", "View")
  @js.native
  class View protected () extends StObject {
    /**
      *
      * @param {!Query} query_
      * @param {!ViewCache} initialViewCache
      */
    def this(query_ : Query, initialViewCache: ViewCache) = this()
    
    /**
      * @param {!EventRegistration} eventRegistration
      */
    def addEventRegistration(eventRegistration: EventRegistration): Unit = js.native
    
    /**
      * Applies the given Operation, updates our cache, and returns the appropriate events.
      *
      * @param {!Operation} operation
      * @param {!WriteTreeRef} writesCache
      * @param {?Node} completeServerCache
      * @return {!Array.<!Event>}
      */
    def applyOperation(operation: Operation, writesCache: WriteTreeRef): js.Array[Event] = js.native
    def applyOperation(operation: Operation, writesCache: WriteTreeRef, completeServerCache: Node): js.Array[Event] = js.native
    
    var eventGenerator_ : js.Any = js.native
    
    var eventRegistrations_ : js.Any = js.native
    
    /**
      * @private
      * @param {!Array.<!Change>} changes
      * @param {!Node} eventCache
      * @param {EventRegistration=} eventRegistration
      * @return {!Array.<!Event>}
      */
    def generateEventsForChanges_(changes: js.Array[Change], eventCache: Node): js.Array[Event] = js.native
    def generateEventsForChanges_(changes: js.Array[Change], eventCache: Node, eventRegistration: EventRegistration): js.Array[Event] = js.native
    
    /**
      * @param {!Path} path
      * @return {?Node}
      */
    def getCompleteServerCache(path: Path): Node | Null = js.native
    
    /**
      * @param {!EventRegistration} registration
      * @return {!Array.<!Event>}
      */
    def getInitialEvents(registration: EventRegistration): js.Array[Event] = js.native
    
    /**
      * @return {!Query}
      */
    def getQuery(): Query = js.native
    
    /**
      * @return {?Node}
      */
    def getServerCache(): Node | Null = js.native
    
    /**
      * @return {boolean}
      */
    def isEmpty(): Boolean = js.native
    
    var processor_ : js.Any = js.native
    
    var query_ : js.Any = js.native
    
    /**
      * @param {?EventRegistration} eventRegistration If null, remove all callbacks.
      * @param {Error=} cancelError If a cancelError is provided, appropriate cancel events will be returned.
      * @return {!Array.<!Event>} Cancel events, if cancelError was provided.
      */
    def removeEventRegistration(): js.Array[Event] = js.native
    def removeEventRegistration(eventRegistration: Null, cancelError: js.Error): js.Array[Event] = js.native
    def removeEventRegistration(eventRegistration: EventRegistration): js.Array[Event] = js.native
    def removeEventRegistration(eventRegistration: EventRegistration, cancelError: js.Error): js.Array[Event] = js.native
    
    var viewCache_ : js.Any = js.native
  }
}
