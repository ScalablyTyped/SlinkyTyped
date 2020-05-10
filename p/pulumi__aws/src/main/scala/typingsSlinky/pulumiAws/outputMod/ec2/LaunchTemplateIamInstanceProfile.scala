package typingsSlinky.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateIamInstanceProfile extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the launch template.
    */
  var arn: js.UndefOr[String] = js.native
  /**
    * The name of the launch template. If you leave this blank, this provider will auto-generate a unique name.
    */
  var name: js.UndefOr[String] = js.native
}

object LaunchTemplateIamInstanceProfile {
  @scala.inline
  def apply(): LaunchTemplateIamInstanceProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateIamInstanceProfile]
  }
  @scala.inline
  implicit class LaunchTemplateIamInstanceProfileOps[Self <: LaunchTemplateIamInstanceProfile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: String): Self = {
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
    def withName(value: String): Self = {
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
  }
  
}

