package typingsSlinky.materialTabs.tabBarAdapterMod

import typingsSlinky.materialTabs.anon.ActiveTabIndex
import typingsSlinky.materialTabs.materialTabsBooleans.`true`
import typingsSlinky.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCTabBarAdapter extends js.Object {
  def addClass(className: String): Unit = js.native
  def bindOnMDCTabSelectedEvent(): Unit = js.native
  def deregisterResizeHandler(handler: EventListener): Unit = js.native
  def getComputedLeftForTabAtIndex(index: Double): Double = js.native
  def getComputedWidthForTabAtIndex(index: Double): Double = js.native
  def getNumberOfTabs(): Double = js.native
  def getOffsetWidth(): Double = js.native
  def getOffsetWidthForIndicator(): Double = js.native
  def isDefaultPreventedOnClickForTabAtIndex(index: Double): Boolean = js.native
  def isTabActiveAtIndex(index: Double): Boolean = js.native
  def measureTabAtIndex(index: Double): Unit = js.native
  def notifyChange(evtData: ActiveTabIndex): Unit = js.native
  def registerResizeHandler(handler: EventListener): Unit = js.native
  def removeClass(className: String): Unit = js.native
  def setPreventDefaultOnClickForTabAtIndex(index: Double, preventDefaultOnClick: Boolean): Unit = js.native
  def setStyleForIndicator(propertyName: String, value: String): Unit = js.native
  @JSName("setTabActiveAtIndex")
  def setTabActiveAtIndex_true(index: Double, isActive: `true`): Unit = js.native
  def unbindOnMDCTabSelectedEvent(): Unit = js.native
}

object MDCTabBarAdapter {
  @scala.inline
  def apply(
    addClass: String => Unit,
    bindOnMDCTabSelectedEvent: () => Unit,
    deregisterResizeHandler: EventListener => Unit,
    getComputedLeftForTabAtIndex: Double => Double,
    getComputedWidthForTabAtIndex: Double => Double,
    getNumberOfTabs: () => Double,
    getOffsetWidth: () => Double,
    getOffsetWidthForIndicator: () => Double,
    isDefaultPreventedOnClickForTabAtIndex: Double => Boolean,
    isTabActiveAtIndex: Double => Boolean,
    measureTabAtIndex: Double => Unit,
    notifyChange: ActiveTabIndex => Unit,
    registerResizeHandler: EventListener => Unit,
    removeClass: String => Unit,
    setPreventDefaultOnClickForTabAtIndex: (Double, Boolean) => Unit,
    setStyleForIndicator: (String, String) => Unit,
    setTabActiveAtIndex: (Double, `true`) => Unit,
    unbindOnMDCTabSelectedEvent: () => Unit
  ): MDCTabBarAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), bindOnMDCTabSelectedEvent = js.Any.fromFunction0(bindOnMDCTabSelectedEvent), deregisterResizeHandler = js.Any.fromFunction1(deregisterResizeHandler), getComputedLeftForTabAtIndex = js.Any.fromFunction1(getComputedLeftForTabAtIndex), getComputedWidthForTabAtIndex = js.Any.fromFunction1(getComputedWidthForTabAtIndex), getNumberOfTabs = js.Any.fromFunction0(getNumberOfTabs), getOffsetWidth = js.Any.fromFunction0(getOffsetWidth), getOffsetWidthForIndicator = js.Any.fromFunction0(getOffsetWidthForIndicator), isDefaultPreventedOnClickForTabAtIndex = js.Any.fromFunction1(isDefaultPreventedOnClickForTabAtIndex), isTabActiveAtIndex = js.Any.fromFunction1(isTabActiveAtIndex), measureTabAtIndex = js.Any.fromFunction1(measureTabAtIndex), notifyChange = js.Any.fromFunction1(notifyChange), registerResizeHandler = js.Any.fromFunction1(registerResizeHandler), removeClass = js.Any.fromFunction1(removeClass), setPreventDefaultOnClickForTabAtIndex = js.Any.fromFunction2(setPreventDefaultOnClickForTabAtIndex), setStyleForIndicator = js.Any.fromFunction2(setStyleForIndicator), setTabActiveAtIndex = js.Any.fromFunction2(setTabActiveAtIndex), unbindOnMDCTabSelectedEvent = js.Any.fromFunction0(unbindOnMDCTabSelectedEvent))
    __obj.asInstanceOf[MDCTabBarAdapter]
  }
  @scala.inline
  implicit class MDCTabBarAdapterOps[Self <: MDCTabBarAdapter] (val x: Self) extends AnyVal {
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
    def withBindOnMDCTabSelectedEvent(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindOnMDCTabSelectedEvent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDeregisterResizeHandler(value: EventListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deregisterResizeHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetComputedLeftForTabAtIndex(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getComputedLeftForTabAtIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetComputedWidthForTabAtIndex(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getComputedWidthForTabAtIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetNumberOfTabs(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNumberOfTabs")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOffsetWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOffsetWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOffsetWidthForIndicator(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOffsetWidthForIndicator")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsDefaultPreventedOnClickForTabAtIndex(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDefaultPreventedOnClickForTabAtIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsTabActiveAtIndex(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTabActiveAtIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMeasureTabAtIndex(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureTabAtIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNotifyChange(value: ActiveTabIndex => Unit): Self = {
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
    def withRemoveClass(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPreventDefaultOnClickForTabAtIndex(value: (Double, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPreventDefaultOnClickForTabAtIndex")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetStyleForIndicator(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStyleForIndicator")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetTabActiveAtIndex(value: (Double, `true`) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTabActiveAtIndex")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUnbindOnMDCTabSelectedEvent(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unbindOnMDCTabSelectedEvent")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

