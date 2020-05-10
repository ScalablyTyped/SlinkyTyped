package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsOrdersV3VerticalsTicketTicketEvent extends js.Object {
  /**
    * Description of the event.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Entry time, which might be different from the event start time. e.g. the
    * event starts at 9am, but entry time is 8:30am.
    */
  var doorTime: js.UndefOr[GoogleActionsOrdersV3Time] = js.native
  /**
    * End time.
    */
  var endDate: js.UndefOr[GoogleActionsOrdersV3Time] = js.native
  /**
    * The characters related to this event. It can be directors or actors of a
    * movie event, or performers of a concert, etc.
    */
  var eventCharacters: js.UndefOr[js.Array[GoogleActionsOrdersV3VerticalsTicketEventCharacter]] = js.native
  /**
    * The location where the event is happening, or an organization is located.
    */
  var location: js.UndefOr[GoogleActionsV2Location] = js.native
  /**
    * Required: Name of the event. For example, if the event is a movie, this
    * should be the movie name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Start time.
    */
  var startDate: js.UndefOr[GoogleActionsOrdersV3Time] = js.native
  /**
    * Required: Type of the ticket event, e.g. movie, concert.
    */
  var `type`: js.UndefOr[GoogleActionsOrdersV3VerticalsTicketTicketEventType] = js.native
  /**
    * Url to the event info.
    */
  var url: js.UndefOr[String] = js.native
}

object GoogleActionsOrdersV3VerticalsTicketTicketEvent {
  @scala.inline
  def apply(): GoogleActionsOrdersV3VerticalsTicketTicketEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsTicketTicketEvent]
  }
  @scala.inline
  implicit class GoogleActionsOrdersV3VerticalsTicketTicketEventOps[Self <: GoogleActionsOrdersV3VerticalsTicketTicketEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDoorTime(value: GoogleActionsOrdersV3Time): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doorTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoorTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doorTime")(js.undefined)
        ret
    }
    @scala.inline
    def withEndDate(value: GoogleActionsOrdersV3Time): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(js.undefined)
        ret
    }
    @scala.inline
    def withEventCharacters(value: js.Array[GoogleActionsOrdersV3VerticalsTicketEventCharacter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventCharacters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventCharacters")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: GoogleActionsV2Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDate(value: GoogleActionsOrdersV3Time): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: GoogleActionsOrdersV3VerticalsTicketTicketEventType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

