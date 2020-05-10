package typingsSlinky.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3SignedObject extends js.Object {
  /**
    * Name of the S3 bucket.
    */
  var bucketName: js.UndefOr[BucketName] = js.native
  /**
    * Key name that uniquely identifies a signed code image in your bucket.
    */
  var key: js.UndefOr[typingsSlinky.awsSdk.signerMod.key] = js.native
}

object S3SignedObject {
  @scala.inline
  def apply(): S3SignedObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3SignedObject]
  }
  @scala.inline
  implicit class S3SignedObjectOps[Self <: S3SignedObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucketName(value: BucketName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucketName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketName")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
  }
  
}

