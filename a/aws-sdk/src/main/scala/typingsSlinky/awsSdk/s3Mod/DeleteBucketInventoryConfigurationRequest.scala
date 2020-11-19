package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteBucketInventoryConfigurationRequest extends js.Object {
  
  /**
    * The name of the bucket containing the inventory configuration to delete.
    */
  var Bucket: BucketName = js.native
  
  /**
    * The ID used to identify the inventory configuration.
    */
  var Id: InventoryId = js.native
}
object DeleteBucketInventoryConfigurationRequest {
  
  @scala.inline
  def apply(Bucket: BucketName, Id: InventoryId): DeleteBucketInventoryConfigurationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBucketInventoryConfigurationRequest]
  }
  
  @scala.inline
  implicit class DeleteBucketInventoryConfigurationRequestOps[Self <: DeleteBucketInventoryConfigurationRequest] (val x: Self) extends AnyVal {
    
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
    def setBucket(value: BucketName): Self = this.set("Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: InventoryId): Self = this.set("Id", value.asInstanceOf[js.Any])
  }
}
