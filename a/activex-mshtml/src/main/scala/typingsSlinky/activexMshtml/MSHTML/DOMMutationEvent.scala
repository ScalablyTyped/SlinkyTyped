package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMMutationEvent extends js.Object {
  @JSName("MSHTML.DOMMutationEvent_typekey")
  var MSHTMLDotDOMMutationEvent_typekey: DOMMutationEvent = js.native
  val attrChange: Double = js.native
  val attrName: String = js.native
  val bubbles: Boolean = js.native
  var cancelBubble: Boolean = js.native
  val cancelable: Boolean = js.native
  val currentTarget: IEventTarget = js.native
  val defaultPrevented: Boolean = js.native
  val eventPhase: Double = js.native
  val isTrusted: Boolean = js.native
  val newValue: String = js.native
  val prevValue: String = js.native
  val relatedNode: js.Any = js.native
  val srcElement: IHTMLElement = js.native
  val target: IEventTarget = js.native
  val timeStamp: Double = js.native
  val `type`: String = js.native
  def initEvent(eventType: String, canBubble: Boolean, cancelable: Boolean): Unit = js.native
  def initMutationEvent(
    eventType: String,
    canBubble: Boolean,
    cancelable: Boolean,
    relatedNodeArg: js.Any,
    prevValueArg: String,
    newValueArg: String,
    attrNameArg: String,
    attrChangeArg: Double
  ): Unit = js.native
  def preventDefault(): Unit = js.native
  def stopImmediatePropagation(): Unit = js.native
  def stopPropagation(): Unit = js.native
}

object DOMMutationEvent {
  @scala.inline
  def apply(
    MSHTMLDotDOMMutationEvent_typekey: DOMMutationEvent,
    attrChange: Double,
    attrName: String,
    bubbles: Boolean,
    cancelBubble: Boolean,
    cancelable: Boolean,
    currentTarget: IEventTarget,
    defaultPrevented: Boolean,
    eventPhase: Double,
    initEvent: (String, Boolean, Boolean) => Unit,
    initMutationEvent: (String, Boolean, Boolean, js.Any, String, String, String, Double) => Unit,
    isTrusted: Boolean,
    newValue: String,
    prevValue: String,
    preventDefault: () => Unit,
    relatedNode: js.Any,
    srcElement: IHTMLElement,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: IEventTarget,
    timeStamp: Double,
    `type`: String
  ): DOMMutationEvent = {
    val __obj = js.Dynamic.literal(attrChange = attrChange.asInstanceOf[js.Any], attrName = attrName.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], initEvent = js.Any.fromFunction3(initEvent), initMutationEvent = js.Any.fromFunction8(initMutationEvent), isTrusted = isTrusted.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], prevValue = prevValue.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), relatedNode = relatedNode.asInstanceOf[js.Any], srcElement = srcElement.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.DOMMutationEvent_typekey")(MSHTMLDotDOMMutationEvent_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMMutationEvent]
  }
  @scala.inline
  implicit class DOMMutationEventOps[Self <: DOMMutationEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotDOMMutationEvent_typekey(value: DOMMutationEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.DOMMutationEvent_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttrChange(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttrName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrName")(value.asInstanceOf[js.Any])
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
    def withEventPhase(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventPhase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitEvent(value: (String, Boolean, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initEvent")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withInitMutationEvent(value: (String, Boolean, Boolean, js.Any, String, String, String, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initMutationEvent")(js.Any.fromFunction8(value))
        ret
    }
    @scala.inline
    def withIsTrusted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTrusted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreventDefault(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRelatedNode(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedNode")(value.asInstanceOf[js.Any])
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

