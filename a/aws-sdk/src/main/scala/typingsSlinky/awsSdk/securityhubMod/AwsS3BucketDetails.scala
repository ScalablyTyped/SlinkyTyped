package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsS3BucketDetails extends js.Object {
  /**
    * The date and time when the S3 bucket was created.
    */
  var CreatedAt: js.UndefOr[NonEmptyString] = js.native
  /**
    * The canonical user ID of the owner of the S3 bucket.
    */
  var OwnerId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The display name of the owner of the S3 bucket.
    */
  var OwnerName: js.UndefOr[NonEmptyString] = js.native
  /**
    * The encryption rules that are applied to the S3 bucket.
    */
  var ServerSideEncryptionConfiguration: js.UndefOr[AwsS3BucketServerSideEncryptionConfiguration] = js.native
}

object AwsS3BucketDetails {
  @scala.inline
  def apply(): AwsS3BucketDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsS3BucketDetails]
  }
  @scala.inline
  implicit class AwsS3BucketDetailsOps[Self <: AwsS3BucketDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedAt(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerId")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerName(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerName")(js.undefined)
        ret
    }
    @scala.inline
    def withServerSideEncryptionConfiguration(value: AwsS3BucketServerSideEncryptionConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerSideEncryptionConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerSideEncryptionConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerSideEncryptionConfiguration")(js.undefined)
        ret
    }
  }
  
}

