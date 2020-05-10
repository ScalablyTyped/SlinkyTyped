package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HibernationOptionsRequest extends js.Object {
  /**
    * If you set this parameter to true, your instance is enabled for hibernation. Default: false 
    */
  var Configured: js.UndefOr[Boolean] = js.native
}

object HibernationOptionsRequest {
  @scala.inline
  def apply(): HibernationOptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HibernationOptionsRequest]
  }
  @scala.inline
  implicit class HibernationOptionsRequestOps[Self <: HibernationOptionsRequest] (val x: Self) extends AnyVal {
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

