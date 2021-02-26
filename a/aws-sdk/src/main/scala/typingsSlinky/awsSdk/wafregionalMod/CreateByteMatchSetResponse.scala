package typingsSlinky.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateByteMatchSetResponse extends StObject {
  
  /**
    * A ByteMatchSet that contains no ByteMatchTuple objects.
    */
  var ByteMatchSet: js.UndefOr[typingsSlinky.awsSdk.wafregionalMod.ByteMatchSet] = js.native
  
  /**
    * The ChangeToken that you used to submit the CreateByteMatchSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typingsSlinky.awsSdk.wafregionalMod.ChangeToken] = js.native
}
object CreateByteMatchSetResponse {
  
  @scala.inline
  def apply(): CreateByteMatchSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateByteMatchSetResponse]
  }
  
  @scala.inline
  implicit class CreateByteMatchSetResponseMutableBuilder[Self <: CreateByteMatchSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setByteMatchSet(value: ByteMatchSet): Self = StObject.set(x, "ByteMatchSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByteMatchSetUndefined: Self = StObject.set(x, "ByteMatchSet", js.undefined)
    
    @scala.inline
    def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeTokenUndefined: Self = StObject.set(x, "ChangeToken", js.undefined)
  }
}
