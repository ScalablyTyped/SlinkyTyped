package typingsSlinky.handsontable.mod.Handsontable.plugins.FiltersPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseComponent extends js.Object {
  var elements: js.Array[_] = js.native
  var hidden: Boolean = js.native
  def destroy(): Boolean = js.native
  def hide(): Unit = js.native
  def isHidden(): Boolean = js.native
  def reset(): Unit = js.native
  def show(): Unit = js.native
}

object BaseComponent {
  @scala.inline
  def apply(
    destroy: () => Boolean,
    elements: js.Array[_],
    hidden: Boolean,
    hide: () => Unit,
    isHidden: () => Boolean,
    reset: () => Unit,
    show: () => Unit
  ): BaseComponent = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), elements = elements.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), isHidden = js.Any.fromFunction0(isHidden), reset = js.Any.fromFunction0(reset), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[BaseComponent]
  }
  @scala.inline
  implicit class BaseComponentOps[Self <: BaseComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestroy(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withElements(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsHidden(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHidden")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

