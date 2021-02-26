package typingsSlinky.matrixAppserviceBridge

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stateLookupMod {
  
  @JSImport("matrix-appservice-bridge/lib/components/state-lookup", "StateLookup")
  @js.native
  class StateLookup protected () extends StObject {
    /**
      * Construct a new state lookup entity.
      *
      * This component stores state events for specific event types which can be
      * queried at a later date. This component will perform network requests to
      * fetch the current state for a given room ID. It relies on
      * {@link StateLookup#onEvent} being called with later events in order to
      * stay up-to-date. This should be connected to the <code>onEvent</code>
      * handler on the {@link Bridge}.
      * @constructor
      * @param {Object} opts Options for this constructor
      * @param {MatrixClient} opts.client Required. The client which will perform
      * /state requests.
      * @param {string[]} opts.eventTypes The state event types to track.
      * @throws if there is no client.
      */
    def this(opts: StateLookupOpts) = this()
    
    var _client: js.Any = js.native
    
    var dict: js.Any = js.native
    
    var eventTypes: js.Any = js.native
    
    var getInitialState: js.Any = js.native
    
    /**
      * Get a stored state event.
      * @param {string} roomId
      * @param {string} eventType
      * @param {string=} stateKey If specified, this function will return either
      * the event or null. If not specified, this function will always return an
      * array of events, which may be empty.
      * @return {?Object|Object[]}
      */
    def getState(roomId: String, eventType: String): Null | StateLookupEvent | js.Array[StateLookupEvent] = js.native
    def getState(roomId: String, eventType: String, stateKey: String): Null | StateLookupEvent | js.Array[StateLookupEvent] = js.native
    
    var insertEvent: js.Any = js.native
    
    var lookupQueue: js.Any = js.native
    
    /**
      * Update any state dictionaries with this event. If there is nothing tracking
      * this room, nothing is stored.
      * @param {Object} event Raw matrix event
      */
    def onEvent(event: StateLookupEvent): js.Promise[Unit] = js.native
    
    var retryStateIn: js.Any = js.native
    
    /**
      * Track a given room. The client must have access to this room.
      *
      * This will perform a room state query initially. Subsequent calls will do
      * nothing, as it will rely on events being pushed to it via {@link StateLookup#onEvent}.
      *
      * @param {string} roomId The room ID to start tracking. You can track multiple
      * rooms by calling this function multiple times with different room IDs.
      * @return {Promise} Resolves when the room is being tracked. Rejects if the room
      * cannot be tracked.
      */
    def trackRoom(roomId: String): js.Promise[StateLookupRoom] = js.native
    
    /**
      * Stop tracking a given room.
      *
      * This will stop further tracking of state events in the given room and delete
      * existing stored state for it.
      *
      * @param {string} roomId The room ID to stop tracking.
      */
    def untrackRoom(roomId: String): Unit = js.native
  }
  
  @js.native
  trait StateLookupEvent extends StObject {
    
    var content: js.Any = js.native
    
    var event_id: String = js.native
    
    var room_id: String = js.native
    
    var state_key: String = js.native
    
    var `type`: String = js.native
  }
  object StateLookupEvent {
    
    @scala.inline
    def apply(content: js.Any, event_id: String, room_id: String, state_key: String, `type`: String): StateLookupEvent = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], event_id = event_id.asInstanceOf[js.Any], room_id = room_id.asInstanceOf[js.Any], state_key = state_key.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateLookupEvent]
    }
    
    @scala.inline
    implicit class StateLookupEventMutableBuilder[Self <: StateLookupEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: js.Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvent_id(value: String): Self = StObject.set(x, "event_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoom_id(value: String): Self = StObject.set(x, "room_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState_key(value: String): Self = StObject.set(x, "state_key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StateLookupOpts extends StObject {
    
    var client: js.Any = js.native
    
    var eventTypes: js.UndefOr[js.Array[String]] = js.native
    
    var retryStateInMs: js.UndefOr[Double] = js.native
    
    var stateLookupConcurrency: js.UndefOr[Double] = js.native
  }
  object StateLookupOpts {
    
    @scala.inline
    def apply(client: js.Any): StateLookupOpts = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateLookupOpts]
    }
    
    @scala.inline
    implicit class StateLookupOptsMutableBuilder[Self <: StateLookupOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient(value: js.Any): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventTypes(value: js.Array[String]): Self = StObject.set(x, "eventTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventTypesUndefined: Self = StObject.set(x, "eventTypes", js.undefined)
      
      @scala.inline
      def setEventTypesVarargs(value: String*): Self = StObject.set(x, "eventTypes", js.Array(value :_*))
      
      @scala.inline
      def setRetryStateInMs(value: Double): Self = StObject.set(x, "retryStateInMs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryStateInMsUndefined: Self = StObject.set(x, "retryStateInMs", js.undefined)
      
      @scala.inline
      def setStateLookupConcurrency(value: Double): Self = StObject.set(x, "stateLookupConcurrency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateLookupConcurrencyUndefined: Self = StObject.set(x, "stateLookupConcurrency", js.undefined)
    }
  }
  
  @js.native
  trait StateLookupRoom extends StObject {
    
    var events: StringDictionary[StringDictionary[StateLookupEvent]] = js.native
    
    var syncPending: Boolean = js.native
    
    var syncPromise: js.Promise[StateLookupRoom] = js.native
  }
  object StateLookupRoom {
    
    @scala.inline
    def apply(
      events: StringDictionary[StringDictionary[StateLookupEvent]],
      syncPending: Boolean,
      syncPromise: js.Promise[StateLookupRoom]
    ): StateLookupRoom = {
      val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], syncPending = syncPending.asInstanceOf[js.Any], syncPromise = syncPromise.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateLookupRoom]
    }
    
    @scala.inline
    implicit class StateLookupRoomMutableBuilder[Self <: StateLookupRoom] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvents(value: StringDictionary[StringDictionary[StateLookupEvent]]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyncPending(value: Boolean): Self = StObject.set(x, "syncPending", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyncPromise(value: js.Promise[StateLookupRoom]): Self = StObject.set(x, "syncPromise", value.asInstanceOf[js.Any])
    }
  }
}
