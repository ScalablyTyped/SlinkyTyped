package typingsSlinky.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamsUpdateDiscussionCommentInOrgEndpoint extends StObject {
  
  /**
    * The discussion comment's body text.
    */
  var body: String = js.native
  
  var comment_number: Double = js.native
  
  var discussion_number: Double = js.native
  
  @JSName("org")
  var org_ : String = js.native
  
  var team_slug: String = js.native
}
object TeamsUpdateDiscussionCommentInOrgEndpoint {
  
  @scala.inline
  def apply(body: String, comment_number: Double, discussion_number: Double, org_ : String, team_slug: String): TeamsUpdateDiscussionCommentInOrgEndpoint = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], comment_number = comment_number.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsUpdateDiscussionCommentInOrgEndpoint]
  }
  
  @scala.inline
  implicit class TeamsUpdateDiscussionCommentInOrgEndpointMutableBuilder[Self <: TeamsUpdateDiscussionCommentInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment_number(value: Double): Self = StObject.set(x, "comment_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscussion_number(value: Double): Self = StObject.set(x, "discussion_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeam_slug(value: String): Self = StObject.set(x, "team_slug", value.asInstanceOf[js.Any])
  }
}
