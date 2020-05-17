package typingsSlinky.antDesignReactNative.anon

import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.RegisteredStyle
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrowV extends js.Object {
  var Arrow: RegisteredStyle[ViewStyle] = js.native
  var ArrowV: RegisteredStyle[ViewStyle] = js.native
  var Body: RegisteredStyle[ViewStyle] = js.native
  var BodyBottomLine: RegisteredStyle[ViewStyle] = js.native
  var Brief: RegisteredStyle[ViewStyle] = js.native
  var BriefText: RegisteredStyle[TextStyle] = js.native
  var Content: RegisteredStyle[TextStyle] = js.native
  var Extra: RegisteredStyle[TextStyle] = js.native
  var Footer: RegisteredStyle[TextStyle] = js.native
  var Header: RegisteredStyle[TextStyle] = js.native
  var Item: RegisteredStyle[ViewStyle] = js.native
  var Line: RegisteredStyle[ViewStyle] = js.native
  var Thumb: RegisteredStyle[ImageStyle] = js.native
  var column: RegisteredStyle[ViewStyle] = js.native
  var multipleLine: RegisteredStyle[ViewStyle] = js.native
  var multipleThumb: RegisteredStyle[ImageStyle] = js.native
  var underlayColor: RegisteredStyle[ViewStyle] = js.native
}

object ArrowV {
  @scala.inline
  def apply(
    Arrow: RegisteredStyle[ViewStyle],
    ArrowV: RegisteredStyle[ViewStyle],
    Body: RegisteredStyle[ViewStyle],
    BodyBottomLine: RegisteredStyle[ViewStyle],
    Brief: RegisteredStyle[ViewStyle],
    BriefText: RegisteredStyle[TextStyle],
    Content: RegisteredStyle[TextStyle],
    Extra: RegisteredStyle[TextStyle],
    Footer: RegisteredStyle[TextStyle],
    Header: RegisteredStyle[TextStyle],
    Item: RegisteredStyle[ViewStyle],
    Line: RegisteredStyle[ViewStyle],
    Thumb: RegisteredStyle[ImageStyle],
    column: RegisteredStyle[ViewStyle],
    multipleLine: RegisteredStyle[ViewStyle],
    multipleThumb: RegisteredStyle[ImageStyle],
    underlayColor: RegisteredStyle[ViewStyle]
  ): ArrowV = {
    val __obj = js.Dynamic.literal(Arrow = Arrow.asInstanceOf[js.Any], ArrowV = ArrowV.asInstanceOf[js.Any], Body = Body.asInstanceOf[js.Any], BodyBottomLine = BodyBottomLine.asInstanceOf[js.Any], Brief = Brief.asInstanceOf[js.Any], BriefText = BriefText.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], Extra = Extra.asInstanceOf[js.Any], Footer = Footer.asInstanceOf[js.Any], Header = Header.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any], Line = Line.asInstanceOf[js.Any], Thumb = Thumb.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], multipleLine = multipleLine.asInstanceOf[js.Any], multipleThumb = multipleThumb.asInstanceOf[js.Any], underlayColor = underlayColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrowV]
  }
  @scala.inline
  implicit class ArrowVOps[Self <: ArrowV] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrow(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArrowV(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArrowV")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBodyBottomLine(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BodyBottomLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrief(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Brief")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBriefText(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BriefText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtra(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Extra")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooter(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Footer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeader(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLine(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThumb(value: RegisteredStyle[ImageStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Thumb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumn(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultipleLine(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultipleThumb(value: RegisteredStyle[ImageStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleThumb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnderlayColor(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlayColor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

