package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOMSiteModeEvent extends js.Object {
  
  @JSName("MSHTML.DOMSiteModeEvent_typekey")
  var MSHTMLDotDOMSiteModeEvent_typekey: DOMSiteModeEvent = js.native
  
  val actionURL: String = js.native
  
  val bubbles: Boolean = js.native
  
  val buttonID: Double = js.native
  
  var cancelBubble: Boolean = js.native
  
  val cancelable: Boolean = js.native
  
  val currentTarget: IEventTarget = js.native
  
  val defaultPrevented: Boolean = js.native
  
  val eventPhase: Double = js.native
  
  def initEvent(eventType: String, canBubble: Boolean, cancelable: Boolean): Unit = js.native
  
  val isTrusted: Boolean = js.native
  
  def preventDefault(): Unit = js.native
  
  val srcElement: IHTMLElement = js.native
  
  def stopImmediatePropagation(): Unit = js.native
  
  def stopPropagation(): Unit = js.native
  
  val target: IEventTarget = js.native
  
  val timeStamp: Double = js.native
  
  val `type`: String = js.native
}
object DOMSiteModeEvent {
  
  @scala.inline
  def apply(
    MSHTMLDotDOMSiteModeEvent_typekey: DOMSiteModeEvent,
    actionURL: String,
    bubbles: Boolean,
    buttonID: Double,
    cancelBubble: Boolean,
    cancelable: Boolean,
    currentTarget: IEventTarget,
    defaultPrevented: Boolean,
    eventPhase: Double,
    initEvent: (String, Boolean, Boolean) => Unit,
    isTrusted: Boolean,
    preventDefault: () => Unit,
    srcElement: IHTMLElement,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: IEventTarget,
    timeStamp: Double,
    `type`: String
  ): DOMSiteModeEvent = {
    val __obj = js.Dynamic.literal(actionURL = actionURL.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], buttonID = buttonID.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], initEvent = js.Any.fromFunction3(initEvent), isTrusted = isTrusted.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), srcElement = srcElement.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.DOMSiteModeEvent_typekey")(MSHTMLDotDOMSiteModeEvent_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMSiteModeEvent]
  }
  
  @scala.inline
  implicit class DOMSiteModeEventOps[Self <: DOMSiteModeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMSHTMLDotDOMSiteModeEvent_typekey(value: DOMSiteModeEvent): Self = this.set("MSHTML.DOMSiteModeEvent_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionURL(value: String): Self = this.set("actionURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBubbles(value: Boolean): Self = this.set("bubbles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonID(value: Double): Self = this.set("buttonID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelBubble(value: Boolean): Self = this.set("cancelBubble", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelable(value: Boolean): Self = this.set("cancelable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTarget(value: IEventTarget): Self = this.set("currentTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPrevented(value: Boolean): Self = this.set("defaultPrevented", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventPhase(value: Double): Self = this.set("eventPhase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitEvent(value: (String, Boolean, Boolean) => Unit): Self = this.set("initEvent", js.Any.fromFunction3(value))
    
    @scala.inline
    def setIsTrusted(value: Boolean): Self = this.set("isTrusted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventDefault(value: () => Unit): Self = this.set("preventDefault", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSrcElement(value: IHTMLElement): Self = this.set("srcElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopImmediatePropagation(value: () => Unit): Self = this.set("stopImmediatePropagation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStopPropagation(value: () => Unit): Self = this.set("stopPropagation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTarget(value: IEventTarget): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeStamp(value: Double): Self = this.set("timeStamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
