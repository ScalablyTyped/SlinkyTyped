package typingsSlinky.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DvCommonWidget extends js.Object {
  def option(key: js.Object, value: js.Object): Unit = js.native
}

object DvCommonWidget {
  @scala.inline
  def apply(option: (js.Object, js.Object) => Unit): DvCommonWidget = {
    val __obj = js.Dynamic.literal(option = js.Any.fromFunction2(option))
    __obj.asInstanceOf[DvCommonWidget]
  }
  @scala.inline
  implicit class DvCommonWidgetOps[Self <: DvCommonWidget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOption(value: (js.Object, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("option")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

