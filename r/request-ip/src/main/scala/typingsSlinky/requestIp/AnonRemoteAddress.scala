package typingsSlinky.requestIp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRemoteAddress extends js.Object {
  var remoteAddress: js.UndefOr[String] = js.native
}

object AnonRemoteAddress {
  @scala.inline
  def apply(): AnonRemoteAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonRemoteAddress]
  }
  @scala.inline
  implicit class AnonRemoteAddressOps[Self <: AnonRemoteAddress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRemoteAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteAddress")(js.undefined)
        ret
    }
  }
  
}

