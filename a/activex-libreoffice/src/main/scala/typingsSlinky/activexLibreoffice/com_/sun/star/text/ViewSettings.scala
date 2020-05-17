package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to the settings of the controller of a text document. */
@js.native
trait ViewSettings extends XPropertySet {
  /**
    * If this property is `TRUE` , whitespaces around pages are hidden.
    * @since LibreOffice 5.1
    */
  var HideWhitespace: Boolean = js.native
  /**
    * metric unit of the horizontal ruler
    *
    * Uses values {@link com.sun.star.awt.FieldUnit}
    * @since OOo 3.1
    */
  var HorizontalRulerMetric: Double = js.native
  /** If this property is `TRUE` hyperlinks in the document are executed (loaded) on mouse click. Otherwise they are handled like normal text. */
  var IsExecuteHyperlinks: Boolean = js.native
  /**
    * Specifies whether to display the grid or not
    * @since OOo 2.0
    */
  var IsRasterVisible: Boolean = js.native
  /**
    * Specifies whether to move frames, drawing elements, and form functions only between grid points.
    * @since OOo 2.0
    */
  var IsSnapToRaster: Boolean = js.native
  /** If this property is `TRUE` , the vertical ruler is aligned to the right side of the view and the vertical scrollbar is on the left. */
  var IsVertRulerRightAligned: Boolean = js.native
  /**
    * Defines the unit of measure for the spacing between grid points on the X-axis.
    *
    * The value must be greater than 0. The application may enforce more restricting bounds for the value.
    * @since OOo 2.0
    * @throws com::sun::star::lang::IllegalArgumentException if the value is out of bounds.
    */
  var RasterResolutionX: Double = js.native
  /**
    * Defines the unit of measure for the spacing between grid points on the Y-axis.
    *
    * The value must be greater than 0. The application may enforce more restricting bounds for the value.
    * @since OOo 2.0
    * @throws com::sun::star::lang::IllegalArgumentException if the value is out of bounds.
    */
  var RasterResolutionY: Double = js.native
  /**
    * Specifies the number of intervals between grid points on the X-axis.
    *
    * The value must be greater or equal to 0, and the application may enforce an upper bound for the value.
    * @since OOo 2.0
    * @throws com::sun::star::lang::IllegalArgumentException if the value is out of bounds.
    */
  var RasterSubdivisionX: Double = js.native
  /**
    * Specifies the number of intervals between grid points on the Y-axis.
    *
    * The value must be greater or equal to 0, and the application may enforce an upper bound for the value.
    * @since OOo 2.0
    * @throws com::sun::star::lang::IllegalArgumentException if the value is out of bounds.
    */
  var RasterSubdivisionY: Double = js.native
  /** If this property is `TRUE` , annotations (notes) are visible. */
  var ShowAnnotations: Boolean = js.native
  /** If this property is `TRUE` , paragraph line breaks are visible. */
  var ShowBreaks: Boolean = js.native
  /**
    * If this property is `TRUE` , tips for document content are shown, typically in a help balloon when the mouse is over the content.
    * @since LibreOffice 4.1
    */
  var ShowContentTips: Boolean = js.native
  /** If this property is `TRUE` , shapes are visible. */
  var ShowDrawings: Boolean = js.native
  /** If this property is `TRUE` , text fields are shown with their commands; otherwise the content is visible. */
  var ShowFieldCommands: Boolean = js.native
  /** If this property is `TRUE` , footnotes symbols are displayed with gray background. */
  var ShowFootnoteBackground: Boolean = js.native
  /** If this property is `TRUE` , graphic objects are visible. */
  var ShowGraphics: Boolean = js.native
  /**
    * If this property is `TRUE` , hidden characters are displayed
    * @since OOo 3.0
    */
  var ShowHiddenCharacters: Boolean = js.native
  /** If this property is `TRUE` , hidden paragraphs are displayed. */
  var ShowHiddenParagraphs: Boolean = js.native
  /** If this property is `TRUE` , hidden text is displayed. */
  var ShowHiddenText: Boolean = js.native
  /** If this property is `TRUE` and the property ShowRulers is `TRUE` , the horizontal ruler is displayed. */
  var ShowHoriRuler: Boolean = js.native
  /** If this property is `TRUE` and the property ShowRulers is `TRUE` , the horizontal scroll bar is displayed. */
  var ShowHoriScrollBar: Boolean = js.native
  /** If this property is `TRUE` , index marks are displayed with gray background. */
  var ShowIndexMarkBackground: Boolean = js.native
  /**
    * If this property is `TRUE` , the settings of non-printing characters are applied.
    *
    * This option controls the use of the settings ShowHiddenCharacters, ShowTabstops, ShowSpaces, ShowBreaks and ShowParaBreaks
    * @since OOo 3.0
    */
  var ShowNonprintingCharacters: Boolean = js.native
  /** If this property is `TRUE` the document will be displayed as if it were a HTML document. */
  var ShowOnlineLayout: Boolean = js.native
  /** If this property is `TRUE` , paragraph breaks are visible. */
  var ShowParaBreaks: Boolean = js.native
  /** If this property is `TRUE` , protected spaces (hard spaces) are displayed with gray background. */
  var ShowProtectedSpaces: Boolean = js.native
  /** ShowHoriRuler and ShowVertRuler determine whether a ruler is visible. */
  var ShowRulers: Boolean = js.native
  /**
    * If this property is `TRUE` , and the scroll bar is shown, a tool tip is displayed while scrolling.
    * @since LibreOffice 4.2
    */
  var ShowScrollBarTips: Boolean = js.native
  /** If this property is `TRUE` , soft hyphens are displayed with gray background. */
  var ShowSoftHyphens: Boolean = js.native
  /** If this property is `TRUE` , spaces are displayed with dots. */
  var ShowSpaces: Boolean = js.native
  /** If this property is `TRUE` , table boundaries are displayed. */
  var ShowTableBoundaries: Boolean = js.native
  /** If this property is `TRUE` , tables are visible. */
  var ShowTables: Boolean = js.native
  /** If this property is `TRUE` , tab stops are visible. */
  var ShowTabstops: Boolean = js.native
  /** If this property is `TRUE` , text boundaries are displayed. */
  var ShowTextBoundaries: Boolean = js.native
  /** If this property is `TRUE` , text fields are displayed with gray background. */
  var ShowTextFieldBackground: Boolean = js.native
  /** If this property is `TRUE` , the vertical ruler is displayed. */
  var ShowVertRuler: Boolean = js.native
  /** If this property is `TRUE` , the vertical scroll bar is displayed. */
  var ShowVertScrollBar: Boolean = js.native
  /** If this property is `TRUE` , smooth scrolling is active. */
  var SmoothScrolling: Boolean = js.native
  /**
    * metric unit of the vertical ruler
    *
    * Uses values from {@link com.sun.star.awt.FieldUnit}
    * @since OOo 3.1
    */
  var VerticalRulerMetric: Double = js.native
  /**
    * This property defines the zoom type for the document.
    * @see com.sun.star.view.DocumentZoomType
    */
  var ZoomType: Double = js.native
  /** Defines the zoom value to use. Valid only if the ZoomType is set to {@link com.sun.star.view.DocumentZoomType.BY_VALUE} . */
  var ZoomValue: Double = js.native
}

