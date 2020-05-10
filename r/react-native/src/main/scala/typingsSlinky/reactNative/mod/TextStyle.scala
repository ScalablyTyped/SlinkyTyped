package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.AnonHeight
import typingsSlinky.reactNative.reactNativeStrings.`100`
import typingsSlinky.reactNative.reactNativeStrings.`200`
import typingsSlinky.reactNative.reactNativeStrings.`300`
import typingsSlinky.reactNative.reactNativeStrings.`400`
import typingsSlinky.reactNative.reactNativeStrings.`500`
import typingsSlinky.reactNative.reactNativeStrings.`600`
import typingsSlinky.reactNative.reactNativeStrings.`700`
import typingsSlinky.reactNative.reactNativeStrings.`800`
import typingsSlinky.reactNative.reactNativeStrings.`900`
import typingsSlinky.reactNative.reactNativeStrings.`line-through`
import typingsSlinky.reactNative.reactNativeStrings.`underline line-through`
import typingsSlinky.reactNative.reactNativeStrings.auto
import typingsSlinky.reactNative.reactNativeStrings.bold
import typingsSlinky.reactNative.reactNativeStrings.bottom
import typingsSlinky.reactNative.reactNativeStrings.capitalize
import typingsSlinky.reactNative.reactNativeStrings.center
import typingsSlinky.reactNative.reactNativeStrings.italic
import typingsSlinky.reactNative.reactNativeStrings.justify
import typingsSlinky.reactNative.reactNativeStrings.left
import typingsSlinky.reactNative.reactNativeStrings.lowercase
import typingsSlinky.reactNative.reactNativeStrings.none
import typingsSlinky.reactNative.reactNativeStrings.normal_
import typingsSlinky.reactNative.reactNativeStrings.right
import typingsSlinky.reactNative.reactNativeStrings.top
import typingsSlinky.reactNative.reactNativeStrings.underline
import typingsSlinky.reactNative.reactNativeStrings.uppercase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.reactNative.mod.TransformsStyle because Already inherited
- typingsSlinky.reactNative.mod.ShadowStyleIOS because Already inherited
- typingsSlinky.reactNative.mod.FlexStyle because Already inherited
- typingsSlinky.reactNative.mod.ViewStyle because Already inherited
- typingsSlinky.reactNative.mod.TextStyleAndroid because var conflicts: alignContent, alignItems, alignSelf, aspectRatio, backfaceVisibility, backgroundColor, borderBottomColor, borderBottomEndRadius, borderBottomLeftRadius, borderBottomRightRadius, borderBottomStartRadius, borderBottomWidth, borderColor, borderEndColor, borderEndWidth, borderLeftColor, borderLeftWidth, borderRadius, borderRightColor, borderRightWidth, borderStartColor, borderStartWidth, borderStyle, borderTopColor, borderTopEndRadius, borderTopLeftRadius, borderTopRightRadius, borderTopStartRadius, borderTopWidth, borderWidth, bottom, direction, display, elevation, end, flex, flexBasis, flexDirection, flexGrow, flexShrink, flexWrap, height, justifyContent, left, margin, marginBottom, marginEnd, marginHorizontal, marginLeft, marginRight, marginStart, marginTop, marginVertical, maxHeight, maxWidth, minHeight, minWidth, opacity, overflow, padding, paddingBottom, paddingEnd, paddingHorizontal, paddingLeft, paddingRight, paddingStart, paddingTop, paddingVertical, position, right, rotation, scaleX, scaleY, shadowColor, shadowOffset, shadowOpacity, shadowRadius, start, testID, top, transform, transformMatrix, translateX, translateY, width, zIndex. Inlined textAlignVertical, includeFontPadding */ @js.native
trait TextStyle extends TextStyleIOS {
  var color: js.UndefOr[String] = js.native
  var fontFamily: js.UndefOr[String] = js.native
  var fontSize: js.UndefOr[Double] = js.native
  var fontStyle: js.UndefOr[normal_ | italic] = js.native
  /**
    * Specifies font weight. The values 'normal' and 'bold' are supported
    * for most fonts. Not all fonts have a variant for each of the numeric
    * values, in that case the closest one is chosen.
    */
  var fontWeight: js.UndefOr[
    normal_ | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900`
  ] = js.native
  var includeFontPadding: js.UndefOr[Boolean] = js.native
  var lineHeight: js.UndefOr[Double] = js.native
  var textAlign: js.UndefOr[auto | left | right | center | justify] = js.native
  var textAlignVertical: js.UndefOr[auto | top | bottom | center] = js.native
  var textDecorationLine: js.UndefOr[none | underline | `line-through` | (`underline line-through`)] = js.native
  var textShadowColor: js.UndefOr[String] = js.native
  var textShadowOffset: js.UndefOr[AnonHeight] = js.native
  var textShadowRadius: js.UndefOr[Double] = js.native
  var textTransform: js.UndefOr[none | capitalize | uppercase | lowercase] = js.native
}

object TextStyle {
  @scala.inline
  def apply(): TextStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextStyle]
  }
  @scala.inline
  implicit class TextStyleOps[Self <: TextStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withFontStyle(value: normal_ | italic): Self = {
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
    def withFontWeight(value: normal_ | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900`): Self = {
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
    def withIncludeFontPadding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeFontPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeFontPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeFontPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withLineHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withTextAlign(value: auto | left | right | center | justify): Self = {
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
    def withTextAlignVertical(value: auto | top | bottom | center): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlignVertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextAlignVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlignVertical")(js.undefined)
        ret
    }
    @scala.inline
    def withTextDecorationLine(value: none | underline | `line-through` | (`underline line-through`)): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDecorationLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextDecorationLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDecorationLine")(js.undefined)
        ret
    }
    @scala.inline
    def withTextShadowColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textShadowColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextShadowColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textShadowColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTextShadowOffset(value: AnonHeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textShadowOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextShadowOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textShadowOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withTextShadowRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textShadowRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextShadowRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textShadowRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withTextTransform(value: none | capitalize | uppercase | lowercase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textTransform")(js.undefined)
        ret
    }
  }
  
}

