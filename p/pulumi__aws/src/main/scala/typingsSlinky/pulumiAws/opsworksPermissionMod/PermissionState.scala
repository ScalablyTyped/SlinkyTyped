package typingsSlinky.pulumiAws.opsworksPermissionMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PermissionState extends js.Object {
  /**
    * Whether the user is allowed to use SSH to communicate with the instance
    */
  val allowSsh: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Whether the user is allowed to use sudo to elevate privileges
    */
  val allowSudo: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The users permission level. Mus be one of `deny`, `show`, `deploy`, `manage`, `iamOnly`
    */
  val level: js.UndefOr[Input[String]] = js.native
  /**
    * The stack to set the permissions for
    */
  val stackId: js.UndefOr[Input[String]] = js.native
  /**
    * The user's IAM ARN to set permissions for
    */
  val userArn: js.UndefOr[Input[String]] = js.native
}

object PermissionState {
  @scala.inline
  def apply(): PermissionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PermissionState]
  }
  @scala.inline
  implicit class PermissionStateOps[Self <: PermissionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowSsh(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSsh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSsh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSsh")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowSudo(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSudo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSudo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSudo")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.undefined)
        ret
    }
    @scala.inline
    def withStackId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackId")(js.undefined)
        ret
    }
    @scala.inline
    def withUserArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userArn")(js.undefined)
        ret
    }
  }
  
}

