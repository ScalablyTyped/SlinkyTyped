package typingsSlinky.cathoQuantum.breakpointsMod

import typingsSlinky.cathoQuantum.AnonColumns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Breakpoints extends js.Object {
  var large: AnonColumns = js.native
  var medium: AnonColumns = js.native
  var small: AnonColumns = js.native
  var xlarge: AnonColumns = js.native
  var xsmall: AnonColumns = js.native
}

object Breakpoints {
  @scala.inline
  def apply(
    large: AnonColumns,
    medium: AnonColumns,
    small: AnonColumns,
    xlarge: AnonColumns,
    xsmall: AnonColumns
  ): Breakpoints = {
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
    def withLarge(value: AnonColumns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("large")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMedium(value: AnonColumns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medium")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmall(value: AnonColumns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("small")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXlarge(value: AnonColumns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xlarge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXsmall(value: AnonColumns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xsmall")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

