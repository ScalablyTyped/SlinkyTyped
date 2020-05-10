package typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntegerParam extends js.Object {
  var int: Double = js.native
}

object IntegerParam {
  @scala.inline
  def apply(int: Double): IntegerParam = {
    val __obj = js.Dynamic.literal(int = int.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegerParam]
  }
  @scala.inline
  implicit class IntegerParamOps[Self <: IntegerParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("int")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

