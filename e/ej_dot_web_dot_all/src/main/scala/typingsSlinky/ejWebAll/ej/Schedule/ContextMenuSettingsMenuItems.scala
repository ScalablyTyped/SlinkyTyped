package typingsSlinky.ejWebAll.ej.Schedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextMenuSettingsMenuItems extends js.Object {
  /** All the appointment related context menu items are grouped under this appointment menu collection.
    */
  var appointment: js.UndefOr[js.Array[_]] = js.native
  /** All the Scheduler cell related context menu items are grouped under this cells menu item collection.
    */
  var cells: js.UndefOr[js.Array[_]] = js.native
}

object ContextMenuSettingsMenuItems {
  @scala.inline
  def apply(): ContextMenuSettingsMenuItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextMenuSettingsMenuItems]
  }
  @scala.inline
  implicit class ContextMenuSettingsMenuItemsOps[Self <: ContextMenuSettingsMenuItems] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppointment(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppointment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointment")(js.undefined)
        ret
    }
    @scala.inline
    def withCells(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCells: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cells")(js.undefined)
        ret
    }
  }
  
}

