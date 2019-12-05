package typingsSlinky.atOracleOraclejet.ojnboxMod

import typingsSlinky.atOracleOraclejet.Anon_AnimationDurationCellDefaults
import typingsSlinky.atOracleOraclejet.Anon_ComponentNameHighlightedCount
import typingsSlinky.atOracleOraclejet.Anon_ContextRendererAnonInsertAnonPreventDefaultK
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.acrossCells
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.all
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.any
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.auto
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.color
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.counts
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.dim
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.ifRequired
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.indicatorColor
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.indicatorIconColor
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.indicatorIconPattern
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.indicatorIconShape
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.multiple
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.none
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.off
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.on
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.single
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.touchStart
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.withinCell
import typingsSlinky.atOracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.atOracleOraclejet.ojdvtDashBaseMod.dvtBaseComponentSettableProperties
import typingsSlinky.atOracleOraclejet.ojnboxMod.ojNBox.Cell
import typingsSlinky.atOracleOraclejet.ojnboxMod.ojNBox.Column
import typingsSlinky.atOracleOraclejet.ojnboxMod.ojNBox.CountLabelContext
import typingsSlinky.atOracleOraclejet.ojnboxMod.ojNBox.Row
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojNBoxSettableProperties[K, D] extends dvtBaseComponentSettableProperties {
  var animationOnDataChange: auto | none
  var animationOnDisplay: auto | none
  var as: String
  var cellContent: counts | auto
  var cellMaximize: off | on
  var cells: js.Array[Cell] | js.Promise[js.Array[Cell]] | Null
  var columns: js.Array[Column] | js.Promise[js.Array[Column]] | Null
  var columnsTitle: String
  var data: (DataProvider[K, D]) | Null
  var groupAttributes: color | indicatorColor | indicatorIconColor | indicatorIconPattern | indicatorIconShape
  var groupBehavior: acrossCells | none | withinCell
  var hiddenCategories: js.Array[String]
  var highlightMatch: any | all
  var highlightedCategories: js.Array[String]
  var hoverBehavior: dim | none
  var labelTruncation: ifRequired | on
  var maximizedColumn: String
  var maximizedRow: String
  var otherColor: String
  var otherThreshold: Double
  var rows: js.Array[Row] | js.Promise[js.Array[Row]] | Null
  var rowsTitle: String
  var selection: js.Array[K]
  var selectionMode: none | single | multiple
  var styleDefaults: Anon_AnimationDurationCellDefaults
  var tooltip: Anon_ContextRendererAnonInsertAnonPreventDefaultK[K]
  var touchResponse: touchStart | auto
  @JSName("translations")
  var translations_ojNBoxSettableProperties: Anon_ComponentNameHighlightedCount
  def countLabel(context: CountLabelContext): String | Null
}

object ojNBoxSettableProperties {
  @scala.inline
  def apply[K, D](
    animationOnDataChange: auto | none,
    animationOnDisplay: auto | none,
    as: String,
    cellContent: counts | auto,
    cellMaximize: off | on,
    columnsTitle: String,
    countLabel: CountLabelContext => String | Null,
    groupAttributes: color | indicatorColor | indicatorIconColor | indicatorIconPattern | indicatorIconShape,
    groupBehavior: acrossCells | none | withinCell,
    hiddenCategories: js.Array[String],
    highlightMatch: any | all,
    highlightedCategories: js.Array[String],
    hoverBehavior: dim | none,
    labelTruncation: ifRequired | on,
    maximizedColumn: String,
    maximizedRow: String,
    otherColor: String,
    otherThreshold: Double,
    rowsTitle: String,
    selection: js.Array[K],
    selectionMode: none | single | multiple,
    styleDefaults: Anon_AnimationDurationCellDefaults,
    tooltip: Anon_ContextRendererAnonInsertAnonPreventDefaultK[K],
    touchResponse: touchStart | auto,
    trackResize: on | off,
    translations: Anon_ComponentNameHighlightedCount,
    cells: js.Array[Cell] | js.Promise[js.Array[Cell]] = null,
    columns: js.Array[Column] | js.Promise[js.Array[Column]] = null,
    data: DataProvider[K, D] = null,
    rows: js.Array[Row] | js.Promise[js.Array[Row]] = null
  ): ojNBoxSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(animationOnDataChange = animationOnDataChange.asInstanceOf[js.Any], animationOnDisplay = animationOnDisplay.asInstanceOf[js.Any], as = as.asInstanceOf[js.Any], cellContent = cellContent.asInstanceOf[js.Any], cellMaximize = cellMaximize.asInstanceOf[js.Any], columnsTitle = columnsTitle.asInstanceOf[js.Any], countLabel = js.Any.fromFunction1(countLabel), groupAttributes = groupAttributes.asInstanceOf[js.Any], groupBehavior = groupBehavior.asInstanceOf[js.Any], hiddenCategories = hiddenCategories.asInstanceOf[js.Any], highlightMatch = highlightMatch.asInstanceOf[js.Any], highlightedCategories = highlightedCategories.asInstanceOf[js.Any], hoverBehavior = hoverBehavior.asInstanceOf[js.Any], labelTruncation = labelTruncation.asInstanceOf[js.Any], maximizedColumn = maximizedColumn.asInstanceOf[js.Any], maximizedRow = maximizedRow.asInstanceOf[js.Any], otherColor = otherColor.asInstanceOf[js.Any], otherThreshold = otherThreshold.asInstanceOf[js.Any], rowsTitle = rowsTitle.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], styleDefaults = styleDefaults.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], touchResponse = touchResponse.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    if (cells != null) __obj.updateDynamic("cells")(cells.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojNBoxSettableProperties[K, D]]
  }
}

