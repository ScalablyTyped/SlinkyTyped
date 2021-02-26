package typingsSlinky.awsSdk.cognitosyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkPublishRequest extends StObject {
  
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
    */
  var IdentityPoolId: typingsSlinky.awsSdk.cognitosyncMod.IdentityPoolId = js.native
}
object BulkPublishRequest {
  
  @scala.inline
  def apply(IdentityPoolId: IdentityPoolId): BulkPublishRequest = {
    val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkPublishRequest]
  }
  
  @scala.inline
  implicit class BulkPublishRequestMutableBuilder[Self <: BulkPublishRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentityPoolId(value: IdentityPoolId): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
  }
}
