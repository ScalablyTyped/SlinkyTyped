package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.util.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** contains settings which are specific to each view of a spreadsheet */
@js.native
trait SpreadsheetViewSettings extends XPropertySet {
  /** specifies the color in which the cell grid is displayed. */
  var GridColor: Color = js.native
  /** enables the column and row headers of the view. */
  var HasColumnRowHeaders: Boolean = js.native
  /** enables the horizontal scroll bar of the view. */
  var HasHorizontalScrollBar: Boolean = js.native
  /** enables the sheet tabs of the view. */
  var HasSheetTabs: Boolean = js.native
  /** enables the vertical scroll bar of the view. */
  var HasVerticalScrollBar: Boolean = js.native
  /** disables the display of marks from online spelling. */
  var HideSpellMarks: Boolean = js.native
  /** enables the display of outline symbols. */
  var IsOutlineSymbolsSet: Boolean = js.native
  /** controls whether strings, values, and formulas are displayed in different colors. */
  var IsValueHighlightingEnabled: Boolean = js.native
  /** enables display of anchor symbols when drawing objects are selected. */
  var ShowAnchor: Boolean = js.native
  /**
    * enables the display of charts in the view.
    * @see SpreadsheetViewObjectsMode
    */
  var ShowCharts: Double = js.native
  /**
    * enables the display of drawing objects in the view.
    * @see SpreadsheetViewObjectsMode
    */
  var ShowDrawing: Double = js.native
  /** controls whether formulas are displayed instead of their results. */
  var ShowFormulas: Boolean = js.native
  /** enables the display of the cell grid. */
  var ShowGrid: Boolean = js.native
  /** enables display of help lines when moving drawing objects. */
  var ShowHelpLines: Boolean = js.native
  /** controls whether a marker is shown for notes in cells. */
  var ShowNotes: Boolean = js.native
  /**
    * enables display of embedded objects in the view.
    * @see SpreadsheetViewObjectsMode
    */
  var ShowObjects: Double = js.native
  /** enables display of page breaks. */
  var ShowPageBreaks: Boolean = js.native
  /** enables display of zero-values. */
  var ShowZeroValues: Boolean = js.native
  /**
    * This property defines the zoom type for the document.
    * @see com.sun.star.view.DocumentZoomType
    */
  var ZoomType: Double = js.native
  /** Defines the zoom value to use. Valid only if the ZoomType is set to {@link com.sun.star.view.DocumentZoomType.BY_VALUE} . */
  var ZoomValue: Double = js.native
}

object SpreadsheetViewSettings {
  @scala.inline
  def apply(
    GridColor: Color,
    HasColumnRowHeaders: Boolean,
    HasHorizontalScrollBar: Boolean,
    HasSheetTabs: Boolean,
    HasVerticalScrollBar: Boolean,
    HideSpellMarks: Boolean,
    IsOutlineSymbolsSet: Boolean,
    IsValueHighlightingEnabled: Boolean,
    PropertySetInfo: XPropertySetInfo,
    ShowAnchor: Boolean,
    ShowCharts: Double,
    ShowDrawing: Double,
    ShowFormulas: Boolean,
    ShowGrid: Boolean,
    ShowHelpLines: Boolean,
    ShowNotes: Boolean,
    ShowObjects: Double,
    ShowPageBreaks: Boolean,
    ShowZeroValues: Boolean,
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
  ): SpreadsheetViewSettings = {
    val __obj = js.Dynamic.literal(GridColor = GridColor.asInstanceOf[js.Any], HasColumnRowHeaders = HasColumnRowHeaders.asInstanceOf[js.Any], HasHorizontalScrollBar = HasHorizontalScrollBar.asInstanceOf[js.Any], HasSheetTabs = HasSheetTabs.asInstanceOf[js.Any], HasVerticalScrollBar = HasVerticalScrollBar.asInstanceOf[js.Any], HideSpellMarks = HideSpellMarks.asInstanceOf[js.Any], IsOutlineSymbolsSet = IsOutlineSymbolsSet.asInstanceOf[js.Any], IsValueHighlightingEnabled = IsValueHighlightingEnabled.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], ShowAnchor = ShowAnchor.asInstanceOf[js.Any], ShowCharts = ShowCharts.asInstanceOf[js.Any], ShowDrawing = ShowDrawing.asInstanceOf[js.Any], ShowFormulas = ShowFormulas.asInstanceOf[js.Any], ShowGrid = ShowGrid.asInstanceOf[js.Any], ShowHelpLines = ShowHelpLines.asInstanceOf[js.Any], ShowNotes = ShowNotes.asInstanceOf[js.Any], ShowObjects = ShowObjects.asInstanceOf[js.Any], ShowPageBreaks = ShowPageBreaks.asInstanceOf[js.Any], ShowZeroValues = ShowZeroValues.asInstanceOf[js.Any], ZoomType = ZoomType.asInstanceOf[js.Any], ZoomValue = ZoomValue.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[SpreadsheetViewSettings]
  }
  @scala.inline
  implicit class SpreadsheetViewSettingsOps[Self <: SpreadsheetViewSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGridColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GridColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasColumnRowHeaders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasColumnRowHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasHorizontalScrollBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasHorizontalScrollBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasSheetTabs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasSheetTabs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasVerticalScrollBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasVerticalScrollBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHideSpellMarks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HideSpellMarks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsOutlineSymbolsSet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsOutlineSymbolsSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsValueHighlightingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsValueHighlightingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowAnchor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowAnchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowCharts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowCharts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowDrawing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowDrawing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowFormulas(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowFormulas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowGrid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowHelpLines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowHelpLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowNotes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowNotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowObjects(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowObjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowPageBreaks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowPageBreaks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowZeroValues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowZeroValues")(value.asInstanceOf[js.Any])
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

