package typingsSlinky.reactGamepad.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Layout extends js.Object {
  var axis: js.Array[InvertibleAxis | Null] = js.native
  var buttonAxis: js.Array[InvertibleAxis | Null] = js.native
  var buttons: js.Array[Button | Null] = js.native
}

object Layout {
  @scala.inline
  def apply(
    axis: js.Array[InvertibleAxis | Null],
    buttonAxis: js.Array[InvertibleAxis | Null],
    buttons: js.Array[Button | Null]
  ): Layout = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], buttonAxis = buttonAxis.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout]
  }
  @scala.inline
  implicit class LayoutOps[Self <: Layout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxis(value: js.Array[InvertibleAxis | Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonAxis(value: js.Array[InvertibleAxis | Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtons(value: js.Array[Button | Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

