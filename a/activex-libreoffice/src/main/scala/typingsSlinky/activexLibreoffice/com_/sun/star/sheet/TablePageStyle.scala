package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Size
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.NamedValue
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyState
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertiesChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameContainer
import typingsSlinky.activexLibreoffice.com_.sun.star.style.GraphicLocation
import typingsSlinky.activexLibreoffice.com_.sun.star.style.PageStyleLayout
import typingsSlinky.activexLibreoffice.com_.sun.star.style.Style
import typingsSlinky.activexLibreoffice.com_.sun.star.table.BorderLine
import typingsSlinky.activexLibreoffice.com_.sun.star.table.ShadowFormat
import typingsSlinky.activexLibreoffice.com_.sun.star.text.XText
import typingsSlinky.activexLibreoffice.com_.sun.star.text.XTextColumns
import typingsSlinky.activexLibreoffice.com_.sun.star.util.Color
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a page style for a spreadsheet.
  *
  * This service extends the service {@link com.sun.star.style.PageStyle} with spreadsheet specific properties.
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.activexLibreoffice.com_.sun.star.style.PageProperties because var conflicts: UserDefinedAttributes. Inlined BackColor, BackGraphicFilter, BackGraphicLocation, BackGraphicURL, BackTransparent, BorderDistance, BottomBorder, BottomBorderDistance, BottomMargin, FirstIsShared, FooterBackColor, FooterBackGraphicFilter, FooterBackGraphicLocation, FooterBackGraphicURL, FooterBackTransparent, FooterBodyDistance, FooterBorderDistance, FooterBottomBorder, FooterBottomBorderDistance, FooterDynamicSpacing, FooterHeight, FooterIsDynamicHeight, FooterIsOn, FooterIsShared, FooterLeftBorder, FooterLeftBorderDistance, FooterLeftMargin, FooterRightBorder, FooterRightBorderDistance, FooterRightMargin, FooterShadowFormat, FooterText, FooterTextLeft, FooterTextRight, FooterTopBorder, FooterTopBorderDistance, FootnoteHeight, FootnoteLineAdjust, FootnoteLineColor, FootnoteLineDistance, FootnoteLineRelativeWidth, FootnoteLineStyle, FootnoteLineTextDistance, FootnoteLineWeight, GridBaseHeight, GridColor, GridDisplay, GridLines, GridMode, GridPrint, GridRubyBelow, GridRubyHeight, HeaderBackColor, HeaderBackGraphicFilter, HeaderBackGraphicLocation, HeaderBackGraphicURL, HeaderBackTransparent, HeaderBodyDistance, HeaderBorderDistance, HeaderBottomBorder, HeaderBottomBorderDistance, HeaderDynamicSpacing, HeaderHeight, HeaderIsDynamicHeight, HeaderIsOn, HeaderIsShared, HeaderLeftBorder, HeaderLeftBorderDistance, HeaderLeftMargin, HeaderRightBorder, HeaderRightBorderDistance, HeaderRightMargin, HeaderShadowFormat, HeaderText, HeaderTextLeft, HeaderTextRight, HeaderTopBorder, HeaderTopBorderDistance, Height, IsLandscape, LeftBorder, LeftBorderDistance, LeftMargin, NumberingType, PageStyleLayout, PrinterPaperTray, RegisterModeActive, RegisterParagraphStyle, RightBorder, RightBorderDistance, RightMargin, ShadowFormat, Size, TextColumns, TopBorder, TopBorderDistance, TopMargin, Width, WritingMode */ @js.native
trait TablePageStyle extends Style {
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
  /** determines whether the table is centered horizontally on the page. */
  var CenterHorizontally: Boolean = js.native
  /** determines whether the table is centered vertically on the page. */
  var CenterVertically: Boolean = js.native
  /**
    * determines if the header/footer content on the first page and remaining pages is the same.
    * @since LibreOffice 4.0
    */
  var FirstIsShared: Boolean = js.native
  /**
    * contains the page number applied to the first page for this sheet.
    *
    * The value 0 indicates that the page numbers are continued from the previous sheet.
    */
  var FirstPageNumber: Double = js.native
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
  /**
    * contains the content of the footer for left pages.
    *
    * After changing the footer text contents, this property has to be reinserted into the property set.
    * @see com.sun.star.sheet.HeaderFooterContent
    */
  var LeftPageFooterContent: XHeaderFooterContent = js.native
  /**
    * contains the content of the header for left pages.
    *
    * After changing the header text contents, this property has to be reinserted into the property set.
    * @see com.sun.star.sheet.HeaderFooterContent
    */
  var LeftPageHeaderContent: XHeaderFooterContent = js.native
  /** determines the default numbering type for this page. */
  var NumberingType: Double = js.native
  /** contains the scaling factor (in percent) for printing the sheet. */
  var PageScale: Double = js.native
  /** determines the layout of the page. */
  var PageStyleLayout: typingsSlinky.activexLibreoffice.com_.sun.star.style.PageStyleLayout = js.native
  /** enables printing of cell annotations. */
  var PrintAnnotations: Boolean = js.native
  /** enables printing of charts. */
  var PrintCharts: Boolean = js.native
  /**
    * specifies the print order for the pages within each sheet.
    *
    * If `TRUE` , the order for printing pages begins with top-to-bottom, then continues with the next set of cell columns to the right. If `FALSE` , the
    * order for printing pages begins with left-to-right, then continues with the next set of cell rows to the bottom.
    */
  var PrintDownFirst: Boolean = js.native
  /** enables printing of drawing objects. */
  var PrintDrawing: Boolean = js.native
  /** enables printing of formulas instead of their results. */
  var PrintFormulas: Boolean = js.native
  /** enables printing of the cell grid. */
  var PrintGrid: Boolean = js.native
  /** enables printing of column and row headers. */
  var PrintHeaders: Boolean = js.native
  /** enables printing of embedded objects. */
  var PrintObjects: Boolean = js.native
  /** enables printing of zero-values. */
  var PrintZeroValues: Boolean = js.native
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
  /**
    * contains the content of the footer for right pages.
    *
    * After changing the footer text contents, this property has to be reinserted into the property set.
    * @see com.sun.star.sheet.HeaderFooterContent
    */
  var RightPageFooterContent: XHeaderFooterContent = js.native
  /**
    * contains the content of the header for right pages.
    *
    * After changing the header text contents, this property has to be reinserted into the property set.
    * @see com.sun.star.sheet.HeaderFooterContent
    */
  var RightPageHeaderContent: XHeaderFooterContent = js.native
  /** contains the number of pages the sheet will printed. */
  var ScaleToPages: Double = js.native
  /**
    * contains the number of horizontal pages the sheet will printed on.
    * @since OOo 2.0
    */
  var ScaleToPagesX: Double = js.native
  /**
    * contains the number of vertical pages the sheet will printed on.
    * @since OOo 2.0
    */
  var ScaleToPagesY: Double = js.native
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
  /** contains the width of the page. */
  var Width: Double = js.native
  /** contains the writing direction, as represented by the {@link com.sun.star.text.WritingMode2} constants */
  var WritingMode: Double = js.native
}

