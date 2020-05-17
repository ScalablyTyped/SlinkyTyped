package typingsSlinky.googleAppsScript.global.GoogleAppsScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GoogleAppsScript.Charts")
@js.native
object Charts extends js.Object {
  /**
    * An enumeration of how hidden dimensions in a source are expressed in a chart.
    */
  @js.native
  object ChartHiddenDimensionStrategy extends js.Object {
    /* 0 */ val IGNORE_BOTH: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.ChartHiddenDimensionStrategy.IGNORE_BOTH with Double = js.native
    /* 2 */ val IGNORE_COLUMNS: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.ChartHiddenDimensionStrategy.IGNORE_COLUMNS with Double = js.native
    /* 1 */ val IGNORE_ROWS: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.ChartHiddenDimensionStrategy.IGNORE_ROWS with Double = js.native
    /* 3 */ val SHOW_BOTH: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.ChartHiddenDimensionStrategy.SHOW_BOTH with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.ChartHiddenDimensionStrategy with Double
      ] = js.native
  }
  
  /**
    * An enumeration of how multiple ranges in the source are expressed in a chart.
    */
  @js.native
  object ChartMergeStrategy extends js.Object {
    /* 0 */ val MERGE_COLUMNS: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.ChartMergeStrategy.MERGE_COLUMNS with Double = js.native
    /* 1 */ val MERGE_ROWS: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.ChartMergeStrategy.MERGE_ROWS with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.ChartMergeStrategy with Double
      ] = js.native
  }
  
  /**
    * Chart types supported by the Charts service.
    */
  @js.native
  object ChartType extends js.Object {
    /* 1 */ val AREA: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.ChartType.AREA with Double = js.native
    /* 2 */ val BAR: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.ChartType.BAR with Double = js.native
    /* 3 */ val BUBBLE: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.ChartType.BUBBLE with Double = js.native
    /* 4 */ val CANDLESTICK: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.ChartType.CANDLESTICK with Double = js.native
    /* 5 */ val COLUMN: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.ChartType.COLUMN with Double = js.native
    /* 6 */ val COMBO: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.ChartType.COMBO with Double = js.native
    /* 7 */ val GAUGE: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.ChartType.GAUGE with Double = js.native
    /* 8 */ val GEO: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.ChartType.GEO with Double = js.native
    /* 9 */ val HISTOGRAM: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.ChartType.HISTOGRAM with Double = js.native
    /* 11 */ val LINE: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.ChartType.LINE with Double = js.native
    /* 12 */ val ORG: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.ChartType.ORG with Double = js.native
    /* 13 */ val PIE: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.ChartType.PIE with Double = js.native
    /* 10 */ val RADAR: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.ChartType.RADAR with Double = js.native
    /* 14 */ val SCATTER: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.ChartType.SCATTER with Double = js.native
    /* 15 */ val SPARKLINE: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.ChartType.SPARKLINE with Double = js.native
    /* 16 */ val STEPPED_AREA: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.ChartType.STEPPED_AREA with Double = js.native
    /* 17 */ val TABLE: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.ChartType.TABLE with Double = js.native
    /* 0 */ val TIMELINE: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.ChartType.TIMELINE with Double = js.native
    /* 18 */ val TREEMAP: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.ChartType.TREEMAP with Double = js.native
    /* 19 */ val WATERFALL: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.ChartType.WATERFALL with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.ChartType with Double] = js.native
  }
  
  /**
    * An enumeration of the valid data types for columns in a DataTable.
    */
  @js.native
  object ColumnType extends js.Object {
    /* 0 */ val DATE: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.ColumnType.DATE with Double = js.native
    /* 1 */ val NUMBER: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.ColumnType.NUMBER with Double = js.native
    /* 2 */ val STRING: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.ColumnType.STRING with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.ColumnType with Double] = js.native
  }
  
  /**
    * An enumeration of the styles for curves in a chart.
    */
  @js.native
  object CurveStyle extends js.Object {
    /* 0 */ val NORMAL: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.CurveStyle.NORMAL with Double = js.native
    /* 1 */ val SMOOTH: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.CurveStyle.SMOOTH with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.CurveStyle with Double] = js.native
  }
  
  /**
    * An enumeration of how a string value should be matched. Matching a string is a boolean operation.
    * Given a string, a match term (string), and a match type, the operation outputs true in
    * the following cases:
    *
    * If the match type equals EXACT and the match term equals the string.
    *
    * If the match type equals PREFIX and the match term is a prefix of the string.
    *
    * If the match type equals ANY and the match term is a substring of the string.
    *
    * This enumeration can be used in by a string filter control to decide which rows to filter out
    * of the data table. Given a column to filter on, leave only the rows that match the value entered
    * in the filter input box, using one of the above matching types.
    */
  @js.native
  object MatchType extends js.Object {
    /* 2 */ val ANY: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.MatchType.ANY with Double = js.native
    /* 0 */ val EXACT: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.MatchType.EXACT with Double = js.native
    /* 1 */ val PREFIX: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.MatchType.PREFIX with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.MatchType with Double] = js.native
  }
  
  /**
    * An enumeration of the orientation of an object.
    */
  @js.native
  object Orientation extends js.Object {
    /* 0 */ val HORIZONTAL: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.Orientation.HORIZONTAL with Double = js.native
    /* 1 */ val VERTICAL: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.Orientation.VERTICAL with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.Orientation with Double] = js.native
  }
  
  /**
    * An enumeration of how to display selected values in picker widget.
    */
  @js.native
  object PickerValuesLayout extends js.Object {
    /* 0 */ val ASIDE: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.PickerValuesLayout.ASIDE with Double = js.native
    /* 1 */ val BELOW: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.PickerValuesLayout.BELOW with Double = js.native
    /* 3 */ val BELOW_STACKED: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.PickerValuesLayout.BELOW_STACKED with Double = js.native
    /* 2 */ val BELOW_WRAPPING: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.PickerValuesLayout.BELOW_WRAPPING with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.PickerValuesLayout with Double
      ] = js.native
  }
  
  /**
    * An enumeration of the styles of points in a line.
    */
  @js.native
  object PointStyle extends js.Object {
    /* 4 */ val HUGE: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.PointStyle.HUGE with Double = js.native
    /* 3 */ val LARGE: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.PointStyle.LARGE with Double = js.native
    /* 2 */ val MEDIUM: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.PointStyle.MEDIUM with Double = js.native
    /* 0 */ val NONE: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.PointStyle.NONE with Double = js.native
    /* 1 */ val TINY: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.PointStyle.TINY with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.PointStyle with Double] = js.native
  }
  
  /**
    * An enumeration of legend positions within a chart.
    */
  @js.native
  object Position extends js.Object {
    /* 2 */ val BOTTOM: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.Position.BOTTOM with Double = js.native
    /* 3 */ val NONE: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.Position.NONE with Double = js.native
    /* 1 */ val RIGHT: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.Position.RIGHT with Double = js.native
    /* 0 */ val TOP: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.Position.TOP with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.Position with Double] = js.native
  }
  
}

