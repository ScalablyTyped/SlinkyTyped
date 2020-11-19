package typingsSlinky.googleapis.bloggerV3Mod.bloggerV3

import typingsSlinky.googleapis.anon.Country
import typingsSlinky.googleapis.anon.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaUser extends js.Object {
  
  /**
    * Profile summary information.
    */
  var about: js.UndefOr[String] = js.native
  
  /**
    * The container of blogs for this user.
    */
  var blogs: js.UndefOr[`1`] = js.native
  
  /**
    * The timestamp of when this profile was created, in seconds since epoch.
    */
  var created: js.UndefOr[String] = js.native
  
  /**
    * The display name.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * The identifier for this User.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The kind of this entity. Always blogger#user
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * This user&#39;s locale
    */
  var locale: js.UndefOr[Country] = js.native
  
  /**
    * The API REST URL to fetch this resource from.
    */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * The user&#39;s profile page.
    */
  var url: js.UndefOr[String] = js.native
}
object SchemaUser {
  
  @scala.inline
  def apply(): SchemaUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUser]
  }
  
  @scala.inline
  implicit class SchemaUserOps[Self <: SchemaUser] (val x: Self) extends AnyVal {
    
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
    def setAbout(value: String): Self = this.set("about", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbout: Self = this.set("about", js.undefined)
    
    @scala.inline
    def setBlogs(value: `1`): Self = this.set("blogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlogs: Self = this.set("blogs", js.undefined)
    
    @scala.inline
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLocale(value: Country): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
