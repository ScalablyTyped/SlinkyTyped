package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HibernationOptions extends js.Object {
  /**
    * If this parameter is set to true, your instance is enabled for hibernation; otherwise, it is not enabled for hibernation.
    */
  var Configured: js.UndefOr[Boolean] = js.native
}

object HibernationOptions {
  @scala.inline
  def apply(): HibernationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HibernationOptions]
  }
  @scala.inline
  implicit class HibernationOptionsOps[Self <: HibernationOptions] (val x: Self) extends AnyVal {
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

