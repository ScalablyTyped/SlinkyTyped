package typingsSlinky.materialTabs.adapterMod

import org.scalajs.dom.raw.EventTarget
import typingsSlinky.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCTabBarScrollerAdapter extends js.Object {
  def addClass(className: String): Unit = js.native
  def addClassToBackIndicator(className: String): Unit = js.native
  def addClassToForwardIndicator(className: String): Unit = js.native
  def deregisterBackIndicatorClickHandler(handler: EventListener): Unit = js.native
  def deregisterCapturedInteractionHandler(evt: String, handler: EventListener): Unit = js.native
  def deregisterForwardIndicatorClickHandler(handler: EventListener): Unit = js.native
  def deregisterWindowResizeHandler(handler: EventListener): Unit = js.native
  def eventTargetHasClass(target: EventTarget, className: String): Boolean = js.native
  def getComputedLeftForTabAtIndex(): Double = js.native
  def getComputedWidthForTabAtIndex(): Double = js.native
  def getNumberOfTabs(): Double = js.native
  def getOffsetLeftForEventTarget(target: EventTarget): Double = js.native
  def getOffsetWidthForEventTarget(target: EventTarget): Double = js.native
  def getOffsetWidthForScrollFrame(): Double = js.native
  def getOffsetWidthForTabBar(): Double = js.native
  def getScrollLeftForScrollFrame(): Double = js.native
  def isRTL(): Boolean = js.native
  def registerBackIndicatorClickHandler(handler: EventListener): Unit = js.native
  def registerCapturedInteractionHandler(evt: String, handler: EventListener): Unit = js.native
  def registerForwardIndicatorClickHandler(handler: EventListener): Unit = js.native
  def registerWindowResizeHandler(handler: EventListener): Unit = js.native
  def removeClass(className: String): Unit = js.native
  def removeClassFromBackIndicator(className: String): Unit = js.native
  def removeClassFromForwardIndicator(className: String): Unit = js.native
  def setScrollLeftForScrollFrame(scrollLeftAmount: Double): Unit = js.native
  def setTransformStyleForTabBar(value: String): Unit = js.native
}

