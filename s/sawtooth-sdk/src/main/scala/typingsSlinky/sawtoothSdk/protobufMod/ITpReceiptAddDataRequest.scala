package typingsSlinky.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITpReceiptAddDataRequest extends js.Object {
  /** TpReceiptAddDataRequest contextId */
  var contextId: js.UndefOr[String | Null] = js.native
  /** TpReceiptAddDataRequest data */
  var data: js.UndefOr[js.typedarray.Uint8Array | Null] = js.native
}

object ITpReceiptAddDataRequest {
  @scala.inline
  def apply(): ITpReceiptAddDataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITpReceiptAddDataRequest]
  }
  @scala.inline
  implicit class ITpReceiptAddDataRequestOps[Self <: ITpReceiptAddDataRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withData(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDataNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(null)
        ret
    }
  }
  
}

