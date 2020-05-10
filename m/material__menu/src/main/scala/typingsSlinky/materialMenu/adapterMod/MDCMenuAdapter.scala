package typingsSlinky.materialMenu.adapterMod

import org.scalajs.dom.raw.EventTarget
import typingsSlinky.materialMenu.AnonBottom
import typingsSlinky.materialMenu.AnonHeight
import typingsSlinky.materialMenu.AnonIndex
import typingsSlinky.materialMenu.AnonLeft
import typingsSlinky.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCMenuAdapter extends js.Object {
  def addClass(className: String): Unit = js.native
  def addClassForOptionAtIndex(index: Double, className: String): Unit = js.native
  def deregisterBodyClickHandler(handler: EventListener): Unit = js.native
  def deregisterInteractionHandler(`type`: String, handler: EventListener): Unit = js.native
  def focus(): Unit = js.native
  def focusItemAtIndex(index: Double): Unit = js.native
  def getAnchorDimensions(): AnonBottom = js.native
  def getAttributeForEventTarget(target: EventTarget, attributeName: String): String = js.native
  def getFocusedItemIndex(): Double = js.native
  def getIndexForEventTarget(target: EventTarget): Double = js.native
  def getInnerDimensions(): AnonHeight = js.native
  def getNumberOfItems(): Double = js.native
  def getWindowDimensions(): AnonHeight = js.native
  def hasAnchor(): Boolean = js.native
  def hasClass(className: String): Boolean = js.native
  def hasNecessaryDom(): Boolean = js.native
  def isFocused(): Boolean = js.native
  def isRtl(): Boolean = js.native
  def notifyCancel(): Unit = js.native
  def notifySelected(evtData: AnonIndex): Unit = js.native
  def registerBodyClickHandler(handler: EventListener): Unit = js.native
  def registerInteractionHandler(`type`: String, handler: EventListener): Unit = js.native
  def removeClass(className: String): Unit = js.native
  def restoreFocus(): Unit = js.native
  def rmAttrForOptionAtIndex(index: Double, attr: String): Unit = js.native
  def rmClassForOptionAtIndex(index: Double, className: String): Unit = js.native
  def saveFocus(): Unit = js.native
  def setAttrForOptionAtIndex(index: Double, attr: String, value: String): Unit = js.native
  def setMaxHeight(height: Double): Unit = js.native
  def setPosition(position: AnonLeft): Unit = js.native
  def setTransformOrigin(origin: String): Unit = js.native
}

