package typingsSlinky.googleapis.calendarV3Mod.calendarV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaFreeBusyRequest extends js.Object {
  /**
    * Maximal number of calendars for which FreeBusy information is to be
    * provided. Optional. Maximum value is 50.
    */
  var calendarExpansionMax: js.UndefOr[Double] = js.native
  /**
    * Maximal number of calendar identifiers to be provided for a single group.
    * Optional. An error is returned for a group with more members than this
    * value. Maximum value is 100.
    */
  var groupExpansionMax: js.UndefOr[Double] = js.native
  /**
    * List of calendars and/or groups to query.
    */
  var items: js.UndefOr[js.Array[SchemaFreeBusyRequestItem]] = js.native
  /**
    * The end of the interval for the query formatted as per RFC3339.
    */
  var timeMax: js.UndefOr[String] = js.native
  /**
    * The start of the interval for the query formatted as per RFC3339.
    */
  var timeMin: js.UndefOr[String] = js.native
  /**
    * Time zone used in the response. Optional. The default is UTC.
    */
  var timeZone: js.UndefOr[String] = js.native
}

object SchemaFreeBusyRequest {
  @scala.inline
  def apply(): SchemaFreeBusyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFreeBusyRequest]
  }
  @scala.inline
  implicit class SchemaFreeBusyRequestOps[Self <: SchemaFreeBusyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalendarExpansionMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarExpansionMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalendarExpansionMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarExpansionMax")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupExpansionMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupExpansionMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupExpansionMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupExpansionMax")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[SchemaFreeBusyRequestItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeMax(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeMax")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeMin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeMin")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(js.undefined)
        ret
    }
  }
  
}

