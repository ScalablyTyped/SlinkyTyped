package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.anon.Avatarurl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactionsCreateForTeamDiscussionCommentInOrgResponseData extends js.Object {
  
  var content: String = js.native
  
  var created_at: String = js.native
  
  var id: Double = js.native
  
  var node_id: String = js.native
  
  var user: Avatarurl = js.native
}
object ReactionsCreateForTeamDiscussionCommentInOrgResponseData {
  
  @scala.inline
  def apply(content: String, created_at: String, id: Double, node_id: String, user: Avatarurl): ReactionsCreateForTeamDiscussionCommentInOrgResponseData = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactionsCreateForTeamDiscussionCommentInOrgResponseData]
  }
  
  @scala.inline
  implicit class ReactionsCreateForTeamDiscussionCommentInOrgResponseDataOps[Self <: ReactionsCreateForTeamDiscussionCommentInOrgResponseData] (val x: Self) extends AnyVal {
    
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode_id(value: String): Self = this.set("node_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: Avatarurl): Self = this.set("user", value.asInstanceOf[js.Any])
  }
}
