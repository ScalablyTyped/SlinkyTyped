package typingsSlinky.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListResolverRuleAssociationsResponse extends js.Object {
  /**
    * The value that you specified for MaxResults in the request.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.MaxResults] = js.native
  /**
    * If more than MaxResults rule associations match the specified criteria, you can submit another ListResolverRuleAssociation request to get the next group of results. In the next request, specify the value of NextToken from the previous response. 
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.NextToken] = js.native
  /**
    * The associations that were created between resolver rules and VPCs using the current AWS account, and that match the specified filters, if any.
    */
  var ResolverRuleAssociations: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.ResolverRuleAssociations] = js.native
}

object ListResolverRuleAssociationsResponse {
  @scala.inline
  def apply(): ListResolverRuleAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResolverRuleAssociationsResponse]
  }
  @scala.inline
  implicit class ListResolverRuleAssociationsResponseOps[Self <: ListResolverRuleAssociationsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withResolverRuleAssociations(value: ResolverRuleAssociations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResolverRuleAssociations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolverRuleAssociations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResolverRuleAssociations")(js.undefined)
        ret
    }
  }
  
}

