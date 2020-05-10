package typingsSlinky.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListResolverRuleAssociationsRequest extends js.Object {
  /**
    * An optional specification to return a subset of resolver rules, such as resolver rules that are associated with the same VPC ID.  If you submit a second or subsequent ListResolverRuleAssociations request and specify the NextToken parameter, you must use the same values for Filters, if any, as in the previous request. 
    */
  var Filters: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.Filters] = js.native
  /**
    * The maximum number of rule associations that you want to return in the response to a ListResolverRuleAssociations request. If you don't specify a value for MaxResults, Resolver returns up to 100 rule associations. 
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.MaxResults] = js.native
  /**
    * For the first ListResolverRuleAssociation request, omit this value. If you have more than MaxResults rule associations, you can submit another ListResolverRuleAssociation request to get the next group of rule associations. In the next request, specify the value of NextToken from the previous response. 
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.NextToken] = js.native
}

object ListResolverRuleAssociationsRequest {
  @scala.inline
  def apply(): ListResolverRuleAssociationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResolverRuleAssociationsRequest]
  }
  @scala.inline
  implicit class ListResolverRuleAssociationsRequestOps[Self <: ListResolverRuleAssociationsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilters(value: Filters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(js.undefined)
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

