package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAddress extends js.Object {
  var Address: js.UndefOr[String] = js.native
  var CachePeriodInMinutes: js.UndefOr[Double] = js.native
}

object AnonAddress {
  @scala.inline
  def apply(): AnonAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAddress]
  }
  @scala.inline
  implicit class AnonAddressOps[Self <: AnonAddress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Address")(js.undefined)
        ret
    }
    @scala.inline
    def withCachePeriodInMinutes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CachePeriodInMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCachePeriodInMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CachePeriodInMinutes")(js.undefined)
        ret
    }
  }
  
}

