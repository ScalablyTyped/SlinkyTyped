package typingsSlinky.materialRadio.adapterMod

import typingsSlinky.materialSelectionControl.mod.MDCSelectionControlState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCRadioAdapter extends js.Object {
  def addClass(className: String): Unit = js.native
  def getNativeControl(): MDCSelectionControlState = js.native
  def removeClass(className: String): Unit = js.native
}

object MDCRadioAdapter {
  @scala.inline
  def apply(
    addClass: String => Unit,
    getNativeControl: () => MDCSelectionControlState,
    removeClass: String => Unit
  ): MDCRadioAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), getNativeControl = js.Any.fromFunction0(getNativeControl), removeClass = js.Any.fromFunction1(removeClass))
    __obj.asInstanceOf[MDCRadioAdapter]
  }
  @scala.inline
  implicit class MDCRadioAdapterOps[Self <: MDCRadioAdapter] (val x: Self) extends AnyVal {
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
    def withGetNativeControl(value: () => MDCSelectionControlState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNativeControl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveClass(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeClass")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