object ViewSettings {
  @scala.inline
  def apply(
    HideWhitespace: Boolean,
    HorizontalRulerMetric: Double,
    IsExecuteHyperlinks: Boolean,
    IsRasterVisible: Boolean,
    IsSnapToRaster: Boolean,
    IsVertRulerRightAligned: Boolean,
    PropertySetInfo: XPropertySetInfo,
    RasterResolutionX: Double,
    RasterResolutionY: Double,
    RasterSubdivisionX: Double,
    RasterSubdivisionY: Double,
    ShowAnnotations: Boolean,
    ShowBreaks: Boolean,
    ShowContentTips: Boolean,
    ShowDrawings: Boolean,
    ShowFieldCommands: Boolean,
    ShowFootnoteBackground: Boolean,
    ShowGraphics: Boolean,
    ShowHiddenCharacters: Boolean,
    ShowHiddenParagraphs: Boolean,
    ShowHiddenText: Boolean,
    ShowHoriRuler: Boolean,
    ShowHoriScrollBar: Boolean,
    ShowIndexMarkBackground: Boolean,
    ShowNonprintingCharacters: Boolean,
    ShowOnlineLayout: Boolean,
    ShowParaBreaks: Boolean,
    ShowProtectedSpaces: Boolean,
    ShowRulers: Boolean,
    ShowScrollBarTips: Boolean,
    ShowSoftHyphens: Boolean,
    ShowSpaces: Boolean,
    ShowTableBoundaries: Boolean,
    ShowTables: Boolean,
    ShowTabstops: Boolean,
    ShowTextBoundaries: Boolean,
    ShowTextFieldBackground: Boolean,
    ShowVertRuler: Boolean,
    ShowVertScrollBar: Boolean,
    SmoothScrolling: Boolean,
    VerticalRulerMetric: Double,
    ZoomType: Double,
    ZoomValue: Double,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): ViewSettings = {
    val __obj = js.Dynamic.literal(HideWhitespace = HideWhitespace.asInstanceOf[js.Any], HorizontalRulerMetric = HorizontalRulerMetric.asInstanceOf[js.Any], IsExecuteHyperlinks = IsExecuteHyperlinks.asInstanceOf[js.Any], IsRasterVisible = IsRasterVisible.asInstanceOf[js.Any], IsSnapToRaster = IsSnapToRaster.asInstanceOf[js.Any], IsVertRulerRightAligned = IsVertRulerRightAligned.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RasterResolutionX = RasterResolutionX.asInstanceOf[js.Any], RasterResolutionY = RasterResolutionY.asInstanceOf[js.Any], RasterSubdivisionX = RasterSubdivisionX.asInstanceOf[js.Any], RasterSubdivisionY = RasterSubdivisionY.asInstanceOf[js.Any], ShowAnnotations = ShowAnnotations.asInstanceOf[js.Any], ShowBreaks = ShowBreaks.asInstanceOf[js.Any], ShowContentTips = ShowContentTips.asInstanceOf[js.Any], ShowDrawings = ShowDrawings.asInstanceOf[js.Any], ShowFieldCommands = ShowFieldCommands.asInstanceOf[js.Any], ShowFootnoteBackground = ShowFootnoteBackground.asInstanceOf[js.Any], ShowGraphics = ShowGraphics.asInstanceOf[js.Any], ShowHiddenCharacters = ShowHiddenCharacters.asInstanceOf[js.Any], ShowHiddenParagraphs = ShowHiddenParagraphs.asInstanceOf[js.Any], ShowHiddenText = ShowHiddenText.asInstanceOf[js.Any], ShowHoriRuler = ShowHoriRuler.asInstanceOf[js.Any], ShowHoriScrollBar = ShowHoriScrollBar.asInstanceOf[js.Any], ShowIndexMarkBackground = ShowIndexMarkBackground.asInstanceOf[js.Any], ShowNonprintingCharacters = ShowNonprintingCharacters.asInstanceOf[js.Any], ShowOnlineLayout = ShowOnlineLayout.asInstanceOf[js.Any], ShowParaBreaks = ShowParaBreaks.asInstanceOf[js.Any], ShowProtectedSpaces = ShowProtectedSpaces.asInstanceOf[js.Any], ShowRulers = ShowRulers.asInstanceOf[js.Any], ShowScrollBarTips = ShowScrollBarTips.asInstanceOf[js.Any], ShowSoftHyphens = ShowSoftHyphens.asInstanceOf[js.Any], ShowSpaces = ShowSpaces.asInstanceOf[js.Any], ShowTableBoundaries = ShowTableBoundaries.asInstanceOf[js.Any], ShowTables = ShowTables.asInstanceOf[js.Any], ShowTabstops = ShowTabstops.asInstanceOf[js.Any], ShowTextBoundaries = ShowTextBoundaries.asInstanceOf[js.Any], ShowTextFieldBackground = ShowTextFieldBackground.asInstanceOf[js.Any], ShowVertRuler = ShowVertRuler.asInstanceOf[js.Any], ShowVertScrollBar = ShowVertScrollBar.asInstanceOf[js.Any], SmoothScrolling = SmoothScrolling.asInstanceOf[js.Any], VerticalRulerMetric = VerticalRulerMetric.asInstanceOf[js.Any], ZoomType = ZoomType.asInstanceOf[js.Any], ZoomValue = ZoomValue.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[ViewSettings]
  }
  @scala.inline
  implicit class ViewSettingsOps[Self <: ViewSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHideWhitespace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HideWhitespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHorizontalRulerMetric(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HorizontalRulerMetric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsExecuteHyperlinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsExecuteHyperlinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRasterVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsRasterVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSnapToRaster(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsSnapToRaster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsVertRulerRightAligned(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsVertRulerRightAligned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRasterResolutionX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RasterResolutionX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRasterResolutionY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RasterResolutionY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRasterSubdivisionX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RasterSubdivisionX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRasterSubdivisionY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RasterSubdivisionY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowAnnotations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowAnnotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowBreaks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowBreaks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowContentTips(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowContentTips")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowDrawings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowDrawings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowFieldCommands(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowFieldCommands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowFootnoteBackground(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowFootnoteBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowGraphics(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowGraphics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowHiddenCharacters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowHiddenCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowHiddenParagraphs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowHiddenParagraphs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowHiddenText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowHiddenText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowHoriRuler(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowHoriRuler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowHoriScrollBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowHoriScrollBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowIndexMarkBackground(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowIndexMarkBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowNonprintingCharacters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowNonprintingCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowOnlineLayout(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowOnlineLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowParaBreaks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowParaBreaks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowProtectedSpaces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowProtectedSpaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowRulers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowRulers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowScrollBarTips(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowScrollBarTips")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowSoftHyphens(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowSoftHyphens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowSpaces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowSpaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowTableBoundaries(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowTableBoundaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowTables(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowTables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowTabstops(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowTabstops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowTextBoundaries(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowTextBoundaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowTextFieldBackground(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowTextFieldBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowVertRuler(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowVertRuler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowVertScrollBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowVertScrollBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmoothScrolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SmoothScrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerticalRulerMetric(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VerticalRulerMetric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoomType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZoomType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoomValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZoomValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

