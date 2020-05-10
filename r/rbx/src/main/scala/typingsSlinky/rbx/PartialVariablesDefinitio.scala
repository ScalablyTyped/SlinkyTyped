package typingsSlinky.rbx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<rbx.rbx/base/helpers/variables.VariablesDefinitions> */
@js.native
trait PartialVariablesDefinitio extends js.Object {
  var badgeSizes: js.UndefOr[ReadonlyArraystringnumber] = js.native
  var breakpoints: js.UndefOr[ReadonlyArraystringnumber] = js.native
  var breakpointsLimited: js.UndefOr[ReadonlyArraystringnumber] = js.native
  var colors: js.UndefOr[ReadonlyArraystringnumber] = js.native
  var displays: js.UndefOr[ReadonlyArraystringnumber] = js.native
  var floatPulledAlignments: js.UndefOr[ReadonlyArraystringnumber] = js.native
  var shades: js.UndefOr[ReadonlyArraystringnumber] = js.native
  var textAlignments: js.UndefOr[ReadonlyArraystringnumber] = js.native
  var textSizes: js.UndefOr[ReadonlyArraystringnumber] = js.native
  var textTransforms: js.UndefOr[ReadonlyArraystringnumber] = js.native
  var textWeights: js.UndefOr[ReadonlyArraystringnumber] = js.native
  var tooltipPositions: js.UndefOr[ReadonlyArraystringnumber] = js.native
}

object PartialVariablesDefinitio {
  @scala.inline
  def apply(): PartialVariablesDefinitio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialVariablesDefinitio]
  }
  @scala.inline
  implicit class PartialVariablesDefinitioOps[Self <: PartialVariablesDefinitio] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBadgeSizes(value: ReadonlyArraystringnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgeSizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBadgeSizes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgeSizes")(js.undefined)
        ret
    }
    @scala.inline
    def withBreakpoints(value: ReadonlyArraystringnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreakpoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakpoints")(js.undefined)
        ret
    }
    @scala.inline
    def withBreakpointsLimited(value: ReadonlyArraystringnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakpointsLimited")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreakpointsLimited: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakpointsLimited")(js.undefined)
        ret
    }
    @scala.inline
    def withColors(value: ReadonlyArraystringnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplays(value: ReadonlyArraystringnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displays")(js.undefined)
        ret
    }
    @scala.inline
    def withFloatPulledAlignments(value: ReadonlyArraystringnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatPulledAlignments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloatPulledAlignments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatPulledAlignments")(js.undefined)
        ret
    }
    @scala.inline
    def withShades(value: ReadonlyArraystringnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shades")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShades: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shades")(js.undefined)
        ret
    }
    @scala.inline
    def withTextAlignments(value: ReadonlyArraystringnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlignments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextAlignments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlignments")(js.undefined)
        ret
    }
    @scala.inline
    def withTextSizes(value: ReadonlyArraystringnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textSizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextSizes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textSizes")(js.undefined)
        ret
    }
    @scala.inline
    def withTextTransforms(value: ReadonlyArraystringnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textTransforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextTransforms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textTransforms")(js.undefined)
        ret
    }
    @scala.inline
    def withTextWeights(value: ReadonlyArraystringnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textWeights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextWeights: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textWeights")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipPositions(value: ReadonlyArraystringnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipPositions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipPositions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipPositions")(js.undefined)
        ret
    }
  }
  
}

