package typingsSlinky.ejWebAll.ej.Schedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockoutSettings extends js.Object {
  /** Binds the name of customStyle field in dataSource. It applies the custom CSS to the block intervals.
    * @Default {null}
    */
  var customStyle: js.UndefOr[String] = js.native
  /** The dataSource option accepts either JSON object collection or DataManager (ej.DataManager) instance that contains Schedule block intervals.
    * @Default {[]}
    */
  var dataSource: js.UndefOr[js.Any | js.Array[_]] = js.native
  /** When set to true, enables the blockout option to be applied on the Scheduler cells.
    * @Default {false}
    */
  var enable: js.UndefOr[Boolean] = js.native
  /** Binds the name of endTime field in dataSource with the end time of block time interval. It indicates the date and time, when the block interval actually ends in the Scheduler.
    * @Default {null}
    */
  var endTime: js.UndefOr[String] = js.native
  /** Binds the name of groupId field in dataSource. Specifies the id of the resource group, to which the time intervals are needed to be blocked.
    * @Default {null}
    */
  var groupId: js.UndefOr[String] = js.native
  /** Binds the id field name in dataSource to the id of block time interval. It denotes the unique id assigned to each of the block records.
    * @Default {null}
    */
  var id: js.UndefOr[String] = js.native
  /** Binds the name of isAllDay field in dataSource. It indicates whether an entire day is blocked or not.
    * @Default {null}
    */
  var isAllDay: js.UndefOr[String] = js.native
  /** Binds the name of isBlockAppointment field in dataSource. When set to true, disables the appointments that lies on the blocked area and restrict to perform CRUD operations in it.
    * @Default {null}
    */
  var isBlockAppointment: js.UndefOr[String] = js.native
  /** It holds either the ej.Query() object or simply the query string that retrieves the specified records from the table.
    * @Default {null}
    */
  var query: js.UndefOr[String] = js.native
  /** Binds the name of resourceId field in dataSource. Specifies the id of the resources, to which the time intervals are needed to be blocked.
    * @Default {null}
    */
  var resourceId: js.UndefOr[String] = js.native
  /** Binds the name of startTime field in the dataSource with start time of block time interval. It indicates the date and time, when the block interval actually starts in the
    * Scheduler.
    * @Default {null}
    */
  var startTime: js.UndefOr[String] = js.native
  /** Binds the name of subject field in the dataSource to block time Subject. Indicates the Subject or title that gets displayed on the Schedule block intervals.
    * @Default {null}
    */
  var subject: js.UndefOr[String] = js.native
  /** Assign the table name from where the records are to be fetched for the Schedule.
    * @Default {null}
    */
  var tableName: js.UndefOr[String] = js.native
  /** Template design that applies on the Schedule block intervals. All the field names that are mapped from dataSource to the appropriate field properties within the blockoutSettings
    * can be used within the template.
    * @Default {null}
    */
  var templateId: js.UndefOr[String] = js.native
}

object BlockoutSettings {
  @scala.inline
  def apply(): BlockoutSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlockoutSettings]
  }
  @scala.inline
  implicit class BlockoutSettingsOps[Self <: BlockoutSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customStyle")(js.undefined)
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
    def withEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.undefined)
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
    def withGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupId")(js.undefined)
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
    def withIsAllDay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAllDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAllDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAllDay")(js.undefined)
        ret
    }
    @scala.inline
    def withIsBlockAppointment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBlockAppointment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsBlockAppointment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBlockAppointment")(js.undefined)
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
    def withResourceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceId")(js.undefined)
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
    @scala.inline
    def withTemplateId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateId")(js.undefined)
        ret
    }
  }
  
}

