package typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a GetSubscriptionRequest. */
@js.native
trait IGetSubscriptionRequest extends js.Object {
  /** GetSubscriptionRequest subscription */
  var subscription: js.UndefOr[String | Null] = js.native
}

object IGetSubscriptionRequest {
  @scala.inline
  def apply(): IGetSubscriptionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGetSubscriptionRequest]
  }
  @scala.inline
  implicit class IGetSubscriptionRequestOps[Self <: IGetSubscriptionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubscription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscriptionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription")(null)
        ret
    }
  }
  
}

