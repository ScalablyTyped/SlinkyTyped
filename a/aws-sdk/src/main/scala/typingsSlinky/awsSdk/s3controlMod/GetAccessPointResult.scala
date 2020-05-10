package typingsSlinky.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAccessPointResult extends js.Object {
  /**
    * The name of the bucket associated with the specified access point.
    */
  var Bucket: js.UndefOr[BucketName] = js.native
  /**
    * The date and time when the specified access point was created.
    */
  var CreationDate: js.UndefOr[js.Date] = js.native
  /**
    * The name of the specified access point.
    */
  var Name: js.UndefOr[AccessPointName] = js.native
  /**
    * Indicates whether this access point allows access from the public Internet. If VpcConfiguration is specified for this access point, then NetworkOrigin is VPC, and the access point doesn't allow access from the public Internet. Otherwise, NetworkOrigin is Internet, and the access point allows access from the public Internet, subject to the access point and bucket access policies.
    */
  var NetworkOrigin: js.UndefOr[typingsSlinky.awsSdk.s3controlMod.NetworkOrigin] = js.native
  var PublicAccessBlockConfiguration: js.UndefOr[typingsSlinky.awsSdk.s3controlMod.PublicAccessBlockConfiguration] = js.native
  /**
    * Contains the Virtual Private Cloud (VPC) configuration for the specified access point.
    */
  var VpcConfiguration: js.UndefOr[typingsSlinky.awsSdk.s3controlMod.VpcConfiguration] = js.native
}

object GetAccessPointResult {
  @scala.inline
  def apply(): GetAccessPointResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccessPointResult]
  }
  @scala.inline
  implicit class GetAccessPointResultOps[Self <: GetAccessPointResult] (val x: Self) extends AnyVal {
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
    def withoutBucket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bucket")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: AccessPointName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkOrigin(value: NetworkOrigin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkOrigin")(js.undefined)
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

