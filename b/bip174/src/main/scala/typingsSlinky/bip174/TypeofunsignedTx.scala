package typingsSlinky.bip174

import typingsSlinky.bip174.interfacesMod.KeyValue
import typingsSlinky.bip174.interfacesMod.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofunsignedTx extends js.Object {
  def encode(data: Transaction): KeyValue = js.native
}

object TypeofunsignedTx {
  @scala.inline
  def apply(encode: Transaction => KeyValue): TypeofunsignedTx = {
    val __obj = js.Dynamic.literal(encode = js.Any.fromFunction1(encode))
    __obj.asInstanceOf[TypeofunsignedTx]
  }
  @scala.inline
  implicit class TypeofunsignedTxOps[Self <: TypeofunsignedTx] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncode(value: Transaction => KeyValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encode")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

