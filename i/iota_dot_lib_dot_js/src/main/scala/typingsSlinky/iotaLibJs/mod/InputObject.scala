package typingsSlinky.iotaLibJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputObject extends js.Object {
  var address: String = js.native
  var balance: Double = js.native
  var keyIndex: Double = js.native
  var security: Security = js.native
}

object InputObject {
  @scala.inline
  def apply(address: String, balance: Double, keyIndex: Double, security: Security): InputObject = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], balance = balance.asInstanceOf[js.Any], keyIndex = keyIndex.asInstanceOf[js.Any], security = security.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputObject]
  }
  @scala.inline
  implicit class InputObjectOps[Self <: InputObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBalance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecurity(value: Security): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("security")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

