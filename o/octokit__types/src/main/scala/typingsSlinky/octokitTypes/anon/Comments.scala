package typingsSlinky.octokitTypes.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Comments extends StObject {
  
  var comments: Double = js.native
  
  var comments_url: String = js.native
  
  var commits_url: String = js.native
  
  var created_at: String = js.native
  
  var description: String = js.native
  
  var files: StringDictionary[Filename] = js.native
  
  var forks_url: String = js.native
  
  var git_pull_url: String = js.native
  
  var git_push_url: String = js.native
  
  var html_url: String = js.native
  
  var id: String = js.native
  
  var node_id: String = js.native
  
  var owner: Avatarurl = js.native
  
  var public: Boolean = js.native
  
  var truncated: Boolean = js.native
  
  var updated_at: String = js.native
  
  var url: String = js.native
  
  var user: String = js.native
}
object Comments {
  
  @scala.inline
  def apply(
    comments: Double,
    comments_url: String,
    commits_url: String,
    created_at: String,
    description: String,
    files: StringDictionary[Filename],
    forks_url: String,
    git_pull_url: String,
    git_push_url: String,
    html_url: String,
    id: String,
    node_id: String,
    owner: Avatarurl,
    public: Boolean,
    truncated: Boolean,
    updated_at: String,
    url: String,
    user: String
  ): Comments = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], commits_url = commits_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], forks_url = forks_url.asInstanceOf[js.Any], git_pull_url = git_pull_url.asInstanceOf[js.Any], git_push_url = git_push_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], truncated = truncated.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comments]
  }
  
  @scala.inline
  implicit class CommentsMutableBuilder[Self <: Comments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComments(value: Double): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComments_url(value: String): Self = StObject.set(x, "comments_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommits_url(value: String): Self = StObject.set(x, "commits_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiles(value: StringDictionary[Filename]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForks_url(value: String): Self = StObject.set(x, "forks_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGit_pull_url(value: String): Self = StObject.set(x, "git_pull_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGit_push_url(value: String): Self = StObject.set(x, "git_push_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: Avatarurl): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTruncated(value: Boolean): Self = StObject.set(x, "truncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
