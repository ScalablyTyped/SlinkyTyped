package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceDetails extends js.Object {
  /**
    * The availability zone of the EC2 instance.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The profile information of the EC2 instance.
    */
  var IamInstanceProfile: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.IamInstanceProfile] = js.native
  /**
    * The image description of the EC2 instance.
    */
  var ImageDescription: js.UndefOr[String] = js.native
  /**
    * The image ID of the EC2 instance.
    */
  var ImageId: js.UndefOr[String] = js.native
  /**
    * The ID of the EC2 instance.
    */
  var InstanceId: js.UndefOr[String] = js.native
  /**
    * The state of the EC2 instance.
    */
  var InstanceState: js.UndefOr[String] = js.native
  /**
    * The type of the EC2 instance.
    */
  var InstanceType: js.UndefOr[String] = js.native
  /**
    * The launch time of the EC2 instance.
    */
  var LaunchTime: js.UndefOr[String] = js.native
  /**
    * The network interface information of the EC2 instance.
    */
  var NetworkInterfaces: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.NetworkInterfaces] = js.native
  /**
    * The Amazon Resource Name (ARN) of the AWS Outpost. Only applicable to AWS Outposts instances.
    */
  var OutpostArn: js.UndefOr[String] = js.native
  /**
    * The platform of the EC2 instance.
    */
  var Platform: js.UndefOr[String] = js.native
  /**
    * The product code of the EC2 instance.
    */
  var ProductCodes: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.ProductCodes] = js.native
  /**
    * The tags of the EC2 instance.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.Tags] = js.native
}

object InstanceDetails {
  @scala.inline
  def apply(): InstanceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceDetails]
  }
  @scala.inline
  implicit class InstanceDetailsOps[Self <: InstanceDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailabilityZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZone")(js.undefined)
        ret
    }
    @scala.inline
    def withIamInstanceProfile(value: IamInstanceProfile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamInstanceProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIamInstanceProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamInstanceProfile")(js.undefined)
        ret
    }
    @scala.inline
    def withImageDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withImageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageId")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceState")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchTime")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkInterfaces(value: NetworkInterfaces): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkInterfaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkInterfaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkInterfaces")(js.undefined)
        ret
    }
    @scala.inline
    def withOutpostArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutpostArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutpostArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutpostArn")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Platform")(js.undefined)
        ret
    }
    @scala.inline
    def withProductCodes(value: ProductCodes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductCodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductCodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductCodes")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Tags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

