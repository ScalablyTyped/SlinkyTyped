package typingsSlinky.ace.AceAjax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Range extends js.Object {
  var end: Position = js.native
  var endColumn: Double = js.native
  var endRow: Double = js.native
  var start: Position = js.native
  var startColumn: Double = js.native
  var startRow: Double = js.native
  /**
    * Returns the part of the current `Range` that occurs within the boundaries of `firstRow` and `lastRow` as a new `Range` object.
    * @param firstRow The starting row
    * @param lastRow The ending row
    **/
  def clipRows(firstRow: Double, lastRow: Double): Range = js.native
  /**
    * Returns a range containing the starting and ending rows of the original range, but with a column value of `0`.
    **/
  def collapseRows(): Range = js.native
  /**
    * Checks the row and column points with the row and column points of the calling range.
    * @param row A row point to compare with
    * @param column A column point to compare with
    **/
  def compare(row: Double, column: Double): Double = js.native
  /**
    * Checks the row and column points with the row and column points of the calling range.
    * @param row A row point to compare with
    * @param column A column point to compare with
    **/
  def compareEnd(row: Double, column: Double): Double = js.native
  /**
    * Checks the row and column points with the row and column points of the calling range.
    * @param row A row point to compare with
    * @param column A column point to compare with
    **/
  def compareInside(row: Double, column: Double): Double = js.native
  /**
    * Checks the row and column points of `p` with the row and column points of the calling range.
    * @param p A point to compare with
    **/
  def comparePoint(p: Range): Double = js.native
  /**
    * Compares `this` range (A) with another range (B).
    * @param range A range to compare with
    **/
  def compareRange(range: Range): Double = js.native
  /**
    * Checks the row and column points with the row and column points of the calling range.
    * @param row A row point to compare with
    * @param column A column point to compare with
    **/
  def compareStart(row: Double, column: Double): Double = js.native
  /**
    * Returns `true` if the `row` and `column` provided are within the given range. This can better be expressed as returning `true` if:
    * ```javascript
    * this.start.row <= row <= this.end.row &&
    * this.start.column <= column <= this.end.column
    * ```
    * @param row A row to check for
    * @param column A column to check for
    **/
  def contains(row: Double, column: Double): Boolean = js.native
  /**
    * Checks the start and end points of `range` and compares them to the calling range. Returns `true` if the `range` is contained within the caller's range.
    * @param range A range to compare with
    **/
  def containsRange(range: Range): Boolean = js.native
  /**
    * Changes the row and column points for the calling range for both the starting and ending points.
    * @param row A new row to extend to
    * @param column A new column to extend to
    **/
  def extend(row: Double, column: Double): Range = js.native
  /**
    * Creates and returns a new `Range` based on the row and column of the given parameters.
    * @param start A starting point to use
    * @param end An ending point to use
    **/
  def fromPoints(start: Range, end: Range): Range = js.native
  /**
    * Returns `true` if the `row` and `column` are within the given range.
    * @param row A row point to compare with
    * @param column A column point to compare with
    **/
  def inside(row: Double, column: Double): Boolean = js.native
  /**
    * Returns `true` if the `row` and `column` are within the given range's ending points.
    * @param row A row point to compare with
    * @param column A column point to compare with
    **/
  def insideEnd(row: Double, column: Double): Boolean = js.native
  /**
    * Returns `true` if the `row` and `column` are within the given range's starting points.
    * @param row A row point to compare with
    * @param column A column point to compare with
    **/
  def insideStart(row: Double, column: Double): Boolean = js.native
  /**
    * Returns `true` if passed in `range` intersects with the one calling this method.
    * @param range A range to compare with
    **/
  def intersects(range: Range): Boolean = js.native
  def isEmpty(): Boolean = js.native
  /**
    * Returns `true` if the caller's ending row point is the same as `row`, and if the caller's ending column is the same as `column`.
    * @param row A row point to compare with
    * @param column A column point to compare with
    **/
  def isEnd(row: Double, column: Double): Boolean = js.native
  /**
    * Returns `true` if and only if the starting row and column, and ending row and column, are equivalent to those given by `range`.
    * @param range A range to check against
    **/
  def isEqual(range: Range): Unit = js.native
  /**
    * Returns `true` if the range spans across multiple lines.
    **/
  def isMultiLine(): Boolean = js.native
  /**
    * Returns `true` if the caller's starting row point is the same as `row`, and if the caller's starting column is the same as `column`.
    * @param row A row point to compare with
    * @param column A column point to compare with
    **/
  def isStart(row: Double, column: Double): Boolean = js.native
  /**
    * Sets the starting row and column for the range.
    * @param row A row point to set
    * @param column A column point to set
    **/
  def setEnd(row: Double, column: Double): Unit = js.native
  /**
    * Sets the starting row and column for the range.
    * @param row A row point to set
    * @param column A column point to set
    **/
  def setStart(row: Double, column: Double): Unit = js.native
  /**
    * Given the current `Range`, this function converts those starting and ending points into screen positions, and then returns a new `Range` object.
    * @param session The `EditSession` to retrieve coordinates from
    **/
  def toScreenRange(session: IEditSession): Range = js.native
}

