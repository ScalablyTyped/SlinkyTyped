package typingsSlinky.googleapis.v1beta1aMod.pubsubV1beta1a

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event indicating a received message or truncation event.
  */
@js.native
trait SchemaPubsubEvent extends js.Object {
  /**
    * Indicates that this subscription has been deleted. (Note that pull
    * subscribers will always receive NOT_FOUND in response in their pull
    * request on the subscription, rather than seeing this boolean.)
    */
  var deleted: js.UndefOr[Boolean] = js.native
  /**
    * A received message.
    */
  var message: js.UndefOr[SchemaPubsubMessage] = js.native
  /**
    * The subscription that received the event.
    */
  var subscription: js.UndefOr[String] = js.native
  /**
    * Indicates that this subscription has been truncated.
    */
  var truncated: js.UndefOr[Boolean] = js.native
}

object SchemaPubsubEvent {
  @scala.inline
  def apply(): SchemaPubsubEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPubsubEvent]
  }
  @scala.inline
  implicit class SchemaPubsubEventOps[Self <: SchemaPubsubEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: SchemaPubsubMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
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
    def withTruncated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTruncated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncated")(js.undefined)
        ret
    }
  }
  
}

