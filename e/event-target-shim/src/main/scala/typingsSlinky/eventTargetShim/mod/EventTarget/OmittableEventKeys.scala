package typingsSlinky.eventTargetShim.mod.EventTarget

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Exclude<keyof event-target-shim.event-target-shim.Event, 'type'> */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.eventTargetShim.eventTargetShimStrings.BUBBLING_PHASE
  - typingsSlinky.eventTargetShim.eventTargetShimStrings.currentTarget
  - typingsSlinky.eventTargetShim.eventTargetShimStrings.NONE
  - typingsSlinky.eventTargetShim.eventTargetShimStrings.initEvent
  - typingsSlinky.eventTargetShim.eventTargetShimStrings.cancelBubble
  - typingsSlinky.eventTargetShim.eventTargetShimStrings.target
  - typingsSlinky.eventTargetShim.eventTargetShimStrings.composed
  - typingsSlinky.eventTargetShim.eventTargetShimStrings.composedPath
  - typingsSlinky.eventTargetShim.eventTargetShimStrings.preventDefault
  - typingsSlinky.eventTargetShim.eventTargetShimStrings.eventPhase
  - typingsSlinky.eventTargetShim.eventTargetShimStrings.cancelable
  - typingsSlinky.eventTargetShim.eventTargetShimStrings.isTrusted
  - typingsSlinky.eventTargetShim.eventTargetShimStrings.returnValue
  - typingsSlinky.eventTargetShim.eventTargetShimStrings.AT_TARGET
  - typingsSlinky.eventTargetShim.eventTargetShimStrings.bubbles
  - typingsSlinky.eventTargetShim.eventTargetShimStrings.stopPropagation
  - typingsSlinky.eventTargetShim.eventTargetShimStrings.stopImmediatePropagation
  - typingsSlinky.eventTargetShim.eventTargetShimStrings.CAPTURING_PHASE
  - typingsSlinky.eventTargetShim.eventTargetShimStrings.srcElement
  - typingsSlinky.eventTargetShim.eventTargetShimStrings.defaultPrevented
  - typingsSlinky.eventTargetShim.eventTargetShimStrings.timeStamp
*/
trait OmittableEventKeys extends js.Object

object OmittableEventKeys {
  @scala.inline
  def AT_TARGET: typingsSlinky.eventTargetShim.eventTargetShimStrings.AT_TARGET = this.cast("AT_TARGET")
  @scala.inline
  def BUBBLING_PHASE: typingsSlinky.eventTargetShim.eventTargetShimStrings.BUBBLING_PHASE = this.cast("BUBBLING_PHASE")
  @scala.inline
  def CAPTURING_PHASE: typingsSlinky.eventTargetShim.eventTargetShimStrings.CAPTURING_PHASE = this.cast("CAPTURING_PHASE")
  @scala.inline
  def NONE: typingsSlinky.eventTargetShim.eventTargetShimStrings.NONE = this.cast("NONE")
  @scala.inline
  def bubbles: typingsSlinky.eventTargetShim.eventTargetShimStrings.bubbles = this.cast("bubbles")
  @scala.inline
  def cancelBubble: typingsSlinky.eventTargetShim.eventTargetShimStrings.cancelBubble = this.cast("cancelBubble")
  @scala.inline
  def cancelable: typingsSlinky.eventTargetShim.eventTargetShimStrings.cancelable = this.cast("cancelable")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def composed: typingsSlinky.eventTargetShim.eventTargetShimStrings.composed = this.cast("composed")
  @scala.inline
  def composedPath: typingsSlinky.eventTargetShim.eventTargetShimStrings.composedPath = this.cast("composedPath")
  @scala.inline
  def currentTarget: typingsSlinky.eventTargetShim.eventTargetShimStrings.currentTarget = this.cast("currentTarget")
  @scala.inline
  def defaultPrevented: typingsSlinky.eventTargetShim.eventTargetShimStrings.defaultPrevented = this.cast("defaultPrevented")
  @scala.inline
  def eventPhase: typingsSlinky.eventTargetShim.eventTargetShimStrings.eventPhase = this.cast("eventPhase")
  @scala.inline
  def initEvent: typingsSlinky.eventTargetShim.eventTargetShimStrings.initEvent = this.cast("initEvent")
  @scala.inline
  def isTrusted: typingsSlinky.eventTargetShim.eventTargetShimStrings.isTrusted = this.cast("isTrusted")
  @scala.inline
  def preventDefault: typingsSlinky.eventTargetShim.eventTargetShimStrings.preventDefault = this.cast("preventDefault")
  @scala.inline
  def returnValue: typingsSlinky.eventTargetShim.eventTargetShimStrings.returnValue = this.cast("returnValue")
  @scala.inline
  def srcElement: typingsSlinky.eventTargetShim.eventTargetShimStrings.srcElement = this.cast("srcElement")
  @scala.inline
  def stopImmediatePropagation: typingsSlinky.eventTargetShim.eventTargetShimStrings.stopImmediatePropagation = this.cast("stopImmediatePropagation")
  @scala.inline
  def stopPropagation: typingsSlinky.eventTargetShim.eventTargetShimStrings.stopPropagation = this.cast("stopPropagation")
  @scala.inline
  def target: typingsSlinky.eventTargetShim.eventTargetShimStrings.target = this.cast("target")
  @scala.inline
  def timeStamp: typingsSlinky.eventTargetShim.eventTargetShimStrings.timeStamp = this.cast("timeStamp")
}

