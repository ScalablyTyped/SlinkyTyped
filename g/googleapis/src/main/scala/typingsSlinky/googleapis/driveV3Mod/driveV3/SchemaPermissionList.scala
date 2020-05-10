package typingsSlinky.googleapis.driveV3Mod.driveV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of permissions for a file.
  */
@js.native
trait SchemaPermissionList extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;drive#permissionList&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The page token for the next page of permissions. This field will be
    * absent if the end of the permissions list has been reached. If the token
    * is rejected for any reason, it should be discarded, and pagination should
    * be restarted from the first page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of permissions. If nextPageToken is populated, then this list
    * may be incomplete and an additional page of results should be fetched.
    */
  var permissions: js.UndefOr[js.Array[SchemaPermission]] = js.native
}

object SchemaPermissionList {
  @scala.inline
  def apply(): SchemaPermissionList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPermissionList]
  }
  @scala.inline
  implicit class SchemaPermissionListOps[Self <: SchemaPermissionList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withPermissions(value: js.Array[SchemaPermission]): Self = {
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
  }
  
}

