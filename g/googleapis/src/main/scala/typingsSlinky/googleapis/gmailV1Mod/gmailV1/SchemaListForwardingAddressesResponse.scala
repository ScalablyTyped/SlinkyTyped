package typingsSlinky.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the ListForwardingAddresses method.
  */
@js.native
trait SchemaListForwardingAddressesResponse extends js.Object {
  /**
    * List of addresses that may be used for forwarding.
    */
  var forwardingAddresses: js.UndefOr[js.Array[SchemaForwardingAddress]] = js.native
}

object SchemaListForwardingAddressesResponse {
  @scala.inline
  def apply(): SchemaListForwardingAddressesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListForwardingAddressesResponse]
  }
  @scala.inline
  implicit class SchemaListForwardingAddressesResponseOps[Self <: SchemaListForwardingAddressesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForwardingAddresses(value: js.Array[SchemaForwardingAddress]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardingAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForwardingAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardingAddresses")(js.undefined)
        ret
    }
  }
  
}

