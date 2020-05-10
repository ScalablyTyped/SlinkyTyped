package typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1

import typingsSlinky.jsrsasign.jsrsasign.BigInteger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BigIntegerParam extends js.Object {
  var bigint: BigInteger = js.native
}

object BigIntegerParam {
  @scala.inline
  def apply(bigint: BigInteger): BigIntegerParam = {
    val __obj = js.Dynamic.literal(bigint = bigint.asInstanceOf[js.Any])
    __obj.asInstanceOf[BigIntegerParam]
  }
  @scala.inline
  implicit class BigIntegerParamOps[Self <: BigIntegerParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBigint(value: BigInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bigint")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

