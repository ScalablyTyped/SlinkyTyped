package typingsSlinky.pulumiAws.accessPointMod

import typingsSlinky.pulumiAws.inputMod.s3.AccessPointPublicAccessBlockConfiguration
import typingsSlinky.pulumiAws.inputMod.s3.AccessPointVpcConfiguration
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessPointArgs extends js.Object {
  val accountId: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the bucket that you want to associate this access point with.
    */
  val bucket: Input[String] = js.native
  /**
    * The name you want to assign to this access point.
    */
  val name: js.UndefOr[Input[String]] = js.native
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

object AccessPointArgs {
  @scala.inline
  def apply(bucket: Input[String]): AccessPointArgs = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessPointArgs]
  }
  @scala.inline
  implicit class AccessPointArgsOps[Self <: AccessPointArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucket(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucket")(value.asInstanceOf[js.Any])
        ret
    }
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

