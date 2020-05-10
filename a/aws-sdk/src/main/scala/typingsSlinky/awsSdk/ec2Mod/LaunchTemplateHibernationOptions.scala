package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateHibernationOptions extends js.Object {
  /**
    * If this parameter is set to true, the instance is enabled for hibernation; otherwise, it is not enabled for hibernation.
    */
  var Configured: js.UndefOr[Boolean] = js.native
}

object LaunchTemplateHibernationOptions {
  @scala.inline
  def apply(): LaunchTemplateHibernationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateHibernationOptions]
  }
  @scala.inline
  implicit class LaunchTemplateHibernationOptionsOps[Self <: LaunchTemplateHibernationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigured(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Configured")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigured: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Configured")(js.undefined)
        ret
    }
  }
  
}

