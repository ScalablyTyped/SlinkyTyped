package typingsSlinky.sawtoothSdk.protobufMod

import typingsSlinky.sawtoothSdk.protobufMod.ClientEventsSubscribeResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClientEventsSubscribeResponse extends js.Object {
  /** ClientEventsSubscribeResponse responseMessage */
  var responseMessage: js.UndefOr[String | Null] = js.native
  /** ClientEventsSubscribeResponse status */
  var status: js.UndefOr[Status | Null] = js.native
}

object IClientEventsSubscribeResponse {
  @scala.inline
  def apply(): IClientEventsSubscribeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientEventsSubscribeResponse]
  }
  @scala.inline
  implicit class IClientEventsSubscribeResponseOps[Self <: IClientEventsSubscribeResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResponseMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseMessageNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseMessage")(null)
        ret
    }
    @scala.inline
    def withStatus(value: Status): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(null)
        ret
    }
  }
  
}

