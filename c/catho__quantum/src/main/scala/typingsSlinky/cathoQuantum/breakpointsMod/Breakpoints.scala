package typingsSlinky.cathoQuantum.breakpointsMod

import typingsSlinky.cathoQuantum.anon.Columns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Breakpoints extends js.Object {
  var large: Columns = js.native
  var medium: Columns = js.native
  var small: Columns = js.native
  var xlarge: Columns = js.native
  var xsmall: Columns = js.native
}

object Breakpoints {
  @scala.inline
  def apply(large: Columns, medium: Columns, small: Columns, xlarge: Columns, xsmall: Columns): Breakpoints = {
    val __obj = js.Dynamic.literal(large = large.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any], xlarge = xlarge.asInstanceOf[js.Any], xsmall = xsmall.asInstanceOf[js.Any])
    __obj.asInstanceOf[Breakpoints]
  }
  @scala.inline
  implicit class BreakpointsOps[Self <: Breakpoints] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLarge(value: Columns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("large")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMedium(value: Columns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medium")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmall(value: Columns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("small")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXlarge(value: Columns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xlarge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXsmall(value: Columns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xsmall")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

