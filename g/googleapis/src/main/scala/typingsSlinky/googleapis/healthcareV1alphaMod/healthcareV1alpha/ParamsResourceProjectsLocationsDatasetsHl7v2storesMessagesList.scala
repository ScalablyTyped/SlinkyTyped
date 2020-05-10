package typingsSlinky.googleapis.healthcareV1alphaMod.healthcareV1alpha

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Restricts messages returned to those matching a filter. Syntax:
    * https://cloud.google.com/appengine/docs/standard/python/search/query_strings
    * Fields/functions available for filtering are: - message_type, from the
    * MSH-9 segment, e.g. 'NOT message_type = "ADT"' - send_date or sendDate,
    * the YYYY-MM-DD date the message was sent in the   dataset's time_zone,
    * from the MSH-7 segment; e.g.   'send_date < "2017-01-02"' - send_time,
    * the timestamp of when the message was sent, using the RFC3339   time
    * format for comparisons, from the MSH-7 segment; e.g. 'send_time <
    * "2017-01-02T00:00:00-05:00"' - send_facility, the hospital/trust that the
    * message came from, from the   MSH-4 segment, e.g. 'send_facility = "RAL"'
    * - HL7RegExp(expr), which does regular expression matching of expr against
    * the HL7 message payload using re2 (http://code.google.com/p/re2/) syntax;
    * e.g. 'HL7RegExp("^.*\|.*\|CERNER")' - PatientId(value, type), which
    * matches if the message lists a patient   having an ID of the given value
    * and type in the PID-2, PID-3, or PID-4   segments; e.g.
    * 'PatientId("123456", "MRN")' - HasLabel(x), a boolean returning true if
    * the message has a label with   key x (having any value) set using the
    * labels map in Message; e.g.   'HasLabel("priority")' - Label(x), a string
    * value of the label with key x as set using the labels   map in Message,
    * e.g. 'Label("priority") = "high"' Negation on the patient ID function and
    * the label function are not supported, e.g. invalid queries: 'NOT
    * PatientId("123456", "MRN")', 'NOT HasLabel("tag1")', 'NOT Label("tag2") =
    * "val2"'. Conjunction of multiple patient ID functions is not supported,
    * e.g. an invalid query: 'PatientId("123456", "MRN") AND
    * PatientId("456789", "MRN")'. Conjunction of multiple label functions is
    * also not supported, e.g. an invalid query: 'HasLabel("tag1") AND
    * Label("tag2") = "val2"'. Conjunction of one patient ID function, one
    * label function and other fields is supported, e.g. a valid query:
    * 'PatientId("123456", "MRN") AND HasLabel("tag1") AND message_type =
    * "ADT"'.
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * Orders messages returned by the specified order_by clause. Syntax:
    * https://cloud.google.com/apis/design/design_patterns#sorting_order Fields
    * available for ordering are: - send_time
    */
  var orderBy: js.UndefOr[String] = js.native
  /**
    * Limit on the number of messages to return in a single response. If zero
    * the default page size of 100 is used.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The next_page_token value returned from the previous List request, if
    * any.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Name of the HL7v2 store to retrieve messages from.
    */
  var parent: js.UndefOr[String] = js.native
}

object ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesList {
  @scala.inline
  def apply(): ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesList]
  }
  @scala.inline
  implicit class ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesListOps[Self <: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderBy")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withParent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
  }
  
}

