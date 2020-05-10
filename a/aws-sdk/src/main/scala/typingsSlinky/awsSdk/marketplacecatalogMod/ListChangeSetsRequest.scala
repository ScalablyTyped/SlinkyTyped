package typingsSlinky.awsSdk.marketplacecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListChangeSetsRequest extends js.Object {
  /**
    * The catalog related to the request. Fixed value: AWSMarketplace 
    */
  var Catalog: typingsSlinky.awsSdk.marketplacecatalogMod.Catalog = js.native
  /**
    * An array of filter objects.
    */
  var FilterList: js.UndefOr[typingsSlinky.awsSdk.marketplacecatalogMod.FilterList] = js.native
  /**
    * The maximum number of results returned by a single call. This value must be provided in the next call to retrieve the next set of results. By default, this value is 20.
    */
  var MaxResults: js.UndefOr[MaxResultInteger] = js.native
  /**
    * The token value retrieved from a previous call to access the next page of results.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.marketplacecatalogMod.NextToken] = js.native
  /**
    * An object that contains two attributes, sortBy and sortOrder.
    */
  var Sort: js.UndefOr[typingsSlinky.awsSdk.marketplacecatalogMod.Sort] = js.native
}

object ListChangeSetsRequest {
  @scala.inline
  def apply(Catalog: Catalog): ListChangeSetsRequest = {
    val __obj = js.Dynamic.literal(Catalog = Catalog.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListChangeSetsRequest]
  }
  @scala.inline
  implicit class ListChangeSetsRequestOps[Self <: ListChangeSetsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCatalog(value: Catalog): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Catalog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterList(value: FilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilterList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilterList")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: MaxResultInteger): Self = {
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
    def withSort(value: Sort): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sort")(js.undefined)
        ret
    }
  }
  
}

