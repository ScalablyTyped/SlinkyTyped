package typingsSlinky.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomerManagedDatastoreS3StorageSummary extends js.Object {
  
  /**
    * The name of the Amazon S3 bucket in which data store data is stored.
    */
  var bucket: js.UndefOr[BucketName] = js.native
  
  /**
    * [Optional] The prefix used to create the keys of the data store data objects. Each object in an Amazon S3 bucket has a key that is its unique identifier within the bucket (each object in a bucket has exactly one key). The prefix must end with a '/'.
    */
  var keyPrefix: js.UndefOr[S3KeyPrefix] = js.native
  
  /**
    * The ARN of the role which grants AWS IoT Analytics permission to interact with your Amazon S3 resources.
    */
  var roleArn: js.UndefOr[RoleArn] = js.native
}
object CustomerManagedDatastoreS3StorageSummary {
  
  @scala.inline
  def apply(): CustomerManagedDatastoreS3StorageSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerManagedDatastoreS3StorageSummary]
  }
  
  @scala.inline
  implicit class CustomerManagedDatastoreS3StorageSummaryOps[Self <: CustomerManagedDatastoreS3StorageSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBucket(value: BucketName): Self = this.set("bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucket: Self = this.set("bucket", js.undefined)
    
    @scala.inline
    def setKeyPrefix(value: S3KeyPrefix): Self = this.set("keyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyPrefix: Self = this.set("keyPrefix", js.undefined)
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleArn: Self = this.set("roleArn", js.undefined)
  }
}
