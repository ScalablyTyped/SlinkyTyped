package typingsSlinky.actionsOnGoogle.permissionPermissionMod

import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2PermissionValueSpec
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2PermissionValueSpecPermissions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PermissionOptions extends js.Object {
  /**
    * Context why the permission is being asked.
    * It's the TTS prompt prefix (action phrase) we ask the user.
    * @public
    */
  var context: js.UndefOr[String] = js.native
  /**
    * Extra properties to be spread into the value.
    * For advanced usages like used in {@link UpdatePermission}
    * @public
    */
  var extra: js.UndefOr[GoogleActionsV2PermissionValueSpec] = js.native
  /**
    * Array or string of permissions App supports,
    * each of which comes from {@link GoogleActionsV2PermissionValueSpecPermissions}.
    * @public
    */
  var permissions: GoogleActionsV2PermissionValueSpecPermissions | js.Array[GoogleActionsV2PermissionValueSpecPermissions] = js.native
}

object PermissionOptions {
  @scala.inline
  def apply(
    permissions: GoogleActionsV2PermissionValueSpecPermissions | js.Array[GoogleActionsV2PermissionValueSpecPermissions]
  ): PermissionOptions = {
    val __obj = js.Dynamic.literal(permissions = permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionOptions]
  }
  @scala.inline
  implicit class PermissionOptionsOps[Self <: PermissionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPermissions(
      value: GoogleActionsV2PermissionValueSpecPermissions | js.Array[GoogleActionsV2PermissionValueSpecPermissions]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withExtra(value: GoogleActionsV2PermissionValueSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtra: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra")(js.undefined)
        ret
    }
  }
  
}

