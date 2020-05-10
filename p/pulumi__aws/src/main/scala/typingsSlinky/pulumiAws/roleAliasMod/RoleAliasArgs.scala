package typingsSlinky.pulumiAws.roleAliasMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoleAliasArgs extends js.Object {
  /**
    * The name of the role alias.
    */
  val alias: Input[String] = js.native
  /**
    * The duration of the credential, in seconds. If you do not specify a value for this setting, the default maximum of one hour is applied. This setting can have a value from 900 seconds (15 minutes) to 3600 seconds (60 minutes).
    */
  val credentialDuration: js.UndefOr[Input[Double]] = js.native
  /**
    * The identity of the role to which the alias refers.
    */
  val roleArn: Input[String] = js.native
}

object RoleAliasArgs {
  @scala.inline
  def apply(alias: Input[String], roleArn: Input[String]): RoleAliasArgs = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoleAliasArgs]
  }
  @scala.inline
  implicit class RoleAliasArgsOps[Self <: RoleAliasArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlias(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCredentialDuration(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentialDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredentialDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentialDuration")(js.undefined)
        ret
    }
  }
  
}

