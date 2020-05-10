package typingsSlinky.microsoftLiveConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a request to create a new calendar that subscribes to the
  * given iCal calendar.
  */
@js.native
trait INewCalendarSubscription extends js.Object {
  /**
    * Name of the calendar.
    */
  var name: String = js.native
  /**
    * A public subscription URL with which Live Connect will synchronize
    * properties and events periodically for this calendar.
    */
  var subscription_location: String = js.native
}

object INewCalendarSubscription {
  @scala.inline
  def apply(name: String, subscription_location: String): INewCalendarSubscription = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], subscription_location = subscription_location.asInstanceOf[js.Any])
    __obj.asInstanceOf[INewCalendarSubscription]
  }
  @scala.inline
  implicit class INewCalendarSubscriptionOps[Self <: INewCalendarSubscription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscription_location(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription_location")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

