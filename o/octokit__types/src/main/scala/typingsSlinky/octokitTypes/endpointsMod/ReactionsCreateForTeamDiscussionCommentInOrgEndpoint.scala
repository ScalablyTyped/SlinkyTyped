package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.anon.`9`
import typingsSlinky.octokitTypes.octokitTypesStrings.Plussign1
import typingsSlinky.octokitTypes.octokitTypesStrings.`-1`
import typingsSlinky.octokitTypes.octokitTypesStrings.confused
import typingsSlinky.octokitTypes.octokitTypesStrings.eyes
import typingsSlinky.octokitTypes.octokitTypesStrings.heart
import typingsSlinky.octokitTypes.octokitTypesStrings.hooray
import typingsSlinky.octokitTypes.octokitTypesStrings.laugh
import typingsSlinky.octokitTypes.octokitTypesStrings.rocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  org :string,   team_slug :string,   discussion_number :number,   comment_number :number,   content :'+1' | '-1' | 'laugh' | 'confused' | 'heart' | 'hooray' | 'rocket' | 'eyes'} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'squirrel-girl'> */
@js.native
trait ReactionsCreateForTeamDiscussionCommentInOrgEndpoint extends StObject {
  
  var comment_number: Double = js.native
  
  /**
    * The [reaction type](https://developer.github.com/v3/reactions/#reaction-types) to add to the team discussion comment.
    */
  var content: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes = js.native
  
  var discussion_number: Double = js.native
  
  var mediaType: `9` = js.native
  
  @JSName("org")
  var org_ : String = js.native
  
  var team_slug: String = js.native
}
object ReactionsCreateForTeamDiscussionCommentInOrgEndpoint {
  
  @scala.inline
  def apply(
    comment_number: Double,
    content: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes,
    discussion_number: Double,
    mediaType: `9`,
    org_ : String,
    team_slug: String
  ): ReactionsCreateForTeamDiscussionCommentInOrgEndpoint = {
    val __obj = js.Dynamic.literal(comment_number = comment_number.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactionsCreateForTeamDiscussionCommentInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ReactionsCreateForTeamDiscussionCommentInOrgEndpointMutableBuilder[Self <: ReactionsCreateForTeamDiscussionCommentInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment_number(value: Double): Self = StObject.set(x, "comment_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscussion_number(value: Double): Self = StObject.set(x, "discussion_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaType(value: `9`): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeam_slug(value: String): Self = StObject.set(x, "team_slug", value.asInstanceOf[js.Any])
  }
}
