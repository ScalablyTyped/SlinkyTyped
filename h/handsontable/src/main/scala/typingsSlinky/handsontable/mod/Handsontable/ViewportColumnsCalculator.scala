package typingsSlinky.handsontable.mod.Handsontable

import typingsSlinky.handsontable.handsontableStrings.all
import typingsSlinky.handsontable.handsontableStrings.last
import typingsSlinky.handsontable.handsontableStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewportColumnsCalculator extends js.Object {
  var count: Double = js.native
  var endColumn: Double | Null = js.native
  var endRow: js.UndefOr[Double] = js.native
  var needVerifyLastColumnWidth: Boolean = js.native
  var startColumn: Double | Null = js.native
  var startPosition: Double = js.native
  var startRow: js.UndefOr[Double] = js.native
  var stretch: none | all | last = js.native
  var stretchAllColumnsWidth: js.Array[Double] = js.native
  var stretchAllRatio: Double = js.native
  var stretchLastWidth: Double = js.native
  var totalTargetWidth: Double = js.native
  def calculate(): Unit = js.native
  def getStretchedColumnWidth(column: Double, baseWidth: Double): Double | Null = js.native
  def refreshStretching(totalWidth: Double): Unit = js.native
}

object ViewportColumnsCalculator {
  @scala.inline
  def apply(
    calculate: () => Unit,
    count: Double,
    getStretchedColumnWidth: (Double, Double) => Double | Null,
    needVerifyLastColumnWidth: Boolean,
    refreshStretching: Double => Unit,
    startPosition: Double,
    stretch: none | all | last,
    stretchAllColumnsWidth: js.Array[Double],
    stretchAllRatio: Double,
    stretchLastWidth: Double,
    totalTargetWidth: Double
  ): ViewportColumnsCalculator = {
    val __obj = js.Dynamic.literal(calculate = js.Any.fromFunction0(calculate), count = count.asInstanceOf[js.Any], getStretchedColumnWidth = js.Any.fromFunction2(getStretchedColumnWidth), needVerifyLastColumnWidth = needVerifyLastColumnWidth.asInstanceOf[js.Any], refreshStretching = js.Any.fromFunction1(refreshStretching), startPosition = startPosition.asInstanceOf[js.Any], stretch = stretch.asInstanceOf[js.Any], stretchAllColumnsWidth = stretchAllColumnsWidth.asInstanceOf[js.Any], stretchAllRatio = stretchAllRatio.asInstanceOf[js.Any], stretchLastWidth = stretchLastWidth.asInstanceOf[js.Any], totalTargetWidth = totalTargetWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportColumnsCalculator]
  }
  @scala.inline
  implicit class ViewportColumnsCalculatorOps[Self <: ViewportColumnsCalculator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalculate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetStretchedColumnWidth(value: (Double, Double) => Double | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStretchedColumnWidth")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNeedVerifyLastColumnWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needVerifyLastColumnWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefreshStretching(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshStretching")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStartPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStretch(value: none | all | last): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stretch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStretchAllColumnsWidth(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stretchAllColumnsWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStretchAllRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stretchAllRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStretchLastWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stretchLastWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalTargetWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalTargetWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndColumnNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endColumn")(null)
        ret
    }
    @scala.inline
    def withEndRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endRow")(js.undefined)
        ret
    }
    @scala.inline
    def withStartColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartColumnNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startColumn")(null)
        ret
    }
    @scala.inline
    def withStartRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startRow")(js.undefined)
        ret
    }
  }
  
}

