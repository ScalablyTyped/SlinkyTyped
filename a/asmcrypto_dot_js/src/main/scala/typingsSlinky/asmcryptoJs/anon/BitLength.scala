package typingsSlinky.asmcryptoJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BitLength extends js.Object {
  var bitLength: Double = js.native
  var limbs: js.typedarray.Uint32Array = js.native
  var sign: Double = js.native
}

object BitLength {
  @scala.inline
  def apply(bitLength: Double, limbs: js.typedarray.Uint32Array, sign: Double): BitLength = {
    val __obj = js.Dynamic.literal(bitLength = bitLength.asInstanceOf[js.Any], limbs = limbs.asInstanceOf[js.Any], sign = sign.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitLength]
  }
  @scala.inline
  implicit class BitLengthOps[Self <: BitLength] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBitLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLimbs(value: js.typedarray.Uint32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limbs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSign(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sign")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

