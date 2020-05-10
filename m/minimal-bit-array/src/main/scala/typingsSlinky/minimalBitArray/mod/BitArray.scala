package typingsSlinky.minimalBitArray.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BitArray extends js.Object {
  var bits: js.typedarray.Uint32Array = js.native
  var length: Double = js.native
  def get(index: Double): Boolean = js.native
  def set(index: Double, value: js.Any): Boolean = js.native
  def toJSON(): BitArrayJSON = js.native
}

object BitArray {
  @scala.inline
  def apply(
    bits: js.typedarray.Uint32Array,
    get: Double => Boolean,
    length: Double,
    set: (Double, js.Any) => Boolean,
    toJSON: () => BitArrayJSON
  ): BitArray = {
    val __obj = js.Dynamic.literal(bits = bits.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), length = length.asInstanceOf[js.Any], set = js.Any.fromFunction2(set), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[BitArray]
  }
  @scala.inline
  implicit class BitArrayOps[Self <: BitArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBits(value: js.typedarray.Uint32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSet(value: (Double, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withToJSON(value: () => BitArrayJSON): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

