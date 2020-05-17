package typingsSlinky.jsrsasign.anon

import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.HexParam
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.NameParam
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.ObjectIdentifierParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayArray extends js.Object {
  var array: js.Array[ObjectIdentifierParam | HexParam | NameParam] = js.native
}

object ArrayArray {
  @scala.inline
  def apply(array: js.Array[ObjectIdentifierParam | HexParam | NameParam]): ArrayArray = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayArray]
  }
  @scala.inline
  implicit class ArrayArrayOps[Self <: ArrayArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArray(value: js.Array[ObjectIdentifierParam | HexParam | NameParam]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("array")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

