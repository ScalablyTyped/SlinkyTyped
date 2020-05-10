package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IosNetworkUsageRule extends js.Object {
  // If set to true, corresponding managed apps will not be allowed to use cellular data when roaming.
  var cellularDataBlockWhenRoaming: js.UndefOr[Boolean] = js.native
  // If set to true, corresponding managed apps will not be allowed to use cellular data at any time.
  var cellularDataBlocked: js.UndefOr[Boolean] = js.native
  /**
    * Information about the managed apps that this rule is going to apply to. This collection can contain a maximum of 500
    * elements.
    */
  var managedApps: js.UndefOr[js.Array[AppListItem]] = js.native
}

object IosNetworkUsageRule {
  @scala.inline
  def apply(): IosNetworkUsageRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosNetworkUsageRule]
  }
  @scala.inline
  implicit class IosNetworkUsageRuleOps[Self <: IosNetworkUsageRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellularDataBlockWhenRoaming(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellularDataBlockWhenRoaming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellularDataBlockWhenRoaming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellularDataBlockWhenRoaming")(js.undefined)
        ret
    }
    @scala.inline
    def withCellularDataBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellularDataBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellularDataBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellularDataBlocked")(js.undefined)
        ret
    }
    @scala.inline
    def withManagedApps(value: js.Array[AppListItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedApps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagedApps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedApps")(js.undefined)
        ret
    }
  }
  
}

