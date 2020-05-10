package typingsSlinky.azureSb.notificationhubresultMod.Azure.ServiceBus.Results

import typingsSlinky.azureSb.mod.Azure.ServiceBus.CreateNotificationHubOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationHubResult extends js.Object {
  def parse(xml: js.Object): js.Object | js.Array[js.Object] = js.native
  def serialize(resource: CreateNotificationHubOptions): String = js.native
}

object NotificationHubResult {
  @scala.inline
  def apply(
    parse: js.Object => js.Object | js.Array[js.Object],
    serialize: CreateNotificationHubOptions => String
  ): NotificationHubResult = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), serialize = js.Any.fromFunction1(serialize))
    __obj.asInstanceOf[NotificationHubResult]
  }
  @scala.inline
  implicit class NotificationHubResultOps[Self <: NotificationHubResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParse(value: js.Object => js.Object | js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSerialize(value: CreateNotificationHubOptions => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialize")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

