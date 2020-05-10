package typingsSlinky.pulumiAws.serviceLinkedRoleMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceLinkedRoleState extends js.Object {
  /**
    * The Amazon Resource Name (ARN) specifying the role.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The AWS service to which this role is attached. You use a string similar to a URL but without the `http://` in front. For example: `elasticbeanstalk.amazonaws.com`. To find the full list of services that support service-linked roles, check [the docs](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-services-that-work-with-iam.html).
    */
  val awsServiceName: js.UndefOr[Input[String]] = js.native
  /**
    * The creation date of the IAM role.
    */
  val createDate: js.UndefOr[Input[String]] = js.native
  /**
    * Additional string appended to the role name. Not all AWS services support custom suffixes.
    */
  val customSuffix: js.UndefOr[Input[String]] = js.native
  /**
    * The description of the role.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the role.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The path of the role.
    */
  val path: js.UndefOr[Input[String]] = js.native
  /**
    * The stable and unique string identifying the role.
    */
  val uniqueId: js.UndefOr[Input[String]] = js.native
}

object ServiceLinkedRoleState {
  @scala.inline
  def apply(): ServiceLinkedRoleState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceLinkedRoleState]
  }
  @scala.inline
  implicit class ServiceLinkedRoleStateOps[Self <: ServiceLinkedRoleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withAwsServiceName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsServiceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsServiceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsServiceName")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateDate(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDate")(js.undefined)
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
    def withPath(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withUniqueId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUniqueId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueId")(js.undefined)
        ret
    }
  }
  
}

