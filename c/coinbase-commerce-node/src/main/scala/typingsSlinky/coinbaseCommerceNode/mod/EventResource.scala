package typingsSlinky.coinbaseCommerceNode.mod

import typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.chargeColonconfirmed
import typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.chargeColoncreated
import typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.chargeColondelayed
import typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.chargeColonfailed
import typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.chargeColonpending
import typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.chargeColonresolved
import typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Event Resource.
  *
  * @link
  */
@js.native
trait EventResource[T] extends js.Object {
  /**
    * API version of the `data` payload.
    */
  var api_version: String = js.native
  /**
    * Event creation time.
    */
  var created_at: Timestamp = js.native
  /**
    * Event Payload.
    * Resource of the associated object at the time of the event.
    */
  var data: T = js.native
  /**
    * Event UUID.
    */
  var id: String = js.native
  /**
    * Resource name.
    */
  var resource: event = js.native
  /**
    * Event type.
    */
  var `type`: chargeColoncreated | chargeColonconfirmed | chargeColonfailed | chargeColondelayed | chargeColonpending | chargeColonresolved = js.native
}

object EventResource {
  @scala.inline
  def apply[T](
    api_version: String,
    created_at: Timestamp,
    data: T,
    id: String,
    resource: event,
    `type`: chargeColoncreated | chargeColonconfirmed | chargeColonfailed | chargeColondelayed | chargeColonpending | chargeColonresolved
  ): EventResource[T] = {
    val __obj = js.Dynamic.literal(api_version = api_version.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventResource[T]]
  }
  @scala.inline
  implicit class EventResourceOps[Self[t] <: EventResource[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withApi_version(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated_at(value: Timestamp): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResource(value: event): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(
      value: chargeColoncreated | chargeColonconfirmed | chargeColonfailed | chargeColondelayed | chargeColonpending | chargeColonresolved
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

