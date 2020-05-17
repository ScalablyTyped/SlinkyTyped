package typingsSlinky.c3.mod

import typingsSlinky.c3.anon.Front
import typingsSlinky.c3.anon.Show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridOptions extends js.Object {
  var focus: js.UndefOr[Show] = js.native
  var lines: js.UndefOr[Front] = js.native
  var x: js.UndefOr[AxisGridOptions] = js.native
  var y: js.UndefOr[AxisGridOptions] = js.native
}

object GridOptions {
  @scala.inline
  def apply(): GridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridOptions]
  }
  @scala.inline
  implicit class GridOptionsOps[Self <: GridOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFocus(value: Show): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.undefined)
        ret
    }
    @scala.inline
    def withLines(value: Front): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lines")(js.undefined)
        ret
    }
    @scala.inline
    def withX(value: AxisGridOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: AxisGridOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
  }
  
}

