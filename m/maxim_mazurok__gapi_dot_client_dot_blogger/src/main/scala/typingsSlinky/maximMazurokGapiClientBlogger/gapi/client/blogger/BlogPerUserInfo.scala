package typingsSlinky.maximMazurokGapiClientBlogger.gapi.client.blogger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlogPerUserInfo extends js.Object {
  
  /** ID of the Blog resource. */
  var blogId: js.UndefOr[String] = js.native
  
  /** True if the user has Admin level access to the blog. */
  var hasAdminAccess: js.UndefOr[Boolean] = js.native
  
  /** The kind of this entity. Always blogger#blogPerUserInfo. */
  var kind: js.UndefOr[String] = js.native
  
  /** The Photo Album Key for the user when adding photos to the blog. */
  var photosAlbumKey: js.UndefOr[String] = js.native
  
  /** Access permissions that the user has for the blog (ADMIN, AUTHOR, or READER). */
  var role: js.UndefOr[String] = js.native
  
  /** ID of the User. */
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBlogId(value: String): Self = this.set("blogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlogId: Self = this.set("blogId", js.undefined)
    
    @scala.inline
    def setHasAdminAccess(value: Boolean): Self = this.set("hasAdminAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasAdminAccess: Self = this.set("hasAdminAccess", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setPhotosAlbumKey(value: String): Self = this.set("photosAlbumKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhotosAlbumKey: Self = this.set("photosAlbumKey", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
}
