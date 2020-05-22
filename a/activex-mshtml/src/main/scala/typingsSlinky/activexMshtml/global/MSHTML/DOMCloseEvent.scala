package typingsSlinky.activexMshtml.global.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.DOMCloseEvent")
@js.native
class DOMCloseEvent protected ()
  extends typingsSlinky.activexMshtml.MSHTML.DOMCloseEvent {
  /* CompleteClass */
  @JSName("MSHTML.DOMCloseEvent_typekey")
  override var MSHTMLDotDOMCloseEvent_typekey: typingsSlinky.activexMshtml.MSHTML.DOMCloseEvent = js.native
  /* CompleteClass */
  override val bubbles: Boolean = js.native
  /* CompleteClass */
  override var cancelBubble: Boolean = js.native
  /* CompleteClass */
  override val cancelable: Boolean = js.native
  /* CompleteClass */
  override val currentTarget: typingsSlinky.activexMshtml.MSHTML.IEventTarget = js.native
  /* CompleteClass */
  override val defaultPrevented: Boolean = js.native
  /* CompleteClass */
  override val eventPhase: Double = js.native
  /* CompleteClass */
  override val isTrusted: Boolean = js.native
  /* CompleteClass */
  override val srcElement: typingsSlinky.activexMshtml.MSHTML.IHTMLElement = js.native
  /* CompleteClass */
  override val target: typingsSlinky.activexMshtml.MSHTML.IEventTarget = js.native
  /* CompleteClass */
  override val timeStamp: Double = js.native
  /* CompleteClass */
  override val `type`: String = js.native
  /* CompleteClass */
  override val wasClean: Boolean = js.native
  /* CompleteClass */
  override def initCloseEvent(
    eventType: String,
    canBubble: Boolean,
    cancelable: Boolean,
    wasClean: Boolean,
    code: Double,
    reason: String
  ): Unit = js.native
  /* CompleteClass */
  override def initEvent(eventType: String, canBubble: Boolean, cancelable: Boolean): Unit = js.native
  /* CompleteClass */
  override def preventDefault(): Unit = js.native
  /* CompleteClass */
  override def stopImmediatePropagation(): Unit = js.native
  /* CompleteClass */
  override def stopPropagation(): Unit = js.native
}

