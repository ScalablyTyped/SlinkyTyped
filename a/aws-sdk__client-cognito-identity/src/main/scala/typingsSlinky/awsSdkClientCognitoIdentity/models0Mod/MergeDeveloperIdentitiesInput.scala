package typingsSlinky.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MergeDeveloperIdentitiesInput extends StObject {
  
  /**
    * <p>User identifier for the destination user. The value should be a
    *             <code>DeveloperUserIdentifier</code>.</p>
    */
  var DestinationUserIdentifier: js.UndefOr[String] = js.native
  
  /**
    * <p>The "domain" by which Cognito will refer to your users. This is a (pseudo) domain
    *          name that you provide while creating an identity pool. This name acts as a placeholder that
    *          allows your backend and the Cognito service to communicate about the developer provider.
    *          For the <code>DeveloperProviderName</code>, you can use letters as well as period (.),
    *          underscore (_), and dash (-).</p>
    */
  var DeveloperProviderName: js.UndefOr[String] = js.native
  
  /**
    * <p>An identity pool ID in the format REGION:GUID.</p>
    */
  var IdentityPoolId: js.UndefOr[String] = js.native
  
  /**
    * <p>User identifier for the source user. The value should be a
    *             <code>DeveloperUserIdentifier</code>.</p>
    */
  var SourceUserIdentifier: js.UndefOr[String] = js.native
}
object MergeDeveloperIdentitiesInput {
  
  @scala.inline
  def apply(): MergeDeveloperIdentitiesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeDeveloperIdentitiesInput]
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "MergeDeveloperIdentitiesInput.filterSensitiveLog")
  @js.native
  def filterSensitiveLog(obj: MergeDeveloperIdentitiesInput): js.Any = js.native
  
  @scala.inline
  implicit class MergeDeveloperIdentitiesInputMutableBuilder[Self <: MergeDeveloperIdentitiesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationUserIdentifier(value: String): Self = StObject.set(x, "DestinationUserIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUserIdentifierUndefined: Self = StObject.set(x, "DestinationUserIdentifier", js.undefined)
    
    @scala.inline
    def setDeveloperProviderName(value: String): Self = StObject.set(x, "DeveloperProviderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeveloperProviderNameUndefined: Self = StObject.set(x, "DeveloperProviderName", js.undefined)
    
    @scala.inline
    def setIdentityPoolId(value: String): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityPoolIdUndefined: Self = StObject.set(x, "IdentityPoolId", js.undefined)
    
    @scala.inline
    def setSourceUserIdentifier(value: String): Self = StObject.set(x, "SourceUserIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUserIdentifierUndefined: Self = StObject.set(x, "SourceUserIdentifier", js.undefined)
  }
}
