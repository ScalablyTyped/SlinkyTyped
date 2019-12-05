package typingsSlinky.atOracleOraclejet.ojnboxMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.Element
import typingsSlinky.atOracleOraclejet.Anon_AnimationDurationCellDefaults
import typingsSlinky.atOracleOraclejet.Anon_ComponentNameHighlightedCount
import typingsSlinky.atOracleOraclejet.Anon_ContextRendererAnonInsertAnonPreventDefaultK
import typingsSlinky.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.acrossCells
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.all
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.animationOnDataChange
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.animationOnDataChangeChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.animationOnDisplay
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.animationOnDisplayChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.any
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.as
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.asChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.auto
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.cellContent
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.cellContentChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.cellMaximize
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.cellMaximizeChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.cells
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.cellsChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.color
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.columns
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.columnsChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.columnsTitle
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.columnsTitleChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.countLabelChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.counts
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.data
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.dataChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.dim
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.groupAttributes
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.groupAttributesChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.groupBehavior
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.groupBehaviorChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.hiddenCategories
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.hiddenCategoriesChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.highlightMatch
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.highlightMatchChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.highlightedCategories
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.highlightedCategoriesChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.hoverBehavior
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.hoverBehaviorChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.ifRequired
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.indicatorColor
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.indicatorIconColor
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.indicatorIconPattern
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.indicatorIconShape
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.labelTruncation
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.labelTruncationChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.maximizedColumn
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.maximizedColumnChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.maximizedRow
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.maximizedRowChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.multiple
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.none
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.off
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.on
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.otherColor
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.otherColorChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.otherThreshold
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.otherThresholdChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.rows
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.rowsChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.rowsTitle
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.rowsTitleChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.selection
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.selectionChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.selectionMode
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.selectionModeChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.single
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.styleDefaults
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.styleDefaultsChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.tooltip
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.tooltipChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.touchResponse
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.touchResponseChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.touchStart
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.translations
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.withinCell
import typingsSlinky.atOracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.atOracleOraclejet.ojdvtDashBaseMod.dvtBaseComponent
import typingsSlinky.atOracleOraclejet.ojnboxMod.ojNBox.Cell
import typingsSlinky.atOracleOraclejet.ojnboxMod.ojNBox.Column
import typingsSlinky.atOracleOraclejet.ojnboxMod.ojNBox.CountLabelContext
import typingsSlinky.atOracleOraclejet.ojnboxMod.ojNBox.Row
import typingsSlinky.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("ojNBox")
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
  var styleDefaults: Anon_AnimationDurationCellDefaults = js.native
  var tooltip: Anon_ContextRendererAnonInsertAnonPreventDefaultK[K] = js.native
  var touchResponse: touchStart | auto = js.native
  @JSName("translations")
  var translations_ojNBox_ : Anon_ComponentNameHighlightedCount = js.native
  def addEventListener(
    `type`: animationOnDataChangeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDataChangeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | none], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDisplayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDisplayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | none], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: cellContentChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[counts | auto], _]
  ): Unit = js.native
  def addEventListener(
    `type`: cellContentChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[counts | auto], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: cellMaximizeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[off | on], _]
  ): Unit = js.native
  def addEventListener(
    `type`: cellMaximizeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[off | on], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: groupAttributesChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        color | indicatorColor | indicatorIconColor | indicatorIconPattern | indicatorIconShape
      ], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: groupAttributesChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        color | indicatorColor | indicatorIconColor | indicatorIconPattern | indicatorIconShape
      ], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: groupBehaviorChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[acrossCells | none | withinCell], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: groupBehaviorChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[acrossCells | none | withinCell], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: highlightMatchChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[any | all], _]
  ): Unit = js.native
  def addEventListener(
    `type`: highlightMatchChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[any | all], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: hoverBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[dim | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: hoverBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[dim | none], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: labelTruncationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[ifRequired | on], _]
  ): Unit = js.native
  def addEventListener(
    `type`: labelTruncationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[ifRequired | on], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: selectionModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | single | multiple], _]
  ): Unit = js.native
  def addEventListener(
    `type`: selectionModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | single | multiple], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: touchResponseChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[touchStart | auto], _]
  ): Unit = js.native
  def addEventListener(
    `type`: touchResponseChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[touchStart | auto], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(
    `type`: asChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(
    `type`: asChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cellsChanged(
    `type`: cellsChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cellsChanged(
    `type`: cellsChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_columnsChanged(
    `type`: columnsChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_columnsChanged(
    `type`: columnsChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_columnsTitleChanged(
    `type`: columnsTitleChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_columnsTitleChanged(
    `type`: columnsTitleChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_countLabelChanged(
    `type`: countLabelChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_countLabelChanged(
    `type`: countLabelChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataChanged(
    `type`: dataChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataChanged(
    `type`: dataChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hiddenCategoriesChanged(
    `type`: hiddenCategoriesChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hiddenCategoriesChanged(
    `type`: hiddenCategoriesChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highlightedCategoriesChanged(
    `type`: highlightedCategoriesChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highlightedCategoriesChanged(
    `type`: highlightedCategoriesChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maximizedColumnChanged(
    `type`: maximizedColumnChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maximizedColumnChanged(
    `type`: maximizedColumnChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maximizedRowChanged(
    `type`: maximizedRowChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maximizedRowChanged(
    `type`: maximizedRowChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_otherColorChanged(
    `type`: otherColorChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_otherColorChanged(
    `type`: otherColorChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_otherThresholdChanged(
    `type`: otherThresholdChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_otherThresholdChanged(
    `type`: otherThresholdChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rowsChanged(
    `type`: rowsChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rowsChanged(
    `type`: rowsChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rowsTitleChanged(
    `type`: rowsTitleChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rowsTitleChanged(
    `type`: rowsTitleChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: selectionChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: selectionChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_styleDefaultsChanged(
    `type`: styleDefaultsChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_styleDefaultsChanged(
    `type`: styleDefaultsChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: tooltipChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: tooltipChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
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
  def getProperty_styleDefaults(property: styleDefaults): Anon_AnimationDurationCellDefaults = js.native
  @JSName("getProperty")
  def getProperty_tooltip(property: tooltip): Anon_ContextRendererAnonInsertAnonPreventDefaultK[K] = js.native
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
  def setProperty_styleDefaults(property: styleDefaults, value: Anon_AnimationDurationCellDefaults): Unit = js.native
  @JSName("setProperty")
  def setProperty_tooltip(property: tooltip, value: Anon_ContextRendererAnonInsertAnonPreventDefaultK[K]): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: Anon_ComponentNameHighlightedCount): Unit = js.native
}

