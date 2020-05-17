package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactNative.mod.AccessibilityChangeEvent
  - typingsSlinky.reactNative.mod.AccessibilityAnnoucementFinishedEvent
*/
trait AccessibilityEvent extends js.Object

object AccessibilityEvent {
  @scala.inline
  implicit def apply(value: AccessibilityAnnoucementFinishedEvent): AccessibilityEvent = value.asInstanceOf[AccessibilityEvent]
  @scala.inline
  implicit def apply(value: AccessibilityChangeEvent): AccessibilityEvent = value.asInstanceOf[AccessibilityEvent]
}

