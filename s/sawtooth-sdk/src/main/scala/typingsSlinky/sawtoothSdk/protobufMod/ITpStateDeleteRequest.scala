package typingsSlinky.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITpStateDeleteRequest extends js.Object {
  /** TpStateDeleteRequest addresses */
  var addresses: js.UndefOr[js.Array[String] | Null] = js.native
  /** TpStateDeleteRequest contextId */
  var contextId: js.UndefOr[String | Null] = js.native
}

object ITpStateDeleteRequest {
  @scala.inline
  def apply(): ITpStateDeleteRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITpStateDeleteRequest]
  }
  @scala.inline
  implicit class ITpStateDeleteRequestOps[Self <: ITpStateDeleteRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddresses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addresses")(js.undefined)
        ret
    }
    @scala.inline
    def withAddressesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addresses")(null)
        ret
    }
    @scala.inline
    def withContextId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextId")(js.undefined)
        ret
    }
    @scala.inline
    def withContextIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextId")(null)
        ret
    }
  }
  
}

