package typingsSlinky.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteImagePermissionsRequest extends StObject {
  
  /**
    * The name of the private image.
    */
  var Name: typingsSlinky.awsSdk.appstreamMod.Name = js.native
  
  /**
    * The 12-digit identifier of the AWS account for which to delete image permissions.
    */
  var SharedAccountId: AwsAccountId = js.native
}
object DeleteImagePermissionsRequest {
  
  @scala.inline
  def apply(Name: Name, SharedAccountId: AwsAccountId): DeleteImagePermissionsRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SharedAccountId = SharedAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteImagePermissionsRequest]
  }
  
  @scala.inline
  implicit class DeleteImagePermissionsRequestMutableBuilder[Self <: DeleteImagePermissionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedAccountId(value: AwsAccountId): Self = StObject.set(x, "SharedAccountId", value.asInstanceOf[js.Any])
  }
}
