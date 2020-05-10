package typingsSlinky.awsSdk.simpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDomainsResult extends js.Object {
  /**
    * A list of domain names that match the expression.
    */
  var DomainNames: js.UndefOr[DomainNameList] = js.native
  /**
    * An opaque token indicating that there are more domains than the specified MaxNumberOfDomains still available.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListDomainsResult {
  @scala.inline
  def apply(): ListDomainsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDomainsResult]
  }
  @scala.inline
  implicit class ListDomainsResultOps[Self <: ListDomainsResult] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withNextToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

