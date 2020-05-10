package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchTablesRequest extends js.Object {
  /**
    * A unique identifier, consisting of  account_id/datalake.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  /**
    * A list of key-value pairs, and a comparator used to filter the search results. Returns all entities matching the predicate.
    */
  var Filters: js.UndefOr[SearchPropertyPredicates] = js.native
  /**
    * The maximum number of tables to return in a single response.
    */
  var MaxResults: js.UndefOr[PageSize] = js.native
  /**
    * A continuation token, included if this is a continuation call.
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * A string used for a text search. Specifying a value in quotes filters based on an exact match to the value.
    */
  var SearchText: js.UndefOr[ValueString] = js.native
  /**
    * A list of criteria for sorting the results by a field name, in an ascending or descending order.
    */
  var SortCriteria: js.UndefOr[typingsSlinky.awsSdk.glueMod.SortCriteria] = js.native
}

object SearchTablesRequest {
  @scala.inline
  def apply(): SearchTablesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchTablesRequest]
  }
  @scala.inline
  implicit class SearchTablesRequestOps[Self <: SearchTablesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCatalogId(value: CatalogIdString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CatalogId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCatalogId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CatalogId")(js.undefined)
        ret
    }
    @scala.inline
    def withFilters(value: SearchPropertyPredicates): Self = {
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
    def withMaxResults(value: PageSize): Self = {
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
    def withNextToken(value: Token): Self = {
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
    def withSearchText(value: ValueString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SearchText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SearchText")(js.undefined)
        ret
    }
    @scala.inline
    def withSortCriteria(value: SortCriteria): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SortCriteria")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortCriteria: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SortCriteria")(js.undefined)
        ret
    }
  }
  
}

