package typingsSlinky.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryRequest extends js.Object {
  /**
    * Enables filtered searches based on document attributes. You can only provide one attribute filter; however, the AndAllFilters, NotFilter, and OrAllFilters parameters contain a list of other filters. The AttributeFilter parameter enables you to create a set of filtering rules that a document must satisfy to be included in the query results.
    */
  var AttributeFilter: js.UndefOr[typingsSlinky.awsSdk.kendraMod.AttributeFilter] = js.native
  /**
    * An array of documents attributes. Amazon Kendra returns a count for each attribute key specified. You can use this information to help narrow the search for your user.
    */
  var Facets: js.UndefOr[FacetList] = js.native
  /**
    * The unique identifier of the index to search. The identifier is returned in the response from the operation.
    */
  var IndexId: typingsSlinky.awsSdk.kendraMod.IndexId = js.native
  /**
    * Query results are returned in pages the size of the PageSize parameter. By default, Amazon Kendra returns the first page of results. Use this parameter to get result pages after the first one.
    */
  var PageNumber: js.UndefOr[Integer] = js.native
  /**
    * Sets the number of results that are returned in each page of results. The default page size is 100.
    */
  var PageSize: js.UndefOr[Integer] = js.native
  /**
    * Sets the type of query. Only results for the specified query type are returned.
    */
  var QueryResultTypeFilter: js.UndefOr[QueryResultType] = js.native
  /**
    * The text to search for.
    */
  var QueryText: typingsSlinky.awsSdk.kendraMod.QueryText = js.native
  /**
    * An array of document attributes to include in the response. No other document attributes are included in the response. By default all document attributes are included in the response. 
    */
  var RequestedDocumentAttributes: js.UndefOr[DocumentAttributeKeyList] = js.native
}

object QueryRequest {
  @scala.inline
  def apply(IndexId: IndexId, QueryText: QueryText): QueryRequest = {
    val __obj = js.Dynamic.literal(IndexId = IndexId.asInstanceOf[js.Any], QueryText = QueryText.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryRequest]
  }
  @scala.inline
  implicit class QueryRequestOps[Self <: QueryRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndexId(value: IndexId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryText(value: QueryText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueryText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributeFilter(value: AttributeFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withFacets(value: FacetList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Facets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFacets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Facets")(js.undefined)
        ret
    }
    @scala.inline
    def withPageNumber(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSize(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryResultTypeFilter(value: QueryResultType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueryResultTypeFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryResultTypeFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueryResultTypeFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestedDocumentAttributes(value: DocumentAttributeKeyList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestedDocumentAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestedDocumentAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestedDocumentAttributes")(js.undefined)
        ret
    }
  }
  
}

