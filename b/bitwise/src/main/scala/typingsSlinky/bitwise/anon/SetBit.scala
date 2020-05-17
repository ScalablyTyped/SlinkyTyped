package typingsSlinky.bitwise.anon

import typingsSlinky.bitwise.bitwiseTypesMod.Bit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetBit extends js.Object {
  def getBit(int32: Double, position: Double): Bit = js.native
  def setBit(int32: Double, position: Double, value: Bit): Bit = js.native
  def toggleBit(int32: Double, position: Double): Double = js.native
}

object SetBit {
  @scala.inline
  def apply(
    getBit: (Double, Double) => Bit,
    setBit: (Double, Double, Bit) => Bit,
    toggleBit: (Double, Double) => Double
  ): SetBit = {
    val __obj = js.Dynamic.literal(getBit = js.Any.fromFunction2(getBit), setBit = js.Any.fromFunction3(setBit), toggleBit = js.Any.fromFunction2(toggleBit))
    __obj.asInstanceOf[SetBit]
  }
  @scala.inline
  implicit class SetBitOps[Self <: SetBit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetBit(value: (Double, Double) => Bit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetBit(value: (Double, Double, Bit) => Bit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBit")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withToggleBit(value: (Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleBit")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

