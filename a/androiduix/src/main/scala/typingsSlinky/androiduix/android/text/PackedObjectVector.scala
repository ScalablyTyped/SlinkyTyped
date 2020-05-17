package typingsSlinky.androiduix.android.text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PackedObjectVector[E] extends js.Object {
  var mColumns: js.Any = js.native
  var mRowGapLength: js.Any = js.native
  var mRowGapStart: js.Any = js.native
  var mRows: js.Any = js.native
  var mValues: js.Any = js.native
  def deleteAt(row: Double, count: Double): Unit = js.native
  def dump(): Unit = js.native
  def getValue(row: Double, column: Double): E = js.native
  /* private */ def growBuffer(): js.Any = js.native
  def insertAt(row: Double, values: js.Array[E]): Unit = js.native
  /* private */ def moveRowGapTo(where: js.Any): js.Any = js.native
  def setValue(row: Double, column: Double, value: E): Unit = js.native
  def size(): Double = js.native
  def width(): Double = js.native
}

object PackedObjectVector {
  @scala.inline
  def apply[E](
    deleteAt: (Double, Double) => Unit,
    dump: () => Unit,
    getValue: (Double, Double) => E,
    growBuffer: () => js.Any,
    insertAt: (Double, js.Array[E]) => Unit,
    mColumns: js.Any,
    mRowGapLength: js.Any,
    mRowGapStart: js.Any,
    mRows: js.Any,
    mValues: js.Any,
    moveRowGapTo: js.Any => js.Any,
    setValue: (Double, Double, E) => Unit,
    size: () => Double,
    width: () => Double
  ): PackedObjectVector[E] = {
    val __obj = js.Dynamic.literal(deleteAt = js.Any.fromFunction2(deleteAt), dump = js.Any.fromFunction0(dump), getValue = js.Any.fromFunction2(getValue), growBuffer = js.Any.fromFunction0(growBuffer), insertAt = js.Any.fromFunction2(insertAt), mColumns = mColumns.asInstanceOf[js.Any], mRowGapLength = mRowGapLength.asInstanceOf[js.Any], mRowGapStart = mRowGapStart.asInstanceOf[js.Any], mRows = mRows.asInstanceOf[js.Any], mValues = mValues.asInstanceOf[js.Any], moveRowGapTo = js.Any.fromFunction1(moveRowGapTo), setValue = js.Any.fromFunction3(setValue), size = js.Any.fromFunction0(size), width = js.Any.fromFunction0(width))
    __obj.asInstanceOf[PackedObjectVector[E]]
  }
  @scala.inline
  implicit class PackedObjectVectorOps[Self[e] <: PackedObjectVector[e], E] (val x: Self[E]) extends AnyVal {
    @scala.inline
    def duplicate: Self[E] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[E]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[E] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[E] with Other]
    @scala.inline
    def withDeleteAt(value: (Double, Double) => Unit): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteAt")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDump(value: () => Unit): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dump")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetValue(value: (Double, Double) => E): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGrowBuffer(value: () => js.Any): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("growBuffer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInsertAt(value: (Double, js.Array[E]) => Unit): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertAt")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMColumns(value: js.Any): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMRowGapLength(value: js.Any): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mRowGapLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMRowGapStart(value: js.Any): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mRowGapStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMRows(value: js.Any): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMValues(value: js.Any): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMoveRowGapTo(value: js.Any => js.Any): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveRowGapTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetValue(value: (Double, Double, E) => Unit): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSize(value: () => Double): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWidth(value: () => Double): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

