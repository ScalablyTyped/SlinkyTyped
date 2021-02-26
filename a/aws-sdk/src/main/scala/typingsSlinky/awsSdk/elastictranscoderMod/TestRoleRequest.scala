package typingsSlinky.awsSdk.elastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestRoleRequest extends StObject {
  
  /**
    * The Amazon S3 bucket that contains media files to be transcoded. The action attempts to read from this bucket.
    */
  var InputBucket: BucketName = js.native
  
  /**
    * The Amazon S3 bucket that Elastic Transcoder writes transcoded media files to. The action attempts to read from this bucket.
    */
  var OutputBucket: BucketName = js.native
  
  /**
    * The IAM Amazon Resource Name (ARN) for the role that you want Elastic Transcoder to test.
    */
  var Role: typingsSlinky.awsSdk.elastictranscoderMod.Role = js.native
  
  /**
    * The ARNs of one or more Amazon Simple Notification Service (Amazon SNS) topics that you want the action to send a test notification to.
    */
  var Topics: SnsTopics = js.native
}
object TestRoleRequest {
  
  @scala.inline
  def apply(InputBucket: BucketName, OutputBucket: BucketName, Role: Role, Topics: SnsTopics): TestRoleRequest = {
    val __obj = js.Dynamic.literal(InputBucket = InputBucket.asInstanceOf[js.Any], OutputBucket = OutputBucket.asInstanceOf[js.Any], Role = Role.asInstanceOf[js.Any], Topics = Topics.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestRoleRequest]
  }
  
  @scala.inline
  implicit class TestRoleRequestMutableBuilder[Self <: TestRoleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputBucket(value: BucketName): Self = StObject.set(x, "InputBucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputBucket(value: BucketName): Self = StObject.set(x, "OutputBucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: Role): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopics(value: SnsTopics): Self = StObject.set(x, "Topics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicsVarargs(value: SnsTopic*): Self = StObject.set(x, "Topics", js.Array(value :_*))
  }
}
