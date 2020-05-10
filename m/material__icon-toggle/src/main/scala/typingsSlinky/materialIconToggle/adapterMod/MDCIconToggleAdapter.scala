package typingsSlinky.materialIconToggle.adapterMod

import typingsSlinky.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCIconToggleAdapter extends js.Object {
  def addClass(className: String): Unit = js.native
  def deregisterInteractionHandler(`type`: String, handler: EventListener): Unit = js.native
  def getAttr(name: String): String = js.native
  def getTabIndex(): Double = js.native
  def notifyChange(evtData: IconToggleEvent): Unit = js.native
  def registerInteractionHandler(`type`: String, handler: EventListener): Unit = js.native
  def removeClass(className: String): Unit = js.native
  def rmAttr(name: String): Unit = js.native
  def setAttr(name: String, value: String): Unit = js.native
  def setTabIndex(tabIndex: Double): Unit = js.native
  def setText(text: String): Unit = js.native
}

object MDCIconToggleAdapter {
  @scala.inline
  def apply(
    addClass: String => Unit,
    deregisterInteractionHandler: (String, EventListener) => Unit,
    getAttr: String => String,
    getTabIndex: () => Double,
    notifyChange: IconToggleEvent => Unit,
    registerInteractionHandler: (String, EventListener) => Unit,
    removeClass: String => Unit,
    rmAttr: String => Unit,
    setAttr: (String, String) => Unit,
    setTabIndex: Double => Unit,
    setText: String => Unit
  ): MDCIconToggleAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), deregisterInteractionHandler = js.Any.fromFunction2(deregisterInteractionHandler), getAttr = js.Any.fromFunction1(getAttr), getTabIndex = js.Any.fromFunction0(getTabIndex), notifyChange = js.Any.fromFunction1(notifyChange), registerInteractionHandler = js.Any.fromFunction2(registerInteractionHandler), removeClass = js.Any.fromFunction1(removeClass), rmAttr = js.Any.fromFunction1(rmAttr), setAttr = js.Any.fromFunction2(setAttr), setTabIndex = js.Any.fromFunction1(setTabIndex), setText = js.Any.fromFunction1(setText))
    __obj.asInstanceOf[MDCIconToggleAdapter]
  }
  @scala.inline
  implicit class MDCIconToggleAdapterOps[Self <: MDCIconToggleAdapter] (val x: Self) extends AnyVal {
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
    def withDeregisterInteractionHandler(value: (String, EventListener) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deregisterInteractionHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetAttr(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetTabIndex(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTabIndex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNotifyChange(value: IconToggleEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyChange")(js.Any.fromFunction1(value))
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
    def withRmAttr(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rmAttr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetAttr(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAttr")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetTabIndex(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTabIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetText(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setText")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

