package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTargetsForSecurityProfileRequest extends StObject {
  
  /**
    * The maximum number of results to return at one time.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * The security profile.
    */
  var securityProfileName: SecurityProfileName = js.native
}
object ListTargetsForSecurityProfileRequest {
  
  @scala.inline
  def apply(securityProfileName: SecurityProfileName): ListTargetsForSecurityProfileRequest = {
    val __obj = js.Dynamic.literal(securityProfileName = securityProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTargetsForSecurityProfileRequest]
  }
  
  @scala.inline
  implicit class ListTargetsForSecurityProfileRequestMutableBuilder[Self <: ListTargetsForSecurityProfileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setSecurityProfileName(value: SecurityProfileName): Self = StObject.set(x, "securityProfileName", value.asInstanceOf[js.Any])
  }
}
