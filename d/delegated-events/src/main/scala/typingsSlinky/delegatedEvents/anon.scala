package typingsSlinky.delegatedEvents

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait CurrentTarget extends StObject {
    
    var currentTarget: Element = js.native
  }
  object CurrentTarget {
    
    @scala.inline
    def apply(currentTarget: Element): CurrentTarget = {
      val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any])
      __obj.asInstanceOf[CurrentTarget]
    }
    
    @scala.inline
    implicit class CurrentTargetMutableBuilder[Self <: CurrentTarget] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentTarget(value: Element): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.CustomEvent<any> & {  currentTarget :std.Element} */
  @js.native
  trait CustomEventanycurrentTarg extends StObject {
    
    val AT_TARGET: Double = js.native
    
    val BUBBLING_PHASE: Double = js.native
    
    val CAPTURING_PHASE: Double = js.native
    
    val NONE: Double = js.native
    
    /**
      * Returns true or false depending on how event was initialized. True if event goes through its target's ancestors in reverse tree order, and false otherwise.
      */
    val bubbles: Boolean = js.native
    
    var cancelBubble: Boolean = js.native
    
    /**
      * Returns true or false depending on how event was initialized. Its return value does not always carry meaning, but true can indicate that part of the operation during which event was dispatched, can be canceled by invoking the preventDefault() method.
      */
    val cancelable: Boolean = js.native
    
    /**
      * Returns true or false depending on how event was initialized. True if event invokes listeners past a ShadowRoot node that is the root of its target, and false otherwise.
      */
    val composed: Boolean = js.native
    
    /**
      * Returns the invocation target objects of event's path (objects on which listeners will be invoked), except for any nodes in shadow trees of which the shadow root's mode is "closed" that are not reachable from event's currentTarget.
      */
    def composedPath(): js.Array[EventTarget] = js.native
    
    /**
      * Returns the object whose event listener's callback is currently being invoked.
      */
    val currentTarget: (EventTarget | Null) with Element = js.native
    
    /**
      * Returns true if preventDefault() was invoked successfully to indicate cancelation, and false otherwise.
      */
    val defaultPrevented: Boolean = js.native
    
    /**
      * Returns any custom data event was created with. Typically used for synthetic events.
      */
    val detail: js.Any = js.native
    
    /**
      * Returns the event's phase, which is one of NONE, CAPTURING_PHASE, AT_TARGET, and BUBBLING_PHASE.
      */
    val eventPhase: Double = js.native
    
    def initCustomEvent(typeArg: String, canBubbleArg: Boolean, cancelableArg: Boolean, detailArg: js.Any): Unit = js.native
    
    def initEvent(`type`: String): Unit = js.native
    def initEvent(`type`: String, bubbles: js.UndefOr[scala.Nothing], cancelable: Boolean): Unit = js.native
    def initEvent(`type`: String, bubbles: Boolean): Unit = js.native
    def initEvent(`type`: String, bubbles: Boolean, cancelable: Boolean): Unit = js.native
    
    /**
      * Returns true if event was dispatched by the user agent, and false otherwise.
      */
    val isTrusted: Boolean = js.native
    
    /**
      * If invoked when the cancelable attribute value is true, and while executing a listener for the event with passive set to false, signals to the operation that caused event to be dispatched that it needs to be canceled.
      */
    def preventDefault(): Unit = js.native
    
    var returnValue: Boolean = js.native
    
    /** @deprecated */
    val srcElement: EventTarget | Null = js.native
    
    /**
      * Invoking this method prevents event from reaching any registered event listeners after the current one finishes running and, when dispatched in a tree, also prevents event from reaching any other objects.
      */
    def stopImmediatePropagation(): Unit = js.native
    
    /**
      * When dispatched in a tree, invoking this method prevents event from reaching any objects other than the current object.
      */
    def stopPropagation(): Unit = js.native
    
    /**
      * Returns the object to which event is dispatched (its target).
      */
    val target: EventTarget | Null = js.native
    
    /**
      * Returns the event's timestamp as the number of milliseconds measured relative to the time origin.
      */
    val timeStamp: Double = js.native
    
    /**
      * Returns the type of event, e.g. "click", "hashchange", or "submit".
      */
    val `type`: String = js.native
  }
}
