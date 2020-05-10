package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The search API response.
  */
@js.native
trait SchemaSearchResponse extends js.Object {
  /**
    * Debugging information about the response.
    */
  var debugInfo: js.UndefOr[SchemaResponseDebugInfo] = js.native
  /**
    * Error information about the response.
    */
  var errorInfo: js.UndefOr[SchemaErrorInfo] = js.native
  /**
    * Repeated facet results.
    */
  var facetResults: js.UndefOr[js.Array[SchemaFacetResult]] = js.native
  /**
    * Whether there are more search results matching the query.
    */
  var hasMoreResults: js.UndefOr[Boolean] = js.native
  /**
    * Query interpretation result for user query. Empty if query interpretation
    * is disabled.
    */
  var queryInterpretation: js.UndefOr[SchemaQueryInterpretation] = js.native
  /**
    * The estimated result count for this query.
    */
  var resultCountEstimate: js.UndefOr[String] = js.native
  /**
    * The exact result count for this query.
    */
  var resultCountExact: js.UndefOr[String] = js.native
  /**
    * Expanded result count information.
    */
  var resultCounts: js.UndefOr[SchemaResultCounts] = js.native
  /**
    * Results from a search query.
    */
  var results: js.UndefOr[js.Array[SchemaSearchResult]] = js.native
  /**
    * Suggested spelling for the query.
    */
  var spellResults: js.UndefOr[js.Array[SchemaSpellResult]] = js.native
  /**
    * Structured results for the user query. These results are not counted
    * against the page_size.
    */
  var structuredResults: js.UndefOr[js.Array[SchemaStructuredResult]] = js.native
}

object SchemaSearchResponse {
  @scala.inline
  def apply(): SchemaSearchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchResponse]
  }
  @scala.inline
  implicit class SchemaSearchResponseOps[Self <: SchemaSearchResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDebugInfo(value: SchemaResponseDebugInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorInfo(value: SchemaErrorInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withFacetResults(value: js.Array[SchemaFacetResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facetResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFacetResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facetResults")(js.undefined)
        ret
    }
    @scala.inline
    def withHasMoreResults(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasMoreResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasMoreResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasMoreResults")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryInterpretation(value: SchemaQueryInterpretation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryInterpretation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryInterpretation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryInterpretation")(js.undefined)
        ret
    }
    @scala.inline
    def withResultCountEstimate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultCountEstimate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultCountEstimate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultCountEstimate")(js.undefined)
        ret
    }
    @scala.inline
    def withResultCountExact(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultCountExact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultCountExact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultCountExact")(js.undefined)
        ret
    }
    @scala.inline
    def withResultCounts(value: SchemaResultCounts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultCounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultCounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultCounts")(js.undefined)
        ret
    }
    @scala.inline
    def withResults(value: js.Array[SchemaSearchResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(js.undefined)
        ret
    }
    @scala.inline
    def withSpellResults(value: js.Array[SchemaSpellResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpellResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellResults")(js.undefined)
        ret
    }
    @scala.inline
    def withStructuredResults(value: js.Array[SchemaStructuredResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structuredResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStructuredResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structuredResults")(js.undefined)
        ret
    }
  }
  
}

