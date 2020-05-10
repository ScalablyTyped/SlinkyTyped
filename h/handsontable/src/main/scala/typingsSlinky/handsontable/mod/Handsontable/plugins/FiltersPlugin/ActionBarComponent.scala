package typingsSlinky.handsontable.mod.Handsontable.plugins.FiltersPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionBarComponent extends BaseComponent {
  def accept(): Unit = js.native
  def cancel(): Unit = js.native
  def getMenuItemDescriptor(): js.Object = js.native
}

object ActionBarComponent {
  @scala.inline
  def apply(
    accept: () => Unit,
    cancel: () => Unit,
    destroy: () => Boolean,
    elements: js.Array[_],
    getMenuItemDescriptor: () => js.Object,
    hidden: Boolean,
    hide: () => Unit,
    isHidden: () => Boolean,
    reset: () => Unit,
    show: () => Unit
  ): ActionBarComponent = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction0(accept), cancel = js.Any.fromFunction0(cancel), destroy = js.Any.fromFunction0(destroy), elements = elements.asInstanceOf[js.Any], getMenuItemDescriptor = js.Any.fromFunction0(getMenuItemDescriptor), hidden = hidden.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), isHidden = js.Any.fromFunction0(isHidden), reset = js.Any.fromFunction0(reset), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[ActionBarComponent]
  }
  @scala.inline
  implicit class ActionBarComponentOps[Self <: ActionBarComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccept(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCancel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMenuItemDescriptor(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMenuItemDescriptor")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

