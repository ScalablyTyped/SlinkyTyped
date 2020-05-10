package typingsSlinky.ejWebAll.ej.Schedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipSettings extends js.Object {
  /** Enables or disables the tooltip display.
    * @Default {false}
    */
  var enable: js.UndefOr[Boolean] = js.native
  /** Template design that customizes the tooltip. All the field names that are mapped from dataSource to the appropriate field properties within the appointmentSettings can be accessed
    * within the template.
    * @Default {null}
    */
  var templateId: js.UndefOr[String] = js.native
}

object TooltipSettings {
  @scala.inline
  def apply(): TooltipSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipSettings]
  }
  @scala.inline
  implicit class TooltipSettingsOps[Self <: TooltipSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

