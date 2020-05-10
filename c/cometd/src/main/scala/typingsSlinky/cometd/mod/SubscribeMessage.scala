package typingsSlinky.cometd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.cometd.mod.Message because Already inherited */ @js.native
trait SubscribeMessage extends BaseMessage {
  var subscription: String = js.native
}

object SubscribeMessage {
  @scala.inline
  def apply(channel: String, subscription: String, successful: Boolean): SubscribeMessage = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any], successful = successful.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeMessage]
  }
  @scala.inline
  implicit class SubscribeMessageOps[Self <: SubscribeMessage] (val x: Self) extends AnyVal {
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
  }
  
}

