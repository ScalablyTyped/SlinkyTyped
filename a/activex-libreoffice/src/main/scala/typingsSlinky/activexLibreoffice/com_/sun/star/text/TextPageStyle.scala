package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.com_.sun.star.util.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a page style for a text document.
  *
  * This service extends the service {@link com.sun.star.style.PageStyle} with specific properties for text documents.
  */
@js.native
trait TextPageStyle extends js.Object {
  /**
    * contains the interface to the text of the footer.
    * @see com.sun.star.text.Text
    */
  var FooterText: XText = js.native
  /**
    * contains the interface to the text of the footer of a first page.
    * @see com.sun.star.text.Text
    * @since LibreOffice 4.0
    */
  var FooterTextFirst: XText = js.native
  /**
    * contains the interface to the text of the footer of a left page.
    * @see com.sun.star.text.Text
    */
  var FooterTextLeft: XText = js.native
  /**
    * contains the interface to the text of the footer of a right page.
    * @see com.sun.star.text.Text
    */
  var FooterTextRight: XText = js.native
  /**
    * contains the maximum height of the footnote area (in 1/100 mm).
    *
    * If set to zero, the height of the current page is used as limit.
    */
  var FootnoteHeight: Double = js.native
  /**
    * contains the adjustment of the separator line between the text and the footnote area.
    * @see com.sun.star.text.HorizontalAdjust
    */
  var FootnoteLineAdjust: Double = js.native
  /** contains the color of the separator line between the text and the footnote area. */
  var FootnoteLineColor: Color = js.native
  /** contains the distance between the footnote area and the separator line between the text and the footnote area (in 1/100 mm). */
  var FootnoteLineDistance: Double = js.native
  /** contains the relative width of the separator line between the text and the footnote area (in percent). */
  var FootnoteLineRelativeWidth: Double = js.native
  /** contains the distance between the text and the separator line between the text and the footnote area (in 1/100 mm). */
  var FootnoteLineTextDistance: Double = js.native
  /** contains the weight of the separator line between the text and the footnote area (in 1/100 mm). */
  var FootnoteLineWeight: Double = js.native
  /**
    * contains the interface to the text of the header.
    * @see com.sun.star.text.Text
    */
  var HeaderText: XText = js.native
  /**
    * contains the interface to the text of the header of first pages.
    * @see com.sun.star.text.Text
    * @since LibreOffice 4.0
    */
  var HeaderTextFirst: XText = js.native
  /**
    * contains the interface to the text of the header of left pages.
    * @see com.sun.star.text.Text
    */
  var HeaderTextLeft: XText = js.native
  /**
    * contains the interface to the text of the header of right pages.
    * @see com.sun.star.text.Text
    */
  var HeaderTextRight: XText = js.native
  /** determines whether the register mode is active on that page. */
  var RegisterModeActive: Boolean = js.native
  /** contains the name of the paragraph style that is used as reference of the register mode. */
  var RegisterParagraphStyle: String = js.native
  /** contains the column settings of the page. */
  var TextColumns: XTextColumns = js.native
}

object TextPageStyle {
  @scala.inline
  def apply(
    FooterText: XText,
    FooterTextFirst: XText,
    FooterTextLeft: XText,
    FooterTextRight: XText,
    FootnoteHeight: Double,
    FootnoteLineAdjust: Double,
    FootnoteLineColor: Color,
    FootnoteLineDistance: Double,
    FootnoteLineRelativeWidth: Double,
    FootnoteLineTextDistance: Double,
    FootnoteLineWeight: Double,
    HeaderText: XText,
    HeaderTextFirst: XText,
    HeaderTextLeft: XText,
    HeaderTextRight: XText,
    RegisterModeActive: Boolean,
    RegisterParagraphStyle: String,
    TextColumns: XTextColumns
  ): TextPageStyle = {
    val __obj = js.Dynamic.literal(FooterText = FooterText.asInstanceOf[js.Any], FooterTextFirst = FooterTextFirst.asInstanceOf[js.Any], FooterTextLeft = FooterTextLeft.asInstanceOf[js.Any], FooterTextRight = FooterTextRight.asInstanceOf[js.Any], FootnoteHeight = FootnoteHeight.asInstanceOf[js.Any], FootnoteLineAdjust = FootnoteLineAdjust.asInstanceOf[js.Any], FootnoteLineColor = FootnoteLineColor.asInstanceOf[js.Any], FootnoteLineDistance = FootnoteLineDistance.asInstanceOf[js.Any], FootnoteLineRelativeWidth = FootnoteLineRelativeWidth.asInstanceOf[js.Any], FootnoteLineTextDistance = FootnoteLineTextDistance.asInstanceOf[js.Any], FootnoteLineWeight = FootnoteLineWeight.asInstanceOf[js.Any], HeaderText = HeaderText.asInstanceOf[js.Any], HeaderTextFirst = HeaderTextFirst.asInstanceOf[js.Any], HeaderTextLeft = HeaderTextLeft.asInstanceOf[js.Any], HeaderTextRight = HeaderTextRight.asInstanceOf[js.Any], RegisterModeActive = RegisterModeActive.asInstanceOf[js.Any], RegisterParagraphStyle = RegisterParagraphStyle.asInstanceOf[js.Any], TextColumns = TextColumns.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextPageStyle]
  }
  @scala.inline
  implicit class TextPageStyleOps[Self <: TextPageStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFooterText(value: XText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FooterText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterTextFirst(value: XText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FooterTextFirst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterTextLeft(value: XText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FooterTextLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterTextRight(value: XText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FooterTextRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFootnoteHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FootnoteHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFootnoteLineAdjust(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FootnoteLineAdjust")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFootnoteLineColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FootnoteLineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFootnoteLineDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FootnoteLineDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFootnoteLineRelativeWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FootnoteLineRelativeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFootnoteLineTextDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FootnoteLineTextDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFootnoteLineWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FootnoteLineWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderText(value: XText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeaderText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderTextFirst(value: XText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeaderTextFirst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderTextLeft(value: XText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeaderTextLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderTextRight(value: XText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeaderTextRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegisterModeActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegisterModeActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegisterParagraphStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegisterParagraphStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextColumns(value: XTextColumns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextColumns")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

