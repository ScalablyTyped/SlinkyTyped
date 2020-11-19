package typingsSlinky.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.std.Event because var conflicts: bubbles, cancelable, currentTarget, defaultPrevented, eventPhase, isTrusted, target, timeStamp, `type`. Inlined AT_TARGET, BUBBLING_PHASE, CAPTURING_PHASE, NONE, cancelBubble, composed, composedPath, initEvent, initEvent, initEvent, initEvent, returnValue, srcElement, stopImmediatePropagation */ @js.native
trait KeyboardEvent[T]
  extends BaseSyntheticEvent[org.scalajs.dom.raw.KeyboardEvent, EventTarget with T, EventTarget] {
  
  val AT_TARGET: Double = js.native
  
  val BUBBLING_PHASE: Double = js.native
  
  val CAPTURING_PHASE: Double = js.native
  
  val NONE: Double = js.native
  
  var altKey: Boolean = js.native
  
  var cancelBubble: Boolean = js.native
  
  var charCode: Double = js.native
  
  /**
    * Returns true or false depending on how event was initialized. True if event invokes listeners past a ShadowRoot node that is the root of its target, and false otherwise.
    */
  val composed: Boolean = js.native
  
  /**
    * Returns the invocation target objects of event's path (objects on which listeners will be invoked), except for any nodes in shadow trees of which the shadow root's mode is "closed" that are not reachable from event's currentTarget.
    */
  def composedPath(): js.Array[org.scalajs.dom.raw.EventTarget] = js.native
  
  var ctrlKey: Boolean = js.native
  
  /**
    * See [DOM Level 3 Events spec](https://www.w3.org/TR/uievents-key/#keys-modifier). for a list of valid (case-sensitive) arguments to this method.
    */
  def getModifierState(key: String): Boolean = js.native
  
  def initEvent(`type`: String): Unit = js.native
  def initEvent(`type`: String, bubbles: js.UndefOr[scala.Nothing], cancelable: Boolean): Unit = js.native
  def initEvent(`type`: String, bubbles: Boolean): Unit = js.native
  def initEvent(`type`: String, bubbles: Boolean, cancelable: Boolean): Unit = js.native
  
  /**
    * See the [DOM Level 3 Events spec](https://www.w3.org/TR/uievents-key/#named-key-attribute-values). for possible values
    */
  var key: String = js.native
  
  var keyCode: Double = js.native
  
  var locale: String = js.native
  
  var location: Double = js.native
  
  var metaKey: Boolean = js.native
  
  var repeat: Boolean = js.native
  
  var returnValue: Boolean = js.native
  
  var shiftKey: Boolean = js.native
  
  /** @deprecated */
  val srcElement: org.scalajs.dom.raw.EventTarget | Null = js.native
  
  /**
    * Invoking this method prevents event from reaching any registered event listeners after the current one finishes running and, when dispatched in a tree, also prevents event from reaching any other objects.
    */
  def stopImmediatePropagation(): Unit = js.native
  
  var which: Double = js.native
}
