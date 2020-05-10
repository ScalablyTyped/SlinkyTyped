package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketInventoryConfigurationRequest extends js.Object {
  /**
    * The name of the bucket containing the inventory configuration to retrieve.
    */
  var Bucket: BucketName = js.native
  /**
    * The ID used to identify the inventory configuration.
    */
  var Id: InventoryId = js.native
}

object GetBucketInventoryConfigurationRequest {
  @scala.inline
  def apply(Bucket: BucketName, Id: InventoryId): GetBucketInventoryConfigurationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketInventoryConfigurationRequest]
  }
  @scala.inline
  implicit class GetBucketInventoryConfigurationRequestOps[Self <: GetBucketInventoryConfigurationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucket(value: BucketName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: InventoryId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

