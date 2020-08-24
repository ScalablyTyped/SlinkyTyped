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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    @scala.inline
    def setFontStyle(value: normal | oblique | italic): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    @scala.inline
    def setFontWeight(
      value: minimum | thin | ultraLight | light | book | normal | medium | semiBold | bold | ultraBold | heavy | ultraHeavy | maximum | Double
    ): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    @scala.inline
    def setTextAlign(value: left | center | right): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
    @scala.inline
    def setTextStretch(
      value: ultraCondensed | extraCondensed | condensed | semiCondensed | normal | semiExpanded | expanded | extraExpanded | ultraExpanded
    ): Self = this.set("textStretch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextStretch: Self = this.set("textStretch", js.undefined)
    @scala.inline
    def setTextUnderline(value: none | single | double | suggestion): Self = this.set("textUnderline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextUnderline: Self = this.set("textUnderline", js.undefined)
    @scala.inline
    def setTextUnderlineColor(value: spelling | grammar | auxiliary | String): Self = this.set("textUnderlineColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextUnderlineColor: Self = this.set("textUnderlineColor", js.undefined)
  }
  
}

