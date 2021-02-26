package typingsSlinky.awsSdk.cognitoidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteIdentitiesResponse extends StObject {
  
  /**
    * An array of UnprocessedIdentityId objects, each of which contains an ErrorCode and IdentityId.
    */
  var UnprocessedIdentityIds: js.UndefOr[UnprocessedIdentityIdList] = js.native
}
object DeleteIdentitiesResponse {
  
  @scala.inline
  def apply(): DeleteIdentitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteIdentitiesResponse]
  }
  
  @scala.inline
  implicit class DeleteIdentitiesResponseMutableBuilder[Self <: DeleteIdentitiesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnprocessedIdentityIds(value: UnprocessedIdentityIdList): Self = StObject.set(x, "UnprocessedIdentityIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnprocessedIdentityIdsUndefined: Self = StObject.set(x, "UnprocessedIdentityIds", js.undefined)
    
    @scala.inline
    def setUnprocessedIdentityIdsVarargs(value: UnprocessedIdentityId*): Self = StObject.set(x, "UnprocessedIdentityIds", js.Array(value :_*))
  }
}
