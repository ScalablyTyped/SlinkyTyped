package typingsSlinky.acmeClient.rfc8555Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderCreateRequest extends js.Object {
  var identifiers: js.Array[Identifier] = js.native
  var notAfter: js.UndefOr[String] = js.native
  var notBefore: js.UndefOr[String] = js.native
}

object OrderCreateRequest {
  @scala.inline
  def apply(identifiers: js.Array[Identifier]): OrderCreateRequest = {
    val __obj = js.Dynamic.literal(identifiers = identifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderCreateRequest]
  }
  @scala.inline
  implicit class OrderCreateRequestOps[Self <: OrderCreateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentifiers(value: js.Array[Identifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotAfter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withNotBefore(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notBefore")(js.undefined)
        ret
    }
  }
  
}

