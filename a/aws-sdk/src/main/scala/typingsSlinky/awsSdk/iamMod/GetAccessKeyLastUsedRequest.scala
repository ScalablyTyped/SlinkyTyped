package typingsSlinky.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAccessKeyLastUsedRequest extends StObject {
  
  /**
    * The identifier of an access key. This parameter allows (through its regex pattern) a string of characters that can consist of any upper or lowercased letter or digit.
    */
  var AccessKeyId: accessKeyIdType = js.native
}
object GetAccessKeyLastUsedRequest {
  
  @scala.inline
  def apply(AccessKeyId: accessKeyIdType): GetAccessKeyLastUsedRequest = {
    val __obj = js.Dynamic.literal(AccessKeyId = AccessKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccessKeyLastUsedRequest]
  }
  
  @scala.inline
  implicit class GetAccessKeyLastUsedRequestMutableBuilder[Self <: GetAccessKeyLastUsedRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessKeyId(value: accessKeyIdType): Self = StObject.set(x, "AccessKeyId", value.asInstanceOf[js.Any])
  }
}
