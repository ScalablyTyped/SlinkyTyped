package typingsSlinky.overlayscrollbars.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverflowChangedArgs extends js.Object {
  var clipped: Boolean = js.native
  var x: Boolean = js.native
  var xScrollable: Boolean = js.native
  var y: Boolean = js.native
  var yScrollable: Boolean = js.native
}

object OverflowChangedArgs {
  @scala.inline
  def apply(clipped: Boolean, x: Boolean, xScrollable: Boolean, y: Boolean, yScrollable: Boolean): OverflowChangedArgs = {
    val __obj = js.Dynamic.literal(clipped = clipped.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xScrollable = xScrollable.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yScrollable = yScrollable.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverflowChangedArgs]
  }
  @scala.inline
  implicit class OverflowChangedArgsOps[Self <: OverflowChangedArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClipped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXScrollable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xScrollable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYScrollable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yScrollable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

