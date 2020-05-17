package typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ModifyPushConfigRequest. */
@js.native
trait IModifyPushConfigRequest extends js.Object {
  /** ModifyPushConfigRequest pushConfig */
  var pushConfig: js.UndefOr[IPushConfig | Null] = js.native
  /** ModifyPushConfigRequest subscription */
  var subscription: js.UndefOr[String | Null] = js.native
}

object IModifyPushConfigRequest {
  @scala.inline
  def apply(): IModifyPushConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IModifyPushConfigRequest]
  }
  @scala.inline
  implicit class IModifyPushConfigRequestOps[Self <: IModifyPushConfigRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPushConfig(value: IPushConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPushConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withPushConfigNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushConfig")(null)
        ret
    }
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

