package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.anon.Avatarurl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IssuesUpdateMilestoneResponseData extends StObject {
  
  var closed_at: String = js.native
  
  var closed_issues: Double = js.native
  
  var created_at: String = js.native
  
  var creator: Avatarurl = js.native
  
  var description: String = js.native
  
  var due_on: String = js.native
  
  var html_url: String = js.native
  
  var id: Double = js.native
  
  var labels_url: String = js.native
  
  var node_id: String = js.native
  
  var number: Double = js.native
  
  var open_issues: Double = js.native
  
  var state: String = js.native
  
  var title: String = js.native
  
  var updated_at: String = js.native
  
  var url: String = js.native
}
object IssuesUpdateMilestoneResponseData {
  
  @scala.inline
  def apply(
    closed_at: String,
    closed_issues: Double,
    created_at: String,
    creator: Avatarurl,
    description: String,
    due_on: String,
    html_url: String,
    id: Double,
    labels_url: String,
    node_id: String,
    number: Double,
    open_issues: Double,
    state: String,
    title: String,
    updated_at: String,
    url: String
  ): IssuesUpdateMilestoneResponseData = {
    val __obj = js.Dynamic.literal(closed_at = closed_at.asInstanceOf[js.Any], closed_issues = closed_issues.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], due_on = due_on.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], labels_url = labels_url.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], open_issues = open_issues.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesUpdateMilestoneResponseData]
  }
  
  @scala.inline
  implicit class IssuesUpdateMilestoneResponseDataMutableBuilder[Self <: IssuesUpdateMilestoneResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClosed_at(value: String): Self = StObject.set(x, "closed_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosed_issues(value: Double): Self = StObject.set(x, "closed_issues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Avatarurl): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDue_on(value: String): Self = StObject.set(x, "due_on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabels_url(value: String): Self = StObject.set(x, "labels_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen_issues(value: Double): Self = StObject.set(x, "open_issues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
