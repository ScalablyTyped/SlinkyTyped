package typingsSlinky.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSecurityKeysResponse extends StObject {
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.connectMod.NextToken] = js.native
  
  /**
    * The security keys.
    */
  var SecurityKeys: js.UndefOr[SecurityKeysList] = js.native
}
object ListSecurityKeysResponse {
  
  @scala.inline
  def apply(): ListSecurityKeysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSecurityKeysResponse]
  }
  
  @scala.inline
  implicit class ListSecurityKeysResponseMutableBuilder[Self <: ListSecurityKeysResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSecurityKeys(value: SecurityKeysList): Self = StObject.set(x, "SecurityKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityKeysUndefined: Self = StObject.set(x, "SecurityKeys", js.undefined)
    
    @scala.inline
    def setSecurityKeysVarargs(value: SecurityKey*): Self = StObject.set(x, "SecurityKeys", js.Array(value :_*))
  }
}
