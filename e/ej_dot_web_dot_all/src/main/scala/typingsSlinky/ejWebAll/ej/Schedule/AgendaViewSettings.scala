package typingsSlinky.ejWebAll.ej.Schedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgendaViewSettings extends js.Object {
  /** You can customize the Date column display based on the requirement.
    * @Default {null}
    */
  var dateColumnTemplateId: js.UndefOr[String] = js.native
  /** You can display the summary of multiple week's appointment by setting this value.
    * @Default {7}
    */
  var daysInAgenda: js.UndefOr[Double] = js.native
  /** You can customize the time column display based on the requirement.
    * @Default {null}
    */
  var timeColumnTemplateId: js.UndefOr[String] = js.native
}

object AgendaViewSettings {
  @scala.inline
  def apply(): AgendaViewSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgendaViewSettings]
  }
  @scala.inline
  implicit class AgendaViewSettingsOps[Self <: AgendaViewSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateColumnTemplateId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateColumnTemplateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateColumnTemplateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateColumnTemplateId")(js.undefined)
        ret
    }
    @scala.inline
    def withDaysInAgenda(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daysInAgenda")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDaysInAgenda: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daysInAgenda")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeColumnTemplateId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeColumnTemplateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeColumnTemplateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeColumnTemplateId")(js.undefined)
        ret
    }
  }
  
}

