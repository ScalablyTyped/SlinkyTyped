package typingsSlinky.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomerManagedChannelS3Storage extends js.Object {
  /**
    * The name of the Amazon S3 bucket in which channel data is stored.
    */
  var bucket: BucketName = js.native
  /**
    * [Optional] The prefix used to create the keys of the channel data objects. Each object in an Amazon S3 bucket has a key that is its unique identifier within the bucket (each object in a bucket has exactly one key). The prefix must end with a '/'.
    */
  var keyPrefix: js.UndefOr[S3KeyPrefix] = js.native
  /**
    * The ARN of the role which grants AWS IoT Analytics permission to interact with your Amazon S3 resources.
    */
  var roleArn: RoleArn = js.native
}

object CustomerManagedChannelS3Storage {
  @scala.inline
  def apply(bucket: BucketName, roleArn: RoleArn): CustomerManagedChannelS3Storage = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerManagedChannelS3Storage]
  }
  @scala.inline
  implicit class CustomerManagedChannelS3StorageOps[Self <: CustomerManagedChannelS3Storage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucket(value: BucketName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleArn(value: RoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyPrefix(value: S3KeyPrefix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPrefix")(js.undefined)
        ret
    }
  }
  
}

