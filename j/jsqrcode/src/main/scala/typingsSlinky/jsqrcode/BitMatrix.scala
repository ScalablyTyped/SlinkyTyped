package typingsSlinky.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BitMatrix extends js.Object {
  val Dimension: Double = js.native
  val Height: Double = js.native
  val Width: Double = js.native
  var bits: js.Array[Double] = js.native
  var height: Double = js.native
  var rowSize: Double = js.native
  var width: Double = js.native
  def clear(): Unit = js.native
  def flip(x: Double, y: Double): Unit = js.native
  def get_Renamed(x: Double, y: Double): Boolean = js.native
  def setRegion(left: Double, top: Double, width: Double, height: Double): Unit = js.native
  def set_Renamed(x: Double, y: Double): Unit = js.native
}

object BitMatrix {
  @scala.inline
  def apply(
    Dimension: Double,
    Height: Double,
    Width: Double,
    bits: js.Array[Double],
    clear: () => Unit,
    flip: (Double, Double) => Unit,
    get_Renamed: (Double, Double) => Boolean,
    height: Double,
    rowSize: Double,
    setRegion: (Double, Double, Double, Double) => Unit,
    set_Renamed: (Double, Double) => Unit,
    width: Double
  ): BitMatrix = {
    val __obj = js.Dynamic.literal(Dimension = Dimension.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], bits = bits.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), flip = js.Any.fromFunction2(flip), get_Renamed = js.Any.fromFunction2(get_Renamed), height = height.asInstanceOf[js.Any], rowSize = rowSize.asInstanceOf[js.Any], setRegion = js.Any.fromFunction4(setRegion), set_Renamed = js.Any.fromFunction2(set_Renamed), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitMatrix]
  }
  @scala.inline
  implicit class BitMatrixOps[Self <: BitMatrix] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDimension(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dimension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBits(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFlip(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flip")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGet_Renamed(value: (Double, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_Renamed")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRowSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetRegion(value: (Double, Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRegion")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withSet_Renamed(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_Renamed")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

