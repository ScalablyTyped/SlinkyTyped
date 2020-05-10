package typingsSlinky.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLaunchTemplateIamInstanceProfile extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the launch template.
    */
  var arn: String = js.native
  /**
    * The name of the launch template.
    */
  var name: String = js.native
}

object GetLaunchTemplateIamInstanceProfile {
  @scala.inline
  def apply(arn: String, name: String): GetLaunchTemplateIamInstanceProfile = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLaunchTemplateIamInstanceProfile]
  }
  @scala.inline
  implicit class GetLaunchTemplateIamInstanceProfileOps[Self <: GetLaunchTemplateIamInstanceProfile] (val x: Self) extends AnyVal {
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

