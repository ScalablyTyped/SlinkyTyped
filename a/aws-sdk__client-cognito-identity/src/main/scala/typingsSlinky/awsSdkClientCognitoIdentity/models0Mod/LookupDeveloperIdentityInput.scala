package typingsSlinky.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LookupDeveloperIdentityInput extends StObject {
  
  /**
    * <p>A unique ID used by your backend authentication process to identify a user.
    *          Typically, a developer identity provider would issue many developer user identifiers, in
    *          keeping with the number of users.</p>
    */
  var DeveloperUserIdentifier: js.UndefOr[String] = js.native
  
  /**
    * <p>A unique identifier in the format REGION:GUID.</p>
    */
  var IdentityId: js.UndefOr[String] = js.native
  
  /**
    * <p>An identity pool ID in the format REGION:GUID.</p>
    */
  var IdentityPoolId: js.UndefOr[String] = js.native
  
  /**
    * <p>The maximum number of identities to return.</p>
    */
  var MaxResults: js.UndefOr[Double] = js.native
  
  /**
    * <p>A pagination token. The first call you make will have <code>NextToken</code> set to
    *          null. After that the service will return <code>NextToken</code> values as needed. For
    *          example, let's say you make a request with <code>MaxResults</code> set to 10, and there are
    *          20 matches in the database. The service will return a pagination token as a part of the
    *          response. This token can be used to call the API again and get results starting from the
    *          11th match.</p>
    */
  var NextToken: js.UndefOr[String] = js.native
}
object LookupDeveloperIdentityInput {
  
  @scala.inline
  def apply(): LookupDeveloperIdentityInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LookupDeveloperIdentityInput]
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "LookupDeveloperIdentityInput.filterSensitiveLog")
  @js.native
  def filterSensitiveLog(obj: LookupDeveloperIdentityInput): js.Any = js.native
  
  @scala.inline
  implicit class LookupDeveloperIdentityInputMutableBuilder[Self <: LookupDeveloperIdentityInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeveloperUserIdentifier(value: String): Self = StObject.set(x, "DeveloperUserIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeveloperUserIdentifierUndefined: Self = StObject.set(x, "DeveloperUserIdentifier", js.undefined)
    
    @scala.inline
    def setIdentityId(value: String): Self = StObject.set(x, "IdentityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityIdUndefined: Self = StObject.set(x, "IdentityId", js.undefined)
    
    @scala.inline
    def setIdentityPoolId(value: String): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityPoolIdUndefined: Self = StObject.set(x, "IdentityPoolId", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
