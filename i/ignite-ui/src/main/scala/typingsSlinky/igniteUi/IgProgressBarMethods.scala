package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgProgressBarMethods extends js.Object {
  def destroy(): Unit = js.native
  def value(newValue: js.Object): Unit = js.native
  def widget(): Unit = js.native
}

object IgProgressBarMethods {
  @scala.inline
  def apply(destroy: () => Unit, value: js.Object => Unit, widget: () => Unit): IgProgressBarMethods = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), value = js.Any.fromFunction1(value), widget = js.Any.fromFunction0(widget))
    __obj.asInstanceOf[IgProgressBarMethods]
  }
  @scala.inline
  implicit class IgProgressBarMethodsOps[Self <: IgProgressBarMethods] (val x: Self) extends AnyVal {
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
    def withValue(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.Any.fromFunction1(value))
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

