package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPRange extends js.Object {
  /**
    * Specifies the IP range.
    */
  var CIDRIP: js.UndefOr[String] = js.native
  /**
    * Specifies the status of the IP range. Status can be "authorizing", "authorized", "revoking", and "revoked".
    */
  var Status: js.UndefOr[String] = js.native
}

object IPRange {
  @scala.inline
  def apply(): IPRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPRange]
  }
  @scala.inline
  implicit class IPRangeOps[Self <: IPRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCIDRIP(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CIDRIP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCIDRIP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CIDRIP")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

