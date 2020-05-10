package typingsSlinky.gapiClientCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateConferenceRequest extends js.Object {
  /** The conference solution, such as Hangouts or Hangouts Meet. */
  var conferenceSolutionKey: js.UndefOr[ConferenceSolutionKey] = js.native
  /**
    * The client-generated unique ID for this request.
    * Clients should regenerate this ID for every new request. If an ID provided is the same as for the previous request, the request is ignored.
    */
  var requestId: js.UndefOr[String] = js.native
  /** The status of the conference create request. */
  var status: js.UndefOr[ConferenceRequestStatus] = js.native
}

object CreateConferenceRequest {
  @scala.inline
  def apply(): CreateConferenceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateConferenceRequest]
  }
  @scala.inline
  implicit class CreateConferenceRequestOps[Self <: CreateConferenceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConferenceSolutionKey(value: ConferenceSolutionKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conferenceSolutionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConferenceSolutionKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conferenceSolutionKey")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestId")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: ConferenceRequestStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

