package typingsSlinky.pulumiAws.serviceLinkedRoleMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceLinkedRoleArgs extends js.Object {
  /**
    * The AWS service to which this role is attached. You use a string similar to a URL but without the `http://` in front. For example: `elasticbeanstalk.amazonaws.com`. To find the full list of services that support service-linked roles, check [the docs](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-services-that-work-with-iam.html).
    */
  val awsServiceName: Input[String] = js.native
  /**
    * Additional string appended to the role name. Not all AWS services support custom suffixes.
    */
  val customSuffix: js.UndefOr[Input[String]] = js.native
  /**
    * The description of the role.
    */
  val description: js.UndefOr[Input[String]] = js.native
}

object ServiceLinkedRoleArgs {
  @scala.inline
  def apply(awsServiceName: Input[String]): ServiceLinkedRoleArgs = {
    val __obj = js.Dynamic.literal(awsServiceName = awsServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceLinkedRoleArgs]
  }
  @scala.inline
  implicit class ServiceLinkedRoleArgsOps[Self <: ServiceLinkedRoleArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAwsServiceName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsServiceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomSuffix(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSuffix")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
  }
  
}

