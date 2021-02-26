package typingsSlinky.maximMazurokGapiClientBlogger.gapi.client.blogger

import typingsSlinky.maximMazurokGapiClientBlogger.anon.Country
import typingsSlinky.maximMazurokGapiClientBlogger.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait User extends StObject {
  
  /** Profile summary information. */
  var about: js.UndefOr[String] = js.native
  
  /** The container of blogs for this user. */
  var blogs: js.UndefOr[`0`] = js.native
  
  /** The timestamp of when this profile was created, in seconds since epoch. */
  var created: js.UndefOr[String] = js.native
  
  /** The display name. */
  var displayName: js.UndefOr[String] = js.native
  
  /** The identifier for this User. */
  var id: js.UndefOr[String] = js.native
  
  /** The kind of this entity. Always blogger#user. */
  var kind: js.UndefOr[String] = js.native
  
  /** This user's locale */
  var locale: js.UndefOr[Country] = js.native
  
  /** The API REST URL to fetch this resource from. */
  var selfLink: js.UndefOr[String] = js.native
  
  /** The user's profile page. */
  var url: js.UndefOr[String] = js.native
}
object User {
  
  @scala.inline
  def apply(): User = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[User]
  }
  
  @scala.inline
  implicit class UserMutableBuilder[Self <: User] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
    
    @scala.inline
    def setBlogs(value: `0`): Self = StObject.set(x, "blogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlogsUndefined: Self = StObject.set(x, "blogs", js.undefined)
    
    @scala.inline
    def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLocale(value: Country): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
