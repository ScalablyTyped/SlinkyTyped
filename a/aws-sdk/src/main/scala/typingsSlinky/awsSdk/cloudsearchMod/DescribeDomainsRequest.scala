package typingsSlinky.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDomainsRequest extends js.Object {
  /**
    * The names of the domains you want to include in the response.
    */
  var DomainNames: js.UndefOr[DomainNameList] = js.native
}

object DescribeDomainsRequest {
  @scala.inline
  def apply(): DescribeDomainsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDomainsRequest]
  }
  @scala.inline
  implicit class DescribeDomainsRequestOps[Self <: DescribeDomainsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainNames(value: DomainNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainNames")(js.undefined)
        ret
    }
  }
  
}

