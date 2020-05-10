package typingsSlinky.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List user permissions response.
  */
@js.native
trait SchemaListUserPermissionsResponse extends js.Object {
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * All GTM UserPermissions of a GTM Account.
    */
  var userPermission: js.UndefOr[js.Array[SchemaUserPermission]] = js.native
}

object SchemaListUserPermissionsResponse {
  @scala.inline
  def apply(): SchemaListUserPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListUserPermissionsResponse]
  }
  @scala.inline
  implicit class SchemaListUserPermissionsResponseOps[Self <: SchemaListUserPermissionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withUserPermission(value: js.Array[SchemaUserPermission]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPermission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserPermission: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPermission")(js.undefined)
        ret
    }
  }
  
}

