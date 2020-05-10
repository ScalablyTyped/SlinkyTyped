package typingsSlinky.gapiClientBlogger.gapi.client.blogger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlogPerUserInfo extends js.Object {
  /** ID of the Blog resource */
  var blogId: js.UndefOr[String] = js.native
  /** True if the user has Admin level access to the blog. */
  var hasAdminAccess: js.UndefOr[Boolean] = js.native
  /** The kind of this entity. Always blogger#blogPerUserInfo */
  var kind: js.UndefOr[String] = js.native
  /** The Photo Album Key for the user when adding photos to the blog */
  var photosAlbumKey: js.UndefOr[String] = js.native
  /** Access permissions that the user has for the blog (ADMIN, AUTHOR, or READER). */
  var role: js.UndefOr[String] = js.native
  /** ID of the User */
  var userId: js.UndefOr[String] = js.native
}

object BlogPerUserInfo {
  @scala.inline
  def apply(): BlogPerUserInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlogPerUserInfo]
  }
  @scala.inline
  implicit class BlogPerUserInfoOps[Self <: BlogPerUserInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlogId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blogId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlogId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blogId")(js.undefined)
        ret
    }
    @scala.inline
    def withHasAdminAccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAdminAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasAdminAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAdminAccess")(js.undefined)
        ret
    }
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
    def withPhotosAlbumKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photosAlbumKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhotosAlbumKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photosAlbumKey")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(js.undefined)
        ret
    }
    @scala.inline
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(js.undefined)
        ret
    }
  }
  
}

