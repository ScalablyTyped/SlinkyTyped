package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.anon.`14`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  owner :string,   repo :string} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'london'> */
@js.native
trait ReposDisableAutomatedSecurityFixesEndpoint extends StObject {
  
  var mediaType: `14` = js.native
  
  var owner: String = js.native
  
  var repo: String = js.native
}
object ReposDisableAutomatedSecurityFixesEndpoint {
  
  @scala.inline
  def apply(mediaType: `14`, owner: String, repo: String): ReposDisableAutomatedSecurityFixesEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposDisableAutomatedSecurityFixesEndpoint]
  }
  
  @scala.inline
  implicit class ReposDisableAutomatedSecurityFixesEndpointMutableBuilder[Self <: ReposDisableAutomatedSecurityFixesEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMediaType(value: `14`): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
