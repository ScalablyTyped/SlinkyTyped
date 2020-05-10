package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgEditorFilterMethods extends js.Object {
  def destroy(): Unit = js.native
  def exitEditMode(): Unit = js.native
  def hasInvalidMessage(): Unit = js.native
  def remove(): Unit = js.native
  def setFocus(delay: js.Object, toggle: js.Object): Unit = js.native
  def validator(): Unit = js.native
}

object IgEditorFilterMethods {
  @scala.inline
  def apply(
    destroy: () => Unit,
    exitEditMode: () => Unit,
    hasInvalidMessage: () => Unit,
    remove: () => Unit,
    setFocus: (js.Object, js.Object) => Unit,
    validator: () => Unit
  ): IgEditorFilterMethods = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), exitEditMode = js.Any.fromFunction0(exitEditMode), hasInvalidMessage = js.Any.fromFunction0(hasInvalidMessage), remove = js.Any.fromFunction0(remove), setFocus = js.Any.fromFunction2(setFocus), validator = js.Any.fromFunction0(validator))
    __obj.asInstanceOf[IgEditorFilterMethods]
  }
  @scala.inline
  implicit class IgEditorFilterMethodsOps[Self <: IgEditorFilterMethods] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExitEditMode(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitEditMode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasInvalidMessage(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasInvalidMessage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemove(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetFocus(value: (js.Object, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFocus")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withValidator(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validator")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

