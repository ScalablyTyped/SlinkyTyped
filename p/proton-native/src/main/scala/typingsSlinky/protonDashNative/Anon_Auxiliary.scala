package typingsSlinky.protonDashNative

import typingsSlinky.protonDashNative.protonDashNativeStrings.auxiliary
import typingsSlinky.protonDashNative.protonDashNativeStrings.bold
import typingsSlinky.protonDashNative.protonDashNativeStrings.book
import typingsSlinky.protonDashNative.protonDashNativeStrings.center
import typingsSlinky.protonDashNative.protonDashNativeStrings.condensed
import typingsSlinky.protonDashNative.protonDashNativeStrings.double
import typingsSlinky.protonDashNative.protonDashNativeStrings.expanded
import typingsSlinky.protonDashNative.protonDashNativeStrings.extraCondensed
import typingsSlinky.protonDashNative.protonDashNativeStrings.extraExpanded
import typingsSlinky.protonDashNative.protonDashNativeStrings.grammar
import typingsSlinky.protonDashNative.protonDashNativeStrings.heavy
import typingsSlinky.protonDashNative.protonDashNativeStrings.italic
import typingsSlinky.protonDashNative.protonDashNativeStrings.left
import typingsSlinky.protonDashNative.protonDashNativeStrings.light
import typingsSlinky.protonDashNative.protonDashNativeStrings.maximum
import typingsSlinky.protonDashNative.protonDashNativeStrings.medium
import typingsSlinky.protonDashNative.protonDashNativeStrings.minimum
import typingsSlinky.protonDashNative.protonDashNativeStrings.none
import typingsSlinky.protonDashNative.protonDashNativeStrings.normal
import typingsSlinky.protonDashNative.protonDashNativeStrings.oblique
import typingsSlinky.protonDashNative.protonDashNativeStrings.right
import typingsSlinky.protonDashNative.protonDashNativeStrings.semiBold
import typingsSlinky.protonDashNative.protonDashNativeStrings.semiCondensed
import typingsSlinky.protonDashNative.protonDashNativeStrings.semiExpanded
import typingsSlinky.protonDashNative.protonDashNativeStrings.single
import typingsSlinky.protonDashNative.protonDashNativeStrings.spelling
import typingsSlinky.protonDashNative.protonDashNativeStrings.suggestion
import typingsSlinky.protonDashNative.protonDashNativeStrings.thin
import typingsSlinky.protonDashNative.protonDashNativeStrings.ultraBold
import typingsSlinky.protonDashNative.protonDashNativeStrings.ultraCondensed
import typingsSlinky.protonDashNative.protonDashNativeStrings.ultraExpanded
import typingsSlinky.protonDashNative.protonDashNativeStrings.ultraHeavy
import typingsSlinky.protonDashNative.protonDashNativeStrings.ultraLight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Auxiliary extends js.Object {
  /**
    * The background color, specified as a CSS color string.
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /**
    * The text color, specified as a CSS color string.
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * The font family (only if available on the system).
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  /**
    * The font size (in pt).
    */
  var fontSize: js.UndefOr[Double] = js.undefined
  /**
    * Whether an italic font should be used.
    */
  var fontStyle: js.UndefOr[normal | oblique | italic] = js.undefined
  /**
    * Whether a bold font should be used (and the amount).
    */
  var fontWeight: js.UndefOr[
    minimum | thin | ultraLight | light | book | normal | medium | semiBold | bold | ultraBold | heavy | ultraHeavy | maximum | Double
  ] = js.undefined
  /**
    * Wheter the text should be aligned to the left, center or right.
    *
    * **Works only on a top level text component, not it's children!**
    */
  var textAlign: js.UndefOr[left | center | right] = js.undefined
  /**
    * How wide or narrow the characters should be.
    */
  var textStretch: js.UndefOr[
    ultraCondensed | extraCondensed | condensed | semiCondensed | normal | semiExpanded | expanded | extraExpanded | ultraExpanded
  ] = js.undefined
  /**
    * The text underline style.
    */
  var textUnderline: js.UndefOr[none | single | double | suggestion] = js.undefined
  /**
    * The text underline color.
    *
    * A color string | 'spelling' | 'grammar' | 'auxiliary'
    */
  var textUnderlineColor: js.UndefOr[spelling | grammar | auxiliary | String] = js.undefined
}

object Anon_Auxiliary {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    color: String = null,
    fontFamily: String = null,
    fontSize: Int | Double = null,
    fontStyle: normal | oblique | italic = null,
    fontWeight: minimum | thin | ultraLight | light | book | normal | medium | semiBold | bold | ultraBold | heavy | ultraHeavy | maximum | Double = null,
    textAlign: left | center | right = null,
    textStretch: ultraCondensed | extraCondensed | condensed | semiCondensed | normal | semiExpanded | expanded | extraExpanded | ultraExpanded = null,
    textUnderline: none | single | double | suggestion = null,
    textUnderlineColor: spelling | grammar | auxiliary | String = null
  ): Anon_Auxiliary = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (textStretch != null) __obj.updateDynamic("textStretch")(textStretch.asInstanceOf[js.Any])
    if (textUnderline != null) __obj.updateDynamic("textUnderline")(textUnderline.asInstanceOf[js.Any])
    if (textUnderlineColor != null) __obj.updateDynamic("textUnderlineColor")(textUnderlineColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Auxiliary]
  }
}

