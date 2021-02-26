package typingsSlinky.firebaseDatabase

import typingsSlinky.firebaseDatabase.dataSnapshotMod.DataSnapshot
import typingsSlinky.firebaseDatabase.eventRegistrationMod.EventRegistration
import typingsSlinky.firebaseDatabase.pathMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventMod {
  
  @JSImport("@firebase/database/dist/src/core/view/Event", "CancelEvent")
  @js.native
  class CancelEvent protected () extends Event {
    /**
      * @param {EventRegistration} eventRegistration
      * @param {Error} error
      * @param {!Path} path
      */
    def this(eventRegistration: EventRegistration, error: js.Error, path: Path) = this()
    
    var error: js.Error = js.native
    
    var eventRegistration: EventRegistration = js.native
    
    var path: Path = js.native
  }
  
  @JSImport("@firebase/database/dist/src/core/view/Event", "DataEvent")
  @js.native
  class DataEvent protected () extends Event {
    /**
      * @param {!string} eventType One of: value, child_added, child_changed, child_moved, child_removed
      * @param {!EventRegistration} eventRegistration The function to call to with the event data. User provided
      * @param {!DataSnapshot} snapshot The data backing the event
      * @param {?string=} prevName Optional, the name of the previous child for child_* events.
      */
    def this(eventType: EventType, eventRegistration: EventRegistration, snapshot: DataSnapshot) = this()
    def this(
      eventType: EventType,
      eventRegistration: EventRegistration,
      snapshot: DataSnapshot,
      prevName: String
    ) = this()
    
    var eventRegistration: EventRegistration = js.native
    
    var eventType: EventType = js.native
    
    var prevName: js.UndefOr[String | Null] = js.native
    
    var snapshot: DataSnapshot = js.native
  }
  
  @js.native
  trait Event extends StObject {
    
    /**
      * @return {!function()}
      */
    def getEventRunner(): js.Function0[Unit] = js.native
    
    /**
      * @return {!string}
      */
    def getEventType(): String = js.native
    
    /**
      * @return {!Path}
      */
    def getPath(): Path = js.native
  }
  object Event {
    
    @scala.inline
    def apply(getEventRunner: () => js.Function0[Unit], getEventType: () => String, getPath: () => Path): Event = {
      val __obj = js.Dynamic.literal(getEventRunner = js.Any.fromFunction0(getEventRunner), getEventType = js.Any.fromFunction0(getEventType), getPath = js.Any.fromFunction0(getPath))
      __obj.asInstanceOf[Event]
    }
    
    @scala.inline
    implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetEventRunner(value: () => js.Function0[Unit]): Self = StObject.set(x, "getEventRunner", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetEventType(value: () => String): Self = StObject.set(x, "getEventType", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPath(value: () => Path): Self = StObject.set(x, "getPath", js.Any.fromFunction0(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.firebaseDatabase.firebaseDatabaseStrings.value
    - typingsSlinky.firebaseDatabase.firebaseDatabaseStrings.Spacechild_added
    - typingsSlinky.firebaseDatabase.firebaseDatabaseStrings.Spacechild_changed
    - typingsSlinky.firebaseDatabase.firebaseDatabaseStrings.Spacechild_moved
    - typingsSlinky.firebaseDatabase.firebaseDatabaseStrings.Spacechild_removed
  */
  trait EventType extends StObject
  object EventType {
    
    @scala.inline
    def Spacechild_added: typingsSlinky.firebaseDatabase.firebaseDatabaseStrings.Spacechild_added = (" child_added").asInstanceOf[typingsSlinky.firebaseDatabase.firebaseDatabaseStrings.Spacechild_added]
    
    @scala.inline
    def Spacechild_changed: typingsSlinky.firebaseDatabase.firebaseDatabaseStrings.Spacechild_changed = (" child_changed").asInstanceOf[typingsSlinky.firebaseDatabase.firebaseDatabaseStrings.Spacechild_changed]
    
    @scala.inline
    def Spacechild_moved: typingsSlinky.firebaseDatabase.firebaseDatabaseStrings.Spacechild_moved = (" child_moved").asInstanceOf[typingsSlinky.firebaseDatabase.firebaseDatabaseStrings.Spacechild_moved]
    
    @scala.inline
    def Spacechild_removed: typingsSlinky.firebaseDatabase.firebaseDatabaseStrings.Spacechild_removed = (" child_removed").asInstanceOf[typingsSlinky.firebaseDatabase.firebaseDatabaseStrings.Spacechild_removed]
    
    @scala.inline
    def value: typingsSlinky.firebaseDatabase.firebaseDatabaseStrings.value = "value".asInstanceOf[typingsSlinky.firebaseDatabase.firebaseDatabaseStrings.value]
  }
}
