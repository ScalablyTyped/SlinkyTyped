package typingsSlinky.materialToolbar.adapterMod

import typingsSlinky.materialToolbar.anon.FlexibleExpansionRatio
import typingsSlinky.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCToolbarAdapter extends js.Object {
  def addClass(className: String): Unit = js.native
  def deregisterResizeHandler(handler: EventListener): Unit = js.native
  def deregisterScrollHandler(handler: EventListener): Unit = js.native
  def getFirstRowElementOffsetHeight(): Double = js.native
  def getOffsetHeight(): Double = js.native
  def getViewportScrollY(): Double = js.native
  def getViewportWidth(): Double = js.native
  def hasClass(className: String): Boolean = js.native
  def notifyChange(evtData: FlexibleExpansionRatio): Unit = js.native
  def registerResizeHandler(handler: EventListener): Unit = js.native
  def registerScrollHandler(handler: EventListener): Unit = js.native
  def removeClass(className: String): Unit = js.native
  def setStyle(property: String, value: String): Unit = js.native
  def setStyleForFixedAdjustElement(property: String, value: String): Unit = js.native
  def setStyleForFlexibleRowElement(property: String, value: String): Unit = js.native
  def setStyleForTitleElement(property: String, value: String): Unit = js.native
}

object MDCToolbarAdapter {
  @scala.inline
  def apply(
    addClass: String => Unit,
    deregisterResizeHandler: EventListener => Unit,
    deregisterScrollHandler: EventListener => Unit,
    getFirstRowElementOffsetHeight: () => Double,
    getOffsetHeight: () => Double,
    getViewportScrollY: () => Double,
    getViewportWidth: () => Double,
    hasClass: String => Boolean,
    notifyChange: FlexibleExpansionRatio => Unit,
    registerResizeHandler: EventListener => Unit,
    registerScrollHandler: EventListener => Unit,
    removeClass: String => Unit,
    setStyle: (String, String) => Unit,
    setStyleForFixedAdjustElement: (String, String) => Unit,
    setStyleForFlexibleRowElement: (String, String) => Unit,
    setStyleForTitleElement: (String, String) => Unit
  ): MDCToolbarAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), deregisterResizeHandler = js.Any.fromFunction1(deregisterResizeHandler), deregisterScrollHandler = js.Any.fromFunction1(deregisterScrollHandler), getFirstRowElementOffsetHeight = js.Any.fromFunction0(getFirstRowElementOffsetHeight), getOffsetHeight = js.Any.fromFunction0(getOffsetHeight), getViewportScrollY = js.Any.fromFunction0(getViewportScrollY), getViewportWidth = js.Any.fromFunction0(getViewportWidth), hasClass = js.Any.fromFunction1(hasClass), notifyChange = js.Any.fromFunction1(notifyChange), registerResizeHandler = js.Any.fromFunction1(registerResizeHandler), registerScrollHandler = js.Any.fromFunction1(registerScrollHandler), removeClass = js.Any.fromFunction1(removeClass), setStyle = js.Any.fromFunction2(setStyle), setStyleForFixedAdjustElement = js.Any.fromFunction2(setStyleForFixedAdjustElement), setStyleForFlexibleRowElement = js.Any.fromFunction2(setStyleForFlexibleRowElement), setStyleForTitleElement = js.Any.fromFunction2(setStyleForTitleElement))
    __obj.asInstanceOf[MDCToolbarAdapter]
  }
  @scala.inline
  implicit class MDCToolbarAdapterOps[Self <: MDCToolbarAdapter] (val x: Self) extends AnyVal {
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
    def withDeregisterResizeHandler(value: EventListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deregisterResizeHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeregisterScrollHandler(value: EventListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deregisterScrollHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetFirstRowElementOffsetHeight(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFirstRowElementOffsetHeight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOffsetHeight(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOffsetHeight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetViewportScrollY(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getViewportScrollY")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetViewportWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getViewportWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasClass(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNotifyChange(value: FlexibleExpansionRatio => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterResizeHandler(value: EventListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerResizeHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterScrollHandler(value: EventListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerScrollHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveClass(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetStyle(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStyle")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetStyleForFixedAdjustElement(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStyleForFixedAdjustElement")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetStyleForFlexibleRowElement(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStyleForFlexibleRowElement")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetStyleForTitleElement(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStyleForTitleElement")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

