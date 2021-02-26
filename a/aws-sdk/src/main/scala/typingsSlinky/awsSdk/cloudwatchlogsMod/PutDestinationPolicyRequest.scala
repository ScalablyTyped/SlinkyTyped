package typingsSlinky.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutDestinationPolicyRequest extends StObject {
  
  /**
    * An IAM policy document that authorizes cross-account users to deliver their log events to the associated destination. This can be up to 5120 bytes.
    */
  var accessPolicy: AccessPolicy = js.native
  
  /**
    * A name for an existing destination.
    */
  var destinationName: DestinationName = js.native
}
object PutDestinationPolicyRequest {
  
  @scala.inline
  def apply(accessPolicy: AccessPolicy, destinationName: DestinationName): PutDestinationPolicyRequest = {
    val __obj = js.Dynamic.literal(accessPolicy = accessPolicy.asInstanceOf[js.Any], destinationName = destinationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutDestinationPolicyRequest]
  }
  
  @scala.inline
  implicit class PutDestinationPolicyRequestMutableBuilder[Self <: PutDestinationPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessPolicy(value: AccessPolicy): Self = StObject.set(x, "accessPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationName(value: DestinationName): Self = StObject.set(x, "destinationName", value.asInstanceOf[js.Any])
  }
}
