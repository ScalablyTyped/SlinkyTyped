package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalIpDetails extends js.Object {
  /**
    * IPV4 remote address of the connection.
    */
  var IpAddressV4: js.UndefOr[String] = js.native
}

object LocalIpDetails {
  @scala.inline
  def apply(): LocalIpDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalIpDetails]
  }
  @scala.inline
  implicit class LocalIpDetailsOps[Self <: LocalIpDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIpAddressV4(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpAddressV4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpAddressV4: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpAddressV4")(js.undefined)
        ret
    }
  }
  
}

