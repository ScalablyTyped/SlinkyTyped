package typingsSlinky.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.octokitTypes.anon.Avatarurl
import typingsSlinky.octokitTypes.anon.Changestatus
import typingsSlinky.octokitTypes.anon.Dictk
import typingsSlinky.octokitTypes.anon.Updatedat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GistsUpdateResponseData extends js.Object {
  
  var comments: Double = js.native
  
  var comments_url: String = js.native
  
  var commits_url: String = js.native
  
  var created_at: String = js.native
  
  var description: String = js.native
  
  var files: StringDictionary[Dictk] = js.native
  
  var forks: js.Array[Updatedat] = js.native
  
  var forks_url: String = js.native
  
  var git_pull_url: String = js.native
  
  var git_push_url: String = js.native
  
  var history: js.Array[Changestatus] = js.native
  
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
object GistsUpdateResponseData {
  
  @scala.inline
  def apply(
    comments: Double,
    comments_url: String,
    commits_url: String,
    created_at: String,
    description: String,
    files: StringDictionary[Dictk],
    forks: js.Array[Updatedat],
    forks_url: String,
    git_pull_url: String,
    git_push_url: String,
    history: js.Array[Changestatus],
    html_url: String,
    id: String,
    node_id: String,
    owner: Avatarurl,
    public: Boolean,
    truncated: Boolean,
    updated_at: String,
    url: String,
    user: String
  ): GistsUpdateResponseData = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], commits_url = commits_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], forks = forks.asInstanceOf[js.Any], forks_url = forks_url.asInstanceOf[js.Any], git_pull_url = git_pull_url.asInstanceOf[js.Any], git_push_url = git_push_url.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], truncated = truncated.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsUpdateResponseData]
  }
  
  @scala.inline
  implicit class GistsUpdateResponseDataOps[Self <: GistsUpdateResponseData] (val x: Self) extends AnyVal {
    
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
    def setComments(value: Double): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComments_url(value: String): Self = this.set("comments_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommits_url(value: String): Self = this.set("commits_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiles(value: StringDictionary[Dictk]): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForksVarargs(value: Updatedat*): Self = this.set("forks", js.Array(value :_*))
    
    @scala.inline
    def setForks(value: js.Array[Updatedat]): Self = this.set("forks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForks_url(value: String): Self = this.set("forks_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGit_pull_url(value: String): Self = this.set("git_pull_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGit_push_url(value: String): Self = this.set("git_push_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryVarargs(value: Changestatus*): Self = this.set("history", js.Array(value :_*))
    
    @scala.inline
    def setHistory(value: js.Array[Changestatus]): Self = this.set("history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml_url(value: String): Self = this.set("html_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode_id(value: String): Self = this.set("node_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: Avatarurl): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublic(value: Boolean): Self = this.set("public", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTruncated(value: Boolean): Self = this.set("truncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated_at(value: String): Self = this.set("updated_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
  }
}
