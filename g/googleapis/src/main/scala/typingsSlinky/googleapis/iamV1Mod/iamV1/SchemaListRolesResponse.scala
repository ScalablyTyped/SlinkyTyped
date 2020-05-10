package typingsSlinky.googleapis.iamV1Mod.iamV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response containing the roles defined under a resource.
  */
@js.native
trait SchemaListRolesResponse extends js.Object {
  /**
    * To retrieve the next page of results, set `ListRolesRequest.page_token`
    * to this value.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The Roles defined on this resource.
    */
  var roles: js.UndefOr[js.Array[SchemaRole]] = js.native
}

object SchemaListRolesResponse {
  @scala.inline
  def apply(): SchemaListRolesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListRolesResponse]
  }
  @scala.inline
  implicit class SchemaListRolesResponseOps[Self <: SchemaListRolesResponse] (val x: Self) extends AnyVal {
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
    def withRoles(value: js.Array[SchemaRole]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roles")(js.undefined)
        ret
    }
  }
  
}

