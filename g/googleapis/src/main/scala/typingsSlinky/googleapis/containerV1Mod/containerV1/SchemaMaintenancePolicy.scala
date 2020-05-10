package typingsSlinky.googleapis.containerV1Mod.containerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * MaintenancePolicy defines the maintenance policy to be used for the
  * cluster.
  */
@js.native
trait SchemaMaintenancePolicy extends js.Object {
  /**
    * Specifies the maintenance window in which maintenance may be performed.
    */
  var window: js.UndefOr[SchemaMaintenanceWindow] = js.native
}

object SchemaMaintenancePolicy {
  @scala.inline
  def apply(): SchemaMaintenancePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMaintenancePolicy]
  }
  @scala.inline
  implicit class SchemaMaintenancePolicyOps[Self <: SchemaMaintenancePolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWindow(value: SchemaMaintenanceWindow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window")(js.undefined)
        ret
    }
  }
  
}

