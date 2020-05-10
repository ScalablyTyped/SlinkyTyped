package typingsSlinky.rbx.variablesMod

import typingsSlinky.rbx.ReadonlyArraystringnumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariablesDefinitions extends js.Object {
  var badgeSizes: ReadonlyArraystringnumber = js.native
  var breakpoints: ReadonlyArraystringnumber = js.native
  var breakpointsLimited: ReadonlyArraystringnumber = js.native
  var colors: ReadonlyArraystringnumber = js.native
  var displays: ReadonlyArraystringnumber = js.native
  var floatPulledAlignments: ReadonlyArraystringnumber = js.native
  var shades: ReadonlyArraystringnumber = js.native
  var textAlignments: ReadonlyArraystringnumber = js.native
  var textSizes: ReadonlyArraystringnumber = js.native
  var textTransforms: ReadonlyArraystringnumber = js.native
  var textWeights: ReadonlyArraystringnumber = js.native
  var tooltipPositions: ReadonlyArraystringnumber = js.native
}

object VariablesDefinitions {
  @scala.inline
  def apply(
    badgeSizes: ReadonlyArraystringnumber,
    breakpoints: ReadonlyArraystringnumber,
    breakpointsLimited: ReadonlyArraystringnumber,
    colors: ReadonlyArraystringnumber,
    displays: ReadonlyArraystringnumber,
    floatPulledAlignments: ReadonlyArraystringnumber,
    shades: ReadonlyArraystringnumber,
    textAlignments: ReadonlyArraystringnumber,
    textSizes: ReadonlyArraystringnumber,
    textTransforms: ReadonlyArraystringnumber,
    textWeights: ReadonlyArraystringnumber,
    tooltipPositions: ReadonlyArraystringnumber
  ): VariablesDefinitions = {
    val __obj = js.Dynamic.literal(badgeSizes = badgeSizes.asInstanceOf[js.Any], breakpoints = breakpoints.asInstanceOf[js.Any], breakpointsLimited = breakpointsLimited.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], displays = displays.asInstanceOf[js.Any], floatPulledAlignments = floatPulledAlignments.asInstanceOf[js.Any], shades = shades.asInstanceOf[js.Any], textAlignments = textAlignments.asInstanceOf[js.Any], textSizes = textSizes.asInstanceOf[js.Any], textTransforms = textTransforms.asInstanceOf[js.Any], textWeights = textWeights.asInstanceOf[js.Any], tooltipPositions = tooltipPositions.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariablesDefinitions]
  }
  @scala.inline
  implicit class VariablesDefinitionsOps[Self <: VariablesDefinitions] (val x: Self) extends AnyVal {
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
    def withBreakpoints(value: ReadonlyArraystringnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBreakpointsLimited(value: ReadonlyArraystringnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakpointsLimited")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColors(value: ReadonlyArraystringnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplays(value: ReadonlyArraystringnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFloatPulledAlignments(value: ReadonlyArraystringnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatPulledAlignments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShades(value: ReadonlyArraystringnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shades")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextAlignments(value: ReadonlyArraystringnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlignments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextSizes(value: ReadonlyArraystringnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textSizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextTransforms(value: ReadonlyArraystringnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textTransforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextWeights(value: ReadonlyArraystringnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textWeights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTooltipPositions(value: ReadonlyArraystringnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipPositions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

