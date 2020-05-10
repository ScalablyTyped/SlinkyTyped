package typingsSlinky.awsSdk.healthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAffectedEntitiesForOrganizationRequest extends js.Object {
  /**
    * The locale (language) to return information in. English (en) is the default and the only supported value at this time.
    */
  var locale: js.UndefOr[typingsSlinky.awsSdk.healthMod.locale] = js.native
  /**
    * The maximum number of items to return in one batch, between 10 and 100, inclusive.
    */
  var maxResults: js.UndefOr[typingsSlinky.awsSdk.healthMod.maxResults] = js.native
  /**
    * If the results of a search are large, only a portion of the results are returned, and a nextToken pagination token is returned in the response. To retrieve the next batch of results, reissue the search request and include the returned token. When all results have been returned, the response does not contain a pagination token value.
    */
  var nextToken: js.UndefOr[typingsSlinky.awsSdk.healthMod.nextToken] = js.native
  /**
    * A JSON set of elements including the awsAccountId and the eventArn.
    */
  var organizationEntityFilters: OrganizationEntityFiltersList = js.native
}

object DescribeAffectedEntitiesForOrganizationRequest {
  @scala.inline
  def apply(organizationEntityFilters: OrganizationEntityFiltersList): DescribeAffectedEntitiesForOrganizationRequest = {
    val __obj = js.Dynamic.literal(organizationEntityFilters = organizationEntityFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAffectedEntitiesForOrganizationRequest]
  }
  @scala.inline
  implicit class DescribeAffectedEntitiesForOrganizationRequestOps[Self <: DescribeAffectedEntitiesForOrganizationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrganizationEntityFilters(value: OrganizationEntityFiltersList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organizationEntityFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocale(value: locale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: maxResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: nextToken): Self = {
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

