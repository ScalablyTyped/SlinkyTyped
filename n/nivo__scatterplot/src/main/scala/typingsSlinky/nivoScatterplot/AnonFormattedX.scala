package typingsSlinky.nivoScatterplot

import typingsSlinky.nivoScatterplot.mod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFormattedX extends js.Object {
  var formattedX: String | Double = js.native
  var formattedY: String | Double = js.native
  var x: Value = js.native
  var y: Value = js.native
}

object AnonFormattedX {
  @scala.inline
  def apply(formattedX: String | Double, formattedY: String | Double, x: Value, y: Value): AnonFormattedX = {
    val __obj = js.Dynamic.literal(formattedX = formattedX.asInstanceOf[js.Any], formattedY = formattedY.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFormattedX]
  }
  @scala.inline
  implicit class AnonFormattedXOps[Self <: AnonFormattedX] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormattedX(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormattedY(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

