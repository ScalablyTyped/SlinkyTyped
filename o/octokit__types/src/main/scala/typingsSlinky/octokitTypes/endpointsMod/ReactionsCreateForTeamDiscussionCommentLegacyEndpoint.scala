package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.anon.`10`
import typingsSlinky.octokitTypes.octokitTypesStrings.Plussign1
import typingsSlinky.octokitTypes.octokitTypesStrings.`-1`
import typingsSlinky.octokitTypes.octokitTypesStrings.confused
import typingsSlinky.octokitTypes.octokitTypesStrings.eyes
import typingsSlinky.octokitTypes.octokitTypesStrings.heart
import typingsSlinky.octokitTypes.octokitTypesStrings.hooray
import typingsSlinky.octokitTypes.octokitTypesStrings.laugh
import typingsSlinky.octokitTypes.octokitTypesStrings.rocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  team_id :number,   discussion_number :number,   comment_number :number,   content :'+1' | '-1' | 'laugh' | 'confused' | 'heart' | 'hooray' | 'rocket' | 'eyes'} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'squirrel-girl'> */
@js.native
trait ReactionsCreateForTeamDiscussionCommentLegacyEndpoint extends js.Object {
  
  var comment_number: Double = js.native
  
  /**
    * The [reaction type](https://developer.github.com/v3/reactions/#reaction-types) to add to the team discussion comment.
    */
  var content: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes = js.native
  
  var discussion_number: Double = js.native
  
  var mediaType: `10` = js.native
  
  var team_id: Double = js.native
}
object ReactionsCreateForTeamDiscussionCommentLegacyEndpoint {
  
  @scala.inline
  def apply(
    comment_number: Double,
    content: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes,
    discussion_number: Double,
    mediaType: `10`,
    team_id: Double
  ): ReactionsCreateForTeamDiscussionCommentLegacyEndpoint = {
    val __obj = js.Dynamic.literal(comment_number = comment_number.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactionsCreateForTeamDiscussionCommentLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ReactionsCreateForTeamDiscussionCommentLegacyEndpointOps[Self <: ReactionsCreateForTeamDiscussionCommentLegacyEndpoint] (val x: Self) extends AnyVal {
    
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
    def setComment_number(value: Double): Self = this.set("comment_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscussion_number(value: Double): Self = this.set("discussion_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaType(value: `10`): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeam_id(value: Double): Self = this.set("team_id", value.asInstanceOf[js.Any])
  }
}
