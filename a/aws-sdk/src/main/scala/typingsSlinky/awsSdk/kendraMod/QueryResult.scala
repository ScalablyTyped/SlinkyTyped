package typingsSlinky.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryResult extends js.Object {
  /**
    * Contains the facet results. A FacetResult contains the counts for each attribute key that was specified in the Facets input parameter.
    */
  var FacetResults: js.UndefOr[FacetResultList] = js.native
  /**
    * The unique identifier for the search. You use QueryId to identify the search when using the feedback API.
    */
  var QueryId: js.UndefOr[typingsSlinky.awsSdk.kendraMod.QueryId] = js.native
  /**
    * The results of the search.
    */
  var ResultItems: js.UndefOr[QueryResultItemList] = js.native
  /**
    * The number of items returned by the search. Use this to determine when you have requested the last set of results.
    */
  var TotalNumberOfResults: js.UndefOr[Integer] = js.native
}

object QueryResult {
  @scala.inline
  def apply(): QueryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryResult]
  }
  @scala.inline
  implicit class QueryResultOps[Self <: QueryResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFacetResults(value: FacetResultList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FacetResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFacetResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FacetResults")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryId(value: QueryId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueryId")(js.undefined)
        ret
    }
    @scala.inline
    def withResultItems(value: QueryResultItemList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResultItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResultItems")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalNumberOfResults(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalNumberOfResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalNumberOfResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalNumberOfResults")(js.undefined)
        ret
    }
  }
  
}

