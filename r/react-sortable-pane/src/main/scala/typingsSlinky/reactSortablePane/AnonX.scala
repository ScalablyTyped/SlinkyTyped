package typingsSlinky.reactSortablePane

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonX extends js.Object {
  var x: Boolean = js.native
  var xy: Boolean = js.native
  var y: Boolean = js.native
}

object AnonX {
  @scala.inline
  def apply(x: Boolean, xy: Boolean, y: Boolean): AnonX = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], xy = xy.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonX]
  }
  @scala.inline
  implicit class AnonXOps[Self <: AnonX] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withX(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

