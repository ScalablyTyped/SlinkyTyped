package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3Action extends StObject {
  
  /**
    * The Amazon S3 bucket.
    */
  var bucketName: BucketName = js.native
  
  /**
    * The Amazon S3 canned ACL that controls access to the object identified by the object key. For more information, see S3 canned ACLs.
    */
  var cannedAcl: js.UndefOr[CannedAccessControlList] = js.native
  
  /**
    * The object key. For more information, see Actions, resources, and condition keys for Amazon S3.
    */
  var key: Key = js.native
  
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: AwsArn = js.native
}
object S3Action {
  
  @scala.inline
  def apply(bucketName: BucketName, key: Key, roleArn: AwsArn): S3Action = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Action]
  }
  
  @scala.inline
  implicit class S3ActionMutableBuilder[Self <: S3Action] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketName(value: BucketName): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCannedAcl(value: CannedAccessControlList): Self = StObject.set(x, "cannedAcl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCannedAclUndefined: Self = StObject.set(x, "cannedAcl", js.undefined)
    
    @scala.inline
    def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: AwsArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
