package typingsSlinky.ejWebAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwimlaneSettingsUnassignedGroup extends js.Object {
  /** To enable or disable unassigned category change with swim lane key values.
    * @Default {true}
    */
  var enable: js.UndefOr[Boolean] = js.native
  /** To set the user defined values which are need to categorized as unassigned category swim lane groups.
    * @Default {[null,undefined,]}
    */
  var keys: js.UndefOr[js.Array[_]] = js.native
}

object SwimlaneSettingsUnassignedGroup {
  @scala.inline
  def apply(): SwimlaneSettingsUnassignedGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwimlaneSettingsUnassignedGroup]
  }
  @scala.inline
  implicit class SwimlaneSettingsUnassignedGroupOps[Self <: SwimlaneSettingsUnassignedGroup] (val x: Self) extends AnyVal {
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
    def withKeys(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(js.undefined)
        ret
    }
  }
  
}

