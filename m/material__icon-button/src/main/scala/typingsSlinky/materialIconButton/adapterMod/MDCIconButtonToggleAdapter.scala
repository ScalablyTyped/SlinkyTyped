package typingsSlinky.materialIconButton.adapterMod

import typingsSlinky.materialIconButton.typesMod.MDCIconButtonToggleEventDetail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCIconButtonToggleAdapter extends js.Object {
  def addClass(className: String): Unit = js.native
  def hasClass(className: String): Boolean = js.native
  def notifyChange(evtData: MDCIconButtonToggleEventDetail): Unit = js.native
  def removeClass(className: String): Unit = js.native
  def setAttr(attrName: String, attrValue: String): Unit = js.native
}

object MDCIconButtonToggleAdapter {
  @scala.inline
  def apply(
    addClass: String => Unit,
    hasClass: String => Boolean,
    notifyChange: MDCIconButtonToggleEventDetail => Unit,
    removeClass: String => Unit,
    setAttr: (String, String) => Unit
  ): MDCIconButtonToggleAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), hasClass = js.Any.fromFunction1(hasClass), notifyChange = js.Any.fromFunction1(notifyChange), removeClass = js.Any.fromFunction1(removeClass), setAttr = js.Any.fromFunction2(setAttr))
    __obj.asInstanceOf[MDCIconButtonToggleAdapter]
  }
  @scala.inline
  implicit class MDCIconButtonToggleAdapterOps[Self <: MDCIconButtonToggleAdapter] (val x: Self) extends AnyVal {
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
    def withHasClass(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNotifyChange(value: MDCIconButtonToggleEventDetail => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveClass(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetAttr(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAttr")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

