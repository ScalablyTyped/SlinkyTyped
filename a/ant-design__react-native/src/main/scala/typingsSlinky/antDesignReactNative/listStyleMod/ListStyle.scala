package typingsSlinky.antDesignReactNative.listStyleMod

import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListStyle extends js.Object {
  var Arrow: ViewStyle = js.native
  var ArrowV: ViewStyle = js.native
  var Body: ViewStyle = js.native
  var BodyBottomLine: ViewStyle = js.native
  var Brief: ViewStyle = js.native
  var BriefText: TextStyle = js.native
  var Content: TextStyle = js.native
  var Extra: TextStyle = js.native
  var Footer: TextStyle = js.native
  var Header: TextStyle = js.native
  var Item: ViewStyle = js.native
  var Line: ViewStyle = js.native
  var Thumb: ImageStyle = js.native
  var column: ViewStyle = js.native
  var multipleLine: ViewStyle = js.native
  var multipleThumb: ImageStyle = js.native
  var underlayColor: ViewStyle = js.native
}

object ListStyle {
  @scala.inline
  def apply(
    Arrow: ViewStyle,
    ArrowV: ViewStyle,
    Body: ViewStyle,
    BodyBottomLine: ViewStyle,
    Brief: ViewStyle,
    BriefText: TextStyle,
    Content: TextStyle,
    Extra: TextStyle,
    Footer: TextStyle,
    Header: TextStyle,
    Item: ViewStyle,
    Line: ViewStyle,
    Thumb: ImageStyle,
    column: ViewStyle,
    multipleLine: ViewStyle,
    multipleThumb: ImageStyle,
    underlayColor: ViewStyle
  ): ListStyle = {
    val __obj = js.Dynamic.literal(Arrow = Arrow.asInstanceOf[js.Any], ArrowV = ArrowV.asInstanceOf[js.Any], Body = Body.asInstanceOf[js.Any], BodyBottomLine = BodyBottomLine.asInstanceOf[js.Any], Brief = Brief.asInstanceOf[js.Any], BriefText = BriefText.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], Extra = Extra.asInstanceOf[js.Any], Footer = Footer.asInstanceOf[js.Any], Header = Header.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any], Line = Line.asInstanceOf[js.Any], Thumb = Thumb.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], multipleLine = multipleLine.asInstanceOf[js.Any], multipleThumb = multipleThumb.asInstanceOf[js.Any], underlayColor = underlayColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStyle]
  }
  @scala.inline
  implicit class ListStyleOps[Self <: ListStyle] (val x: Self) extends AnyVal {
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
    def withArrowV(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArrowV")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBodyBottomLine(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BodyBottomLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrief(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Brief")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBriefText(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BriefText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtra(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Extra")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooter(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Footer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeader(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLine(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThumb(value: ImageStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Thumb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumn(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultipleLine(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultipleThumb(value: ImageStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleThumb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnderlayColor(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlayColor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

