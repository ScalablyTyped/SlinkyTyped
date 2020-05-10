package typingsSlinky.ejWebAll.ej.Schedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppointmentSettings extends js.Object {
  /** Binds the name of allDay field in dataSource. It indicates whether the appointment is an all-day appointment or not.
    * @Default {null}
    */
  var allDay: js.UndefOr[String] = js.native
  /** When set to false, doesn't consider the time difference offset calculation on appointment time.
    * @Default {true}
    */
  var applyTimeOffset: js.UndefOr[Boolean] = js.native
  /** Binds the name of categorize field in dataSource. It indicates the categorize value, red categorize, green, yellow and so on applied to the appointments.
    * @Default {null}
    */
  var categorize: js.UndefOr[String] = js.native
  /** The dataSource option accepts either JSON object collection or DataManager (ej.DataManager) instance that contains Schedule appointments.
    * @Default {[]}
    */
  var dataSource: js.UndefOr[js.Any | js.Array[_]] = js.native
  /** Binds the description field name in dataSource. It indicates the appointment description.
    * @Default {null}
    */
  var description: js.UndefOr[String] = js.native
  /** When set to true, introduces a new option to edit only the future occurrences of the appointments in a recurrence series from the currently selected appointment's date.
    * @Default {false}
    */
  var editFutureEventsOnly: js.UndefOr[Boolean] = js.native
  /** Binds the name of endTime field in dataSource with the end time of Schedule appointments. It indicates the date and time when Schedule appointment actually ends.
    * @Default {null}
    */
  var endTime: js.UndefOr[String] = js.native
  /** Binds the name of end timezone field in dataSource. It indicates the timezone of appointment end date. When the endTimeZone field is not mentioned, the appointment uses the
    * Schedule timeZone or System timeZone.
    * @Default {null}
    */
  var endTimeZone: js.UndefOr[String] = js.native
  /** Binds the id field name in dataSource to the id of Schedule appointments. It denotes the unique id assigned to appointments.
    * @Default {null}
    */
  var id: js.UndefOr[String] = js.native
  /** Binds the name of location field in dataSource. It indicates the appointment location.
    * @Default {null}
    */
  var location: js.UndefOr[String] = js.native
  /** Binds the name of the priority field in dataSource. It indicates the priority, high, low, medium and none of the appointments.
    * @Default {null}
    */
  var priority: js.UndefOr[String] = js.native
  /** It holds either the ej.Query() object or simply the query string that retrieves the specified records from the table.
    * @Default {null}
    */
  var query: js.UndefOr[String] = js.native
  /** Binds the name of recurrence field in dataSource. It indicates whether the appointment is a recurrence appointment or not.
    * @Default {null}
    */
  var recurrence: js.UndefOr[String] = js.native
  /** Binds the name of recurrenceRule field in dataSource. It indicates the recurrence pattern associated with appointments.
    * @Default {null}
    */
  var recurrenceRule: js.UndefOr[String] = js.native
  /** Binds one or more fields in resource collection dataSource. It maps the resource field names with appointments denoting the resource of appointments actually belongs.
    * @Default {null}
    */
  var resourceFields: js.UndefOr[String] = js.native
  /** Binds the name of startTime field in the dataSource with start time of the Schedule appointments. It indicates the date and Time when Schedule appointment actually starts.
    * @Default {null}
    */
  var startTime: js.UndefOr[String] = js.native
  /** Binds the name of start timezone field in dataSource. It indicates the timezone of appointment start date. When startTimeZone field is not mentioned, the appointment uses the
    * Schedule timeZone or System timeZone.
    * @Default {null}
    */
  var startTimeZone: js.UndefOr[String] = js.native
  /** Binds the name of subject field in the dataSource to appointment Subject. Indicates the Subject or title that gets displayed on Schedule appointments.
    * @Default {null}
    */
  var subject: js.UndefOr[String] = js.native
  /** Assign the table name from where the records are to be fetched for the Schedule.
    * @Default {null}
    */
  var tableName: js.UndefOr[String] = js.native
}

object AppointmentSettings {
  @scala.inline
  def apply(): AppointmentSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppointmentSettings]
  }
  @scala.inline
  implicit class AppointmentSettingsOps[Self <: AppointmentSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllDay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allDay")(js.undefined)
        ret
    }
    @scala.inline
    def withApplyTimeOffset(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyTimeOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyTimeOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyTimeOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withCategorize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categorize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategorize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categorize")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: js.Any | js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
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
    def withEditFutureEventsOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editFutureEventsOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditFutureEventsOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editFutureEventsOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTimeZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTimeZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTimeZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTimeZone")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: String): Self = {
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
    def withPriority(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withRecurrence(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurrence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecurrence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurrence")(js.undefined)
        ret
    }
    @scala.inline
    def withRecurrenceRule(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurrenceRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecurrenceRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurrenceRule")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceFields(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceFields")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTimeZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimeZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTimeZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimeZone")(js.undefined)
        ret
    }
    @scala.inline
    def withSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(js.undefined)
        ret
    }
    @scala.inline
    def withTableName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableName")(js.undefined)
        ret
    }
  }
  
}