object TablePageStyle {
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
    CenterHorizontally: Boolean,
    CenterVertically: Boolean,
    DisplayName: String,
    FirstIsShared: Boolean,
    FirstPageNumber: Double,
    FollowStyle: String,
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
    Hidden: Boolean,
    IsAutoUpdate: String,
    IsLandscape: Boolean,
    IsPhysical: Boolean,
    LeftBorder: BorderLine,
    LeftBorderDistance: Double,
    LeftMargin: Double,
    LeftPageFooterContent: XHeaderFooterContent,
    LeftPageHeaderContent: XHeaderFooterContent,
    Name: String,
    NumberingType: Double,
    PageScale: Double,
    PageStyleLayout: PageStyleLayout,
    ParaStyleConditions: SafeArray[NamedValue],
    ParentStyle: String,
    PrintAnnotations: Boolean,
    PrintCharts: Boolean,
    PrintDownFirst: Boolean,
    PrintDrawing: Boolean,
    PrintFormulas: Boolean,
    PrintGrid: Boolean,
    PrintHeaders: Boolean,
    PrintObjects: Boolean,
    PrintZeroValues: Boolean,
    PrinterPaperTray: String,
    PropertySetInfo: XPropertySetInfo,
    RegisterModeActive: Boolean,
    RegisterParagraphStyle: String,
    RightBorder: BorderLine,
    RightBorderDistance: Double,
    RightMargin: Double,
    RightPageFooterContent: XHeaderFooterContent,
    RightPageHeaderContent: XHeaderFooterContent,
    ScaleToPages: Double,
    ScaleToPagesX: Double,
    ScaleToPagesY: Double,
    ShadowFormat: ShadowFormat,
    Size: Size,
    StyleInteropGrabBag: SafeArray[PropertyValue],
    TextColumns: XTextColumns,
    TopBorder: BorderLine,
    TopBorderDistance: Double,
    TopMargin: Double,
    UserDefinedAttributes: XNameContainer,
    Width: Double,
    WritingMode: Double,
    acquire: () => Unit,
    addPropertiesChangeListener: (SeqEquiv[String], XPropertiesChangeListener) => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    firePropertiesChangeEvent: (SeqEquiv[String], XPropertiesChangeListener) => Unit,
    getName: () => String,
    getParentStyle: () => String,
    getPropertyDefaults: SeqEquiv[String] => SafeArray[_],
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyStates: SeqEquiv[String] => SafeArray[PropertyState],
    getPropertyValue: String => js.Any,
    getPropertyValues: SeqEquiv[String] => SafeArray[_],
    isInUse: () => Boolean,
    isUserDefined: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertiesChangeListener: XPropertiesChangeListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setAllPropertiesToDefault: () => Unit,
    setName: String => Unit,
    setParentStyle: String => Unit,
    setPropertiesToDefault: SeqEquiv[String] => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setPropertyValues: (SeqEquiv[String], SeqEquiv[_]) => Unit
  ): TablePageStyle = {
    val __obj = js.Dynamic.literal(BackColor = BackColor.asInstanceOf[js.Any], BackGraphicFilter = BackGraphicFilter.asInstanceOf[js.Any], BackGraphicLocation = BackGraphicLocation.asInstanceOf[js.Any], BackGraphicURL = BackGraphicURL.asInstanceOf[js.Any], BackTransparent = BackTransparent.asInstanceOf[js.Any], BorderDistance = BorderDistance.asInstanceOf[js.Any], BottomBorder = BottomBorder.asInstanceOf[js.Any], BottomBorderDistance = BottomBorderDistance.asInstanceOf[js.Any], BottomMargin = BottomMargin.asInstanceOf[js.Any], CenterHorizontally = CenterHorizontally.asInstanceOf[js.Any], CenterVertically = CenterVertically.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], FirstIsShared = FirstIsShared.asInstanceOf[js.Any], FirstPageNumber = FirstPageNumber.asInstanceOf[js.Any], FollowStyle = FollowStyle.asInstanceOf[js.Any], FooterBackColor = FooterBackColor.asInstanceOf[js.Any], FooterBackGraphicFilter = FooterBackGraphicFilter.asInstanceOf[js.Any], FooterBackGraphicLocation = FooterBackGraphicLocation.asInstanceOf[js.Any], FooterBackGraphicURL = FooterBackGraphicURL.asInstanceOf[js.Any], FooterBackTransparent = FooterBackTransparent.asInstanceOf[js.Any], FooterBodyDistance = FooterBodyDistance.asInstanceOf[js.Any], FooterBorderDistance = FooterBorderDistance.asInstanceOf[js.Any], FooterBottomBorder = FooterBottomBorder.asInstanceOf[js.Any], FooterBottomBorderDistance = FooterBottomBorderDistance.asInstanceOf[js.Any], FooterDynamicSpacing = FooterDynamicSpacing.asInstanceOf[js.Any], FooterHeight = FooterHeight.asInstanceOf[js.Any], FooterIsDynamicHeight = FooterIsDynamicHeight.asInstanceOf[js.Any], FooterIsOn = FooterIsOn.asInstanceOf[js.Any], FooterIsShared = FooterIsShared.asInstanceOf[js.Any], FooterLeftBorder = FooterLeftBorder.asInstanceOf[js.Any], FooterLeftBorderDistance = FooterLeftBorderDistance.asInstanceOf[js.Any], FooterLeftMargin = FooterLeftMargin.asInstanceOf[js.Any], FooterRightBorder = FooterRightBorder.asInstanceOf[js.Any], FooterRightBorderDistance = FooterRightBorderDistance.asInstanceOf[js.Any], FooterRightMargin = FooterRightMargin.asInstanceOf[js.Any], FooterShadowFormat = FooterShadowFormat.asInstanceOf[js.Any], FooterText = FooterText.asInstanceOf[js.Any], FooterTextLeft = FooterTextLeft.asInstanceOf[js.Any], FooterTextRight = FooterTextRight.asInstanceOf[js.Any], FooterTopBorder = FooterTopBorder.asInstanceOf[js.Any], FooterTopBorderDistance = FooterTopBorderDistance.asInstanceOf[js.Any], FootnoteHeight = FootnoteHeight.asInstanceOf[js.Any], FootnoteLineAdjust = FootnoteLineAdjust.asInstanceOf[js.Any], FootnoteLineColor = FootnoteLineColor.asInstanceOf[js.Any], FootnoteLineDistance = FootnoteLineDistance.asInstanceOf[js.Any], FootnoteLineRelativeWidth = FootnoteLineRelativeWidth.asInstanceOf[js.Any], FootnoteLineStyle = FootnoteLineStyle.asInstanceOf[js.Any], FootnoteLineTextDistance = FootnoteLineTextDistance.asInstanceOf[js.Any], FootnoteLineWeight = FootnoteLineWeight.asInstanceOf[js.Any], GridBaseHeight = GridBaseHeight.asInstanceOf[js.Any], GridColor = GridColor.asInstanceOf[js.Any], GridDisplay = GridDisplay.asInstanceOf[js.Any], GridLines = GridLines.asInstanceOf[js.Any], GridMode = GridMode.asInstanceOf[js.Any], GridPrint = GridPrint.asInstanceOf[js.Any], GridRubyBelow = GridRubyBelow.asInstanceOf[js.Any], GridRubyHeight = GridRubyHeight.asInstanceOf[js.Any], HeaderBackColor = HeaderBackColor.asInstanceOf[js.Any], HeaderBackGraphicFilter = HeaderBackGraphicFilter.asInstanceOf[js.Any], HeaderBackGraphicLocation = HeaderBackGraphicLocation.asInstanceOf[js.Any], HeaderBackGraphicURL = HeaderBackGraphicURL.asInstanceOf[js.Any], HeaderBackTransparent = HeaderBackTransparent.asInstanceOf[js.Any], HeaderBodyDistance = HeaderBodyDistance.asInstanceOf[js.Any], HeaderBorderDistance = HeaderBorderDistance.asInstanceOf[js.Any], HeaderBottomBorder = HeaderBottomBorder.asInstanceOf[js.Any], HeaderBottomBorderDistance = HeaderBottomBorderDistance.asInstanceOf[js.Any], HeaderDynamicSpacing = HeaderDynamicSpacing.asInstanceOf[js.Any], HeaderHeight = HeaderHeight.asInstanceOf[js.Any], HeaderIsDynamicHeight = HeaderIsDynamicHeight.asInstanceOf[js.Any], HeaderIsOn = HeaderIsOn.asInstanceOf[js.Any], HeaderIsShared = HeaderIsShared.asInstanceOf[js.Any], HeaderLeftBorder = HeaderLeftBorder.asInstanceOf[js.Any], HeaderLeftBorderDistance = HeaderLeftBorderDistance.asInstanceOf[js.Any], HeaderLeftMargin = HeaderLeftMargin.asInstanceOf[js.Any], HeaderRightBorder = HeaderRightBorder.asInstanceOf[js.Any], HeaderRightBorderDistance = HeaderRightBorderDistance.asInstanceOf[js.Any], HeaderRightMargin = HeaderRightMargin.asInstanceOf[js.Any], HeaderShadowFormat = HeaderShadowFormat.asInstanceOf[js.Any], HeaderText = HeaderText.asInstanceOf[js.Any], HeaderTextLeft = HeaderTextLeft.asInstanceOf[js.Any], HeaderTextRight = HeaderTextRight.asInstanceOf[js.Any], HeaderTopBorder = HeaderTopBorder.asInstanceOf[js.Any], HeaderTopBorderDistance = HeaderTopBorderDistance.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Hidden = Hidden.asInstanceOf[js.Any], IsAutoUpdate = IsAutoUpdate.asInstanceOf[js.Any], IsLandscape = IsLandscape.asInstanceOf[js.Any], IsPhysical = IsPhysical.asInstanceOf[js.Any], LeftBorder = LeftBorder.asInstanceOf[js.Any], LeftBorderDistance = LeftBorderDistance.asInstanceOf[js.Any], LeftMargin = LeftMargin.asInstanceOf[js.Any], LeftPageFooterContent = LeftPageFooterContent.asInstanceOf[js.Any], LeftPageHeaderContent = LeftPageHeaderContent.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NumberingType = NumberingType.asInstanceOf[js.Any], PageScale = PageScale.asInstanceOf[js.Any], PageStyleLayout = PageStyleLayout.asInstanceOf[js.Any], ParaStyleConditions = ParaStyleConditions.asInstanceOf[js.Any], ParentStyle = ParentStyle.asInstanceOf[js.Any], PrintAnnotations = PrintAnnotations.asInstanceOf[js.Any], PrintCharts = PrintCharts.asInstanceOf[js.Any], PrintDownFirst = PrintDownFirst.asInstanceOf[js.Any], PrintDrawing = PrintDrawing.asInstanceOf[js.Any], PrintFormulas = PrintFormulas.asInstanceOf[js.Any], PrintGrid = PrintGrid.asInstanceOf[js.Any], PrintHeaders = PrintHeaders.asInstanceOf[js.Any], PrintObjects = PrintObjects.asInstanceOf[js.Any], PrintZeroValues = PrintZeroValues.asInstanceOf[js.Any], PrinterPaperTray = PrinterPaperTray.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RegisterModeActive = RegisterModeActive.asInstanceOf[js.Any], RegisterParagraphStyle = RegisterParagraphStyle.asInstanceOf[js.Any], RightBorder = RightBorder.asInstanceOf[js.Any], RightBorderDistance = RightBorderDistance.asInstanceOf[js.Any], RightMargin = RightMargin.asInstanceOf[js.Any], RightPageFooterContent = RightPageFooterContent.asInstanceOf[js.Any], RightPageHeaderContent = RightPageHeaderContent.asInstanceOf[js.Any], ScaleToPages = ScaleToPages.asInstanceOf[js.Any], ScaleToPagesX = ScaleToPagesX.asInstanceOf[js.Any], ScaleToPagesY = ScaleToPagesY.asInstanceOf[js.Any], ShadowFormat = ShadowFormat.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], StyleInteropGrabBag = StyleInteropGrabBag.asInstanceOf[js.Any], TextColumns = TextColumns.asInstanceOf[js.Any], TopBorder = TopBorder.asInstanceOf[js.Any], TopBorderDistance = TopBorderDistance.asInstanceOf[js.Any], TopMargin = TopMargin.asInstanceOf[js.Any], UserDefinedAttributes = UserDefinedAttributes.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], WritingMode = WritingMode.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertiesChangeListener = js.Any.fromFunction2(addPropertiesChangeListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), firePropertiesChangeEvent = js.Any.fromFunction2(firePropertiesChangeEvent), getName = js.Any.fromFunction0(getName), getParentStyle = js.Any.fromFunction0(getParentStyle), getPropertyDefaults = js.Any.fromFunction1(getPropertyDefaults), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyStates = js.Any.fromFunction1(getPropertyStates), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValues = js.Any.fromFunction1(getPropertyValues), isInUse = js.Any.fromFunction0(isInUse), isUserDefined = js.Any.fromFunction0(isUserDefined), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertiesChangeListener = js.Any.fromFunction1(removePropertiesChangeListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setAllPropertiesToDefault = js.Any.fromFunction0(setAllPropertiesToDefault), setName = js.Any.fromFunction1(setName), setParentStyle = js.Any.fromFunction1(setParentStyle), setPropertiesToDefault = js.Any.fromFunction1(setPropertiesToDefault), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setPropertyValues = js.Any.fromFunction2(setPropertyValues))
    __obj.asInstanceOf[TablePageStyle]
  }
  @scala.inline
  implicit class TablePageStyleOps[Self <: TablePageStyle] (val x: Self) extends AnyVal {
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
    def withCenterHorizontally(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CenterHorizontally")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCenterVertically(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CenterVertically")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstIsShared(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstIsShared")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstPageNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstPageNumber")(value.asInstanceOf[js.Any])
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
    def withLeftPageFooterContent(value: XHeaderFooterContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LeftPageFooterContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftPageHeaderContent(value: XHeaderFooterContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LeftPageHeaderContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberingType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageStyleLayout(value: PageStyleLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageStyleLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrintAnnotations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrintAnnotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrintCharts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrintCharts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrintDownFirst(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrintDownFirst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrintDrawing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrintDrawing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrintFormulas(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrintFormulas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrintGrid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrintGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrintHeaders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrintHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrintObjects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrintObjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrintZeroValues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrintZeroValues")(value.asInstanceOf[js.Any])
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
    def withRightPageFooterContent(value: XHeaderFooterContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RightPageFooterContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightPageHeaderContent(value: XHeaderFooterContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RightPageHeaderContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScaleToPages(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScaleToPages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScaleToPagesX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScaleToPagesX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScaleToPagesY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScaleToPagesY")(value.asInstanceOf[js.Any])
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

