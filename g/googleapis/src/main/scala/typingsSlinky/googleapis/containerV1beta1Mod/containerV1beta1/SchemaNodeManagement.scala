package typingsSlinky.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NodeManagement defines the set of node management services turned on for
  * the node pool.
  */
@js.native
trait SchemaNodeManagement extends js.Object {
  /**
    * Whether the nodes will be automatically repaired.
    */
  var autoRepair: js.UndefOr[Boolean] = js.native
  /**
    * Whether the nodes will be automatically upgraded.
    */
  var autoUpgrade: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the Auto Upgrade knobs for the node pool.
    */
  var upgradeOptions: js.UndefOr[SchemaAutoUpgradeOptions] = js.native
}

object SchemaNodeManagement {
  @scala.inline
  def apply(): SchemaNodeManagement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeManagement]
  }
  @scala.inline
  implicit class SchemaNodeManagementOps[Self <: SchemaNodeManagement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoRepair(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRepair")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoRepair: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRepair")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoUpgrade(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUpgrade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoUpgrade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUpgrade")(js.undefined)
        ret
    }
    @scala.inline
    def withUpgradeOptions(value: SchemaAutoUpgradeOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upgradeOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpgradeOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upgradeOptions")(js.undefined)
        ret
    }
  }
  
}

