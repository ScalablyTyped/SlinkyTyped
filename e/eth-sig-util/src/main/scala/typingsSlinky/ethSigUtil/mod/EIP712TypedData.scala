package typingsSlinky.ethSigUtil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EIP712TypedData extends js.Object {
  var domain: EIP712Domain = js.native
  var message: EIP712Message = js.native
  var primaryType: String = js.native
  var types: EIP712Types = js.native
}

object EIP712TypedData {
  @scala.inline
  def apply(domain: EIP712Domain, message: EIP712Message, primaryType: String, types: EIP712Types): EIP712TypedData = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], primaryType = primaryType.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[EIP712TypedData]
  }
  @scala.inline
  implicit class EIP712TypedDataOps[Self <: EIP712TypedData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomain(value: EIP712Domain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: EIP712Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypes(value: EIP712Types): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

