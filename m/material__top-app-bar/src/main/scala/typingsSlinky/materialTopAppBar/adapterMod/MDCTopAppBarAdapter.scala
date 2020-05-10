package typingsSlinky.materialTopAppBar.adapterMod

import typingsSlinky.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCTopAppBarAdapter extends js.Object {
  /**
    * Adds a class to the root Element.
    */
  def addClass(className: String): Unit = js.native
  /**
    * Deregisters an event handler on the navigation icon element for a given event.
    */
  def deregisterNavigationIconInteractionHandler(`type`: String, handler: EventListener): Unit = js.native
  def deregisterResizeHandler(handler: EventListener): Unit = js.native
  def deregisterScrollHandler(handler: EventListener): Unit = js.native
  /**
    * Gets the height of the top app bar.
    */
  def getTopAppBarHeight(): Double = js.native
  def getTotalActionItems(): Double = js.native
  def getViewportScrollY(): Double = js.native
  /**
    * Returns true if the root Element contains the given class.
    */
  def hasClass(className: String): Boolean = js.native
  /**
    * Emits an event when the navigation icon is clicked.
    */
  def notifyNavigationIconClicked(): Unit = js.native
  /**
    * Registers an event handler on the navigation icon element for a given event.
    */
  def registerNavigationIconInteractionHandler(`type`: String, handler: EventListener): Unit = js.native
  def registerResizeHandler(handler: EventListener): Unit = js.native
  def registerScrollHandler(handler: EventListener): Unit = js.native
  /**
    * Removes a class from the root Element.
    */
  def removeClass(className: String): Unit = js.native
  /**
    * Sets the specified inline style property on the root Element to the given value.
    */
  def setStyle(property: String, value: String): Unit = js.native
}

object MDCTopAppBarAdapter {
  @scala.inline
  def apply(
    addClass: String => Unit,
    deregisterNavigationIconInteractionHandler: (String, EventListener) => Unit,
    deregisterResizeHandler: EventListener => Unit,
    deregisterScrollHandler: EventListener => Unit,
    getTopAppBarHeight: () => Double,
    getTotalActionItems: () => Double,
    getViewportScrollY: () => Double,
    hasClass: String => Boolean,
    notifyNavigationIconClicked: () => Unit,
    registerNavigationIconInteractionHandler: (String, EventListener) => Unit,
    registerResizeHandler: EventListener => Unit,
    registerScrollHandler: EventListener => Unit,
    removeClass: String => Unit,
    setStyle: (String, String) => Unit
  ): MDCTopAppBarAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), deregisterNavigationIconInteractionHandler = js.Any.fromFunction2(deregisterNavigationIconInteractionHandler), deregisterResizeHandler = js.Any.fromFunction1(deregisterResizeHandler), deregisterScrollHandler = js.Any.fromFunction1(deregisterScrollHandler), getTopAppBarHeight = js.Any.fromFunction0(getTopAppBarHeight), getTotalActionItems = js.Any.fromFunction0(getTotalActionItems), getViewportScrollY = js.Any.fromFunction0(getViewportScrollY), hasClass = js.Any.fromFunction1(hasClass), notifyNavigationIconClicked = js.Any.fromFunction0(notifyNavigationIconClicked), registerNavigationIconInteractionHandler = js.Any.fromFunction2(registerNavigationIconInteractionHandler), registerResizeHandler = js.Any.fromFunction1(registerResizeHandler), registerScrollHandler = js.Any.fromFunction1(registerScrollHandler), removeClass = js.Any.fromFunction1(removeClass), setStyle = js.Any.fromFunction2(setStyle))
    __obj.asInstanceOf[MDCTopAppBarAdapter]
  }
  @scala.inline
  implicit class MDCTopAppBarAdapterOps[Self <: MDCTopAppBarAdapter] (val x: Self) extends AnyVal {
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
    def withDeregisterNavigationIconInteractionHandler(value: (String, EventListener) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deregisterNavigationIconInteractionHandler")(js.Any.fromFunction2(value))
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
    def withGetTopAppBarHeight(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTopAppBarHeight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTotalActionItems(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTotalActionItems")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetViewportScrollY(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getViewportScrollY")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasClass(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNotifyNavigationIconClicked(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyNavigationIconClicked")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRegisterNavigationIconInteractionHandler(value: (String, EventListener) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerNavigationIconInteractionHandler")(js.Any.fromFunction2(value))
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
  }
  
}