object MDCMenuAdapter {
  @scala.inline
  def apply(
    addClass: String => Unit,
    addClassForOptionAtIndex: (Double, String) => Unit,
    deregisterBodyClickHandler: EventListener => Unit,
    deregisterInteractionHandler: (String, EventListener) => Unit,
    focus: () => Unit,
    focusItemAtIndex: Double => Unit,
    getAnchorDimensions: () => AnonBottom,
    getAttributeForEventTarget: (EventTarget, String) => String,
    getFocusedItemIndex: () => Double,
    getIndexForEventTarget: EventTarget => Double,
    getInnerDimensions: () => AnonHeight,
    getNumberOfItems: () => Double,
    getWindowDimensions: () => AnonHeight,
    hasAnchor: () => Boolean,
    hasClass: String => Boolean,
    hasNecessaryDom: () => Boolean,
    isFocused: () => Boolean,
    isRtl: () => Boolean,
    notifyCancel: () => Unit,
    notifySelected: AnonIndex => Unit,
    registerBodyClickHandler: EventListener => Unit,
    registerInteractionHandler: (String, EventListener) => Unit,
    removeClass: String => Unit,
    restoreFocus: () => Unit,
    rmAttrForOptionAtIndex: (Double, String) => Unit,
    rmClassForOptionAtIndex: (Double, String) => Unit,
    saveFocus: () => Unit,
    setAttrForOptionAtIndex: (Double, String, String) => Unit,
    setMaxHeight: Double => Unit,
    setPosition: AnonLeft => Unit,
    setTransformOrigin: String => Unit
  ): MDCMenuAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), addClassForOptionAtIndex = js.Any.fromFunction2(addClassForOptionAtIndex), deregisterBodyClickHandler = js.Any.fromFunction1(deregisterBodyClickHandler), deregisterInteractionHandler = js.Any.fromFunction2(deregisterInteractionHandler), focus = js.Any.fromFunction0(focus), focusItemAtIndex = js.Any.fromFunction1(focusItemAtIndex), getAnchorDimensions = js.Any.fromFunction0(getAnchorDimensions), getAttributeForEventTarget = js.Any.fromFunction2(getAttributeForEventTarget), getFocusedItemIndex = js.Any.fromFunction0(getFocusedItemIndex), getIndexForEventTarget = js.Any.fromFunction1(getIndexForEventTarget), getInnerDimensions = js.Any.fromFunction0(getInnerDimensions), getNumberOfItems = js.Any.fromFunction0(getNumberOfItems), getWindowDimensions = js.Any.fromFunction0(getWindowDimensions), hasAnchor = js.Any.fromFunction0(hasAnchor), hasClass = js.Any.fromFunction1(hasClass), hasNecessaryDom = js.Any.fromFunction0(hasNecessaryDom), isFocused = js.Any.fromFunction0(isFocused), isRtl = js.Any.fromFunction0(isRtl), notifyCancel = js.Any.fromFunction0(notifyCancel), notifySelected = js.Any.fromFunction1(notifySelected), registerBodyClickHandler = js.Any.fromFunction1(registerBodyClickHandler), registerInteractionHandler = js.Any.fromFunction2(registerInteractionHandler), removeClass = js.Any.fromFunction1(removeClass), restoreFocus = js.Any.fromFunction0(restoreFocus), rmAttrForOptionAtIndex = js.Any.fromFunction2(rmAttrForOptionAtIndex), rmClassForOptionAtIndex = js.Any.fromFunction2(rmClassForOptionAtIndex), saveFocus = js.Any.fromFunction0(saveFocus), setAttrForOptionAtIndex = js.Any.fromFunction3(setAttrForOptionAtIndex), setMaxHeight = js.Any.fromFunction1(setMaxHeight), setPosition = js.Any.fromFunction1(setPosition), setTransformOrigin = js.Any.fromFunction1(setTransformOrigin))
    __obj.asInstanceOf[MDCMenuAdapter]
  }
  @scala.inline
  implicit class MDCMenuAdapterOps[Self <: MDCMenuAdapter] (val x: Self) extends AnyVal {
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
    def withAddClassForOptionAtIndex(value: (Double, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addClassForOptionAtIndex")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDeregisterBodyClickHandler(value: EventListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deregisterBodyClickHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeregisterInteractionHandler(value: (String, EventListener) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deregisterInteractionHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFocus(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFocusItemAtIndex(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusItemAtIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAnchorDimensions(value: () => AnonBottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAnchorDimensions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAttributeForEventTarget(value: (EventTarget, String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttributeForEventTarget")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetFocusedItemIndex(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFocusedItemIndex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetIndexForEventTarget(value: EventTarget => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIndexForEventTarget")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetInnerDimensions(value: () => AnonHeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInnerDimensions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetNumberOfItems(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNumberOfItems")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetWindowDimensions(value: () => AnonHeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWindowDimensions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasAnchor(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAnchor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasClass(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHasNecessaryDom(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasNecessaryDom")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsFocused(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFocused")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsRtl(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRtl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNotifyCancel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyCancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNotifySelected(value: AnonIndex => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifySelected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterBodyClickHandler(value: EventListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerBodyClickHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterInteractionHandler(value: (String, EventListener) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerInteractionHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemoveClass(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRestoreFocus(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restoreFocus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRmAttrForOptionAtIndex(value: (Double, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rmAttrForOptionAtIndex")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRmClassForOptionAtIndex(value: (Double, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rmClassForOptionAtIndex")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSaveFocus(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveFocus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetAttrForOptionAtIndex(value: (Double, String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAttrForOptionAtIndex")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetMaxHeight(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxHeight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPosition(value: AnonLeft => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPosition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTransformOrigin(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTransformOrigin")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

