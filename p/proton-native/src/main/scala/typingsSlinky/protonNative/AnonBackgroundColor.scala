package typingsSlinky.protonNative

import typingsSlinky.protonNative.protonNativeStrings.auxiliary
import typingsSlinky.protonNative.protonNativeStrings.bold
import typingsSlinky.protonNative.protonNativeStrings.book
import typingsSlinky.protonNative.protonNativeStrings.center
import typingsSlinky.protonNative.protonNativeStrings.condensed
import typingsSlinky.protonNative.protonNativeStrings.double
import typingsSlinky.protonNative.protonNativeStrings.expanded
import typingsSlinky.protonNative.protonNativeStrings.extraCondensed
import typingsSlinky.protonNative.protonNativeStrings.extraExpanded
import typingsSlinky.protonNative.protonNativeStrings.grammar
import typingsSlinky.protonNative.protonNativeStrings.heavy
import typingsSlinky.protonNative.protonNativeStrings.italic
import typingsSlinky.protonNative.protonNativeStrings.left
import typingsSlinky.protonNative.protonNativeStrings.light
import typingsSlinky.protonNative.protonNativeStrings.maximum
import typingsSlinky.protonNative.protonNativeStrings.medium
import typingsSlinky.protonNative.protonNativeStrings.minimum
import typingsSlinky.protonNative.protonNativeStrings.none
import typingsSlinky.protonNative.protonNativeStrings.normal
import typingsSlinky.protonNative.protonNativeStrings.oblique
import typingsSlinky.protonNative.protonNativeStrings.right
import typingsSlinky.protonNative.protonNativeStrings.semiBold
import typingsSlinky.protonNative.protonNativeStrings.semiCondensed
import typingsSlinky.protonNative.protonNativeStrings.semiExpanded
import typingsSlinky.protonNative.protonNativeStrings.single
import typingsSlinky.protonNative.protonNativeStrings.spelling
import typingsSlinky.protonNative.protonNativeStrings.suggestion
import typingsSlinky.protonNative.protonNativeStrings.thin
import typingsSlinky.protonNative.protonNativeStrings.ultraBold
import typingsSlinky.protonNative.protonNativeStrings.ultraCondensed
import typingsSlinky.protonNative.protonNativeStrings.ultraExpanded
import typingsSlinky.protonNative.protonNativeStrings.ultraHeavy
import typingsSlinky.protonNative.protonNativeStrings.ultraLight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackgroundColor extends js.Object {
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

object AnonBackgroundColor {
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
  ): AnonBackgroundColor = {
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
    __obj.asInstanceOf[AnonBackgroundColor]
  }
}

