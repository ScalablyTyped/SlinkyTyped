package typingsSlinky.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataMask extends js.Object {
  def isMasked(i: Double, j: Double): Boolean = js.native
  def unmaskBitMatrix(bits: js.Array[Double], dimension: Double): Unit = js.native
}

object DataMask {
  @scala.inline
  def apply(isMasked: (Double, Double) => Boolean, unmaskBitMatrix: (js.Array[Double], Double) => Unit): DataMask = {
    val __obj = js.Dynamic.literal(isMasked = js.Any.fromFunction2(isMasked), unmaskBitMatrix = js.Any.fromFunction2(unmaskBitMatrix))
    __obj.asInstanceOf[DataMask]
  }
  @scala.inline
  implicit class DataMaskOps[Self <: DataMask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsMasked(value: (Double, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMasked")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUnmaskBitMatrix(value: (js.Array[Double], Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmaskBitMatrix")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

