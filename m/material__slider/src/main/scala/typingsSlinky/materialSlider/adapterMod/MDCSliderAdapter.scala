package typingsSlinky.materialSlider.adapterMod

import org.scalajs.dom.raw.ClientRect
import typingsSlinky.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCSliderAdapter extends js.Object {
  def addClass(className: String): Unit = js.native
  def appendTrackMarkers(numMarkers: Double): Unit = js.native
  def computeBoundingRect(): ClientRect = js.native
  def deregisterBodyInteractionHandler(`type`: String, handler: EventListener): Unit = js.native
  def deregisterInteractionHandler(`type`: String, handler: EventListener): Unit = js.native
  def deregisterResizeHandler(handler: EventListener): Unit = js.native
  def deregisterThumbContainerInteractionHandler(`type`: String, handler: EventListener): Unit = js.native
  def getAttribute(name: String): String | Null = js.native
  def getTabIndex(): Double = js.native
  def hasClass(className: String): Boolean = js.native
  def isRTL(): Boolean = js.native
  def notifyChange(): Unit = js.native
  def notifyInput(): Unit = js.native
  def registerBodyInteractionHandler(`type`: String, handler: EventListener): Unit = js.native
  def registerInteractionHandler(`type`: String, handler: EventListener): Unit = js.native
  def registerResizeHandler(handler: EventListener): Unit = js.native
  def registerThumbContainerInteractionHandler(`type`: String, handler: EventListener): Unit = js.native
  def removeAttribute(name: String): Unit = js.native
  def removeClass(className: String): Unit = js.native
  def removeTrackMarkers(): Unit = js.native
  def setAttribute(name: String, value: String): Unit = js.native
  def setLastTrackMarkersStyleProperty(propertyName: String, value: String): Unit = js.native
  def setMarkerValue(value: Double): Unit = js.native
  def setThumbContainerStyleProperty(propertyName: String, value: String): Unit = js.native
  def setTrackStyleProperty(propertyName: String, value: String): Unit = js.native
}

object MDCSliderAdapter {
  @scala.inline
  def apply(
    addClass: String => Unit,
    appendTrackMarkers: Double => Unit,
    computeBoundingRect: () => ClientRect,
    deregisterBodyInteractionHandler: (String, EventListener) => Unit,
    deregisterInteractionHandler: (String, EventListener) => Unit,
    deregisterResizeHandler: EventListener => Unit,
    deregisterThumbContainerInteractionHandler: (String, EventListener) => Unit,
    getAttribute: String => String | Null,
    getTabIndex: () => Double,
    hasClass: String => Boolean,
    isRTL: () => Boolean,
    notifyChange: () => Unit,
    notifyInput: () => Unit,
    registerBodyInteractionHandler: (String, EventListener) => Unit,
    registerInteractionHandler: (String, EventListener) => Unit,
    registerResizeHandler: EventListener => Unit,
    registerThumbContainerInteractionHandler: (String, EventListener) => Unit,
    removeAttribute: String => Unit,
    removeClass: String => Unit,
    removeTrackMarkers: () => Unit,
    setAttribute: (String, String) => Unit,
    setLastTrackMarkersStyleProperty: (String, String) => Unit,
    setMarkerValue: Double => Unit,
    setThumbContainerStyleProperty: (String, String) => Unit,
    setTrackStyleProperty: (String, String) => Unit
  ): MDCSliderAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), appendTrackMarkers = js.Any.fromFunction1(appendTrackMarkers), computeBoundingRect = js.Any.fromFunction0(computeBoundingRect), deregisterBodyInteractionHandler = js.Any.fromFunction2(deregisterBodyInteractionHandler), deregisterInteractionHandler = js.Any.fromFunction2(deregisterInteractionHandler), deregisterResizeHandler = js.Any.fromFunction1(deregisterResizeHandler), deregisterThumbContainerInteractionHandler = js.Any.fromFunction2(deregisterThumbContainerInteractionHandler), getAttribute = js.Any.fromFunction1(getAttribute), getTabIndex = js.Any.fromFunction0(getTabIndex), hasClass = js.Any.fromFunction1(hasClass), isRTL = js.Any.fromFunction0(isRTL), notifyChange = js.Any.fromFunction0(notifyChange), notifyInput = js.Any.fromFunction0(notifyInput), registerBodyInteractionHandler = js.Any.fromFunction2(registerBodyInteractionHandler), registerInteractionHandler = js.Any.fromFunction2(registerInteractionHandler), registerResizeHandler = js.Any.fromFunction1(registerResizeHandler), registerThumbContainerInteractionHandler = js.Any.fromFunction2(registerThumbContainerInteractionHandler), removeAttribute = js.Any.fromFunction1(removeAttribute), removeClass = js.Any.fromFunction1(removeClass), removeTrackMarkers = js.Any.fromFunction0(removeTrackMarkers), setAttribute = js.Any.fromFunction2(setAttribute), setLastTrackMarkersStyleProperty = js.Any.fromFunction2(setLastTrackMarkersStyleProperty), setMarkerValue = js.Any.fromFunction1(setMarkerValue), setThumbContainerStyleProperty = js.Any.fromFunction2(setThumbContainerStyleProperty), setTrackStyleProperty = js.Any.fromFunction2(setTrackStyleProperty))
    __obj.asInstanceOf[MDCSliderAdapter]
  }
  @scala.inline
  implicit class MDCSliderAdapterOps[Self <: MDCSliderAdapter] (val x: Self) extends AnyVal {
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
    def withAppendTrackMarkers(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendTrackMarkers")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComputeBoundingRect(value: () => ClientRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeBoundingRect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDeregisterBodyInteractionHandler(value: (String, EventListener) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deregisterBodyInteractionHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDeregisterInteractionHandler(value: (String, EventListener) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deregisterInteractionHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDeregisterResizeHandler(value: EventListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deregisterResizeHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeregisterThumbContainerInteractionHandler(value: (String, EventListener) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deregisterThumbContainerInteractionHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetAttribute(value: String => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttribute")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetTabIndex(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTabIndex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasClass(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsRTL(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRTL")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNotifyChange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNotifyInput(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyInput")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRegisterBodyInteractionHandler(value: (String, EventListener) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerBodyInteractionHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRegisterInteractionHandler(value: (String, EventListener) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerInteractionHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRegisterResizeHandler(value: EventListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerResizeHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterThumbContainerInteractionHandler(value: (String, EventListener) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerThumbContainerInteractionHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemoveAttribute(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAttribute")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveClass(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveTrackMarkers(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeTrackMarkers")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetAttribute(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAttribute")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetLastTrackMarkersStyleProperty(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLastTrackMarkersStyleProperty")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetMarkerValue(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMarkerValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetThumbContainerStyleProperty(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setThumbContainerStyleProperty")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetTrackStyleProperty(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTrackStyleProperty")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

