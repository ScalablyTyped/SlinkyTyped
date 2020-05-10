package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgButtonMethods extends js.Object {
  def destroy(): Unit = js.native
  def setTitle(title: js.Object): Unit = js.native
  def widget(): Unit = js.native
}

object IgButtonMethods {
  @scala.inline
  def apply(destroy: () => Unit, setTitle: js.Object => Unit, widget: () => Unit): IgButtonMethods = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), setTitle = js.Any.fromFunction1(setTitle), widget = js.Any.fromFunction0(widget))
    __obj.asInstanceOf[IgButtonMethods]
  }
  @scala.inline
  implicit class IgButtonMethodsOps[Self <: IgButtonMethods] (val x: Self) extends AnyVal {
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
    def withSetTitle(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTitle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWidget(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widget")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

