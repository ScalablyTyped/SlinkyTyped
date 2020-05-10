package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPv4Range extends IpRange {
  // Lower address.
  var lowerAddress: js.UndefOr[String] = js.native
  // Upper address.
  var upperAddress: js.UndefOr[String] = js.native
}

object IPv4Range {
  @scala.inline
  def apply(): IPv4Range = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPv4Range]
  }
  @scala.inline
  implicit class IPv4RangeOps[Self <: IPv4Range] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLowerAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowerAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withUpperAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upperAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpperAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upperAddress")(js.undefined)
        ret
    }
  }
  
}

