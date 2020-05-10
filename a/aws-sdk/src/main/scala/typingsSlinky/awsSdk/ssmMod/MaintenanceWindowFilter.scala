package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaintenanceWindowFilter extends js.Object {
  /**
    * The name of the filter.
    */
  var Key: js.UndefOr[MaintenanceWindowFilterKey] = js.native
  /**
    * The filter values.
    */
  var Values: js.UndefOr[MaintenanceWindowFilterValues] = js.native
}

object MaintenanceWindowFilter {
  @scala.inline
  def apply(): MaintenanceWindowFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindowFilter]
  }
  @scala.inline
  implicit class MaintenanceWindowFilterOps[Self <: MaintenanceWindowFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: MaintenanceWindowFilterKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Key")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: MaintenanceWindowFilterValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Values")(js.undefined)
        ret
    }
  }
  
}

