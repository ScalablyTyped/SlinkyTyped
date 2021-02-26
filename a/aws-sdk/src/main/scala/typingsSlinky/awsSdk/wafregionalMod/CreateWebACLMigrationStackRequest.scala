package typingsSlinky.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateWebACLMigrationStackRequest extends StObject {
  
  /**
    * Indicates whether to exclude entities that can't be migrated or to stop the migration. Set this to true to ignore unsupported entities in the web ACL during the migration. Otherwise, if AWS WAF encounters unsupported entities, it stops the process and throws an exception. 
    */
  var IgnoreUnsupportedType: typingsSlinky.awsSdk.wafregionalMod.IgnoreUnsupportedType = js.native
  
  /**
    * The name of the Amazon S3 bucket to store the CloudFormation template in. The S3 bucket must be configured as follows for the migration:    The bucket name must start with aws-waf-migration-. For example, aws-waf-migration-my-web-acl.   The bucket must be in the Region where you are deploying the template. For example, for a web ACL in us-west-2, you must use an Amazon S3 bucket in us-west-2 and you must deploy the template stack to us-west-2.    The bucket policies must permit the migration process to write data. For listings of the bucket policies, see the Examples section.   
    */
  var S3BucketName: typingsSlinky.awsSdk.wafregionalMod.S3BucketName = js.native
  
  /**
    * The UUID of the WAF Classic web ACL that you want to migrate to WAF v2.
    */
  var WebACLId: ResourceId = js.native
}
object CreateWebACLMigrationStackRequest {
  
  @scala.inline
  def apply(IgnoreUnsupportedType: IgnoreUnsupportedType, S3BucketName: S3BucketName, WebACLId: ResourceId): CreateWebACLMigrationStackRequest = {
    val __obj = js.Dynamic.literal(IgnoreUnsupportedType = IgnoreUnsupportedType.asInstanceOf[js.Any], S3BucketName = S3BucketName.asInstanceOf[js.Any], WebACLId = WebACLId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWebACLMigrationStackRequest]
  }
  
  @scala.inline
  implicit class CreateWebACLMigrationStackRequestMutableBuilder[Self <: CreateWebACLMigrationStackRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIgnoreUnsupportedType(value: IgnoreUnsupportedType): Self = StObject.set(x, "IgnoreUnsupportedType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BucketName(value: S3BucketName): Self = StObject.set(x, "S3BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebACLId(value: ResourceId): Self = StObject.set(x, "WebACLId", value.asInstanceOf[js.Any])
  }
}
