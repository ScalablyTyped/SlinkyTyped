package typingsSlinky.rebass.mod

import typingsSlinky.rebass.rebassStrings.fontWeights
import typingsSlinky.rebass.rebassStrings.letterSpacings
import typingsSlinky.rebass.rebassStrings.lineHeights
import typingsSlinky.styledSystem.mod.FontFamilyProps
import typingsSlinky.styledSystem.mod.FontStyleProps
import typingsSlinky.styledSystem.mod.FontWeightProps
import typingsSlinky.styledSystem.mod.LetterSpacingProps
import typingsSlinky.styledSystem.mod.LineHeightProps
import typingsSlinky.styledSystem.mod.RequiredTheme
import typingsSlinky.styledSystem.mod.TextAlignProps
import typingsSlinky.styledSystem.mod.ThemeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextKnownProps
  extends BoxKnownProps
     with FontFamilyProps[RequiredTheme]
     with FontWeightProps[RequiredTheme, ThemeValue[fontWeights, RequiredTheme, js.Any]]
     with FontStyleProps[RequiredTheme]
     with TextAlignProps[RequiredTheme]
     with LineHeightProps[RequiredTheme, ThemeValue[lineHeights, RequiredTheme, js.Any]]
     with LetterSpacingProps[RequiredTheme, ThemeValue[letterSpacings, RequiredTheme, js.Any]]

object TextKnownProps {
  @scala.inline
  def apply(): TextKnownProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextKnownProps]
  }
}

