package typingsSlinky.antDesignReactNative

import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@ant-design/react-native.@ant-design/react-native/lib/list/style.ListStyle> */
@js.native
trait PartialListStyle extends js.Object {
  var Arrow: js.UndefOr[ViewStyle] = js.native
  var ArrowV: js.UndefOr[ViewStyle] = js.native
  var Body: js.UndefOr[ViewStyle] = js.native
  var BodyBottomLine: js.UndefOr[ViewStyle] = js.native
  var Brief: js.UndefOr[ViewStyle] = js.native
  var BriefText: js.UndefOr[TextStyle] = js.native
  var Content: js.UndefOr[TextStyle] = js.native
  var Extra: js.UndefOr[TextStyle] = js.native
  var Footer: js.UndefOr[TextStyle] = js.native
  var Header: js.UndefOr[TextStyle] = js.native
  var Item: js.UndefOr[ViewStyle] = js.native
  var Line: js.UndefOr[ViewStyle] = js.native
  var Thumb: js.UndefOr[ImageStyle] = js.native
  var column: js.UndefOr[ViewStyle] = js.native
  var multipleLine: js.UndefOr[ViewStyle] = js.native
  var multipleThumb: js.UndefOr[ImageStyle] = js.native
  var underlayColor: js.UndefOr[ViewStyle] = js.native
}

object PartialListStyle {
  @scala.inline
  def apply(): PartialListStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialListStyle]
  }
  @scala.inline
  implicit class PartialListStyleOps[Self <: PartialListStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrow(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arrow")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowV(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArrowV")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowV: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArrowV")(js.undefined)
        ret
    }
    @scala.inline
    def withBody(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Body")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyBottomLine(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BodyBottomLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyBottomLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BodyBottomLine")(js.undefined)
        ret
    }
    @scala.inline
    def withBrief(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Brief")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrief: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Brief")(js.undefined)
        ret
    }
    @scala.inline
    def withBriefText(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BriefText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBriefText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BriefText")(js.undefined)
        ret
    }
    @scala.inline
    def withContent(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Content")(js.undefined)
        ret
    }
    @scala.inline
    def withExtra(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Extra")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtra: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Extra")(js.undefined)
        ret
    }
    @scala.inline
    def withFooter(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Footer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Footer")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Header")(js.undefined)
        ret
    }
    @scala.inline
    def withItem(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(js.undefined)
        ret
    }
    @scala.inline
    def withLine(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Line")(js.undefined)
        ret
    }
    @scala.inline
    def withThumb(value: ImageStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Thumb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Thumb")(js.undefined)
        ret
    }
    @scala.inline
    def withColumn(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(js.undefined)
        ret
    }
    @scala.inline
    def withMultipleLine(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultipleLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleLine")(js.undefined)
        ret
    }
    @scala.inline
    def withMultipleThumb(value: ImageStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleThumb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultipleThumb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleThumb")(js.undefined)
        ret
    }
    @scala.inline
    def withUnderlayColor(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlayColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnderlayColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlayColor")(js.undefined)
        ret
    }
  }
  
}

