package typingsSlinky.awsSdk.marketplacecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEntitiesRequest extends js.Object {
  /**
    * The catalog related to the request. Fixed value: AWSMarketplace 
    */
  var Catalog: typingsSlinky.awsSdk.marketplacecatalogMod.Catalog = js.native
  /**
    * The type of entities to retrieve.
    */
  var EntityType: typingsSlinky.awsSdk.marketplacecatalogMod.EntityType = js.native
  /**
    * An array of filter objects. Each filter object contains two attributes, filterName and filterValues.
    */
  var FilterList: js.UndefOr[typingsSlinky.awsSdk.marketplacecatalogMod.FilterList] = js.native
  /**
    * Specifies the upper limit of the elements on a single page. If a value isn't provided, the default value is 20.
    */
  var MaxResults: js.UndefOr[MaxResultInteger] = js.native
  /**
    * The value of the next token, if it exists. Null if there are no more results.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.marketplacecatalogMod.NextToken] = js.native
  /**
    * An object that contains two attributes, sortBy and sortOrder.
    */
  var Sort: js.UndefOr[typingsSlinky.awsSdk.marketplacecatalogMod.Sort] = js.native
}

object ListEntitiesRequest {
  @scala.inline
  def apply(Catalog: Catalog, EntityType: EntityType): ListEntitiesRequest = {
    val __obj = js.Dynamic.literal(Catalog = Catalog.asInstanceOf[js.Any], EntityType = EntityType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEntitiesRequest]
  }
  @scala.inline
  implicit class ListEntitiesRequestOps[Self <: ListEntitiesRequest] (val x: Self) extends AnyVal {
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
    def withEntityType(value: EntityType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntityType")(value.asInstanceOf[js.Any])
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

