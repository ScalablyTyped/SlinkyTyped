package typingsSlinky.protonNative.anon

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

@js.native
trait BackgroundColor extends js.Object {
  /**
    * The background color, specified as a CSS color string.
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /**
    * The text color, specified as a CSS color string.
    */
  var color: js.UndefOr[String] = js.native
  /**
    * The font family (only if available on the system).
    */
  var fontFamily: js.UndefOr[String] = js.native
  /**
    * The font size (in pt).
    */
  var fontSize: js.UndefOr[Double] = js.native
  /**
    * Whether an italic font should be used.
    */
  var fontStyle: js.UndefOr[normal | oblique | italic] = js.native
  /**
    * Whether a bold font should be used (and the amount).
    */
  var fontWeight: js.UndefOr[
    minimum | thin | ultraLight | light | book | normal | medium | semiBold | bold | ultraBold | heavy | ultraHeavy | maximum | Double
  ] = js.native
  /**
    * Wheter the text should be aligned to the left, center or right.
    *
    * **Works only on a top level text component, not it's children!**
    */
  var textAlign: js.UndefOr[left | center | right] = js.native
  /**
    * How wide or narrow the characters should be.
    */
  var textStretch: js.UndefOr[
    ultraCondensed | extraCondensed | condensed | semiCondensed | normal | semiExpanded | expanded | extraExpanded | ultraExpanded
  ] = js.native
  /**
    * The text underline style.
    */
  var textUnderline: js.UndefOr[none | single | double | suggestion] = js.native
  /**
    * The text underline color.
    *
    * A color string | 'spelling' | 'grammar' | 'auxiliary'
    */
  var textUnderlineColor: js.UndefOr[spelling | grammar | auxiliary | String] = js.native
}

object BackgroundColor {
  @scala.inline
  def apply(): BackgroundColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundColor]
  }
  @scala.inline
  implicit class BackgroundColorOps[Self <: BackgroundColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withFontStyle(value: normal | oblique | italic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withFontWeight(
      value: minimum | thin | ultraLight | light | book | normal | medium | semiBold | bold | ultraBold | heavy | ultraHeavy | maximum | Double
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withTextAlign(value: left | center | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withTextStretch(
      value: ultraCondensed | extraCondensed | condensed | semiCondensed | normal | semiExpanded | expanded | extraExpanded | ultraExpanded
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStretch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextStretch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStretch")(js.undefined)
        ret
    }
    @scala.inline
    def withTextUnderline(value: none | single | double | suggestion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textUnderline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextUnderline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textUnderline")(js.undefined)
        ret
    }
    @scala.inline
    def withTextUnderlineColor(value: spelling | grammar | auxiliary | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textUnderlineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextUnderlineColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textUnderlineColor")(js.undefined)
        ret
    }
  }
  
}

