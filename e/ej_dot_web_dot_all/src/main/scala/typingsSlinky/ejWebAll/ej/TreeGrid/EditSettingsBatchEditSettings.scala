package typingsSlinky.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditSettingsBatchEditSettings extends js.Object {
  /** Specifies the batch edit mode whether it is cell, row or dialog.
    * @Default {ej.TreeGrid.BatchEditMode.Cell}
    */
  var editMode: js.UndefOr[BatchEditMode | String] = js.native
}

object EditSettingsBatchEditSettings {
  @scala.inline
  def apply(): EditSettingsBatchEditSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditSettingsBatchEditSettings]
  }
  @scala.inline
  implicit class EditSettingsBatchEditSettingsOps[Self <: EditSettingsBatchEditSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEditMode(value: BatchEditMode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editMode")(js.undefined)
        ret
    }
  }
  
}

