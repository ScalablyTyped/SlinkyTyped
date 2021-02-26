package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.anon.`4`
import typingsSlinky.octokitTypes.octokitTypesStrings.collaborators_only
import typingsSlinky.octokitTypes.octokitTypesStrings.contributors_only
import typingsSlinky.octokitTypes.octokitTypesStrings.existing_users
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  owner :string,   repo :string,   limit :'existing_users' | 'contributors_only' | 'collaborators_only'} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'sombra'> */
@js.native
trait InteractionsSetRestrictionsForRepoEndpoint extends StObject {
  
  /**
    * Specifies the group of GitHub users who can comment, open issues, or create pull requests for the given repository. Must be one of: `existing_users`, `contributors_only`, or `collaborators_only`.
    */
  var limit: existing_users | contributors_only | collaborators_only = js.native
  
  var mediaType: `4` = js.native
  
  var owner: String = js.native
  
  var repo: String = js.native
}
object InteractionsSetRestrictionsForRepoEndpoint {
  
  @scala.inline
  def apply(
    limit: existing_users | contributors_only | collaborators_only,
    mediaType: `4`,
    owner: String,
    repo: String
  ): InteractionsSetRestrictionsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionsSetRestrictionsForRepoEndpoint]
  }
  
  @scala.inline
  implicit class InteractionsSetRestrictionsForRepoEndpointMutableBuilder[Self <: InteractionsSetRestrictionsForRepoEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: existing_users | contributors_only | collaborators_only): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaType(value: `4`): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
