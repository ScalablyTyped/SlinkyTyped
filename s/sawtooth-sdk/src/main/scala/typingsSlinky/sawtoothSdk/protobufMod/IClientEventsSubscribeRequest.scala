package typingsSlinky.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClientEventsSubscribeRequest extends js.Object {
  /** ClientEventsSubscribeRequest lastKnownBlockIds */
  var lastKnownBlockIds: js.UndefOr[js.Array[String] | Null] = js.native
  /** ClientEventsSubscribeRequest subscriptions */
  var subscriptions: js.UndefOr[js.Array[IEventSubscription] | Null] = js.native
}

object IClientEventsSubscribeRequest {
  @scala.inline
  def apply(): IClientEventsSubscribeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientEventsSubscribeRequest]
  }
  @scala.inline
  implicit class IClientEventsSubscribeRequestOps[Self <: IClientEventsSubscribeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastKnownBlockIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastKnownBlockIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastKnownBlockIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastKnownBlockIds")(js.undefined)
        ret
    }
    @scala.inline
    def withLastKnownBlockIdsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastKnownBlockIds")(null)
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

