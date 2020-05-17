package typingsSlinky.activexLibreoffice.com_.sun.star.style

import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Size
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameContainer
import typingsSlinky.activexLibreoffice.com_.sun.star.table.BorderLine
import typingsSlinky.activexLibreoffice.com_.sun.star.table.ShadowFormat
import typingsSlinky.activexLibreoffice.com_.sun.star.text.XText
import typingsSlinky.activexLibreoffice.com_.sun.star.text.XTextColumns
import typingsSlinky.activexLibreoffice.com_.sun.star.util.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes the style of pages. */
@js.native
trait PageProperties extends js.Object {
  /** contains the background color of the page. */
  var BackColor: Color = js.native
  /** contains the filter name of the background graphic. */
  var BackGraphicFilter: String = js.native
  /** determines the location of the background graphic. */
  var BackGraphicLocation: GraphicLocation = js.native
  /** contains the URL of the background graphic. */
  var BackGraphicURL: String = js.native
  /**
    * determines if the background color is transparent.
    *
    * If this property is set to `TRUE` , {@link PageStyle.BackColor} will not be used.
    */
  var BackTransparent: Boolean = js.native
  /** determines the distance of all borders of the page. */
  var BorderDistance: Double = js.native
  /** determines the style of the bottom border line of the page. */
  var BottomBorder: BorderLine = js.native
  /** determines the bottom border distance of the page. */
  var BottomBorderDistance: Double = js.native
  /** determines the bottom margin of the page. */
  var BottomMargin: Double = js.native
  /**
    * determines if the header/footer content on the first page and remaining pages is the same.
    * @since LibreOffice 4.0
    */
  var FirstIsShared: Boolean = js.native
  /** contains the color of the background of the footer. */
  var FooterBackColor: Color = js.native
  /** contains the filter name of the background graphic in the footer. */
  var FooterBackGraphicFilter: String = js.native
  /** determines the location of the background graphic in the footer. */
  var FooterBackGraphicLocation: GraphicLocation = js.native
  /** contains the URL of the background graphic in the footer. */
  var FooterBackGraphicURL: String = js.native
  /** determines if the background of the footer is transparent. */
  var FooterBackTransparent: Boolean = js.native
  /** determines the distance between the footer and the body text area. */
  var FooterBodyDistance: Double = js.native
  /** contains the distance of all borders of the footer. */
  var FooterBorderDistance: Double = js.native
  /** contains the style of the bottom border line of the footer. */
  var FooterBottomBorder: BorderLine = js.native
  /** contains the bottom border distance of the footer. */
  var FooterBottomBorderDistance: Double = js.native
  /** determines whether to use dynamic spacing in footer or not. */
  var FooterDynamicSpacing: Boolean = js.native
  /** determines the height of the footer. */
  var FooterHeight: Double = js.native
  /** determines if the height of the footer depends on the content. */
  var FooterIsDynamicHeight: Boolean = js.native
  /** determines if a footer is used on the page. */
  var FooterIsOn: Boolean = js.native
  /** determines if the footer content on left and right pages is the same. */
  var FooterIsShared: Boolean = js.native
  /** contains the style of the left border line of the footer. */
  var FooterLeftBorder: BorderLine = js.native
  /** contains the left border distance of the footer. */
  var FooterLeftBorderDistance: Double = js.native
  /** determines the left margin of the footer. */
  var FooterLeftMargin: Double = js.native
  /** contains the style of the right border line of the footer. */
  var FooterRightBorder: BorderLine = js.native
  /** contains the right border distance of the footer. */
  var FooterRightBorderDistance: Double = js.native
  /** determines the right margin of the footer. */
  var FooterRightMargin: Double = js.native
  /** determines the shadow of the footer. */
  var FooterShadowFormat: ShadowFormat = js.native
  /** contains the interface to the text of the footer. */
  var FooterText: XText = js.native
  /** contains the interface to the text of the footer of a left page. */
  var FooterTextLeft: XText = js.native
  /** contains the interface to the text of the footer of a right page.contains . */
  var FooterTextRight: XText = js.native
  /** contains the style of the top border line of the footer. */
  var FooterTopBorder: BorderLine = js.native
  /** contains the top border distance of the footer. */
  var FooterTopBorderDistance: Double = js.native
  /** contains the maximum height of the footnote area. If set to zero then the height of the current page is used as limit. */
  var FootnoteHeight: Double = js.native
  /**
    * contains the adjustment of the separator line between the text and the footnote area.
    *
    * com::sun::star::text::HorizontalAdjusts.
    */
  var FootnoteLineAdjust: Double = js.native
  /** contains the color of the separator line between the text and the footnote area. */
  var FootnoteLineColor: Color = js.native
  /** contains the distance between the footnote area and the separator line between the text and the footnote area. */
  var FootnoteLineDistance: Double = js.native
  /** contains the relative width of the separator line between the text and the footnote area. */
  var FootnoteLineRelativeWidth: Double = js.native
  /**
    * contains the style of the separator line between the text and the footnote area.
    * @see com.sun.star.style.FootnoteLineStyle for the possible values.
    */
  var FootnoteLineStyle: Double = js.native
  /** contains the distance between the text and the separator line between the text and the footnote area. */
  var FootnoteLineTextDistance: Double = js.native
  /** contains the weight of the separator line between the text and the footnote area. */
  var FootnoteLineWeight: Double = js.native
  /** contains the height of the base text line inside the text grid */
  var GridBaseHeight: Double = js.native
  /** contains the display color of the text grid */
  var GridColor: Color = js.native
  /** determines whether the text grid lines are visible or not */
  var GridDisplay: Boolean = js.native
  /** contains the number of lines in the text grid */
  var GridLines: Double = js.native
  /** contains the mode of the text grid (none, lines, ...), as represented by {@link com.sun.star.text.TextGridMode} constants */
  var GridMode: Double = js.native
  /** determines whether the text grid lines are printed */
  var GridPrint: Boolean = js.native
  /** determines whether the text grid's ruby line is located below or above the base line */
  var GridRubyBelow: Boolean = js.native
  /** contains the height of the ruby text line inside the text grid */
  var GridRubyHeight: Double = js.native
  /** contains the color of the background of the header. */
  var HeaderBackColor: Color = js.native
  /** contains the filter name of the background graphic of the header. */
  var HeaderBackGraphicFilter: String = js.native
  /** determines the location of the background graphic of the header. */
  var HeaderBackGraphicLocation: GraphicLocation = js.native
  /** contains the URL of the background graphic of the header. */
  var HeaderBackGraphicURL: String = js.native
  /**
    * determines if the background color of the header is transparent.
    *
    * If this property is set to `TRUE` , {@link PageStyle.HeaderBackColor} will not be used.
    */
  var HeaderBackTransparent: Boolean = js.native
  /** determines the distance between the header and the body text area. */
  var HeaderBodyDistance: Double = js.native
  /** determines the distance of all borders of the header. */
  var HeaderBorderDistance: Double = js.native
  /** determines the style of the bottom border line of the header. */
  var HeaderBottomBorder: BorderLine = js.native
  /** determines the bottom border distance of the header. */
  var HeaderBottomBorderDistance: Double = js.native
  /** determines whether to use dynamic spacing in header or not. */
  var HeaderDynamicSpacing: Boolean = js.native
  /** contains the height of the header. */
  var HeaderHeight: Double = js.native
  /** determines if the height of the header depends on the content. */
  var HeaderIsDynamicHeight: Boolean = js.native
  /** determines if a header is used on the page. */
  var HeaderIsOn: Boolean = js.native
  /** determines if the header content on left and right pages is the same. */
  var HeaderIsShared: Boolean = js.native
  /** determines the style of the left border line of the header. */
  var HeaderLeftBorder: BorderLine = js.native
  /** determines the left border distance of the header. */
  var HeaderLeftBorderDistance: Double = js.native
  /** contains the left margin of the header. */
  var HeaderLeftMargin: Double = js.native
  /** determines the style of the right border line of the header. */
  var HeaderRightBorder: BorderLine = js.native
  /** determines the right border distance of the header. */
  var HeaderRightBorderDistance: Double = js.native
  /** contains the right margin of the header. */
  var HeaderRightMargin: Double = js.native
  /** determines the shadow of the header. */
  var HeaderShadowFormat: ShadowFormat = js.native
  /** contains the interface to the text of the header. */
  var HeaderText: XText = js.native
  /** contains the interface to the text of the header of left pages. */
  var HeaderTextLeft: XText = js.native
  /** contains the interface to the text of the header of right pages. */
  var HeaderTextRight: XText = js.native
  /** determines the style of the top border line of the header. */
  var HeaderTopBorder: BorderLine = js.native
  /** determines the top border distance of the header. */
  var HeaderTopBorderDistance: Double = js.native
  /** contains the height of the page. */
  var Height: Double = js.native
  /** determines if the page format is landscape. */
  var IsLandscape: Boolean = js.native
  /** determines the style of the left border line of the page. */
  var LeftBorder: BorderLine = js.native
  /** determines the left border distance of the page. */
  var LeftBorderDistance: Double = js.native
  /** determines the left margin of the page. */
  var LeftMargin: Double = js.native
  /** determines the default numbering type for this page. */
  var NumberingType: Double = js.native
  /** determines the layout of the page. */
  var PageStyleLayout: typingsSlinky.activexLibreoffice.com_.sun.star.style.PageStyleLayout = js.native
  /** contains the name of a paper tray of the selected printer. */
  var PrinterPaperTray: String = js.native
  /** determines if the register mode is active on that page. */
  var RegisterModeActive: Boolean = js.native
  /** contains the name of the paragraph style that is used as reference of the register mode. */
  var RegisterParagraphStyle: String = js.native
  /** determines the style of the right border line of the page. */
  var RightBorder: BorderLine = js.native
  /** determines the right border distance of the page. */
  var RightBorderDistance: Double = js.native
  /** determines the right margin of the page. */
  var RightMargin: Double = js.native
  /** determines the shadow of the page. */
  var ShadowFormat: typingsSlinky.activexLibreoffice.com_.sun.star.table.ShadowFormat = js.native
  /** contains the paper size of the page. */
  var Size: typingsSlinky.activexLibreoffice.com_.sun.star.awt.Size = js.native
  /** contains the column settings of the page. */
  var TextColumns: XTextColumns = js.native
  /** determines the style of the top border line of the page. */
  var TopBorder: BorderLine = js.native
  /** determines the top border distance of the page. */
  var TopBorderDistance: Double = js.native
  /** determines the top margin of the page. */
  var TopMargin: Double = js.native
  /**
    * contains user defined attributes.
    *
    * This {@link com.sun.star.container.XNameContainer} supports the service {@link com.sun.star.xml.AttributeContainer} .
    */
  var UserDefinedAttributes: XNameContainer = js.native
  /** contains the width of the page. */
  var Width: Double = js.native
  /** contains the writing direction, as represented by the {@link com.sun.star.text.WritingMode2} constants */
  var WritingMode: Double = js.native
}

