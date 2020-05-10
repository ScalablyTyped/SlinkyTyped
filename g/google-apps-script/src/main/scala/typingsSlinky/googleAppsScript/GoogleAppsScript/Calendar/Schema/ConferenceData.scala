package typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConferenceData extends js.Object {
  var conferenceId: js.UndefOr[String] = js.native
  var conferenceSolution: js.UndefOr[ConferenceSolution] = js.native
  var createRequest: js.UndefOr[CreateConferenceRequest] = js.native
  var entryPoints: js.UndefOr[js.Array[EntryPoint]] = js.native
  var notes: js.UndefOr[String] = js.native
  var parameters: js.UndefOr[ConferenceParameters] = js.native
  var signature: js.UndefOr[String] = js.native
}

object ConferenceData {
  @scala.inline
  def apply(): ConferenceData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConferenceData]
  }
  @scala.inline
  implicit class ConferenceDataOps[Self <: ConferenceData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConferenceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conferenceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConferenceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conferenceId")(js.undefined)
        ret
    }
    @scala.inline
    def withConferenceSolution(value: ConferenceSolution): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conferenceSolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConferenceSolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conferenceSolution")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateRequest(value: CreateConferenceRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withEntryPoints(value: js.Array[EntryPoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntryPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryPoints")(js.undefined)
        ret
    }
    @scala.inline
    def withNotes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(js.undefined)
        ret
    }
    @scala.inline
    def withParameters(value: ConferenceParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(js.undefined)
        ret
    }
    @scala.inline
    def withSignature(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(js.undefined)
        ret
    }
  }
  
}

