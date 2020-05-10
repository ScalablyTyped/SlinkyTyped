package typingsSlinky.googleapis.calendarV3Mod.calendarV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaConferenceData extends js.Object {
  /**
    * The ID of the conference. Can be used by developers to keep track of
    * conferences, should not be displayed to users. Values for solution types:
    * - &quot;eventHangout&quot;: unset. - &quot;eventNamedHangout&quot;: the
    * name of the Hangout. - &quot;hangoutsMeet&quot;: the 10-letter meeting
    * code, for example &quot;aaa-bbbb-ccc&quot;.  Optional.
    */
  var conferenceId: js.UndefOr[String] = js.native
  /**
    * The conference solution, such as Hangouts or Hangouts Meet. Unset for a
    * conference with a failed create request. Either conferenceSolution and at
    * least one entryPoint, or createRequest is required.
    */
  var conferenceSolution: js.UndefOr[SchemaConferenceSolution] = js.native
  /**
    * A request to generate a new conference and attach it to the event. The
    * data is generated asynchronously. To see whether the data is present
    * check the status field. Either conferenceSolution and at least one
    * entryPoint, or createRequest is required.
    */
  var createRequest: js.UndefOr[SchemaCreateConferenceRequest] = js.native
  /**
    * Information about individual conference entry points, such as URLs or
    * phone numbers. All of them must belong to the same conference. Either
    * conferenceSolution and at least one entryPoint, or createRequest is
    * required.
    */
  var entryPoints: js.UndefOr[js.Array[SchemaEntryPoint]] = js.native
  /**
    * Additional notes (such as instructions from the domain administrator,
    * legal notices) to display to the user. Can contain HTML. The maximum
    * length is 2048 characters. Optional.
    */
  var notes: js.UndefOr[String] = js.native
  /**
    * Additional properties related to a conference. An example would be a
    * solution-specific setting for enabling video streaming.
    */
  var parameters: js.UndefOr[SchemaConferenceParameters] = js.native
  /**
    * The signature of the conference data. Genereated on server side. Must be
    * preserved while copying the conference data between events, otherwise the
    * conference data will not be copied. Unset for a conference with a failed
    * create request. Optional for a conference with a pending create request.
    */
  var signature: js.UndefOr[String] = js.native
}

object SchemaConferenceData {
  @scala.inline
  def apply(): SchemaConferenceData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConferenceData]
  }
  @scala.inline
  implicit class SchemaConferenceDataOps[Self <: SchemaConferenceData] (val x: Self) extends AnyVal {
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
    def withConferenceSolution(value: SchemaConferenceSolution): Self = {
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
    def withCreateRequest(value: SchemaCreateConferenceRequest): Self = {
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
    def withEntryPoints(value: js.Array[SchemaEntryPoint]): Self = {
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
    def withParameters(value: SchemaConferenceParameters): Self = {
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

