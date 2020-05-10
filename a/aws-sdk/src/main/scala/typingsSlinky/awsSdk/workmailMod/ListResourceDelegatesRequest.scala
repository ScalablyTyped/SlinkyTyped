package typingsSlinky.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListResourceDelegatesRequest extends js.Object {
  /**
    * The number of maximum results in a page.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.workmailMod.MaxResults] = js.native
  /**
    * The token used to paginate through the delegates associated with a resource.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.workmailMod.NextToken] = js.native
  /**
    * The identifier for the organization that contains the resource for which delegates are listed.
    */
  var OrganizationId: typingsSlinky.awsSdk.workmailMod.OrganizationId = js.native
  /**
    * The identifier for the resource whose delegates are listed.
    */
  var ResourceId: WorkMailIdentifier = js.native
}

object ListResourceDelegatesRequest {
  @scala.inline
  def apply(OrganizationId: OrganizationId, ResourceId: WorkMailIdentifier): ListResourceDelegatesRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResourceDelegatesRequest]
  }
  @scala.inline
  implicit class ListResourceDelegatesRequestOps[Self <: ListResourceDelegatesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrganizationId(value: OrganizationId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceId(value: WorkMailIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxResults(value: MaxResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
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

