package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Origination extends js.Object {
  /**
    * When origination settings are disabled, inbound calls are not enabled for your Amazon Chime Voice Connector.
    */
  var Disabled: js.UndefOr[Boolean] = js.native
  /**
    * The call distribution properties defined for your SIP hosts. Valid range: Minimum value of 1. Maximum value of 20.
    */
  var Routes: js.UndefOr[OriginationRouteList] = js.native
}

object Origination {
  @scala.inline
  def apply(): Origination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Origination]
  }
  @scala.inline
  implicit class OriginationOps[Self <: Origination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withRoutes(value: OriginationRouteList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Routes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Routes")(js.undefined)
        ret
    }
  }
  
}

