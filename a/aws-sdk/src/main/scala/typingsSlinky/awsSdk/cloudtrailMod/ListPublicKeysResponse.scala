package typingsSlinky.awsSdk.cloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPublicKeysResponse extends StObject {
  
  /**
    * Reserved for future use.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * Contains an array of PublicKey objects.  The returned public keys may have validity time ranges that overlap. 
    */
  var PublicKeyList: js.UndefOr[typingsSlinky.awsSdk.cloudtrailMod.PublicKeyList] = js.native
}
object ListPublicKeysResponse {
  
  @scala.inline
  def apply(): ListPublicKeysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPublicKeysResponse]
  }
  
  @scala.inline
  implicit class ListPublicKeysResponseMutableBuilder[Self <: ListPublicKeysResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPublicKeyList(value: PublicKeyList): Self = StObject.set(x, "PublicKeyList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeyListUndefined: Self = StObject.set(x, "PublicKeyList", js.undefined)
    
    @scala.inline
    def setPublicKeyListVarargs(value: PublicKey*): Self = StObject.set(x, "PublicKeyList", js.Array(value :_*))
  }
}
