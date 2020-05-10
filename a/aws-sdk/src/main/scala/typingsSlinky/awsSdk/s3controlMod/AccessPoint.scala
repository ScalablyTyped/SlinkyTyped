package typingsSlinky.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessPoint extends js.Object {
  /**
    * The name of the bucket associated with this access point.
    */
  var Bucket: BucketName = js.native
  /**
    * The name of this access point.
    */
  var Name: AccessPointName = js.native
  /**
    * Indicates whether this access point allows access from the public Internet. If VpcConfiguration is specified for this access point, then NetworkOrigin is VPC, and the access point doesn't allow access from the public Internet. Otherwise, NetworkOrigin is Internet, and the access point allows access from the public Internet, subject to the access point and bucket access policies.
    */
  var NetworkOrigin: typingsSlinky.awsSdk.s3controlMod.NetworkOrigin = js.native
  /**
    * The Virtual Private Cloud (VPC) configuration for this access point, if one exists.
    */
  var VpcConfiguration: js.UndefOr[typingsSlinky.awsSdk.s3controlMod.VpcConfiguration] = js.native
}

object AccessPoint {
  @scala.inline
  def apply(Bucket: BucketName, Name: AccessPointName, NetworkOrigin: NetworkOrigin): AccessPoint = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NetworkOrigin = NetworkOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessPoint]
  }
  @scala.inline
  implicit class AccessPointOps[Self <: AccessPoint] (val x: Self) extends AnyVal {
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
    def withName(value: AccessPointName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworkOrigin(value: NetworkOrigin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkOrigin")(value.asInstanceOf[js.Any])
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