object PageProperties {
  @scala.inline
  def apply(
    BackColor: Color,
    BackGraphicFilter: String,
    BackGraphicLocation: GraphicLocation,
    BackGraphicURL: String,
    BackTransparent: Boolean,
    BorderDistance: Double,
    BottomBorder: BorderLine,
    BottomBorderDistance: Double,
    BottomMargin: Double,
    FirstIsShared: Boolean,
    FooterBackColor: Color,
    FooterBackGraphicFilter: String,
    FooterBackGraphicLocation: GraphicLocation,
    FooterBackGraphicURL: String,
    FooterBackTransparent: Boolean,
    FooterBodyDistance: Double,
    FooterBorderDistance: Double,
    FooterBottomBorder: BorderLine,
    FooterBottomBorderDistance: Double,
    FooterDynamicSpacing: Boolean,
    FooterHeight: Double,
    FooterIsDynamicHeight: Boolean,
    FooterIsOn: Boolean,
    FooterIsShared: Boolean,
    FooterLeftBorder: BorderLine,
    FooterLeftBorderDistance: Double,
    FooterLeftMargin: Double,
    FooterRightBorder: BorderLine,
    FooterRightBorderDistance: Double,
    FooterRightMargin: Double,
    FooterShadowFormat: ShadowFormat,
    FooterText: XText,
    FooterTextLeft: XText,
    FooterTextRight: XText,
    FooterTopBorder: BorderLine,
    FooterTopBorderDistance: Double,
    FootnoteHeight: Double,
    FootnoteLineAdjust: Double,
    FootnoteLineColor: Color,
    FootnoteLineDistance: Double,
    FootnoteLineRelativeWidth: Double,
    FootnoteLineStyle: Double,
    FootnoteLineTextDistance: Double,
    FootnoteLineWeight: Double,
    GridBaseHeight: Double,
    GridColor: Color,
    GridDisplay: Boolean,
    GridLines: Double,
    GridMode: Double,
    GridPrint: Boolean,
    GridRubyBelow: Boolean,
    GridRubyHeight: Double,
    HeaderBackColor: Color,
    HeaderBackGraphicFilter: String,
    HeaderBackGraphicLocation: GraphicLocation,
    HeaderBackGraphicURL: String,
    HeaderBackTransparent: Boolean,
    HeaderBodyDistance: Double,
    HeaderBorderDistance: Double,
    HeaderBottomBorder: BorderLine,
    HeaderBottomBorderDistance: Double,
    HeaderDynamicSpacing: Boolean,
    HeaderHeight: Double,
    HeaderIsDynamicHeight: Boolean,
    HeaderIsOn: Boolean,
    HeaderIsShared: Boolean,
    HeaderLeftBorder: BorderLine,
    HeaderLeftBorderDistance: Double,
    HeaderLeftMargin: Double,
    HeaderRightBorder: BorderLine,
    HeaderRightBorderDistance: Double,
    HeaderRightMargin: Double,
    HeaderShadowFormat: ShadowFormat,
    HeaderText: XText,
    HeaderTextLeft: XText,
    HeaderTextRight: XText,
    HeaderTopBorder: BorderLine,
    HeaderTopBorderDistance: Double,
    Height: Double,
    IsLandscape: Boolean,
    LeftBorder: BorderLine,
    LeftBorderDistance: Double,
    LeftMargin: Double,
    NumberingType: Double,
    PageStyleLayout: PageStyleLayout,
    PrinterPaperTray: String,
    RegisterModeActive: Boolean,
    RegisterParagraphStyle: String,
    RightBorder: BorderLine,
    RightBorderDistance: Double,
    RightMargin: Double,
    ShadowFormat: ShadowFormat,
    Size: Size,
    TextColumns: XTextColumns,
    TopBorder: BorderLine,
    TopBorderDistance: Double,
    TopMargin: Double,
    UserDefinedAttributes: XNameContainer,
    Width: Double,
    WritingMode: Double
  ): PageProperties = {
    val __obj = js.Dynamic.literal(BackColor = BackColor.asInstanceOf[js.Any], BackGraphicFilter = BackGraphicFilter.asInstanceOf[js.Any], BackGraphicLocation = BackGraphicLocation.asInstanceOf[js.Any], BackGraphicURL = BackGraphicURL.asInstanceOf[js.Any], BackTransparent = BackTransparent.asInstanceOf[js.Any], BorderDistance = BorderDistance.asInstanceOf[js.Any], BottomBorder = BottomBorder.asInstanceOf[js.Any], BottomBorderDistance = BottomBorderDistance.asInstanceOf[js.Any], BottomMargin = BottomMargin.asInstanceOf[js.Any], FirstIsShared = FirstIsShared.asInstanceOf[js.Any], FooterBackColor = FooterBackColor.asInstanceOf[js.Any], FooterBackGraphicFilter = FooterBackGraphicFilter.asInstanceOf[js.Any], FooterBackGraphicLocation = FooterBackGraphicLocation.asInstanceOf[js.Any], FooterBackGraphicURL = FooterBackGraphicURL.asInstanceOf[js.Any], FooterBackTransparent = FooterBackTransparent.asInstanceOf[js.Any], FooterBodyDistance = FooterBodyDistance.asInstanceOf[js.Any], FooterBorderDistance = FooterBorderDistance.asInstanceOf[js.Any], FooterBottomBorder = FooterBottomBorder.asInstanceOf[js.Any], FooterBottomBorderDistance = FooterBottomBorderDistance.asInstanceOf[js.Any], FooterDynamicSpacing = FooterDynamicSpacing.asInstanceOf[js.Any], FooterHeight = FooterHeight.asInstanceOf[js.Any], FooterIsDynamicHeight = FooterIsDynamicHeight.asInstanceOf[js.Any], FooterIsOn = FooterIsOn.asInstanceOf[js.Any], FooterIsShared = FooterIsShared.asInstanceOf[js.Any], FooterLeftBorder = FooterLeftBorder.asInstanceOf[js.Any], FooterLeftBorderDistance = FooterLeftBorderDistance.asInstanceOf[js.Any], FooterLeftMargin = FooterLeftMargin.asInstanceOf[js.Any], FooterRightBorder = FooterRightBorder.asInstanceOf[js.Any], FooterRightBorderDistance = FooterRightBorderDistance.asInstanceOf[js.Any], FooterRightMargin = FooterRightMargin.asInstanceOf[js.Any], FooterShadowFormat = FooterShadowFormat.asInstanceOf[js.Any], FooterText = FooterText.asInstanceOf[js.Any], FooterTextLeft = FooterTextLeft.asInstanceOf[js.Any], FooterTextRight = FooterTextRight.asInstanceOf[js.Any], FooterTopBorder = FooterTopBorder.asInstanceOf[js.Any], FooterTopBorderDistance = FooterTopBorderDistance.asInstanceOf[js.Any], FootnoteHeight = FootnoteHeight.asInstanceOf[js.Any], FootnoteLineAdjust = FootnoteLineAdjust.asInstanceOf[js.Any], FootnoteLineColor = FootnoteLineColor.asInstanceOf[js.Any], FootnoteLineDistance = FootnoteLineDistance.asInstanceOf[js.Any], FootnoteLineRelativeWidth = FootnoteLineRelativeWidth.asInstanceOf[js.Any], FootnoteLineStyle = FootnoteLineStyle.asInstanceOf[js.Any], FootnoteLineTextDistance = FootnoteLineTextDistance.asInstanceOf[js.Any], FootnoteLineWeight = FootnoteLineWeight.asInstanceOf[js.Any], GridBaseHeight = GridBaseHeight.asInstanceOf[js.Any], GridColor = GridColor.asInstanceOf[js.Any], GridDisplay = GridDisplay.asInstanceOf[js.Any], GridLines = GridLines.asInstanceOf[js.Any], GridMode = GridMode.asInstanceOf[js.Any], GridPrint = GridPrint.asInstanceOf[js.Any], GridRubyBelow = GridRubyBelow.asInstanceOf[js.Any], GridRubyHeight = GridRubyHeight.asInstanceOf[js.Any], HeaderBackColor = HeaderBackColor.asInstanceOf[js.Any], HeaderBackGraphicFilter = HeaderBackGraphicFilter.asInstanceOf[js.Any], HeaderBackGraphicLocation = HeaderBackGraphicLocation.asInstanceOf[js.Any], HeaderBackGraphicURL = HeaderBackGraphicURL.asInstanceOf[js.Any], HeaderBackTransparent = HeaderBackTransparent.asInstanceOf[js.Any], HeaderBodyDistance = HeaderBodyDistance.asInstanceOf[js.Any], HeaderBorderDistance = HeaderBorderDistance.asInstanceOf[js.Any], HeaderBottomBorder = HeaderBottomBorder.asInstanceOf[js.Any], HeaderBottomBorderDistance = HeaderBottomBorderDistance.asInstanceOf[js.Any], HeaderDynamicSpacing = HeaderDynamicSpacing.asInstanceOf[js.Any], HeaderHeight = HeaderHeight.asInstanceOf[js.Any], HeaderIsDynamicHeight = HeaderIsDynamicHeight.asInstanceOf[js.Any], HeaderIsOn = HeaderIsOn.asInstanceOf[js.Any], HeaderIsShared = HeaderIsShared.asInstanceOf[js.Any], HeaderLeftBorder = HeaderLeftBorder.asInstanceOf[js.Any], HeaderLeftBorderDistance = HeaderLeftBorderDistance.asInstanceOf[js.Any], HeaderLeftMargin = HeaderLeftMargin.asInstanceOf[js.Any], HeaderRightBorder = HeaderRightBorder.asInstanceOf[js.Any], HeaderRightBorderDistance = HeaderRightBorderDistance.asInstanceOf[js.Any], HeaderRightMargin = HeaderRightMargin.asInstanceOf[js.Any], HeaderShadowFormat = HeaderShadowFormat.asInstanceOf[js.Any], HeaderText = HeaderText.asInstanceOf[js.Any], HeaderTextLeft = HeaderTextLeft.asInstanceOf[js.Any], HeaderTextRight = HeaderTextRight.asInstanceOf[js.Any], HeaderTopBorder = HeaderTopBorder.asInstanceOf[js.Any], HeaderTopBorderDistance = HeaderTopBorderDistance.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], IsLandscape = IsLandscape.asInstanceOf[js.Any], LeftBorder = LeftBorder.asInstanceOf[js.Any], LeftBorderDistance = LeftBorderDistance.asInstanceOf[js.Any], LeftMargin = LeftMargin.asInstanceOf[js.Any], NumberingType = NumberingType.asInstanceOf[js.Any], PageStyleLayout = PageStyleLayout.asInstanceOf[js.Any], PrinterPaperTray = PrinterPaperTray.asInstanceOf[js.Any], RegisterModeActive = RegisterModeActive.asInstanceOf[js.Any], RegisterParagraphStyle = RegisterParagraphStyle.asInstanceOf[js.Any], RightBorder = RightBorder.asInstanceOf[js.Any], RightBorderDistance = RightBorderDistance.asInstanceOf[js.Any], RightMargin = RightMargin.asInstanceOf[js.Any], ShadowFormat = ShadowFormat.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], TextColumns = TextColumns.asInstanceOf[js.Any], TopBorder = TopBorder.asInstanceOf[js.Any], TopBorderDistance = TopBorderDistance.asInstanceOf[js.Any], TopMargin = TopMargin.asInstanceOf[js.Any], UserDefinedAttributes = UserDefinedAttributes.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], WritingMode = WritingMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageProperties]
  }
  @scala.inline
  implicit class PagePropertiesOps[Self <: PageProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackGraphicFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackGraphicFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackGraphicLocation(value: GraphicLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackGraphicLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackGraphicURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackGraphicURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackTransparent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackTransparent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BorderDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBottomBorder(value: BorderLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BottomBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBottomBorderDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BottomBorderDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBottomMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BottomMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstIsShared(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstIsShared")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterBackColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FooterBackColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterBackGraphicFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FooterBackGraphicFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterBackGraphicLocation(value: GraphicLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FooterBackGraphicLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterBackGraphicURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FooterBackGraphicURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterBackTransparent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FooterBackTransparent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterBodyDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FooterBodyDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterBorderDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FooterBorderDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterBottomBorder(value: BorderLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FooterBottomBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterBottomBorderDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FooterBottomBorderDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterDynamicSpacing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FooterDynamicSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FooterHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterIsDynamicHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FooterIsDynamicHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterIsOn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FooterIsOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterIsShared(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FooterIsShared")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterLeftBorder(value: BorderLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FooterLeftBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterLeftBorderDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FooterLeftBorderDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterLeftMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FooterLeftMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterRightBorder(value: BorderLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FooterRightBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterRightBorderDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FooterRightBorderDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterRightMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FooterRightMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterShadowFormat(value: ShadowFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FooterShadowFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterText(value: XText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FooterText")(value.asInstanceOf[js.Any])
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
    def withFooterTopBorder(value: BorderLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FooterTopBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterTopBorderDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FooterTopBorderDistance")(value.asInstanceOf[js.Any])
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
    def withFootnoteLineStyle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FootnoteLineStyle")(value.asInstanceOf[js.Any])
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
    def withGridBaseHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GridBaseHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGridColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GridColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGridDisplay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GridDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGridLines(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GridLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGridMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GridMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGridPrint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GridPrint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGridRubyBelow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GridRubyBelow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGridRubyHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GridRubyHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderBackColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeaderBackColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderBackGraphicFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeaderBackGraphicFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderBackGraphicLocation(value: GraphicLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeaderBackGraphicLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderBackGraphicURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeaderBackGraphicURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderBackTransparent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeaderBackTransparent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderBodyDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeaderBodyDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderBorderDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeaderBorderDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderBottomBorder(value: BorderLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeaderBottomBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderBottomBorderDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeaderBottomBorderDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderDynamicSpacing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeaderDynamicSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeaderHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderIsDynamicHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeaderIsDynamicHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderIsOn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeaderIsOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderIsShared(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeaderIsShared")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderLeftBorder(value: BorderLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeaderLeftBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderLeftBorderDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeaderLeftBorderDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderLeftMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeaderLeftMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderRightBorder(value: BorderLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeaderRightBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderRightBorderDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeaderRightBorderDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderRightMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeaderRightMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderShadowFormat(value: ShadowFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeaderShadowFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderText(value: XText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeaderText")(value.asInstanceOf[js.Any])
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
    def withHeaderTopBorder(value: BorderLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeaderTopBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderTopBorderDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeaderTopBorderDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsLandscape(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsLandscape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftBorder(value: BorderLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LeftBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftBorderDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LeftBorderDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LeftMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberingType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageStyleLayout(value: PageStyleLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageStyleLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrinterPaperTray(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrinterPaperTray")(value.asInstanceOf[js.Any])
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
    def withRightBorder(value: BorderLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RightBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightBorderDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RightBorderDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RightMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShadowFormat(value: ShadowFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShadowFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextColumns(value: XTextColumns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopBorder(value: BorderLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TopBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopBorderDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TopBorderDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TopMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserDefinedAttributes(value: XNameContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserDefinedAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWritingMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WritingMode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

