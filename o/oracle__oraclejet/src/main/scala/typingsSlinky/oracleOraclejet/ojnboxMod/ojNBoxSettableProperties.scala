package typingsSlinky.oracleOraclejet.ojnboxMod

import typingsSlinky.oracleOraclejet.Anon13
import typingsSlinky.oracleOraclejet.AnonCellDefaults
import typingsSlinky.oracleOraclejet.AnonHighlightedCount
import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentSettableProperties
import typingsSlinky.oracleOraclejet.ojnboxMod.ojNBox.Cell
import typingsSlinky.oracleOraclejet.ojnboxMod.ojNBox.Column
import typingsSlinky.oracleOraclejet.ojnboxMod.ojNBox.CountLabelContext
import typingsSlinky.oracleOraclejet.ojnboxMod.ojNBox.Row
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.acrossCells
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.all
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.any
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.color
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.counts
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dim
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ifRequired
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.indicatorColor
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.indicatorIconColor
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.indicatorIconPattern
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.indicatorIconShape
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.multiple
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.single
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.touchStart
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.withinCell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojNBoxSettableProperties[K, D] extends dvtBaseComponentSettableProperties {
  var animationOnDataChange: auto | none = js.native
  var animationOnDisplay: auto | none = js.native
  var as: String = js.native
  var cellContent: counts | auto = js.native
  var cellMaximize: off | on = js.native
  var cells: js.Array[Cell] | js.Promise[js.Array[Cell]] | Null = js.native
  var columns: js.Array[Column] | js.Promise[js.Array[Column]] | Null = js.native
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
  var otherColor: String = js.native
  var otherThreshold: Double = js.native
  var rows: js.Array[Row] | js.Promise[js.Array[Row]] | Null = js.native
  var rowsTitle: String = js.native
  var selection: js.Array[K] = js.native
  var selectionMode: none | single | multiple = js.native
  var styleDefaults: AnonCellDefaults = js.native
  var tooltip: Anon13[K] = js.native
  var touchResponse: touchStart | auto = js.native
  @JSName("translations")
  var translations_ojNBoxSettableProperties: AnonHighlightedCount = js.native
  def countLabel(context: CountLabelContext): String | Null = js.native
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
    styleDefaults: AnonCellDefaults,
    tooltip: Anon13[K],
    touchResponse: touchStart | auto,
    trackResize: on | off,
    translations: AnonHighlightedCount
  ): ojNBoxSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(animationOnDataChange = animationOnDataChange.asInstanceOf[js.Any], animationOnDisplay = animationOnDisplay.asInstanceOf[js.Any], as = as.asInstanceOf[js.Any], cellContent = cellContent.asInstanceOf[js.Any], cellMaximize = cellMaximize.asInstanceOf[js.Any], columnsTitle = columnsTitle.asInstanceOf[js.Any], countLabel = js.Any.fromFunction1(countLabel), groupAttributes = groupAttributes.asInstanceOf[js.Any], groupBehavior = groupBehavior.asInstanceOf[js.Any], hiddenCategories = hiddenCategories.asInstanceOf[js.Any], highlightMatch = highlightMatch.asInstanceOf[js.Any], highlightedCategories = highlightedCategories.asInstanceOf[js.Any], hoverBehavior = hoverBehavior.asInstanceOf[js.Any], labelTruncation = labelTruncation.asInstanceOf[js.Any], maximizedColumn = maximizedColumn.asInstanceOf[js.Any], maximizedRow = maximizedRow.asInstanceOf[js.Any], otherColor = otherColor.asInstanceOf[js.Any], otherThreshold = otherThreshold.asInstanceOf[js.Any], rowsTitle = rowsTitle.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], styleDefaults = styleDefaults.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], touchResponse = touchResponse.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojNBoxSettableProperties[K, D]]
  }
  @scala.inline
  implicit class ojNBoxSettablePropertiesOps[Self[k, d] <: ojNBoxSettableProperties[k, d], K, D] (val x: Self[K, D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, D]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, D]) with Other]
    @scala.inline
    def withAnimationOnDataChange(value: auto | none): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationOnDataChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimationOnDisplay(value: auto | none): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationOnDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAs(value: String): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellContent(value: counts | auto): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellMaximize(value: off | on): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellMaximize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnsTitle(value: String): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnsTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountLabel(value: CountLabelContext => String | Null): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGroupAttributes(value: color | indicatorColor | indicatorIconColor | indicatorIconPattern | indicatorIconShape): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupBehavior(value: acrossCells | none | withinCell): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHiddenCategories(value: js.Array[String]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenCategories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlightMatch(value: any | all): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlightedCategories(value: js.Array[String]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightedCategories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHoverBehavior(value: dim | none): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelTruncation(value: ifRequired | on): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelTruncation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaximizedColumn(value: String): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximizedColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaximizedRow(value: String): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximizedRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOtherColor(value: String): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOtherThreshold(value: Double): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowsTitle(value: String): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelection(value: js.Array[K]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionMode(value: none | single | multiple): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyleDefaults(value: AnonCellDefaults): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTooltip(value: Anon13[K]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchResponse(value: touchStart | auto): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslations(value: AnonHighlightedCount): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCells(value: js.Array[Cell] | js.Promise[js.Array[Cell]]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellsNull: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cells")(null)
        ret
    }
    @scala.inline
    def withColumns(value: js.Array[Column] | js.Promise[js.Array[Column]]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnsNull: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(null)
        ret
    }
    @scala.inline
    def withData(value: DataProvider[K, D]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataNull: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(null)
        ret
    }
    @scala.inline
    def withRows(value: js.Array[Row] | js.Promise[js.Array[Row]]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowsNull: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(null)
        ret
    }
  }
  
}

