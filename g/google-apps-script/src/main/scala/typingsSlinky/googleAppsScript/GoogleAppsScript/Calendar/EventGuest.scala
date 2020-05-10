package typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar

import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a guest of an event.
  */
@js.native
trait EventGuest extends js.Object {
  def getAdditionalGuests(): Integer = js.native
  def getEmail(): String = js.native
  def getGuestStatus(): GuestStatus = js.native
  def getName(): String = js.native
  /** @deprecated DO NOT USE */ def getStatus(): String = js.native
}

object EventGuest {
  @scala.inline
  def apply(
    getAdditionalGuests: () => Integer,
    getEmail: () => String,
    getGuestStatus: () => GuestStatus,
    getName: () => String,
    getStatus: () => String
  ): EventGuest = {
    val __obj = js.Dynamic.literal(getAdditionalGuests = js.Any.fromFunction0(getAdditionalGuests), getEmail = js.Any.fromFunction0(getEmail), getGuestStatus = js.Any.fromFunction0(getGuestStatus), getName = js.Any.fromFunction0(getName), getStatus = js.Any.fromFunction0(getStatus))
    __obj.asInstanceOf[EventGuest]
  }
  @scala.inline
  implicit class EventGuestOps[Self <: EventGuest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAdditionalGuests(value: () => Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAdditionalGuests")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEmail(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEmail")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetGuestStatus(value: () => GuestStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGuestStatus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStatus(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStatus")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

