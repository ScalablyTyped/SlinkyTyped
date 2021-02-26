package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.anon.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  org :string,   team_slug :string,   discussion_number :number,   comment_number :number,   reaction_id :number} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'squirrel-girl'> */
@js.native
trait ReactionsDeleteForTeamDiscussionCommentEndpoint extends StObject {
  
  var comment_number: Double = js.native
  
  var discussion_number: Double = js.native
  
  var mediaType: `9` = js.native
  
  @JSName("org")
  var org_ : String = js.native
  
  var reaction_id: Double = js.native
  
  var team_slug: String = js.native
}
object ReactionsDeleteForTeamDiscussionCommentEndpoint {
  
  @scala.inline
  def apply(
    comment_number: Double,
    discussion_number: Double,
    mediaType: `9`,
    org_ : String,
    reaction_id: Double,
    team_slug: String
  ): ReactionsDeleteForTeamDiscussionCommentEndpoint = {
    val __obj = js.Dynamic.literal(comment_number = comment_number.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], reaction_id = reaction_id.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactionsDeleteForTeamDiscussionCommentEndpoint]
  }
  
  @scala.inline
  implicit class ReactionsDeleteForTeamDiscussionCommentEndpointMutableBuilder[Self <: ReactionsDeleteForTeamDiscussionCommentEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment_number(value: Double): Self = StObject.set(x, "comment_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscussion_number(value: Double): Self = StObject.set(x, "discussion_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaType(value: `9`): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReaction_id(value: Double): Self = StObject.set(x, "reaction_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeam_slug(value: String): Self = StObject.set(x, "team_slug", value.asInstanceOf[js.Any])
  }
}
