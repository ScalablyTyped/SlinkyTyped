package typingsSlinky.atMaterialDashUiCore.stylesCreateTypographyMod

import typingsSlinky.csstype.csstypeMod.ColorProperty
import typingsSlinky.csstype.csstypeMod.FontFamilyProperty
import typingsSlinky.csstype.csstypeMod.FontSizeProperty
import typingsSlinky.csstype.csstypeMod.FontWeightProperty
import typingsSlinky.csstype.csstypeMod.LetterSpacingProperty
import typingsSlinky.csstype.csstypeMod.LineHeightProperty
import typingsSlinky.csstype.csstypeMod.TextTransformProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<std.Pick<@material-ui/core.@material-ui/core/styles/withStyles.CSSProperties, 'fontFamily' | 'fontSize' | 'fontWeight' | 'color'>> & std.Partial<std.Pick<@material-ui/core.@material-ui/core/styles/withStyles.CSSProperties, 'letterSpacing' | 'lineHeight' | 'textTransform'>> */
@js.native
trait TypographyStyle extends js.Object {
  var color: ColorProperty = js.native
  var fontFamily: FontFamilyProperty = js.native
  var fontSize: FontSizeProperty[Double | String] = js.native
  var fontWeight: FontWeightProperty = js.native
  var letterSpacing: js.UndefOr[LetterSpacingProperty[Double | String]] = js.native
  var lineHeight: js.UndefOr[LineHeightProperty[Double | String]] = js.native
  var textTransform: js.UndefOr[TextTransformProperty] = js.native
}

object TypographyStyle {
  @scala.inline
  def apply(
    color: ColorProperty,
    fontFamily: FontFamilyProperty,
    fontSize: FontSizeProperty[Double | String],
    fontWeight: FontWeightProperty,
    letterSpacing: LetterSpacingProperty[Double | String] = null,
    lineHeight: LineHeightProperty[Double | String] = null,
    textTransform: TextTransformProperty = null
  ): TypographyStyle = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any])
    if (letterSpacing != null) __obj.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (textTransform != null) __obj.updateDynamic("textTransform")(textTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypographyStyle]
  }
}

