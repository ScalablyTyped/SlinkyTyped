package typingsSlinky.pulumiAws.accessPointMod

import typingsSlinky.pulumiAws.inputMod.s3.AccessPointPublicAccessBlockConfiguration
import typingsSlinky.pulumiAws.inputMod.s3.AccessPointVpcConfiguration
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessPointState extends js.Object {
  val accountId: js.UndefOr[Input[String]] = js.native
  /**
    * Amazon Resource Name (ARN) of the S3 Access Point.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the bucket that you want to associate this access point with.
    */
  val bucket: js.UndefOr[Input[String]] = js.native
  /**
    * The DNS domain name of the S3 Access Point in the format _`name`_-_`accountId`_.s3-accesspoint._region_.amazonaws.com.
    * Note: S3 access points only support secure access by HTTPS. HTTP isn't supported.
    */
  val domainName: js.UndefOr[Input[String]] = js.native
  /**
    * Indicates whether this access point currently has a policy that allows public access.
    */
  val hasPublicAccessPolicy: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The name you want to assign to this access point.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Indicates whether this access point allows access from the public Internet. Values are `VPC` (the access point doesn't allow access from the public Internet) and `Internet` (the access point allows access from the public Internet, subject to the access point and bucket access policies).
    */
  val networkOrigin: js.UndefOr[Input[String]] = js.native
  /**
    * A valid JSON document that specifies the policy that you want to apply to this access point.
    */
  val policy: js.UndefOr[Input[String]] = js.native
  /**
    * Configuration block to manage the `PublicAccessBlock` configuration that you want to apply to this Amazon S3 bucket. You can enable the configuration options in any combination. Detailed below.
    */
  val publicAccessBlockConfiguration: js.UndefOr[Input[AccessPointPublicAccessBlockConfiguration]] = js.native
  /**
    * Configuration block to restrict access to this access point to requests from the specified Virtual Private Cloud (VPC). Detailed below.
    */
  val vpcConfiguration: js.UndefOr[Input[AccessPointVpcConfiguration]] = js.native
}

object AccessPointState {
  @scala.inline
  def apply(): AccessPointState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessPointState]
  }
  @scala.inline
  implicit class AccessPointStateOps[Self <: AccessPointState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(js.undefined)
        ret
    }
    @scala.inline
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withBucket(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucket")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainName")(js.undefined)
        ret
    }
    @scala.inline
    def withHasPublicAccessPolicy(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasPublicAccessPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasPublicAccessPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasPublicAccessPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkOrigin(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkOrigin")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicy(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicAccessBlockConfiguration(value: Input[AccessPointPublicAccessBlockConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicAccessBlockConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicAccessBlockConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicAccessBlockConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcConfiguration(value: Input[AccessPointVpcConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcConfiguration")(js.undefined)
        ret
    }
  }
  
}

