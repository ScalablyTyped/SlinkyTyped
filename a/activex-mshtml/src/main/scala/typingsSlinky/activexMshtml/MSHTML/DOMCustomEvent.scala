package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMCustomEvent extends js.Object {
  @JSName("MSHTML.DOMCustomEvent_typekey")
  var MSHTMLDotDOMCustomEvent_typekey: DOMCustomEvent = js.native
  val bubbles: Boolean = js.native
  var cancelBubble: Boolean = js.native
  val cancelable: Boolean = js.native
  val currentTarget: IEventTarget = js.native
  val defaultPrevented: Boolean = js.native
  val detail: js.Any = js.native
  val eventPhase: Double = js.native
  val isTrusted: Boolean = js.native
  val srcElement: IHTMLElement = js.native
  val target: IEventTarget = js.native
  val timeStamp: Double = js.native
  val `type`: String = js.native
  def initCustomEvent(eventType: String, canBubble: Boolean, cancelable: Boolean, detail: js.Any): Unit = js.native
  def initEvent(eventType: String, canBubble: Boolean, cancelable: Boolean): Unit = js.native
  def preventDefault(): Unit = js.native
  def stopImmediatePropagation(): Unit = js.native
  def stopPropagation(): Unit = js.native
}

object DOMCustomEvent {
  @scala.inline
  def apply(
    MSHTMLDotDOMCustomEvent_typekey: DOMCustomEvent,
    bubbles: Boolean,
    cancelBubble: Boolean,
    cancelable: Boolean,
    currentTarget: IEventTarget,
    defaultPrevented: Boolean,
    detail: js.Any,
    eventPhase: Double,
    initCustomEvent: (String, Boolean, Boolean, js.Any) => Unit,
    initEvent: (String, Boolean, Boolean) => Unit,
    isTrusted: Boolean,
    preventDefault: () => Unit,
    srcElement: IHTMLElement,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: IEventTarget,
    timeStamp: Double,
    `type`: String
  ): DOMCustomEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], initCustomEvent = js.Any.fromFunction4(initCustomEvent), initEvent = js.Any.fromFunction3(initEvent), isTrusted = isTrusted.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), srcElement = srcElement.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.DOMCustomEvent_typekey")(MSHTMLDotDOMCustomEvent_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMCustomEvent]
  }
  @scala.inline
  implicit class DOMCustomEventOps[Self <: DOMCustomEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotDOMCustomEvent_typekey(value: DOMCustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.DOMCustomEvent_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBubbles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancelBubble(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelBubble")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancelable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentTarget(value: IEventTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultPrevented(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPrevented")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetail(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventPhase(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventPhase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitCustomEvent(value: (String, Boolean, Boolean, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initCustomEvent")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withInitEvent(value: (String, Boolean, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initEvent")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withIsTrusted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTrusted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreventDefault(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSrcElement(value: IHTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStopImmediatePropagation(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopImmediatePropagation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStopPropagation(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopPropagation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTarget(value: IEventTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeStamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeStamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

