package typingsSlinky.maximMazurokGapiClientBlogger.gapi.client.blogger

import typingsSlinky.maximMazurokGapiClientBlogger.anon.DisplayName
import typingsSlinky.maximMazurokGapiClientBlogger.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Comment extends StObject {
  
  /** The author of this Comment. */
  var author: js.UndefOr[DisplayName] = js.native
  
  /** Data about the blog containing this comment. */
  var blog: js.UndefOr[Id] = js.native
  
  /** The actual content of the comment. May include HTML markup. */
  var content: js.UndefOr[String] = js.native
  
  /** The identifier for this resource. */
  var id: js.UndefOr[String] = js.native
  
  /** Data about the comment this is in reply to. */
  var inReplyTo: js.UndefOr[Id] = js.native
  
  /** The kind of this entry. Always blogger#comment. */
  var kind: js.UndefOr[String] = js.native
  
  /** Data about the post containing this comment. */
  var post: js.UndefOr[Id] = js.native
  
  /** RFC 3339 date-time when this comment was published. */
  var published: js.UndefOr[String] = js.native
  
  /** The API REST URL to fetch this resource from. */
  var selfLink: js.UndefOr[String] = js.native
  
  /** The status of the comment (only populated for admin users). */
  var status: js.UndefOr[String] = js.native
  
  /** RFC 3339 date-time when this comment was last updated. */
  var updated: js.UndefOr[String] = js.native
}
object Comment {
  
  @scala.inline
  def apply(): Comment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Comment]
  }
  
  @scala.inline
  implicit class CommentMutableBuilder[Self <: Comment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthor(value: DisplayName): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    @scala.inline
    def setBlog(value: Id): Self = StObject.set(x, "blog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlogUndefined: Self = StObject.set(x, "blog", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInReplyTo(value: Id): Self = StObject.set(x, "inReplyTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInReplyToUndefined: Self = StObject.set(x, "inReplyTo", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPost(value: Id): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
    
    @scala.inline
    def setPublished(value: String): Self = StObject.set(x, "published", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedUndefined: Self = StObject.set(x, "published", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
  }
}
