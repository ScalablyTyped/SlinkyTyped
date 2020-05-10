package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgToolbarButtonMethods extends js.Object {
  /**
  	 * Activate toolbar button
  	 *
  	 * @param event
  	 */
  def activate(event: js.Object): Unit = js.native
  /**
  	 * Deactivate toolbar button
  	 *
  	 * @param event
  	 */
  def deactivate(event: js.Object): Unit = js.native
  /**
  	 * Destroy the widget.
  	 */
  def destroy(): Unit = js.native
  /**
  	 * Toggle toolbar button
  	 */
  def toggle(): Unit = js.native
  /**
  	 * Returns the element that represents this widget.
  	 */
  def widget(): js.Object = js.native
}

object IgToolbarButtonMethods {
  @scala.inline
  def apply(
    activate: js.Object => Unit,
    deactivate: js.Object => Unit,
    destroy: () => Unit,
    toggle: () => Unit,
    widget: () => js.Object
  ): IgToolbarButtonMethods = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction1(activate), deactivate = js.Any.fromFunction1(deactivate), destroy = js.Any.fromFunction0(destroy), toggle = js.Any.fromFunction0(toggle), widget = js.Any.fromFunction0(widget))
    __obj.asInstanceOf[IgToolbarButtonMethods]
  }
  @scala.inline
  implicit class IgToolbarButtonMethodsOps[Self <: IgToolbarButtonMethods] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivate(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeactivate(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deactivate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToggle(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWidget(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widget")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

