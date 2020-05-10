package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2PermissionValueSpec extends js.Object {
  /**
    * The context why agent needs to request permission.
    */
  var optContext: js.UndefOr[String] = js.native
  /**
    * List of permissions requested by the agent.
    */
  var permissions: js.UndefOr[js.Array[GoogleActionsV2PermissionValueSpecPermissions]] = js.native
  /**
    * Additional information needed to fulfill update permission request.
    */
  var updatePermissionValueSpec: js.UndefOr[GoogleActionsV2UpdatePermissionValueSpec] = js.native
}

object GoogleActionsV2PermissionValueSpec {
  @scala.inline
  def apply(): GoogleActionsV2PermissionValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2PermissionValueSpec]
  }
  @scala.inline
  implicit class GoogleActionsV2PermissionValueSpecOps[Self <: GoogleActionsV2PermissionValueSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptContext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optContext")(js.undefined)
        ret
    }
    @scala.inline
    def withPermissions(value: js.Array[GoogleActionsV2PermissionValueSpecPermissions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatePermissionValueSpec(value: GoogleActionsV2UpdatePermissionValueSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatePermissionValueSpec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatePermissionValueSpec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatePermissionValueSpec")(js.undefined)
        ret
    }
  }
  
}

