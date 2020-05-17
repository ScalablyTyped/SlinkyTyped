package typingsSlinky.qrcodeSvg.mod

import typingsSlinky.qrcodeSvg.anon.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** The cache used to store data during the creation of this QRCode. */
  var dataCache: js.Array[Double] | Null = js.native
  /** A list of the data added to this QRCode. */
  var dataList: js.Array[Data] = js.native
  /** The numerical error correction level for this QRCode. */
  var errorCorrectLevel: Double = js.native
  /** The width/length of this QRCode's modules matrix. */
  var moduleCount: Double = js.native
  /**
    * This QRCode's data matrix. A square, two-dimensional boolean array
    * of `moduleCount` x `moduleCount` size. True in a given slot means
    * that spot is filled in in the QRCode visualization.
    */
  var modules: js.Array[js.Array[Boolean]] = js.native
  /** The calculated type number for this QRCode. */
  var typeNumber: Double = js.native
  /**
    * Queue data up to be added to this QRCode. `make` needs to be called
    *   to actually generate the QRCode from the data.
    * @param data The data to queue up in this QRCode.
    */
  def addData(data: String): Unit = js.native
  /** Returns the length/width of this QRCode's matrix. */
  def getModuleCount(): Double = js.native
  /**
    * Whether a given coordinate is filled in in this QRCode's matrix.
    * @param  row The row to check.
    * @param  col The column to check.
    * @return True if the coordinate is filled in, false otherwise.
    */
  def isDark(row: Double, col: Double): Boolean = js.native
  /** Generate this QRCode's matrix from the queued data. */
  def make(): Unit = js.native
}

object Model {
  @scala.inline
  def apply(
    addData: String => Unit,
    dataList: js.Array[Data],
    errorCorrectLevel: Double,
    getModuleCount: () => Double,
    isDark: (Double, Double) => Boolean,
    make: () => Unit,
    moduleCount: Double,
    modules: js.Array[js.Array[Boolean]],
    typeNumber: Double
  ): Model = {
    val __obj = js.Dynamic.literal(addData = js.Any.fromFunction1(addData), dataList = dataList.asInstanceOf[js.Any], errorCorrectLevel = errorCorrectLevel.asInstanceOf[js.Any], getModuleCount = js.Any.fromFunction0(getModuleCount), isDark = js.Any.fromFunction2(isDark), make = js.Any.fromFunction0(make), moduleCount = moduleCount.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], typeNumber = typeNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddData(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDataList(value: js.Array[Data]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorCorrectLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCorrectLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetModuleCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getModuleCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsDark(value: (Double, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDark")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMake(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("make")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withModuleCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModules(value: js.Array[js.Array[Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataCache(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataCacheNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataCache")(null)
        ret
    }
  }
  
}

