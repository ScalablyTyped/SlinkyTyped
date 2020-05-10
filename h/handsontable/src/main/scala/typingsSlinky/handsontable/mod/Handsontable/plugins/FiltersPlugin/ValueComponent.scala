package typingsSlinky.handsontable.mod.Handsontable.plugins.FiltersPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValueComponent extends BaseComponent {
  def getMenuItemDescriptor(): js.Object = js.native
  def getMultipleSelectElement(): MultipleSelectUI = js.native
  def getState(): js.Object = js.native
  def setState(value: js.Object): Unit = js.native
  def updateState(stateInfo: js.Object): Unit = js.native
}

object ValueComponent {
  @scala.inline
  def apply(
    destroy: () => Boolean,
    elements: js.Array[_],
    getMenuItemDescriptor: () => js.Object,
    getMultipleSelectElement: () => MultipleSelectUI,
    getState: () => js.Object,
    hidden: Boolean,
    hide: () => Unit,
    isHidden: () => Boolean,
    reset: () => Unit,
    setState: js.Object => Unit,
    show: () => Unit,
    updateState: js.Object => Unit
  ): ValueComponent = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), elements = elements.asInstanceOf[js.Any], getMenuItemDescriptor = js.Any.fromFunction0(getMenuItemDescriptor), getMultipleSelectElement = js.Any.fromFunction0(getMultipleSelectElement), getState = js.Any.fromFunction0(getState), hidden = hidden.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), isHidden = js.Any.fromFunction0(isHidden), reset = js.Any.fromFunction0(reset), setState = js.Any.fromFunction1(setState), show = js.Any.fromFunction0(show), updateState = js.Any.fromFunction1(updateState))
    __obj.asInstanceOf[ValueComponent]
  }
  @scala.inline
  implicit class ValueComponentOps[Self <: ValueComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetMenuItemDescriptor(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMenuItemDescriptor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMultipleSelectElement(value: () => MultipleSelectUI): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMultipleSelectElement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetState(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getState")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetState(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setState")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateState(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateState")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

