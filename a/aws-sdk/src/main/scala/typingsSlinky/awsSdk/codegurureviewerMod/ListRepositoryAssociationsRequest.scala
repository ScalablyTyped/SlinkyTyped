package typingsSlinky.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRepositoryAssociationsRequest extends js.Object {
  /**
    * The maximum number of repository association results returned by ListRepositoryAssociations in paginated output. When this parameter is used, ListRepositoryAssociations only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another ListRepositoryAssociations request with the returned nextToken value. This value can be between 1 and 100. If this parameter is not used, then ListRepositoryAssociations returns up to 100 results and a nextToken value if applicable. 
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.codegurureviewerMod.MaxResults] = js.native
  /**
    * List of names to use as a filter.
    */
  var Names: js.UndefOr[typingsSlinky.awsSdk.codegurureviewerMod.Names] = js.native
  /**
    * The nextToken value returned from a previous paginated ListRepositoryAssociations request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value.   This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and not for other programmatic purposes. 
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.codegurureviewerMod.NextToken] = js.native
  /**
    * List of owners to use as a filter. For AWS CodeCommit, the owner is the AWS account id. For GitHub, it is the GitHub account name.
    */
  var Owners: js.UndefOr[typingsSlinky.awsSdk.codegurureviewerMod.Owners] = js.native
  /**
    * List of provider types to use as a filter.
    */
  var ProviderTypes: js.UndefOr[typingsSlinky.awsSdk.codegurureviewerMod.ProviderTypes] = js.native
  /**
    * List of states to use as a filter.
    */
  var States: js.UndefOr[RepositoryAssociationStates] = js.native
}

object ListRepositoryAssociationsRequest {
  @scala.inline
  def apply(): ListRepositoryAssociationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRepositoryAssociationsRequest]
  }
  @scala.inline
  implicit class ListRepositoryAssociationsRequestOps[Self <: ListRepositoryAssociationsRequest] (val x: Self) extends AnyVal {
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
    def withNames(value: Names): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Names")(js.undefined)
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
    def withOwners(value: Owners): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Owners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Owners")(js.undefined)
        ret
    }
    @scala.inline
    def withProviderTypes(value: ProviderTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProviderTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProviderTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProviderTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withStates(value: RepositoryAssociationStates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("States")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("States")(js.undefined)
        ret
    }
  }
  
}

