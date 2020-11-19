package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOMCompositionEvent extends js.Object {
  
  @JSName("MSHTML.DOMCompositionEvent_typekey")
  var MSHTMLDotDOMCompositionEvent_typekey: DOMCompositionEvent = js.native
  
  val bubbles: Boolean = js.native
  
  var cancelBubble: Boolean = js.native
  
  val cancelable: Boolean = js.native
  
  val currentTarget: IEventTarget = js.native
  
  val data: String = js.native
  
  val defaultPrevented: Boolean = js.native
  
  val detail: Double = js.native
  
  val eventPhase: Double = js.native
  
  def initCompositionEvent(
    eventType: String,
    canBubble: Boolean,
    cancelable: Boolean,
    viewArg: IHTMLWindow2,
    data: String,
    locale: String
  ): Unit = js.native
  
  def initEvent(eventType: String, canBubble: Boolean, cancelable: Boolean): Unit = js.native
  
  def initUIEvent(eventType: String, canBubble: Boolean, cancelable: Boolean, view: IHTMLWindow2, detail: Double): Unit = js.native
  
  val isTrusted: Boolean = js.native
  
  val locale: String = js.native
  
  def preventDefault(): Unit = js.native
  
  val srcElement: IHTMLElement = js.native
  
  def stopImmediatePropagation(): Unit = js.native
  
  def stopPropagation(): Unit = js.native
  
  val target: IEventTarget = js.native
  
  val timeStamp: Double = js.native
  
  val `type`: String = js.native
  
  def view(pvarIndex: js.Any): js.Any = js.native
  @JSName("view")
  val view_Original: IHTMLWindow2 = js.native
}
