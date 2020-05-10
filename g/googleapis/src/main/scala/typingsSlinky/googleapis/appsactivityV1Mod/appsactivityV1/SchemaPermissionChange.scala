package typingsSlinky.googleapis.appsactivityV1Mod.appsactivityV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about a Drive object&#39;s permissions that changed as
  * a result of a permissionChange type event.
  */
@js.native
trait SchemaPermissionChange extends js.Object {
  /**
    * Lists all Permission objects added.
    */
  var addedPermissions: js.UndefOr[js.Array[SchemaPermission]] = js.native
  /**
    * Lists all Permission objects removed.
    */
  var removedPermissions: js.UndefOr[js.Array[SchemaPermission]] = js.native
}

object SchemaPermissionChange {
  @scala.inline
  def apply(): SchemaPermissionChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPermissionChange]
  }
  @scala.inline
  implicit class SchemaPermissionChangeOps[Self <: SchemaPermissionChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddedPermissions(value: js.Array[SchemaPermission]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addedPermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddedPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addedPermissions")(js.undefined)
        ret
    }
    @scala.inline
    def withRemovedPermissions(value: js.Array[SchemaPermission]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removedPermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemovedPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removedPermissions")(js.undefined)
        ret
    }
  }
  
}

