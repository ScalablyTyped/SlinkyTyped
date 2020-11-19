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

/* Inlined {  owner :string,   repo :string,   comment_id :number,   content :'+1' | '-1' | 'laugh' | 'confused' | 'heart' | 'hooray' | 'rocket' | 'eyes'} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'squirrel-girl'> */
@js.native
trait ReactionsCreateForIssueCommentEndpoint extends js.Object {
  
  var comment_id: Double = js.native
  
  /**
    * The [reaction type](https://developer.github.com/v3/reactions/#reaction-types) to add to the issue comment.
    */
  var content: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes = js.native
  
  var mediaType: `10` = js.native
  
  var owner: String = js.native
  
  var repo: String = js.native
}
object ReactionsCreateForIssueCommentEndpoint {
  
  @scala.inline
  def apply(
    comment_id: Double,
    content: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes,
    mediaType: `10`,
    owner: String,
    repo: String
  ): ReactionsCreateForIssueCommentEndpoint = {
    val __obj = js.Dynamic.literal(comment_id = comment_id.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactionsCreateForIssueCommentEndpoint]
  }
  
  @scala.inline
  implicit class ReactionsCreateForIssueCommentEndpointOps[Self <: ReactionsCreateForIssueCommentEndpoint] (val x: Self) extends AnyVal {
    
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
    def setComment_id(value: Double): Self = this.set("comment_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaType(value: `10`): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
  }
}
