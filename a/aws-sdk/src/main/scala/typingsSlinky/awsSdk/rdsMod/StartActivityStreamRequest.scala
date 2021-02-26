package typingsSlinky.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartActivityStreamRequest extends StObject {
  
  /**
    * Specifies whether or not the database activity stream is to start as soon as possible, regardless of the maintenance window for the database.
    */
  var ApplyImmediately: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * The AWS KMS key identifier for encrypting messages in the database activity stream. The key identifier can be either a key ID, a key ARN, or a key alias.
    */
  var KmsKeyId: String = js.native
  
  /**
    * Specifies the mode of the database activity stream. Database events such as a change or access generate an activity stream event. The database session can handle these events either synchronously or asynchronously. 
    */
  var Mode: ActivityStreamMode = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the DB cluster, for example arn:aws:rds:us-east-1:12345667890:cluster:das-cluster.
    */
  var ResourceArn: String = js.native
}
object StartActivityStreamRequest {
  
  @scala.inline
  def apply(KmsKeyId: String, Mode: ActivityStreamMode, ResourceArn: String): StartActivityStreamRequest = {
    val __obj = js.Dynamic.literal(KmsKeyId = KmsKeyId.asInstanceOf[js.Any], Mode = Mode.asInstanceOf[js.Any], ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartActivityStreamRequest]
  }
  
  @scala.inline
  implicit class StartActivityStreamRequestMutableBuilder[Self <: StartActivityStreamRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplyImmediately(value: BooleanOptional): Self = StObject.set(x, "ApplyImmediately", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyImmediatelyUndefined: Self = StObject.set(x, "ApplyImmediately", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: ActivityStreamMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArn(value: String): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
