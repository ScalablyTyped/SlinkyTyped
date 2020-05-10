package typingsSlinky.handsontable.mod.Handsontable.plugins

import typingsSlinky.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataProvider extends js.Object {
  var changes: js.Object = js.native
  var hot: Core = js.native
  var t: RecordTranslator = js.native
  def clearChanges(): Unit = js.native
  def collectChanges(row: Double, column: Double, value: js.Any): Unit = js.native
  def destroy(): Unit = js.native
  def getDataAtCell(row: Double, column: Double): js.Any = js.native
  def getDataByRange(row1: Double, column1: Double, row2: Double, column2: Double): js.Array[_] = js.native
  def getRawDataAtCell(row: Double, column: Double): js.Any = js.native
  def getRawDataByRange(row1: Double, column1: Double, row2: Double, column2: Double): js.Array[_] = js.native
  def getSourceDataAtCell(row: Double, column: Double): js.Any = js.native
  def getSourceDataByRange(row1: Double, column1: Double, row2: Double, column2: Double): js.Array[_] = js.native
  def isInDataRange(row: Double, column: Double): Boolean = js.native
  def updateSourceData(row: Double, column: Double, value: js.Any): Unit = js.native
}

object DataProvider {
  @scala.inline
  def apply(
    changes: js.Object,
    clearChanges: () => Unit,
    collectChanges: (Double, Double, js.Any) => Unit,
    destroy: () => Unit,
    getDataAtCell: (Double, Double) => js.Any,
    getDataByRange: (Double, Double, Double, Double) => js.Array[_],
    getRawDataAtCell: (Double, Double) => js.Any,
    getRawDataByRange: (Double, Double, Double, Double) => js.Array[_],
    getSourceDataAtCell: (Double, Double) => js.Any,
    getSourceDataByRange: (Double, Double, Double, Double) => js.Array[_],
    hot: Core,
    isInDataRange: (Double, Double) => Boolean,
    t: RecordTranslator,
    updateSourceData: (Double, Double, js.Any) => Unit
  ): DataProvider = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], clearChanges = js.Any.fromFunction0(clearChanges), collectChanges = js.Any.fromFunction3(collectChanges), destroy = js.Any.fromFunction0(destroy), getDataAtCell = js.Any.fromFunction2(getDataAtCell), getDataByRange = js.Any.fromFunction4(getDataByRange), getRawDataAtCell = js.Any.fromFunction2(getRawDataAtCell), getRawDataByRange = js.Any.fromFunction4(getRawDataByRange), getSourceDataAtCell = js.Any.fromFunction2(getSourceDataAtCell), getSourceDataByRange = js.Any.fromFunction4(getSourceDataByRange), hot = hot.asInstanceOf[js.Any], isInDataRange = js.Any.fromFunction2(isInDataRange), t = t.asInstanceOf[js.Any], updateSourceData = js.Any.fromFunction3(updateSourceData))
    __obj.asInstanceOf[DataProvider]
  }
  @scala.inline
  implicit class DataProviderOps[Self <: DataProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChanges(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClearChanges(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearChanges")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCollectChanges(value: (Double, Double, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectChanges")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDataAtCell(value: (Double, Double) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDataAtCell")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetDataByRange(value: (Double, Double, Double, Double) => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDataByRange")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withGetRawDataAtCell(value: (Double, Double) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRawDataAtCell")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetRawDataByRange(value: (Double, Double, Double, Double) => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRawDataByRange")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withGetSourceDataAtCell(value: (Double, Double) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSourceDataAtCell")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetSourceDataByRange(value: (Double, Double, Double, Double) => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSourceDataByRange")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withHot(value: Core): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsInDataRange(value: (Double, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInDataRange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withT(value: RecordTranslator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("t")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateSourceData(value: (Double, Double, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateSourceData")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

