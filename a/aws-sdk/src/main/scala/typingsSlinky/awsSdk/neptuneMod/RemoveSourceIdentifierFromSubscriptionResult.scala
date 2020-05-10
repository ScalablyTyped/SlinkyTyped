package typingsSlinky.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveSourceIdentifierFromSubscriptionResult extends js.Object {
  var EventSubscription: js.UndefOr[typingsSlinky.awsSdk.neptuneMod.EventSubscription] = js.native
}

object RemoveSourceIdentifierFromSubscriptionResult {
  @scala.inline
  def apply(): RemoveSourceIdentifierFromSubscriptionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveSourceIdentifierFromSubscriptionResult]
  }
  @scala.inline
  implicit class RemoveSourceIdentifierFromSubscriptionResultOps[Self <: RemoveSourceIdentifierFromSubscriptionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventSubscription(value: EventSubscription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventSubscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventSubscription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventSubscription")(js.undefined)
        ret
    }
  }
  
}

