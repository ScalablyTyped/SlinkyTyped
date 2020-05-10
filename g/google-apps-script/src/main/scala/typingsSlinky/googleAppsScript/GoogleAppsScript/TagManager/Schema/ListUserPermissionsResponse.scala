package typingsSlinky.googleAppsScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListUserPermissionsResponse extends js.Object {
  var nextPageToken: js.UndefOr[String] = js.native
  var userPermission: js.UndefOr[js.Array[UserPermission]] = js.native
}

object ListUserPermissionsResponse {
  @scala.inline
  def apply(): ListUserPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUserPermissionsResponse]
  }
  @scala.inline
  implicit class ListUserPermissionsResponseOps[Self <: ListUserPermissionsResponse] (val x: Self) extends AnyVal {
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
    def withUserPermission(value: js.Array[UserPermission]): Self = {
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

