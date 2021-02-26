package typingsSlinky.eventTargetShim

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.eventTargetShim.anon.AddEventListener
import typingsSlinky.eventTargetShim.anon.EventTargetloose
import typingsSlinky.eventTargetShim.anon.EventTargetstandard
import typingsSlinky.eventTargetShim.anon.PartialPickEventOmittable
import typingsSlinky.eventTargetShim.mod.EventTarget.EventAttributes
import typingsSlinky.eventTargetShim.mod.EventTarget.EventDefinition
import typingsSlinky.eventTargetShim.mod.EventTarget.Mode
import typingsSlinky.eventTargetShim.mod.EventTarget._EventData
import typingsSlinky.std.Exclude
import typingsSlinky.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* Inlined event-target-shim.event-target-shim.EventTargetConstructor<{}, {}, 'loose'> & {new <TEvents extends event-target-shim.event-target-shim.EventTarget.EventDefinition, TEventAttributes extends event-target-shim.event-target-shim.EventTarget.EventDefinition, TMode extends event-target-shim.event-target-shim.EventTarget.Mode = 'loose'>(): event-target-shim.event-target-shim.EventTarget<TEvents, TEventAttributes, TMode>, None <TEvents extends event-target-shim.event-target-shim.EventTarget.EventDefinition = {}, TEventAttributes extends event-target-shim.event-target-shim.EventTarget.EventDefinition = {}, TMode extends event-target-shim.event-target-shim.EventTarget.Mode = 'loose'>(events : std.Array<string>): event-target-shim.event-target-shim.EventTargetConstructor<TEvents, TEventAttributes, TMode>, None <TEvents extends event-target-shim.event-target-shim.EventTarget.EventDefinition = {}, TEventAttributes extends event-target-shim.event-target-shim.EventTarget.EventDefinition = {}, TMode extends event-target-shim.event-target-shim.EventTarget.Mode = 'loose'>(event0 : string, events : ...string): event-target-shim.event-target-shim.EventTargetConstructor<TEvents, TEventAttributes, TMode>} */
  object default {
    
    /**
      * Define an `EventTarget` constructor with attribute events and detailed event definition.
      *
      * Unfortunately, the second type parameter `TEventAttributes` was needed
      * because we cannot compute string literal types.
      *
      * @example
      * class AbortSignal extends EventTarget<{ abort: Event }, { onabort: Event }>("abort") {
      *      abort(): void {}
      * }
      *
      * @param events Optional event attributes (e.g. passing in `"click"` adds `onclick` to prototype).
      */
    @JSImport("event-target-shim", JSImport.Default)
    @js.native
    def apply[TEvents /* <: EventDefinition */, TEventAttributes /* <: EventDefinition */, TMode /* <: Mode */](event0: String, events: String*): EventTargetConstructor[TEvents, TEventAttributes, TMode] = js.native
    /**
      * Define an `EventTarget` constructor with attribute events and detailed event definition.
      *
      * Unfortunately, the second type parameter `TEventAttributes` was needed
      * because we cannot compute string literal types.
      *
      * @example
      * class AbortSignal extends EventTarget<{ abort: Event }, { onabort: Event }>("abort") {
      *      abort(): void {}
      * }
      *
      * @param events Optional event attributes (e.g. passing in `"click"` adds `onclick` to prototype).
      */
    @JSImport("event-target-shim", JSImport.Default)
    @js.native
    def apply[TEvents /* <: EventDefinition */, TEventAttributes /* <: EventDefinition */, TMode /* <: Mode */](events: js.Array[String]): EventTargetConstructor[TEvents, TEventAttributes, TMode] = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("event-target-shim", JSImport.Default)
    @js.native
    class ^ () extends EventTargetloose
  }
  
  /* Inlined event-target-shim.event-target-shim.EventTargetConstructor<{}, {}, 'loose'> & {new <TEvents extends event-target-shim.event-target-shim.EventTarget.EventDefinition, TEventAttributes extends event-target-shim.event-target-shim.EventTarget.EventDefinition, TMode extends event-target-shim.event-target-shim.EventTarget.Mode = 'loose'>(): event-target-shim.event-target-shim.EventTarget<TEvents, TEventAttributes, TMode>, None <TEvents extends event-target-shim.event-target-shim.EventTarget.EventDefinition = {}, TEventAttributes extends event-target-shim.event-target-shim.EventTarget.EventDefinition = {}, TMode extends event-target-shim.event-target-shim.EventTarget.Mode = 'loose'>(events : std.Array<string>): event-target-shim.event-target-shim.EventTargetConstructor<TEvents, TEventAttributes, TMode>, None <TEvents extends event-target-shim.event-target-shim.EventTarget.EventDefinition = {}, TEventAttributes extends event-target-shim.event-target-shim.EventTarget.EventDefinition = {}, TMode extends event-target-shim.event-target-shim.EventTarget.Mode = 'loose'>(event0 : string, events : ...string): event-target-shim.event-target-shim.EventTargetConstructor<TEvents, TEventAttributes, TMode>} */
  object EventTarget {
    
    /**
      * Define an `EventTarget` constructor with attribute events and detailed event definition.
      *
      * Unfortunately, the second type parameter `TEventAttributes` was needed
      * because we cannot compute string literal types.
      *
      * @example
      * class AbortSignal extends EventTarget<{ abort: Event }, { onabort: Event }>("abort") {
      *      abort(): void {}
      * }
      *
      * @param events Optional event attributes (e.g. passing in `"click"` adds `onclick` to prototype).
      */
    @JSImport("event-target-shim", "EventTarget")
    @js.native
    def apply[TEvents /* <: EventDefinition */, TEventAttributes /* <: EventDefinition */, TMode /* <: Mode */](event0: String, events: String*): EventTargetConstructor[TEvents, TEventAttributes, TMode] = js.native
    /**
      * Define an `EventTarget` constructor with attribute events and detailed event definition.
      *
      * Unfortunately, the second type parameter `TEventAttributes` was needed
      * because we cannot compute string literal types.
      *
      * @example
      * class AbortSignal extends EventTarget<{ abort: Event }, { onabort: Event }>("abort") {
      *      abort(): void {}
      * }
      *
      * @param events Optional event attributes (e.g. passing in `"click"` adds `onclick` to prototype).
      */
    @JSImport("event-target-shim", "EventTarget")
    @js.native
    def apply[TEvents /* <: EventDefinition */, TEventAttributes /* <: EventDefinition */, TMode /* <: Mode */](events: js.Array[String]): EventTargetConstructor[TEvents, TEventAttributes, TMode] = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("event-target-shim", "EventTarget")
    @js.native
    class ^ () extends EventTargetloose
    
    @js.native
    trait AddOptions extends RemoveOptions {
      
      /**
        * The flag to indicate that the listener will be removed on the first
        * event.
        */
      var once: js.UndefOr[Boolean] = js.native
      
      /**
        * The flag to indicate that the listener doesn't support
        * `event.preventDefault()` operation.
        */
      var passive: js.UndefOr[Boolean] = js.native
    }
    object AddOptions {
      
      @scala.inline
      def apply(): AddOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AddOptions]
      }
      
      @scala.inline
      implicit class AddOptionsMutableBuilder[Self <: AddOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
        
        @scala.inline
        def setPassive(value: Boolean): Self = StObject.set(x, "passive", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPassiveUndefined: Self = StObject.set(x, "passive", js.undefined)
      }
    }
    
    type EventAttributes[TEventAttributes /* <: EventDefinition */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof TEventAttributes ]: event-target-shim.event-target-shim.EventTarget.FunctionListener<TEventAttributes[P]> | null}
      */ typingsSlinky.eventTargetShim.eventTargetShimStrings.EventAttributes with TopLevel[TEventAttributes]
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.eventTargetShim.mod.Event
      - typingsSlinky.eventTargetShim.mod.EventTarget.NonStandardEvent
      - (typingsSlinky.std.Pick[
    / * import warning: importer.ImportType#apply Failed type conversion: TEvents[TEventType] * / js.Any, 
    typingsSlinky.std.Exclude[
      / * import warning: importer.ImportType#apply Failed type conversion: keyof TEvents[TEventType] * / js.Any, 
      typingsSlinky.eventTargetShim.mod.EventTarget.OmittableEventKeys
    ]]) with typingsSlinky.eventTargetShim.anon.PartialPickEventOmittable[TEvents]
    */
    type EventData[TEvents /* <: EventDefinition */, TEventType /* <: /* keyof TEvents */ String */, TMode /* <: Mode */] = (_EventData[TEvents, TEventType, TMode]) | ((Pick[
        /* import warning: importer.ImportType#apply Failed type conversion: TEvents[TEventType] */ js.Any, 
        Exclude[
          /* import warning: importer.ImportType#apply Failed type conversion: keyof TEvents[TEventType] */ js.Any, 
          OmittableEventKeys
        ]
      ]) with PartialPickEventOmittable[TEvents])
    
    type EventDefinition = StringDictionary[Event]
    
    type EventType[TEvents /* <: EventDefinition */, TMode /* <: Mode */] = /* keyof TEvents */ String
    
    type FunctionListener[TEvent] = js.Function1[/* event */ TEvent, Unit]
    
    type Listener[TEvent] = FunctionListener[TEvent] | ObjectListener[TEvent]
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.eventTargetShim.eventTargetShimStrings.strict
      - typingsSlinky.eventTargetShim.eventTargetShimStrings.standard
      - typingsSlinky.eventTargetShim.eventTargetShimStrings.loose
    */
    trait Mode extends StObject
    object Mode {
      
      @scala.inline
      def loose: typingsSlinky.eventTargetShim.eventTargetShimStrings.loose = "loose".asInstanceOf[typingsSlinky.eventTargetShim.eventTargetShimStrings.loose]
      
      @scala.inline
      def standard: typingsSlinky.eventTargetShim.eventTargetShimStrings.standard = "standard".asInstanceOf[typingsSlinky.eventTargetShim.eventTargetShimStrings.standard]
      
      @scala.inline
      def strict: typingsSlinky.eventTargetShim.eventTargetShimStrings.strict = "strict".asInstanceOf[typingsSlinky.eventTargetShim.eventTargetShimStrings.strict]
    }
    
    @js.native
    trait NonStandardEvent
      extends /* key */ StringDictionary[js.Any]
         with _EventData[js.Any, js.Any, js.Any] {
      
      var `type`: String = js.native
    }
    object NonStandardEvent {
      
      @scala.inline
      def apply(`type`: String): NonStandardEvent = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[NonStandardEvent]
      }
      
      @scala.inline
      implicit class NonStandardEventMutableBuilder[Self <: NonStandardEvent] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait ObjectListener[TEvent] extends StObject {
      
      def handleEvent(event: TEvent): Unit = js.native
    }
    object ObjectListener {
      
      @scala.inline
      def apply[TEvent](handleEvent: TEvent => Unit): ObjectListener[TEvent] = {
        val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
        __obj.asInstanceOf[ObjectListener[TEvent]]
      }
      
      @scala.inline
      implicit class ObjectListenerMutableBuilder[Self <: ObjectListener[_], TEvent] (val x: Self with ObjectListener[TEvent]) extends AnyVal {
        
        @scala.inline
        def setHandleEvent(value: TEvent => Unit): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1(value))
      }
    }
    
    /* Inlined std.Exclude<keyof event-target-shim.event-target-shim.Event, 'type'> */
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.eventTargetShim.eventTargetShimStrings.target
      - typingsSlinky.eventTargetShim.eventTargetShimStrings.eventPhase
      - typingsSlinky.eventTargetShim.eventTargetShimStrings.composed
      - typingsSlinky.eventTargetShim.eventTargetShimStrings.CAPTURING_PHASE
      - typingsSlinky.eventTargetShim.eventTargetShimStrings.stopImmediatePropagation
      - typingsSlinky.eventTargetShim.eventTargetShimStrings.timeStamp
      - typingsSlinky.eventTargetShim.eventTargetShimStrings.stopPropagation
      - typingsSlinky.eventTargetShim.eventTargetShimStrings.defaultPrevented
      - typingsSlinky.eventTargetShim.eventTargetShimStrings.AT_TARGET
      - typingsSlinky.eventTargetShim.eventTargetShimStrings.NONE
      - typingsSlinky.eventTargetShim.eventTargetShimStrings.cancelable
      - typingsSlinky.eventTargetShim.eventTargetShimStrings.returnValue
      - typingsSlinky.eventTargetShim.eventTargetShimStrings.isTrusted
      - typingsSlinky.eventTargetShim.eventTargetShimStrings.bubbles
      - typingsSlinky.eventTargetShim.eventTargetShimStrings.initEvent
      - typingsSlinky.eventTargetShim.eventTargetShimStrings.srcElement
      - typingsSlinky.eventTargetShim.eventTargetShimStrings.preventDefault
      - typingsSlinky.eventTargetShim.eventTargetShimStrings.cancelBubble
      - typingsSlinky.eventTargetShim.eventTargetShimStrings.composedPath
      - typingsSlinky.eventTargetShim.eventTargetShimStrings.currentTarget
      - typingsSlinky.eventTargetShim.eventTargetShimStrings.BUBBLING_PHASE
    */
    trait OmittableEventKeys extends StObject
    object OmittableEventKeys {
      
      @scala.inline
      def AT_TARGET: typingsSlinky.eventTargetShim.eventTargetShimStrings.AT_TARGET = "AT_TARGET".asInstanceOf[typingsSlinky.eventTargetShim.eventTargetShimStrings.AT_TARGET]
      
      @scala.inline
      def BUBBLING_PHASE: typingsSlinky.eventTargetShim.eventTargetShimStrings.BUBBLING_PHASE = "BUBBLING_PHASE".asInstanceOf[typingsSlinky.eventTargetShim.eventTargetShimStrings.BUBBLING_PHASE]
      
      @scala.inline
      def CAPTURING_PHASE: typingsSlinky.eventTargetShim.eventTargetShimStrings.CAPTURING_PHASE = "CAPTURING_PHASE".asInstanceOf[typingsSlinky.eventTargetShim.eventTargetShimStrings.CAPTURING_PHASE]
      
      @scala.inline
      def NONE: typingsSlinky.eventTargetShim.eventTargetShimStrings.NONE = "NONE".asInstanceOf[typingsSlinky.eventTargetShim.eventTargetShimStrings.NONE]
      
      @scala.inline
      def bubbles: typingsSlinky.eventTargetShim.eventTargetShimStrings.bubbles = "bubbles".asInstanceOf[typingsSlinky.eventTargetShim.eventTargetShimStrings.bubbles]
      
      @scala.inline
      def cancelBubble: typingsSlinky.eventTargetShim.eventTargetShimStrings.cancelBubble = "cancelBubble".asInstanceOf[typingsSlinky.eventTargetShim.eventTargetShimStrings.cancelBubble]
      
      @scala.inline
      def cancelable: typingsSlinky.eventTargetShim.eventTargetShimStrings.cancelable = "cancelable".asInstanceOf[typingsSlinky.eventTargetShim.eventTargetShimStrings.cancelable]
      
      @scala.inline
      def composed: typingsSlinky.eventTargetShim.eventTargetShimStrings.composed = "composed".asInstanceOf[typingsSlinky.eventTargetShim.eventTargetShimStrings.composed]
      
      @scala.inline
      def composedPath: typingsSlinky.eventTargetShim.eventTargetShimStrings.composedPath = "composedPath".asInstanceOf[typingsSlinky.eventTargetShim.eventTargetShimStrings.composedPath]
      
      @scala.inline
      def currentTarget: typingsSlinky.eventTargetShim.eventTargetShimStrings.currentTarget = "currentTarget".asInstanceOf[typingsSlinky.eventTargetShim.eventTargetShimStrings.currentTarget]
      
      @scala.inline
      def defaultPrevented: typingsSlinky.eventTargetShim.eventTargetShimStrings.defaultPrevented = "defaultPrevented".asInstanceOf[typingsSlinky.eventTargetShim.eventTargetShimStrings.defaultPrevented]
      
      @scala.inline
      def eventPhase: typingsSlinky.eventTargetShim.eventTargetShimStrings.eventPhase = "eventPhase".asInstanceOf[typingsSlinky.eventTargetShim.eventTargetShimStrings.eventPhase]
      
      @scala.inline
      def initEvent: typingsSlinky.eventTargetShim.eventTargetShimStrings.initEvent = "initEvent".asInstanceOf[typingsSlinky.eventTargetShim.eventTargetShimStrings.initEvent]
      
      @scala.inline
      def isTrusted: typingsSlinky.eventTargetShim.eventTargetShimStrings.isTrusted = "isTrusted".asInstanceOf[typingsSlinky.eventTargetShim.eventTargetShimStrings.isTrusted]
      
      @scala.inline
      def preventDefault: typingsSlinky.eventTargetShim.eventTargetShimStrings.preventDefault = "preventDefault".asInstanceOf[typingsSlinky.eventTargetShim.eventTargetShimStrings.preventDefault]
      
      @scala.inline
      def returnValue: typingsSlinky.eventTargetShim.eventTargetShimStrings.returnValue = "returnValue".asInstanceOf[typingsSlinky.eventTargetShim.eventTargetShimStrings.returnValue]
      
      @scala.inline
      def srcElement: typingsSlinky.eventTargetShim.eventTargetShimStrings.srcElement = "srcElement".asInstanceOf[typingsSlinky.eventTargetShim.eventTargetShimStrings.srcElement]
      
      @scala.inline
      def stopImmediatePropagation: typingsSlinky.eventTargetShim.eventTargetShimStrings.stopImmediatePropagation = "stopImmediatePropagation".asInstanceOf[typingsSlinky.eventTargetShim.eventTargetShimStrings.stopImmediatePropagation]
      
      @scala.inline
      def stopPropagation: typingsSlinky.eventTargetShim.eventTargetShimStrings.stopPropagation = "stopPropagation".asInstanceOf[typingsSlinky.eventTargetShim.eventTargetShimStrings.stopPropagation]
      
      @scala.inline
      def target: typingsSlinky.eventTargetShim.eventTargetShimStrings.target = "target".asInstanceOf[typingsSlinky.eventTargetShim.eventTargetShimStrings.target]
      
      @scala.inline
      def timeStamp: typingsSlinky.eventTargetShim.eventTargetShimStrings.timeStamp = "timeStamp".asInstanceOf[typingsSlinky.eventTargetShim.eventTargetShimStrings.timeStamp]
    }
    
    type PickEvent[TEvents /* <: EventDefinition */, TEventType /* <: /* keyof TEvents */ String */] = Event | (/* import warning: importer.ImportType#apply Failed type conversion: TEvents[TEventType] */ js.Any)
    
    @js.native
    trait RemoveOptions extends StObject {
      
      /**
        * The flag to indicate that the listener is for the capturing phase.
        */
      var capture: js.UndefOr[Boolean] = js.native
    }
    object RemoveOptions {
      
      @scala.inline
      def apply(): RemoveOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RemoveOptions]
      }
      
      @scala.inline
      implicit class RemoveOptionsMutableBuilder[Self <: RemoveOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      }
    }
    
    trait _EventData[TEvents /* <: EventDefinition */, TEventType /* <: /* keyof TEvents */ String */, TMode /* <: Mode */] extends StObject
  }
  type EventTarget[TEvents /* <: EventDefinition */, TEventAttributes /* <: EventDefinition */, TMode /* <: Mode */] = EventAttributes[TEventAttributes] with (AddEventListener[TEvents, TMode])
  
  @JSImport("event-target-shim", "defineEventAttribute")
  @js.native
  def defineEventAttribute(prototype: EventTargetloose, eventName: String): Unit = js.native
  
  @js.native
  trait Event
    extends _EventData[js.Any, js.Any, js.Any] {
    
    /**
      * Constant of AT_TARGET.
      */
    val AT_TARGET: Double = js.native
    
    /**
      * Constant of BUBBLING_PHASE.
      */
    val BUBBLING_PHASE: Double = js.native
    
    /**
      * Constant of CAPTURING_PHASE.
      */
    val CAPTURING_PHASE: Double = js.native
    
    /**
      * Constant of NONE.
      */
    val NONE: Double = js.native
    
    /**
      * The flag indicating bubbling.
      */
    val bubbles: Boolean = js.native
    
    /**
      * Stop event bubbling.
      * @deprecated
      */
    var cancelBubble: Boolean = js.native
    
    /**
      * The flag indicating whether the event can be canceled.
      */
    val cancelable: Boolean = js.native
    
    /**
      * The flag to indicating if event is composed.
      */
    val composed: Boolean = js.native
    
    /**
      * The composed path of this event.
      */
    def composedPath(): js.Array[EventTargetstandard] = js.native
    
    /**
      * The current target of this event.
      */
    val currentTarget: EventTargetstandard | Null = js.native
    
    /**
      * The flag to indicating whether the event was canceled.
      */
    val defaultPrevented: Boolean = js.native
    
    /**
      * Indicates which phase of the event flow is currently being evaluated.
      */
    val eventPhase: Double = js.native
    
    /**
      * Initialize event.
      * @deprecated
      */
    def initEvent(`type`: String): Unit = js.native
    def initEvent(`type`: String, bubbles: js.UndefOr[scala.Nothing], cancelable: Boolean): Unit = js.native
    def initEvent(`type`: String, bubbles: Boolean): Unit = js.native
    def initEvent(`type`: String, bubbles: Boolean, cancelable: Boolean): Unit = js.native
    
    /**
      * Indicates whether the event was dispatched by the user agent.
      */
    val isTrusted: Boolean = js.native
    
    /**
      * Cancel this event.
      */
    def preventDefault(): Unit = js.native
    
    /**
      * Set or get cancellation flag.
      * @deprecated
      */
    var returnValue: Boolean = js.native
    
    /**
      * The target of this event.
      * @deprecated
      */
    val srcElement: js.Any | Null = js.native
    
    /**
      * Stop event bubbling.
      */
    def stopImmediatePropagation(): Unit = js.native
    
    /**
      * Stop event bubbling.
      */
    def stopPropagation(): Unit = js.native
    
    /**
      * The target of this event.
      */
    val target: EventTargetstandard | Null = js.native
    
    /**
      * The unix time of this event.
      */
    val timeStamp: Double = js.native
    
    /**
      * The type of this event.
      */
    val `type`: String = js.native
  }
  
  @js.native
  trait EventTargetConstructor[TEvents /* <: EventDefinition */, TEventAttributes /* <: EventDefinition */, TMode /* <: Mode */] extends Instantiable0[EventTarget[TEvents, TEventAttributes, TMode]]
  
  @js.native
  trait Type[T /* <: String */] extends StObject {
    
    var `type`: T = js.native
  }
  object Type {
    
    @scala.inline
    def apply[T /* <: String */](`type`: T): Type[T] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type[T]]
    }
    
    @scala.inline
    implicit class TypeMutableBuilder[Self <: Type[_], T /* <: String */] (val x: Self with Type[T]) extends AnyVal {
      
      @scala.inline
      def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
