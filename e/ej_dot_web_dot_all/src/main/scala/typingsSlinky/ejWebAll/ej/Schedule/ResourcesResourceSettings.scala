package typingsSlinky.ejWebAll.ej.Schedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourcesResourceSettings extends js.Object {
  /** Binds appointmentClass field name in the dataSource. It applies custom CSS class name to appointments depicting to the resource it belongs.
    * @Default {null}
    */
  var appointmentClass: js.UndefOr[String] = js.native
  /** Binds color field name in the dataSource to resourceSettings color. The color specified here gets applied to the Schedule appointments denoting to the resource it belongs.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.native
  /** The dataSource option accepts either JSON object collection or DataManager (ejDataManager) instance that contains the resources related data.
    * @Default {[]}
    */
  var dataSource: js.UndefOr[js.Any | js.Array[_]] = js.native
  /** Binds the end work hour field name in the dataSource. It's optional, but providing it with some numeric value will set the end work hour for specific resources.
    * @Default {null}
    */
  var end: js.UndefOr[String] = js.native
  /** Binds groupId field name in the dataSource to resourceSettings groupId.
    * @Default {null}
    */
  var groupId: js.UndefOr[String] = js.native
  /** Binds id field name in the dataSource to resourceSettings id.
    * @Default {null}
    */
  var id: js.UndefOr[String] = js.native
  /** Binds the starting work hour field name in the dataSource. It's optional, but providing it with some numeric value will set the starting work hour for specific resources.
    * @Default {null}
    */
  var start: js.UndefOr[String] = js.native
  /** Binds text field name in the dataSource to resourceSettings text. These text gets listed out in resources field of the appointment window.
    * @Default {null}
    */
  var text: js.UndefOr[String] = js.native
  /** Binds the resources working days field name in the dataSource. It's optional, and accepts the array of strings (week day names). When provided with specific collection of days
    * (array of day names), only those days will render for the specific resources.
    * @Default {null}
    */
  var workWeek: js.UndefOr[String] = js.native
}

object ResourcesResourceSettings {
  @scala.inline
  def apply(): ResourcesResourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcesResourceSettings]
  }
  @scala.inline
  implicit class ResourcesResourceSettingsOps[Self <: ResourcesResourceSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppointmentClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppointmentClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentClass")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
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
    def withEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
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
    def withStart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkWeek(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkWeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workWeek")(js.undefined)
        ret
    }
  }
  
}

