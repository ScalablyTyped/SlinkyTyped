package typingsSlinky.grommet

import typingsSlinky.grommet.utilsMod.BreakpointBorderSize
import typingsSlinky.grommet.utilsMod.BreakpointEdgeSize
import typingsSlinky.grommet.utilsMod.BreakpointSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBorderSize extends js.Object {
  var borderSize: js.UndefOr[BreakpointBorderSize] = js.native
  var edgeSize: js.UndefOr[BreakpointEdgeSize] = js.native
  var size: js.UndefOr[BreakpointSize] = js.native
  var value: js.UndefOr[Double] = js.native
}

object AnonBorderSize {
  @scala.inline
  def apply(): AnonBorderSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonBorderSize]
  }
  @scala.inline
  implicit class AnonBorderSizeOps[Self <: AnonBorderSize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderSize(value: BreakpointBorderSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderSize")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeSize(value: BreakpointEdgeSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: BreakpointSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

