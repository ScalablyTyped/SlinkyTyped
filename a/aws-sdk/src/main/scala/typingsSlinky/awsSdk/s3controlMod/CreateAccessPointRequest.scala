package typingsSlinky.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAccessPointRequest extends js.Object {
  /**
    * The AWS account ID for the owner of the bucket for which you want to create an access point.
    */
  var AccountId: typingsSlinky.awsSdk.s3controlMod.AccountId = js.native
  /**
    * The name of the bucket that you want to associate this access point with.
    */
  var Bucket: BucketName = js.native
  /**
    * The name you want to assign to this access point.
    */
  var Name: AccessPointName = js.native
  var PublicAccessBlockConfiguration: js.UndefOr[typingsSlinky.awsSdk.s3controlMod.PublicAccessBlockConfiguration] = js.native
  /**
    * If you include this field, Amazon S3 restricts access to this access point to requests from the specified Virtual Private Cloud (VPC).
    */
  var VpcConfiguration: js.UndefOr[typingsSlinky.awsSdk.s3controlMod.VpcConfiguration] = js.native
}

object CreateAccessPointRequest {
  @scala.inline
  def apply(AccountId: AccountId, Bucket: BucketName, Name: AccessPointName): CreateAccessPointRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Bucket = Bucket.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccessPointRequest]
  }
  @scala.inline
  implicit class CreateAccessPointRequestOps[Self <: CreateAccessPointRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: AccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBucket(value: BucketName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: AccessPointName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicAccessBlockConfiguration(value: PublicAccessBlockConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicAccessBlockConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicAccessBlockConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicAccessBlockConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcConfiguration(value: VpcConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcConfiguration")(js.undefined)
        ret
    }
  }
  
}

