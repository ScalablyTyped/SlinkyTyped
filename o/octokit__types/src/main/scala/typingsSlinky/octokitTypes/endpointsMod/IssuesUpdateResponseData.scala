package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.anon.Avatarurl
import typingsSlinky.octokitTypes.anon.Closedat
import typingsSlinky.octokitTypes.anon.Color
import typingsSlinky.octokitTypes.anon.Diffurl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IssuesUpdateResponseData extends StObject {
  
  var active_lock_reason: String = js.native
  
  var assignee: Avatarurl = js.native
  
  var assignees: js.Array[Avatarurl] = js.native
  
  var body: String = js.native
  
  var closed_at: String = js.native
  
  var closed_by: Avatarurl = js.native
  
  var comments: Double = js.native
  
  var comments_url: String = js.native
  
  var created_at: String = js.native
  
  var events_url: String = js.native
  
  var html_url: String = js.native
  
  var id: Double = js.native
  
  var labels: js.Array[Color] = js.native
  
  var labels_url: String = js.native
  
  var locked: Boolean = js.native
  
  var milestone: Closedat = js.native
  
  var node_id: String = js.native
  
  var number: Double = js.native
  
  var pull_request: Diffurl = js.native
  
  var repository_url: String = js.native
  
  var state: String = js.native
  
  var title: String = js.native
  
  var updated_at: String = js.native
  
  var url: String = js.native
  
  var user: Avatarurl = js.native
}
object IssuesUpdateResponseData {
  
  @scala.inline
  def apply(
    active_lock_reason: String,
    assignee: Avatarurl,
    assignees: js.Array[Avatarurl],
    body: String,
    closed_at: String,
    closed_by: Avatarurl,
    comments: Double,
    comments_url: String,
    created_at: String,
    events_url: String,
    html_url: String,
    id: Double,
    labels: js.Array[Color],
    labels_url: String,
    locked: Boolean,
    milestone: Closedat,
    node_id: String,
    number: Double,
    pull_request: Diffurl,
    repository_url: String,
    state: String,
    title: String,
    updated_at: String,
    url: String,
    user: Avatarurl
  ): IssuesUpdateResponseData = {
    val __obj = js.Dynamic.literal(active_lock_reason = active_lock_reason.asInstanceOf[js.Any], assignee = assignee.asInstanceOf[js.Any], assignees = assignees.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], closed_at = closed_at.asInstanceOf[js.Any], closed_by = closed_by.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], labels_url = labels_url.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], milestone = milestone.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], pull_request = pull_request.asInstanceOf[js.Any], repository_url = repository_url.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesUpdateResponseData]
  }
  
  @scala.inline
  implicit class IssuesUpdateResponseDataMutableBuilder[Self <: IssuesUpdateResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive_lock_reason(value: String): Self = StObject.set(x, "active_lock_reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignee(value: Avatarurl): Self = StObject.set(x, "assignee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignees(value: js.Array[Avatarurl]): Self = StObject.set(x, "assignees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssigneesVarargs(value: Avatarurl*): Self = StObject.set(x, "assignees", js.Array(value :_*))
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosed_at(value: String): Self = StObject.set(x, "closed_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosed_by(value: Avatarurl): Self = StObject.set(x, "closed_by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComments(value: Double): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComments_url(value: String): Self = StObject.set(x, "comments_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvents_url(value: String): Self = StObject.set(x, "events_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabels(value: js.Array[Color]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsVarargs(value: Color*): Self = StObject.set(x, "labels", js.Array(value :_*))
    
    @scala.inline
    def setLabels_url(value: String): Self = StObject.set(x, "labels_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMilestone(value: Closedat): Self = StObject.set(x, "milestone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPull_request(value: Diffurl): Self = StObject.set(x, "pull_request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepository_url(value: String): Self = StObject.set(x, "repository_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: Avatarurl): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
