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

/* Inlined {  owner :string,   repo :string,   comment_id :number,   content :'+1' | '-1' | 'laugh' | 'confused' | 'heart' | 'hooray' | 'rocket' | 'eyes' | undefined,   per_page :number | undefined,   page :number | undefined} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'squirrel-girl'> */
@js.native
trait ReactionsListForCommitCommentEndpoint extends StObject {
  
  var comment_id: Double = js.native
  
  /**
    * Returns a single [reaction type](https://developer.github.com/v3/reactions/#reaction-types). Omit this parameter to list all reactions to a commit comment.
    */
  var content: js.UndefOr[Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes] = js.native
  
  var mediaType: `9` = js.native
  
  var owner: String = js.native
  
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.native
  
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.native
  
  var repo: String = js.native
}
object ReactionsListForCommitCommentEndpoint {
  
  @scala.inline
  def apply(comment_id: Double, mediaType: `9`, owner: String, repo: String): ReactionsListForCommitCommentEndpoint = {
    val __obj = js.Dynamic.literal(comment_id = comment_id.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactionsListForCommitCommentEndpoint]
  }
  
  @scala.inline
  implicit class ReactionsListForCommitCommentEndpointMutableBuilder[Self <: ReactionsListForCommitCommentEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment_id(value: Double): Self = StObject.set(x, "comment_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setMediaType(value: `9`): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
