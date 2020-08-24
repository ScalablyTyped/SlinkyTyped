package typingsSlinky.rbx.variablesMod

import typingsSlinky.rbx.rbxNumbers.`1`
import typingsSlinky.rbx.rbxNumbers.`2`
import typingsSlinky.rbx.rbxNumbers.`3`
import typingsSlinky.rbx.rbxNumbers.`4`
import typingsSlinky.rbx.rbxNumbers.`5`
import typingsSlinky.rbx.rbxNumbers.`6`
import typingsSlinky.rbx.rbxNumbers.`7`
import typingsSlinky.rbx.rbxStrings.`black-bis`
import typingsSlinky.rbx.rbxStrings.`black-ter`
import typingsSlinky.rbx.rbxStrings.`grey-dark`
import typingsSlinky.rbx.rbxStrings.`grey-darker`
import typingsSlinky.rbx.rbxStrings.`grey-light`
import typingsSlinky.rbx.rbxStrings.`grey-lighter`
import typingsSlinky.rbx.rbxStrings.`inline-block`
import typingsSlinky.rbx.rbxStrings.`inline-flex`
import typingsSlinky.rbx.rbxStrings.`inline`
import typingsSlinky.rbx.rbxStrings.`white-bis`
import typingsSlinky.rbx.rbxStrings.`white-ter`
import typingsSlinky.rbx.rbxStrings.black
import typingsSlinky.rbx.rbxStrings.block
import typingsSlinky.rbx.rbxStrings.bold
import typingsSlinky.rbx.rbxStrings.bottom
import typingsSlinky.rbx.rbxStrings.capitalized
import typingsSlinky.rbx.rbxStrings.centered
import typingsSlinky.rbx.rbxStrings.danger
import typingsSlinky.rbx.rbxStrings.dark
import typingsSlinky.rbx.rbxStrings.desktop
import typingsSlinky.rbx.rbxStrings.flex
import typingsSlinky.rbx.rbxStrings.fullhd
import typingsSlinky.rbx.rbxStrings.grey
import typingsSlinky.rbx.rbxStrings.info
import typingsSlinky.rbx.rbxStrings.justified
import typingsSlinky.rbx.rbxStrings.large
import typingsSlinky.rbx.rbxStrings.left
import typingsSlinky.rbx.rbxStrings.light
import typingsSlinky.rbx.rbxStrings.link
import typingsSlinky.rbx.rbxStrings.lowercase
import typingsSlinky.rbx.rbxStrings.medium
import typingsSlinky.rbx.rbxStrings.mobile
import typingsSlinky.rbx.rbxStrings.normal
import typingsSlinky.rbx.rbxStrings.primary
import typingsSlinky.rbx.rbxStrings.right
import typingsSlinky.rbx.rbxStrings.semibold
import typingsSlinky.rbx.rbxStrings.small
import typingsSlinky.rbx.rbxStrings.success
import typingsSlinky.rbx.rbxStrings.tablet
import typingsSlinky.rbx.rbxStrings.top
import typingsSlinky.rbx.rbxStrings.touch
import typingsSlinky.rbx.rbxStrings.uppercase
import typingsSlinky.rbx.rbxStrings.warning
import typingsSlinky.rbx.rbxStrings.white
import typingsSlinky.rbx.rbxStrings.widescreen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariablesDefaults extends js.Object {
  var badgeSizes: small | medium | large = js.native
  var breakpoints: mobile | tablet | desktop | widescreen | fullhd | touch = js.native
  var breakpointsLimited: mobile | fullhd | touch = js.native
  var colors: primary | success | info | warning | danger | light | dark | white | black | link = js.native
  var displays: block | flex | `inline` | `inline-block` | `inline-flex` = js.native
  var floatPulledAlignments: left | right = js.native
  var shades: `black-bis` | `black-ter` | `grey-darker` | `grey-dark` | grey | `grey-light` | `grey-lighter` | `white-ter` | `white-bis` = js.native
  var textAlignments: centered | justified | left | right = js.native
  var textSizes: `1` | `2` | `3` | `4` | `5` | `6` | `7` = js.native
  var textTransforms: capitalized | lowercase | uppercase = js.native
  var textWeights: light | medium | normal | semibold | bold = js.native
  var tooltipPositions: top | right | bottom | left = js.native
}

