package typingsSlinky.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamsUpdateDiscussionInOrgEndpoint extends StObject {
  
  /**
    * The discussion post's body text.
    */
  var body: js.UndefOr[String] = js.native
  
  var discussion_number: Double = js.native
  
  @JSName("org")
  var org_ : String = js.native
  
  var team_slug: String = js.native
  
  /**
    * The discussion post's title.
    */
  var title: js.UndefOr[String] = js.native
}
object TeamsUpdateDiscussionInOrgEndpoint {
  
  @scala.inline
  def apply(discussion_number: Double, org_ : String, team_slug: String): TeamsUpdateDiscussionInOrgEndpoint = {
    val __obj = js.Dynamic.literal(discussion_number = discussion_number.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsUpdateDiscussionInOrgEndpoint]
  }
  
  @scala.inline
  implicit class TeamsUpdateDiscussionInOrgEndpointMutableBuilder[Self <: TeamsUpdateDiscussionInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setDiscussion_number(value: Double): Self = StObject.set(x, "discussion_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeam_slug(value: String): Self = StObject.set(x, "team_slug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
