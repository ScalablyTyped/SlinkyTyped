package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteEventSubscriptionMessage extends js.Object {
  /**
    * The name of the Amazon Redshift event notification subscription to be deleted.
    */
  var SubscriptionName: String = js.native
}

object DeleteEventSubscriptionMessage {
  @scala.inline
  def apply(SubscriptionName: String): DeleteEventSubscriptionMessage = {
    val __obj = js.Dynamic.literal(SubscriptionName = SubscriptionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEventSubscriptionMessage]
  }
  @scala.inline
  implicit class DeleteEventSubscriptionMessageOps[Self <: DeleteEventSubscriptionMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubscriptionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubscriptionName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

