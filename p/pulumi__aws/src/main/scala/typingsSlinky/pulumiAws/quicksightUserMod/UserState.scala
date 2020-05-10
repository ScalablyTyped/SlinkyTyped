package typingsSlinky.pulumiAws.quicksightUserMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserState extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the user
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The ID for the AWS account that the user is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
    */
  val awsAccountId: js.UndefOr[Input[String]] = js.native
  /**
    * The email address of the user that you want to register.
    */
  val email: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the IAM user or role that you are registering with Amazon QuickSight.
    */
  val iamArn: js.UndefOr[Input[String]] = js.native
  /**
    * Amazon QuickSight supports several ways of managing the identity of users. This parameter accepts either  `IAM` or `QUICKSIGHT`.
    */
  val identityType: js.UndefOr[Input[String]] = js.native
  /**
    * The namespace. Currently, you should set this to `default`.
    */
  val namespace: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the IAM session to use when assuming roles that can embed QuickSight dashboards.
    */
  val sessionName: js.UndefOr[Input[String]] = js.native
  /**
    * The Amazon QuickSight user name that you want to create for the user you are registering.
    */
  val userName: js.UndefOr[Input[String]] = js.native
  /**
    * The Amazon QuickSight role of the user. The user role can be one of the following: `READER`, `AUTHOR`, or `ADMIN`
    */
  val userRole: js.UndefOr[Input[String]] = js.native
}

object UserState {
  @scala.inline
  def apply(): UserState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserState]
  }
  @scala.inline
  implicit class UserStateOps[Self <: UserState] (val x: Self) extends AnyVal {
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
    def withAwsAccountId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsAccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withEmail(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withIamArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIamArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamArn")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentityType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identityType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentityType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identityType")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespace(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionName")(js.undefined)
        ret
    }
    @scala.inline
    def withUserName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userName")(js.undefined)
        ret
    }
    @scala.inline
    def withUserRole(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userRole")(js.undefined)
        ret
    }
  }
  
}