object VariablesDefaults {
  @scala.inline
  def apply(
    badgeSizes: small | medium | large,
    breakpoints: mobile | tablet | desktop | widescreen | fullhd | touch,
    breakpointsLimited: mobile | fullhd | touch,
    colors: primary | success | info | warning | danger | light | dark | white | black | link,
    displays: block | flex | `inline` | `inline-block` | `inline-flex`,
    floatPulledAlignments: left | right,
    shades: `black-bis` | `black-ter` | `grey-darker` | `grey-dark` | grey | `grey-light` | `grey-lighter` | `white-ter` | `white-bis`,
    textAlignments: centered | justified | left | right,
    textSizes: `1` | `2` | `3` | `4` | `5` | `6` | `7`,
    textTransforms: capitalized | lowercase | uppercase,
    textWeights: light | medium | normal | semibold | bold,
    tooltipPositions: top | right | bottom | left
  ): VariablesDefaults = {
    val __obj = js.Dynamic.literal(badgeSizes = badgeSizes.asInstanceOf[js.Any], breakpoints = breakpoints.asInstanceOf[js.Any], breakpointsLimited = breakpointsLimited.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], displays = displays.asInstanceOf[js.Any], floatPulledAlignments = floatPulledAlignments.asInstanceOf[js.Any], shades = shades.asInstanceOf[js.Any], textAlignments = textAlignments.asInstanceOf[js.Any], textSizes = textSizes.asInstanceOf[js.Any], textTransforms = textTransforms.asInstanceOf[js.Any], textWeights = textWeights.asInstanceOf[js.Any], tooltipPositions = tooltipPositions.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariablesDefaults]
  }
  @scala.inline
  implicit class VariablesDefaultsOps[Self <: VariablesDefaults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBadgeSizes(value: small | medium | large): Self = this.set("badgeSizes", value.asInstanceOf[js.Any])
    @scala.inline
    def setBreakpoints(value: mobile | tablet | desktop | widescreen | fullhd | touch): Self = this.set("breakpoints", value.asInstanceOf[js.Any])
    @scala.inline
    def setBreakpointsLimited(value: mobile | fullhd | touch): Self = this.set("breakpointsLimited", value.asInstanceOf[js.Any])
    @scala.inline
    def setColors(value: primary | success | info | warning | danger | light | dark | white | black | link): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplays(value: block | flex | `inline` | `inline-block` | `inline-flex`): Self = this.set("displays", value.asInstanceOf[js.Any])
    @scala.inline
    def setFloatPulledAlignments(value: left | right): Self = this.set("floatPulledAlignments", value.asInstanceOf[js.Any])
    @scala.inline
    def setShades(
      value: `black-bis` | `black-ter` | `grey-darker` | `grey-dark` | grey | `grey-light` | `grey-lighter` | `white-ter` | `white-bis`
    ): Self = this.set("shades", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextAlignments(value: centered | justified | left | right): Self = this.set("textAlignments", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextSizes(value: `1` | `2` | `3` | `4` | `5` | `6` | `7`): Self = this.set("textSizes", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextTransforms(value: capitalized | lowercase | uppercase): Self = this.set("textTransforms", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextWeights(value: light | medium | normal | semibold | bold): Self = this.set("textWeights", value.asInstanceOf[js.Any])
    @scala.inline
    def setTooltipPositions(value: top | right | bottom | left): Self = this.set("tooltipPositions", value.asInstanceOf[js.Any])
  }
  
}

