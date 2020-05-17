package typingsSlinky.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrowV extends js.Object {
  var Arrow: MarginLeftMarginTop = js.native
  var ArrowV: MarginLeftWidth = js.native
  var Body: BorderTopColor = js.native
  var BodyBottomLine: BorderBottomWidth = js.native
  var Brief: MinHeightNumber = js.native
  var BriefText: FontSizePaddingTop = js.native
  var Content: FontSizeTextAlignVertical = js.native
  var Extra: FontSizeTextAlign = js.native
  var Footer: PaddingVertical = js.native
  var Header: PaddingTop = js.native
  var Item: FlexGrow = js.native
  var Line: MinHeight = js.native
  var Thumb: HeightMarginRight = js.native
  var column: FlexFlexDirection = js.native
  var multipleLine: PaddingVerticalNumber = js.native
  var multipleThumb: HeightWidth = js.native
  var underlayColor: BackgroundColorString = js.native
}

object ArrowV {
  @scala.inline
  def apply(
    Arrow: MarginLeftMarginTop,
    ArrowV: MarginLeftWidth,
    Body: BorderTopColor,
    BodyBottomLine: BorderBottomWidth,
    Brief: MinHeightNumber,
    BriefText: FontSizePaddingTop,
    Content: FontSizeTextAlignVertical,
    Extra: FontSizeTextAlign,
    Footer: PaddingVertical,
    Header: PaddingTop,
    Item: FlexGrow,
    Line: MinHeight,
    Thumb: HeightMarginRight,
    column: FlexFlexDirection,
    multipleLine: PaddingVerticalNumber,
    multipleThumb: HeightWidth,
    underlayColor: BackgroundColorString
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
    def withArrow(value: MarginLeftMarginTop): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArrowV(value: MarginLeftWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArrowV")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: BorderTopColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBodyBottomLine(value: BorderBottomWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BodyBottomLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrief(value: MinHeightNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Brief")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBriefText(value: FontSizePaddingTop): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BriefText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: FontSizeTextAlignVertical): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtra(value: FontSizeTextAlign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Extra")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooter(value: PaddingVertical): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Footer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeader(value: PaddingTop): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: FlexGrow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLine(value: MinHeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThumb(value: HeightMarginRight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Thumb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumn(value: FlexFlexDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultipleLine(value: PaddingVerticalNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultipleThumb(value: HeightWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleThumb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnderlayColor(value: BackgroundColorString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlayColor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

