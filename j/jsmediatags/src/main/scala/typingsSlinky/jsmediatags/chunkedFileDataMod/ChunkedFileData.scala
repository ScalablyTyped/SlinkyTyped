package typingsSlinky.jsmediatags.chunkedFileDataMod

import typingsSlinky.jsmediatags.anon.EndIx
import typingsSlinky.jsmediatags.typesMod.DataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChunkedFileData extends js.Object {
  def _concatData(dataA: DataType, dataB: DataType): DataType = js.native
  def _getChunkRange(offsetStart: Double, offsetEnd: Double): EndIx = js.native
  def _sliceData(data: DataType, begin: Double, end: Double): DataType = js.native
  def addData(offset: Double, data: DataType): Unit = js.native
  def getByteAt(offset: Double): js.Any = js.native
  def hasDataRange(offsetStart: Double, offsetEnd: Double): Boolean = js.native
}

object ChunkedFileData {
  @scala.inline
  def apply(
    _concatData: (DataType, DataType) => DataType,
    _getChunkRange: (Double, Double) => EndIx,
    _sliceData: (DataType, Double, Double) => DataType,
    addData: (Double, DataType) => Unit,
    getByteAt: Double => js.Any,
    hasDataRange: (Double, Double) => Boolean
  ): ChunkedFileData = {
    val __obj = js.Dynamic.literal(_concatData = js.Any.fromFunction2(_concatData), _getChunkRange = js.Any.fromFunction2(_getChunkRange), _sliceData = js.Any.fromFunction3(_sliceData), addData = js.Any.fromFunction2(addData), getByteAt = js.Any.fromFunction1(getByteAt), hasDataRange = js.Any.fromFunction2(hasDataRange))
    __obj.asInstanceOf[ChunkedFileData]
  }
  @scala.inline
  implicit class ChunkedFileDataOps[Self <: ChunkedFileData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_concatData(value: (DataType, DataType) => DataType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_concatData")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def with_getChunkRange(value: (Double, Double) => EndIx): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_getChunkRange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def with_sliceData(value: (DataType, Double, Double) => DataType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_sliceData")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withAddData(value: (Double, DataType) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addData")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetByteAt(value: Double => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getByteAt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHasDataRange(value: (Double, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasDataRange")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

