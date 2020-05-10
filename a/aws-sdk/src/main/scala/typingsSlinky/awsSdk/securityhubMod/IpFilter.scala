package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IpFilter extends js.Object {
  /**
    * A finding's CIDR value.
    */
  var Cidr: js.UndefOr[NonEmptyString] = js.native
}

object IpFilter {
  @scala.inline
  def apply(): IpFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpFilter]
  }
  @scala.inline
  implicit class IpFilterOps[Self <: IpFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCidr(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cidr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCidr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cidr")(js.undefined)
        ret
    }
  }
  
}