object Range {
  @scala.inline
  def apply(
    clipRows: (Double, Double) => Range,
    collapseRows: () => Range,
    compare: (Double, Double) => Double,
    compareEnd: (Double, Double) => Double,
    compareInside: (Double, Double) => Double,
    comparePoint: Range => Double,
    compareRange: Range => Double,
    compareStart: (Double, Double) => Double,
    contains: (Double, Double) => Boolean,
    containsRange: Range => Boolean,
    end: Position,
    endColumn: Double,
    endRow: Double,
    extend: (Double, Double) => Range,
    fromPoints: (Range, Range) => Range,
    inside: (Double, Double) => Boolean,
    insideEnd: (Double, Double) => Boolean,
    insideStart: (Double, Double) => Boolean,
    intersects: Range => Boolean,
    isEmpty: () => Boolean,
    isEnd: (Double, Double) => Boolean,
    isEqual: Range => Unit,
    isMultiLine: () => Boolean,
    isStart: (Double, Double) => Boolean,
    setEnd: (Double, Double) => Unit,
    setStart: (Double, Double) => Unit,
    start: Position,
    startColumn: Double,
    startRow: Double,
    toScreenRange: IEditSession => Range
  ): Range = {
    val __obj = js.Dynamic.literal(clipRows = js.Any.fromFunction2(clipRows), collapseRows = js.Any.fromFunction0(collapseRows), compare = js.Any.fromFunction2(compare), compareEnd = js.Any.fromFunction2(compareEnd), compareInside = js.Any.fromFunction2(compareInside), comparePoint = js.Any.fromFunction1(comparePoint), compareRange = js.Any.fromFunction1(compareRange), compareStart = js.Any.fromFunction2(compareStart), contains = js.Any.fromFunction2(contains), containsRange = js.Any.fromFunction1(containsRange), end = end.asInstanceOf[js.Any], endColumn = endColumn.asInstanceOf[js.Any], endRow = endRow.asInstanceOf[js.Any], extend = js.Any.fromFunction2(extend), fromPoints = js.Any.fromFunction2(fromPoints), inside = js.Any.fromFunction2(inside), insideEnd = js.Any.fromFunction2(insideEnd), insideStart = js.Any.fromFunction2(insideStart), intersects = js.Any.fromFunction1(intersects), isEmpty = js.Any.fromFunction0(isEmpty), isEnd = js.Any.fromFunction2(isEnd), isEqual = js.Any.fromFunction1(isEqual), isMultiLine = js.Any.fromFunction0(isMultiLine), isStart = js.Any.fromFunction2(isStart), setEnd = js.Any.fromFunction2(setEnd), setStart = js.Any.fromFunction2(setStart), start = start.asInstanceOf[js.Any], startColumn = startColumn.asInstanceOf[js.Any], startRow = startRow.asInstanceOf[js.Any], toScreenRange = js.Any.fromFunction1(toScreenRange))
    __obj.asInstanceOf[Range]
  }
  @scala.inline
  implicit class RangeOps[Self <: Range] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClipRows(value: (Double, Double) => Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipRows")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCollapseRows(value: () => Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseRows")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCompare(value: (Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compare")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCompareEnd(value: (Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareEnd")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCompareInside(value: (Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareInside")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withComparePoint(value: Range => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparePoint")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCompareRange(value: Range => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareRange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCompareStart(value: (Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareStart")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withContains(value: (Double, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withContainsRange(value: Range => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsRange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEnd(value: Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtend(value: (Double, Double) => Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extend")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFromPoints(value: (Range, Range) => Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromPoints")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withInside(value: (Double, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inside")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withInsideEnd(value: (Double, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insideEnd")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withInsideStart(value: (Double, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insideStart")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIntersects(value: Range => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersects")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsEmpty(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmpty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsEnd(value: (Double, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnd")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIsEqual(value: Range => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEqual")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsMultiLine(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMultiLine")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsStart(value: (Double, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStart")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetEnd(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEnd")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetStart(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStart")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withStart(value: Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToScreenRange(value: IEditSession => Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toScreenRange")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

