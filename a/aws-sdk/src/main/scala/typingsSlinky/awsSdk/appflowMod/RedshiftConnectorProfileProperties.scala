package typingsSlinky.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedshiftConnectorProfileProperties extends StObject {
  
  /**
    *  A name for the associated Amazon S3 bucket. 
    */
  var bucketName: BucketName = js.native
  
  /**
    *  The object key for the destination bucket in which Amazon AppFlow places the files. 
    */
  var bucketPrefix: js.UndefOr[BucketPrefix] = js.native
  
  /**
    *  The JDBC URL of the Amazon Redshift cluster. 
    */
  var databaseUrl: DatabaseUrl = js.native
  
  /**
    *  The Amazon Resource Name (ARN) of the IAM role. 
    */
  var roleArn: RoleArn = js.native
}
object RedshiftConnectorProfileProperties {
  
  @scala.inline
  def apply(bucketName: BucketName, databaseUrl: DatabaseUrl, roleArn: RoleArn): RedshiftConnectorProfileProperties = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], databaseUrl = databaseUrl.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedshiftConnectorProfileProperties]
  }
  
  @scala.inline
  implicit class RedshiftConnectorProfilePropertiesMutableBuilder[Self <: RedshiftConnectorProfileProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketName(value: BucketName): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketPrefix(value: BucketPrefix): Self = StObject.set(x, "bucketPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketPrefixUndefined: Self = StObject.set(x, "bucketPrefix", js.undefined)
    
    @scala.inline
    def setDatabaseUrl(value: DatabaseUrl): Self = StObject.set(x, "databaseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