object MDCTabBarScrollerAdapter {
  @scala.inline
  def apply(
    addClass: String => Unit,
    addClassToBackIndicator: String => Unit,
    addClassToForwardIndicator: String => Unit,
    deregisterBackIndicatorClickHandler: EventListener => Unit,
    deregisterCapturedInteractionHandler: (String, EventListener) => Unit,
    deregisterForwardIndicatorClickHandler: EventListener => Unit,
    deregisterWindowResizeHandler: EventListener => Unit,
    eventTargetHasClass: (EventTarget, String) => Boolean,
    getComputedLeftForTabAtIndex: () => Double,
    getComputedWidthForTabAtIndex: () => Double,
    getNumberOfTabs: () => Double,
    getOffsetLeftForEventTarget: EventTarget => Double,
    getOffsetWidthForEventTarget: EventTarget => Double,
    getOffsetWidthForScrollFrame: () => Double,
    getOffsetWidthForTabBar: () => Double,
    getScrollLeftForScrollFrame: () => Double,
    isRTL: () => Boolean,
    registerBackIndicatorClickHandler: EventListener => Unit,
    registerCapturedInteractionHandler: (String, EventListener) => Unit,
    registerForwardIndicatorClickHandler: EventListener => Unit,
    registerWindowResizeHandler: EventListener => Unit,
    removeClass: String => Unit,
    removeClassFromBackIndicator: String => Unit,
    removeClassFromForwardIndicator: String => Unit,
    setScrollLeftForScrollFrame: Double => Unit,
    setTransformStyleForTabBar: String => Unit
  ): MDCTabBarScrollerAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), addClassToBackIndicator = js.Any.fromFunction1(addClassToBackIndicator), addClassToForwardIndicator = js.Any.fromFunction1(addClassToForwardIndicator), deregisterBackIndicatorClickHandler = js.Any.fromFunction1(deregisterBackIndicatorClickHandler), deregisterCapturedInteractionHandler = js.Any.fromFunction2(deregisterCapturedInteractionHandler), deregisterForwardIndicatorClickHandler = js.Any.fromFunction1(deregisterForwardIndicatorClickHandler), deregisterWindowResizeHandler = js.Any.fromFunction1(deregisterWindowResizeHandler), eventTargetHasClass = js.Any.fromFunction2(eventTargetHasClass), getComputedLeftForTabAtIndex = js.Any.fromFunction0(getComputedLeftForTabAtIndex), getComputedWidthForTabAtIndex = js.Any.fromFunction0(getComputedWidthForTabAtIndex), getNumberOfTabs = js.Any.fromFunction0(getNumberOfTabs), getOffsetLeftForEventTarget = js.Any.fromFunction1(getOffsetLeftForEventTarget), getOffsetWidthForEventTarget = js.Any.fromFunction1(getOffsetWidthForEventTarget), getOffsetWidthForScrollFrame = js.Any.fromFunction0(getOffsetWidthForScrollFrame), getOffsetWidthForTabBar = js.Any.fromFunction0(getOffsetWidthForTabBar), getScrollLeftForScrollFrame = js.Any.fromFunction0(getScrollLeftForScrollFrame), isRTL = js.Any.fromFunction0(isRTL), registerBackIndicatorClickHandler = js.Any.fromFunction1(registerBackIndicatorClickHandler), registerCapturedInteractionHandler = js.Any.fromFunction2(registerCapturedInteractionHandler), registerForwardIndicatorClickHandler = js.Any.fromFunction1(registerForwardIndicatorClickHandler), registerWindowResizeHandler = js.Any.fromFunction1(registerWindowResizeHandler), removeClass = js.Any.fromFunction1(removeClass), removeClassFromBackIndicator = js.Any.fromFunction1(removeClassFromBackIndicator), removeClassFromForwardIndicator = js.Any.fromFunction1(removeClassFromForwardIndicator), setScrollLeftForScrollFrame = js.Any.fromFunction1(setScrollLeftForScrollFrame), setTransformStyleForTabBar = js.Any.fromFunction1(setTransformStyleForTabBar))
    __obj.asInstanceOf[MDCTabBarScrollerAdapter]
  }
  @scala.inline
  implicit class MDCTabBarScrollerAdapterOps[Self <: MDCTabBarScrollerAdapter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddClass(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddClassToBackIndicator(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addClassToBackIndicator")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddClassToForwardIndicator(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addClassToForwardIndicator")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeregisterBackIndicatorClickHandler(value: EventListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deregisterBackIndicatorClickHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeregisterCapturedInteractionHandler(value: (String, EventListener) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deregisterCapturedInteractionHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDeregisterForwardIndicatorClickHandler(value: EventListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deregisterForwardIndicatorClickHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeregisterWindowResizeHandler(value: EventListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deregisterWindowResizeHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEventTargetHasClass(value: (EventTarget, String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTargetHasClass")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetComputedLeftForTabAtIndex(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getComputedLeftForTabAtIndex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetComputedWidthForTabAtIndex(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getComputedWidthForTabAtIndex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetNumberOfTabs(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNumberOfTabs")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOffsetLeftForEventTarget(value: EventTarget => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOffsetLeftForEventTarget")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetOffsetWidthForEventTarget(value: EventTarget => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOffsetWidthForEventTarget")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetOffsetWidthForScrollFrame(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOffsetWidthForScrollFrame")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOffsetWidthForTabBar(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOffsetWidthForTabBar")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetScrollLeftForScrollFrame(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScrollLeftForScrollFrame")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsRTL(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRTL")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRegisterBackIndicatorClickHandler(value: EventListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerBackIndicatorClickHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterCapturedInteractionHandler(value: (String, EventListener) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerCapturedInteractionHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRegisterForwardIndicatorClickHandler(value: EventListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerForwardIndicatorClickHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterWindowResizeHandler(value: EventListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerWindowResizeHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveClass(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveClassFromBackIndicator(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeClassFromBackIndicator")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveClassFromForwardIndicator(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeClassFromForwardIndicator")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetScrollLeftForScrollFrame(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScrollLeftForScrollFrame")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTransformStyleForTabBar(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTransformStyleForTabBar")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

