package typingsSlinky.gapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeManagement extends js.Object {
  /**
    * A flag that specifies whether the node auto-repair is enabled for the node
    * pool. If enabled, the nodes in this node pool will be monitored and, if
    * they fail health checks too many times, an automatic repair action will be
    * triggered.
    */
  var autoRepair: js.UndefOr[Boolean] = js.native
  /**
    * A flag that specifies whether node auto-upgrade is enabled for the node
    * pool. If enabled, node auto-upgrade helps keep the nodes in your node pool
    * up to date with the latest release version of Kubernetes.
    */
  var autoUpgrade: js.UndefOr[Boolean] = js.native
  /** Specifies the Auto Upgrade knobs for the node pool. */
  var upgradeOptions: js.UndefOr[AutoUpgradeOptions] = js.native
}

object NodeManagement {
  @scala.inline
  def apply(): NodeManagement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeManagement]
  }
  @scala.inline
  implicit class NodeManagementOps[Self <: NodeManagement] (val x: Self) extends AnyVal {
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
    def withUpgradeOptions(value: AutoUpgradeOptions): Self = {
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

