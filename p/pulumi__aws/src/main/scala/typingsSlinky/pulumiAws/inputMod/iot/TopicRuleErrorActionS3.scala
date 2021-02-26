package typingsSlinky.pulumiAws.inputMod.iot

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicRuleErrorActionS3 extends StObject {
  
  /**
    * The Amazon S3 bucket name.
    */
  var bucketName: Input[String] = js.native
  
  /**
    * The object key.
    */
  var key: Input[String] = js.native
  
  /**
    * The IAM role ARN that allows access to the CloudWatch alarm.
    */
  var roleArn: Input[String] = js.native
}
object TopicRuleErrorActionS3 {
  
  @scala.inline
  def apply(bucketName: Input[String], key: Input[String], roleArn: Input[String]): TopicRuleErrorActionS3 = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleErrorActionS3]
  }
  
  @scala.inline
  implicit class TopicRuleErrorActionS3MutableBuilder[Self <: TopicRuleErrorActionS3] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketName(value: Input[String]): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: Input[String]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
