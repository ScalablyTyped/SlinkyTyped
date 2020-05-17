package typingsSlinky.androiduix.android.text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PackedIntVector extends js.Object {
  var mColumns: js.Any = js.native
  var mRowGapLength: js.Any = js.native
  var mRowGapStart: js.Any = js.native
  var mRows: js.Any = js.native
  var mValueGap: js.Any = js.native
  var mValues: js.Any = js.native
  def adjustValuesBelow(startRow: Double, column: Double, delta: Double): Unit = js.native
  def deleteAt(row: Double, count: Double): Unit = js.native
  def getValue(row: Double, column: Double): Double = js.native
  /* private */ def growBuffer(): js.Any = js.native
  def insertAt(row: Double, values: js.Array[Double]): Unit = js.native
  /* private */ def moveRowGapTo(where: js.Any): js.Any = js.native
  /* private */ def moveValueGapTo(column: js.Any, where: js.Any): js.Any = js.native
  def setValue(row: Double, column: Double, value: Double): Unit = js.native
  /* private */ def setValueInternal(row: js.Any, column: js.Any, value: js.Any): js.Any = js.native
  def size(): Double = js.native
  def width(): Double = js.native
}

object PackedIntVector {
  @scala.inline
  def apply(
    adjustValuesBelow: (Double, Double, Double) => Unit,
    deleteAt: (Double, Double) => Unit,
    getValue: (Double, Double) => Double,
    growBuffer: () => js.Any,
    insertAt: (Double, js.Array[Double]) => Unit,
    mColumns: js.Any,
    mRowGapLength: js.Any,
    mRowGapStart: js.Any,
    mRows: js.Any,
    mValueGap: js.Any,
    mValues: js.Any,
    moveRowGapTo: js.Any => js.Any,
    moveValueGapTo: (js.Any, js.Any) => js.Any,
    setValue: (Double, Double, Double) => Unit,
    setValueInternal: (js.Any, js.Any, js.Any) => js.Any,
    size: () => Double,
    width: () => Double
  ): PackedIntVector = {
    val __obj = js.Dynamic.literal(adjustValuesBelow = js.Any.fromFunction3(adjustValuesBelow), deleteAt = js.Any.fromFunction2(deleteAt), getValue = js.Any.fromFunction2(getValue), growBuffer = js.Any.fromFunction0(growBuffer), insertAt = js.Any.fromFunction2(insertAt), mColumns = mColumns.asInstanceOf[js.Any], mRowGapLength = mRowGapLength.asInstanceOf[js.Any], mRowGapStart = mRowGapStart.asInstanceOf[js.Any], mRows = mRows.asInstanceOf[js.Any], mValueGap = mValueGap.asInstanceOf[js.Any], mValues = mValues.asInstanceOf[js.Any], moveRowGapTo = js.Any.fromFunction1(moveRowGapTo), moveValueGapTo = js.Any.fromFunction2(moveValueGapTo), setValue = js.Any.fromFunction3(setValue), setValueInternal = js.Any.fromFunction3(setValueInternal), size = js.Any.fromFunction0(size), width = js.Any.fromFunction0(width))
    __obj.asInstanceOf[PackedIntVector]
  }
  @scala.inline
  implicit class PackedIntVectorOps[Self <: PackedIntVector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdjustValuesBelow(value: (Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjustValuesBelow")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDeleteAt(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteAt")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetValue(value: (Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGrowBuffer(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("growBuffer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInsertAt(value: (Double, js.Array[Double]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertAt")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMColumns(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMRowGapLength(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mRowGapLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMRowGapStart(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mRowGapStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMRows(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMValueGap(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mValueGap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMValues(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMoveRowGapTo(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveRowGapTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMoveValueGapTo(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveValueGapTo")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetValue(value: (Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetValueInternal(value: (js.Any, js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValueInternal")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSize(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

