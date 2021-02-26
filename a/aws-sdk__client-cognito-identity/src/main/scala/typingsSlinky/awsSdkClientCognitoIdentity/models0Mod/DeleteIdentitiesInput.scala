package typingsSlinky.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteIdentitiesInput extends StObject {
  
  /**
    * <p>A list of 1-60 identities that you want to delete.</p>
    */
  var IdentityIdsToDelete: js.UndefOr[js.Array[String]] = js.native
}
object DeleteIdentitiesInput {
  
  @scala.inline
  def apply(): DeleteIdentitiesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteIdentitiesInput]
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "DeleteIdentitiesInput.filterSensitiveLog")
  @js.native
  def filterSensitiveLog(obj: DeleteIdentitiesInput): js.Any = js.native
  
  @scala.inline
  implicit class DeleteIdentitiesInputMutableBuilder[Self <: DeleteIdentitiesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentityIdsToDelete(value: js.Array[String]): Self = StObject.set(x, "IdentityIdsToDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityIdsToDeleteUndefined: Self = StObject.set(x, "IdentityIdsToDelete", js.undefined)
    
    @scala.inline
    def setIdentityIdsToDeleteVarargs(value: String*): Self = StObject.set(x, "IdentityIdsToDelete", js.Array(value :_*))
  }
}
