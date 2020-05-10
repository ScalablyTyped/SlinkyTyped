package typingsSlinky.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClientEventsGetRequest extends js.Object {
  /** ClientEventsGetRequest blockIds */
  var blockIds: js.UndefOr[js.Array[String] | Null] = js.native
  /** ClientEventsGetRequest subscriptions */
  var subscriptions: js.UndefOr[js.Array[IEventSubscription] | Null] = js.native
}

object IClientEventsGetRequest {
  @scala.inline
  def apply(): IClientEventsGetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientEventsGetRequest]
  }
  @scala.inline
  implicit class IClientEventsGetRequestOps[Self <: IClientEventsGetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockIds")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockIdsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockIds")(null)
        ret
    }
    @scala.inline
    def withSubscriptions(value: js.Array[IEventSubscription]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscriptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptions")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscriptionsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptions")(null)
        ret
    }
  }
  
}

