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

/* Inlined rbx.rbx/types.Prefer<rbx.rbx/base/helpers/variables.VariablesOverrides, rbx.rbx/base/helpers/variables.VariablesDefaults> */
trait Variables extends js.Object {
  var badgeSizes: small | medium | large
  var breakpoints: mobile | tablet | desktop | widescreen | fullhd | touch
  var breakpointsLimited: mobile | fullhd | touch
  var colors: primary | success | info | warning | danger | light | dark | white | black | link
  var displays: block | flex | `inline` | `inline-block` | `inline-flex`
  var floatPulledAlignments: left | right
  var shades: `black-bis` | `black-ter` | `grey-darker` | `grey-dark` | grey | `grey-light` | `grey-lighter` | `white-ter` | `white-bis`
  var textAlignments: centered | justified | left | right
  var textSizes: `1` | `2` | `3` | `4` | `5` | `6` | `7`
  var textTransforms: capitalized | lowercase | uppercase
  var textWeights: light | medium | normal | semibold | bold
  var tooltipPositions: top | right | bottom | left
}

object Variables {
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
  ): Variables = {
    val __obj = js.Dynamic.literal(badgeSizes = badgeSizes.asInstanceOf[js.Any], breakpoints = breakpoints.asInstanceOf[js.Any], breakpointsLimited = breakpointsLimited.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], displays = displays.asInstanceOf[js.Any], floatPulledAlignments = floatPulledAlignments.asInstanceOf[js.Any], shades = shades.asInstanceOf[js.Any], textAlignments = textAlignments.asInstanceOf[js.Any], textSizes = textSizes.asInstanceOf[js.Any], textTransforms = textTransforms.asInstanceOf[js.Any], textWeights = textWeights.asInstanceOf[js.Any], tooltipPositions = tooltipPositions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Variables]
  }
}

