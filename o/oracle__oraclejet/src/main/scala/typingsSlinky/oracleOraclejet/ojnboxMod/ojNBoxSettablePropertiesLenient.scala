package typingsSlinky.oracleOraclejet.ojnboxMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.anon.CellDefaults
import typingsSlinky.oracleOraclejet.anon.HighlightedCount
import typingsSlinky.oracleOraclejet.anon.`13`
import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataProvider
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

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojnbox.ojNBoxSettableProperties<K, D>> */
@js.native
trait ojNBoxSettablePropertiesLenient[K, D]
  extends /* key */ StringDictionary[js.Any] {
  var animationOnDataChange: js.UndefOr[auto | none] = js.native
  var animationOnDisplay: js.UndefOr[auto | none] = js.native
  var as: js.UndefOr[String] = js.native
  var cellContent: js.UndefOr[counts | auto] = js.native
  var cellMaximize: js.UndefOr[off | on] = js.native
  var cells: js.UndefOr[js.Array[Cell] | js.Promise[js.Array[Cell]]] = js.native
  var columns: js.UndefOr[js.Array[Column] | js.Promise[js.Array[Column]]] = js.native
  var columnsTitle: js.UndefOr[String] = js.native
  var countLabel: js.UndefOr[js.Function1[/* context */ CountLabelContext, String | Null]] = js.native
  var data: js.UndefOr[DataProvider[K, D]] = js.native
  var groupAttributes: js.UndefOr[
    color | indicatorColor | indicatorIconColor | indicatorIconPattern | indicatorIconShape
  ] = js.native
  var groupBehavior: js.UndefOr[acrossCells | none | withinCell] = js.native
  var hiddenCategories: js.UndefOr[js.Array[String]] = js.native
  var highlightMatch: js.UndefOr[any | all] = js.native
  var highlightedCategories: js.UndefOr[js.Array[String]] = js.native
  var hoverBehavior: js.UndefOr[dim | none] = js.native
  var labelTruncation: js.UndefOr[ifRequired | on] = js.native
  var maximizedColumn: js.UndefOr[String] = js.native
  var maximizedRow: js.UndefOr[String] = js.native
  var otherColor: js.UndefOr[String] = js.native
  var otherThreshold: js.UndefOr[Double] = js.native
  var rows: js.UndefOr[js.Array[Row] | js.Promise[js.Array[Row]]] = js.native
  var rowsTitle: js.UndefOr[String] = js.native
  var selection: js.UndefOr[js.Array[K]] = js.native
  var selectionMode: js.UndefOr[none | single | multiple] = js.native
  var styleDefaults: js.UndefOr[CellDefaults] = js.native
  var tooltip: js.UndefOr[`13`[K]] = js.native
  var touchResponse: js.UndefOr[touchStart | auto] = js.native
  var trackResize: js.UndefOr[on | off] = js.native
  var translations: js.UndefOr[HighlightedCount] = js.native
}

object ojNBoxSettablePropertiesLenient {
  @scala.inline
  def apply[K, D](): ojNBoxSettablePropertiesLenient[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojNBoxSettablePropertiesLenient[K, D]]
  }
  @scala.inline
  implicit class ojNBoxSettablePropertiesLenientOps[Self[k, d] <: ojNBoxSettablePropertiesLenient[k, d], K, D] (val x: Self[K, D]) extends AnyVal {
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
    def withoutAnimationOnDataChange: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationOnDataChange")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationOnDisplay(value: auto | none): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationOnDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationOnDisplay: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationOnDisplay")(js.undefined)
        ret
    }
    @scala.inline
    def withAs(value: String): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAs: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(js.undefined)
        ret
    }
    @scala.inline
    def withCellContent(value: counts | auto): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellContent: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellContent")(js.undefined)
        ret
    }
    @scala.inline
    def withCellMaximize(value: off | on): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellMaximize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellMaximize: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellMaximize")(js.undefined)
        ret
    }
    @scala.inline
    def withCells(value: js.Array[Cell] | js.Promise[js.Array[Cell]]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCells: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cells")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns(value: js.Array[Column] | js.Promise[js.Array[Column]]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnsTitle(value: String): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnsTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnsTitle: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnsTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withCountLabel(value: /* context */ CountLabelContext => String | Null): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCountLabel: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: DataProvider[K, D]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupAttributes(value: color | indicatorColor | indicatorIconColor | indicatorIconPattern | indicatorIconShape): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupAttributes: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupBehavior(value: acrossCells | none | withinCell): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupBehavior: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withHiddenCategories(value: js.Array[String]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenCategories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHiddenCategories: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenCategories")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightMatch(value: any | all): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightMatch: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightedCategories(value: js.Array[String]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightedCategories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightedCategories: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightedCategories")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverBehavior(value: dim | none): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverBehavior: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelTruncation(value: ifRequired | on): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelTruncation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelTruncation: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelTruncation")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximizedColumn(value: String): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximizedColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximizedColumn: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximizedColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximizedRow(value: String): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximizedRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximizedRow: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximizedRow")(js.undefined)
        ret
    }
    @scala.inline
    def withOtherColor(value: String): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOtherColor: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherColor")(js.undefined)
        ret
    }
    @scala.inline
    def withOtherThreshold(value: Double): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOtherThreshold: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: js.Array[Row] | js.Promise[js.Array[Row]]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
    @scala.inline
    def withRowsTitle(value: String): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowsTitle: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withSelection(value: js.Array[K]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelection: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionMode(value: none | single | multiple): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionMode: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleDefaults(value: CellDefaults): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyleDefaults: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleDefaults")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: `13`[K]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchResponse(value: touchStart | auto): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchResponse: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackResize(value: on | off): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackResize: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackResize")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslations(value: HighlightedCount): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslations: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(js.undefined)
        ret
    }
  }
  
}

