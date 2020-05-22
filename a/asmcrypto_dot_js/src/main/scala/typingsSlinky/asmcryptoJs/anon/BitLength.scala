package typingsSlinky.asmcryptoJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BitLength extends js.Object {
  var bitLength: Double
  var limbs: js.typedarray.Uint32Array
  var sign: Double
}

object BitLength {
  @scala.inline
  def apply(bitLength: Double, limbs: js.typedarray.Uint32Array, sign: Double): BitLength = {
    val __obj = js.Dynamic.literal(bitLength = bitLength.asInstanceOf[js.Any], limbs = limbs.asInstanceOf[js.Any], sign = sign.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitLength]
  }
}

