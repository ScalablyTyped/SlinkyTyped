package typingsSlinky.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDomainAssociationsResult extends js.Object {
  /**
    *  List of Domain Associations. 
    */
  var domainAssociations: DomainAssociations = js.native
  /**
    *  Pagination token. If non-null pagination token is returned in a result, then pass its value in another request to fetch more entries. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListDomainAssociationsResult {
  @scala.inline
  def apply(domainAssociations: DomainAssociations): ListDomainAssociationsResult = {
    val __obj = js.Dynamic.literal(domainAssociations = domainAssociations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDomainAssociationsResult]
  }
  @scala.inline
  implicit class ListDomainAssociationsResultOps[Self <: ListDomainAssociationsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainAssociations(value: DomainAssociations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainAssociations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
  }
  
}

