package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The search API request.
  */
@js.native
trait SchemaSearchRequest extends js.Object {
  /**
    * The sources to use for querying. If not specified, all data sources from
    * the current search application are used.
    */
  var dataSourceRestrictions: js.UndefOr[js.Array[SchemaDataSourceRestriction]] = js.native
  var facetOptions: js.UndefOr[js.Array[SchemaFacetOptions]] = js.native
  /**
    * Maximum number of search results to return in one page. Valid values are
    * between 1 and 100, inclusive. Default value is 10.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The raw query string. See supported search operators in the [Cloud search
    * Cheat
    * Sheet](https://gsuite.google.com/learning-center/products/cloudsearch/cheat-sheet/)
    */
  var query: js.UndefOr[String] = js.native
  /**
    * Options to interpret the user query.
    */
  var queryInterpretationOptions: js.UndefOr[SchemaQueryInterpretationOptions] = js.native
  /**
    * Request options, such as the search application and user timezone.
    */
  var requestOptions: js.UndefOr[SchemaRequestOptions] = js.native
  /**
    * The options for sorting the search results
    */
  var sortOptions: js.UndefOr[SchemaSortOptions] = js.native
  /**
    * Starting index of the results.
    */
  var start: js.UndefOr[Double] = js.native
}

object SchemaSearchRequest {
  @scala.inline
  def apply(): SchemaSearchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchRequest]
  }
  @scala.inline
  implicit class SchemaSearchRequestOps[Self <: SchemaSearchRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSourceRestrictions(value: js.Array[SchemaDataSourceRestriction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceRestrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSourceRestrictions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceRestrictions")(js.undefined)
        ret
    }
    @scala.inline
    def withFacetOptions(value: js.Array[SchemaFacetOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facetOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFacetOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facetOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryInterpretationOptions(value: SchemaQueryInterpretationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryInterpretationOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryInterpretationOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryInterpretationOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestOptions(value: SchemaRequestOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withSortOptions(value: SchemaSortOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
  }
  
}

