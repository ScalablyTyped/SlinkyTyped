package typingsSlinky.oracleOraclejet.ojnboxMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.oracleOraclejet.anon.CellDefaults
import typingsSlinky.oracleOraclejet.anon.HighlightedCount
import typingsSlinky.oracleOraclejet.anon.`15`
import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.oracleOraclejet.ojdvtBaseMod.dvtBaseComponent
import typingsSlinky.oracleOraclejet.ojnboxMod.ojNBox.Cell
import typingsSlinky.oracleOraclejet.ojnboxMod.ojNBox.Column
import typingsSlinky.oracleOraclejet.ojnboxMod.ojNBox.CountLabelContext
import typingsSlinky.oracleOraclejet.ojnboxMod.ojNBox.Row
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.acrossCells
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.all
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.animationOnDataChange
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.animationOnDataChangeChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.animationOnDisplay
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.animationOnDisplayChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.any
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.as
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.asChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.cellContent
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.cellContentChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.cellMaximize
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.cellMaximizeChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.cells
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.cellsChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.color
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.columns
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.columnsChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.columnsTitle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.columnsTitleChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.countLabelChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.counts
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.data
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dataChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dim
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.groupAttributes
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.groupAttributesChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.groupBehavior
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.groupBehaviorChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hiddenCategories
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hiddenCategoriesChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.highlightMatch
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.highlightMatchChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.highlightedCategories
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.highlightedCategoriesChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hoverBehavior
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hoverBehaviorChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ifRequired
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.indicatorColor
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.indicatorIconColor
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.indicatorIconPattern
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.indicatorIconShape
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.labelTruncation
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.labelTruncationChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.maximizedColumn
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.maximizedColumnChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.maximizedRow
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.maximizedRowChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.multiple
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.otherColor
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.otherColorChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.otherThreshold
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.otherThresholdChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rows
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rowsChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rowsTitle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rowsTitleChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.selection
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.selectionChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.selectionMode
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.selectionModeChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.single
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.styleDefaults
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.styleDefaultsChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.tooltip
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.tooltipChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.touchResponse
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.touchResponseChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.touchStart
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.translations
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.withinCell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojNBox_[K, D] extends dvtBaseComponent[ojNBoxSettableProperties[K, D]] {
  var animationOnDataChange: auto | none = js.native
  var animationOnDisplay: auto | none = js.native
  var as: String = js.native
  var cellContent: counts | auto = js.native
  var cellMaximize: off | on = js.native
  var cells: js.Promise[js.Array[Cell]] | Null = js.native
  var columns: js.Promise[js.Array[Column]] | Null = js.native
  var columnsTitle: String = js.native
  var data: (DataProvider[K, D]) | Null = js.native
  var groupAttributes: color | indicatorColor | indicatorIconColor | indicatorIconPattern | indicatorIconShape = js.native
  var groupBehavior: acrossCells | none | withinCell = js.native
  var hiddenCategories: js.Array[String] = js.native
  var highlightMatch: any | all = js.native
  var highlightedCategories: js.Array[String] = js.native
  var hoverBehavior: dim | none = js.native
  var labelTruncation: ifRequired | on = js.native
  var maximizedColumn: String = js.native
  var maximizedRow: String = js.native
  var onAnimationOnDataChangeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onAnimationOnDisplayChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onAsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onCellContentChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onCellMaximizeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onCellsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onColumnsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onColumnsTitleChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onCountLabelChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onDataChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onGroupAttributesChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onGroupBehaviorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onHiddenCategoriesChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onHighlightMatchChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onHighlightedCategoriesChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onHoverBehaviorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onLabelTruncationChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onMaximizedColumnChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onMaximizedRowChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOtherColorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOtherThresholdChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onRowsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onRowsTitleChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSelectionChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSelectionModeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onStyleDefaultsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onTooltipChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onTouchResponseChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var otherColor: String = js.native
  var otherThreshold: Double = js.native
  var rows: js.Promise[js.Array[Row]] | Null = js.native
  var rowsTitle: String = js.native
  var selection: js.Array[K] = js.native
  var selectionMode: none | single | multiple = js.native
  var styleDefaults: CellDefaults = js.native
  var tooltip: `15`[K] = js.native
  var touchResponse: touchStart | auto = js.native
  @JSName("translations")
  var translations_ojNBox_ : HighlightedCount = js.native
  def addEventListener(
    `type`: animationOnDataChangeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDataChangeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDisplayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDisplayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: cellContentChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: cellContentChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: cellMaximizeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: cellMaximizeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: groupAttributesChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: groupAttributesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: groupBehaviorChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: groupBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: highlightMatchChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: highlightMatchChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: hoverBehaviorChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: hoverBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: labelTruncationChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: labelTruncationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: selectionModeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: selectionModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: touchResponseChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: touchResponseChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(`type`: asChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(
    `type`: asChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cellsChanged(`type`: cellsChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cellsChanged(
    `type`: cellsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_columnsChanged(`type`: columnsChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_columnsChanged(
    `type`: columnsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_columnsTitleChanged(`type`: columnsTitleChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_columnsTitleChanged(
    `type`: columnsTitleChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_countLabelChanged(`type`: countLabelChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_countLabelChanged(
    `type`: countLabelChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataChanged(`type`: dataChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataChanged(
    `type`: dataChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hiddenCategoriesChanged(
    `type`: hiddenCategoriesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hiddenCategoriesChanged(
    `type`: hiddenCategoriesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highlightedCategoriesChanged(
    `type`: highlightedCategoriesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highlightedCategoriesChanged(
    `type`: highlightedCategoriesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maximizedColumnChanged(`type`: maximizedColumnChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maximizedColumnChanged(
    `type`: maximizedColumnChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maximizedRowChanged(`type`: maximizedRowChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maximizedRowChanged(
    `type`: maximizedRowChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_otherColorChanged(`type`: otherColorChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_otherColorChanged(
    `type`: otherColorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_otherThresholdChanged(`type`: otherThresholdChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_otherThresholdChanged(
    `type`: otherThresholdChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rowsChanged(`type`: rowsChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rowsChanged(
    `type`: rowsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rowsTitleChanged(`type`: rowsTitleChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rowsTitleChanged(
    `type`: rowsTitleChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(`type`: selectionChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: selectionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_styleDefaultsChanged(`type`: styleDefaultsChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_styleDefaultsChanged(
    `type`: styleDefaultsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(`type`: tooltipChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: tooltipChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def countLabel(context: CountLabelContext): String | Null = js.native
  def getCell(rowValue: String, columnValue: String): js.Object | Null = js.native
  def getColumn(columnValue: String): js.Object | Null = js.native
  def getColumnCount(): Double = js.native
  def getColumnsTitle(): String = js.native
  def getContextByNode(node: Element): js.Object | Null = js.native
  def getDialog(): js.Object | Null = js.native
  def getGroupBehavior(): String = js.native
  def getGroupNode(groupCategory: String): js.Object | Null = js.native
  @JSName("getProperty")
  def getProperty_animationOnDataChange(property: animationOnDataChange): auto | none = js.native
  @JSName("getProperty")
  def getProperty_animationOnDisplay(property: animationOnDisplay): auto | none = js.native
  @JSName("getProperty")
  def getProperty_as(property: as): String = js.native
  @JSName("getProperty")
  def getProperty_cellContent(property: cellContent): counts | auto = js.native
  @JSName("getProperty")
  def getProperty_cellMaximize(property: cellMaximize): off | on = js.native
  @JSName("getProperty")
  def getProperty_cells(property: cells): js.Promise[js.Array[Cell]] | Null = js.native
  @JSName("getProperty")
  def getProperty_columns(property: columns): js.Promise[js.Array[Column]] | Null = js.native
  @JSName("getProperty")
  def getProperty_columnsTitle(property: columnsTitle): String = js.native
  @JSName("getProperty")
  def getProperty_data(property: data): (DataProvider[K, D]) | Null = js.native
  @JSName("getProperty")
  def getProperty_groupAttributes(property: groupAttributes): color | indicatorColor | indicatorIconColor | indicatorIconPattern | indicatorIconShape = js.native
  @JSName("getProperty")
  def getProperty_groupBehavior(property: groupBehavior): acrossCells | none | withinCell = js.native
  @JSName("getProperty")
  def getProperty_hiddenCategories(property: hiddenCategories): js.Array[String] = js.native
  @JSName("getProperty")
  def getProperty_highlightMatch(property: highlightMatch): any | all = js.native
  @JSName("getProperty")
  def getProperty_highlightedCategories(property: highlightedCategories): js.Array[String] = js.native
  @JSName("getProperty")
  def getProperty_hoverBehavior(property: hoverBehavior): dim | none = js.native
  @JSName("getProperty")
  def getProperty_labelTruncation(property: labelTruncation): ifRequired | on = js.native
  @JSName("getProperty")
  def getProperty_maximizedColumn(property: maximizedColumn): String = js.native
  @JSName("getProperty")
  def getProperty_maximizedRow(property: maximizedRow): String = js.native
  @JSName("getProperty")
  def getProperty_otherColor(property: otherColor): String = js.native
  @JSName("getProperty")
  def getProperty_otherThreshold(property: otherThreshold): Double = js.native
  @JSName("getProperty")
  def getProperty_rows(property: rows): js.Promise[js.Array[Row]] | Null = js.native
  @JSName("getProperty")
  def getProperty_rowsTitle(property: rowsTitle): String = js.native
  @JSName("getProperty")
  def getProperty_selection(property: selection): js.Array[K] = js.native
  @JSName("getProperty")
  def getProperty_selectionMode(property: selectionMode): none | single | multiple = js.native
  @JSName("getProperty")
  def getProperty_styleDefaults(property: styleDefaults): CellDefaults = js.native
  @JSName("getProperty")
  def getProperty_tooltip(property: tooltip): `15`[K] = js.native
  @JSName("getProperty")
  def getProperty_touchResponse(property: touchResponse): touchStart | auto = js.native
  def getRow(rowValue: String): js.Object | Null = js.native
  def getRowCount(): Double = js.native
  def getRowsTitle(): String = js.native
  def setProperties(properties: ojNBoxSettablePropertiesLenient[K, D]): Unit = js.native
  def setProperty(property: animationOnDataChange, value: auto): Unit = js.native
  def setProperty(property: animationOnDataChange, value: none): Unit = js.native
  def setProperty(property: animationOnDisplay, value: auto): Unit = js.native
  def setProperty(property: animationOnDisplay, value: none): Unit = js.native
  def setProperty(property: cellContent, value: auto): Unit = js.native
  def setProperty(property: cellContent, value: counts): Unit = js.native
  def setProperty(property: cellMaximize, value: off): Unit = js.native
  def setProperty(property: cellMaximize, value: on): Unit = js.native
  def setProperty(property: groupAttributes, value: color): Unit = js.native
  def setProperty(property: groupAttributes, value: indicatorColor): Unit = js.native
  def setProperty(property: groupAttributes, value: indicatorIconColor): Unit = js.native
  def setProperty(property: groupAttributes, value: indicatorIconPattern): Unit = js.native
  def setProperty(property: groupAttributes, value: indicatorIconShape): Unit = js.native
  def setProperty(property: groupBehavior, value: acrossCells): Unit = js.native
  def setProperty(property: groupBehavior, value: none): Unit = js.native
  def setProperty(property: groupBehavior, value: withinCell): Unit = js.native
  def setProperty(property: highlightMatch, value: all): Unit = js.native
  def setProperty(property: highlightMatch, value: any): Unit = js.native
  def setProperty(property: hoverBehavior, value: dim): Unit = js.native
  def setProperty(property: hoverBehavior, value: none): Unit = js.native
  def setProperty(property: labelTruncation, value: ifRequired): Unit = js.native
  def setProperty(property: labelTruncation, value: on): Unit = js.native
  def setProperty(property: selectionMode, value: multiple): Unit = js.native
  def setProperty(property: selectionMode, value: none): Unit = js.native
  def setProperty(property: selectionMode, value: single): Unit = js.native
  def setProperty(property: touchResponse, value: auto): Unit = js.native
  def setProperty(property: touchResponse, value: touchStart): Unit = js.native
  @JSName("setProperty")
  def setProperty_as(property: as, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_cells(property: cells): Unit = js.native
  @JSName("setProperty")
  def setProperty_cells(property: cells, value: js.Array[Cell]): Unit = js.native
  @JSName("setProperty")
  def setProperty_cells(property: cells, value: js.Promise[js.Array[Cell]]): Unit = js.native
  @JSName("setProperty")
  def setProperty_columns(property: columns): Unit = js.native
  @JSName("setProperty")
  def setProperty_columns(property: columns, value: js.Array[Column]): Unit = js.native
  @JSName("setProperty")
  def setProperty_columns(property: columns, value: js.Promise[js.Array[Column]]): Unit = js.native
  @JSName("setProperty")
  def setProperty_columnsTitle(property: columnsTitle, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data, value: DataProvider[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_hiddenCategories(property: hiddenCategories, value: js.Array[String]): Unit = js.native
  @JSName("setProperty")
  def setProperty_highlightedCategories(property: highlightedCategories, value: js.Array[String]): Unit = js.native
  @JSName("setProperty")
  def setProperty_maximizedColumn(property: maximizedColumn, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_maximizedRow(property: maximizedRow, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_otherColor(property: otherColor, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_otherThreshold(property: otherThreshold, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_rows(property: rows): Unit = js.native
  @JSName("setProperty")
  def setProperty_rows(property: rows, value: js.Array[Row]): Unit = js.native
  @JSName("setProperty")
  def setProperty_rows(property: rows, value: js.Promise[js.Array[Row]]): Unit = js.native
  @JSName("setProperty")
  def setProperty_rowsTitle(property: rowsTitle, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_selection(property: selection, value: js.Array[K]): Unit = js.native
  @JSName("setProperty")
  def setProperty_styleDefaults(property: styleDefaults, value: CellDefaults): Unit = js.native
  @JSName("setProperty")
  def setProperty_tooltip(property: tooltip, value: `15`[K]): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: HighlightedCount): Unit = js.native
}

