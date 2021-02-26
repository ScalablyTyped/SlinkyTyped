package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.anon.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  owner :string,   repo :string} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'sombra'> */
@js.native
trait InteractionsRemoveRestrictionsForRepoEndpoint extends StObject {
  
  var mediaType: `4` = js.native
  
  var owner: String = js.native
  
  var repo: String = js.native
}
object InteractionsRemoveRestrictionsForRepoEndpoint {
  
  @scala.inline
  def apply(mediaType: `4`, owner: String, repo: String): InteractionsRemoveRestrictionsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionsRemoveRestrictionsForRepoEndpoint]
  }
  
  @scala.inline
  implicit class InteractionsRemoveRestrictionsForRepoEndpointMutableBuilder[Self <: InteractionsRemoveRestrictionsForRepoEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMediaType(value: `4`): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
