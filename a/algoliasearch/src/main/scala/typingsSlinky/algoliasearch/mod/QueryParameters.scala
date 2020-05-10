package typingsSlinky.algoliasearch.mod

import typingsSlinky.algoliasearch.algoliasearchStrings.all
import typingsSlinky.algoliasearch.algoliasearchStrings.allOptional
import typingsSlinky.algoliasearch.algoliasearchStrings.alpha
import typingsSlinky.algoliasearch.algoliasearchStrings.attribute
import typingsSlinky.algoliasearch.algoliasearchStrings.count
import typingsSlinky.algoliasearch.algoliasearchStrings.firstWords
import typingsSlinky.algoliasearch.algoliasearchStrings.ignorePlurals
import typingsSlinky.algoliasearch.algoliasearchStrings.lastWords
import typingsSlinky.algoliasearch.algoliasearchStrings.min
import typingsSlinky.algoliasearch.algoliasearchStrings.multiWordsSynonym
import typingsSlinky.algoliasearch.algoliasearchStrings.none
import typingsSlinky.algoliasearch.algoliasearchStrings.prefixAll
import typingsSlinky.algoliasearch.algoliasearchStrings.prefixLast
import typingsSlinky.algoliasearch.algoliasearchStrings.prefixNone
import typingsSlinky.algoliasearch.algoliasearchStrings.singleWordSynonym
import typingsSlinky.algoliasearch.algoliasearchStrings.strict
import typingsSlinky.algoliasearch.algoliasearchStrings.word
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryParameters extends js.Object {
  /**
    * Enables the advanced query syntax
    * default: false
    */
  var advancedSyntax: js.UndefOr[Boolean] = js.native
  /**
    * If set to false, disables typo tolerance on numeric tokens (numbers).
    * default:
    */
  var allowTyposOnNumericTokens: js.UndefOr[Boolean] = js.native
  /**
    * Specify the list of approximation that should be considered as an exact match in the ranking formula
    * default: ['ignorePlurals', 'singleWordSynonym']
    * 'ignorePlurals': alternative words added by the ignorePlurals feature
    * 'singleWordSynonym': single-word synonym (For example "NY" = "NYC")
    * 'multiWordsSynonym': multiple-words synonym
    */
  var alternativesAsExact: js.UndefOr[js.Array[ignorePlurals | singleWordSynonym | multiWordsSynonym]] = js.native
  /**
    * If set to false, this query will not be taken into account in the analytics feature.
    * default true
    */
  var analytics: js.UndefOr[Boolean] = js.native
  /**
    * If set, tag your query with the specified identifiers
    * default: []
    */
  var analyticsTags: js.UndefOr[js.Array[String]] = js.native
  /**
    * Search for entries around a given location
    * default: ""
    */
  var aroundLatLng: js.UndefOr[String] = js.native
  /**
    * Search for entries around a given latitude/longitude automatically computed from user IP address.
    * default: ""
    */
  var aroundLatLngViaIP: js.UndefOr[Boolean] = js.native
  /**
    * Control the precision of a geo search
    * default: null
    */
  var aroundPrecision: js.UndefOr[Double] = js.native
  /**
    * Control the radius associated with a geo search. Defined in meters.
    * default: null
    * You can specify aroundRadius=all if you want to compute the geo distance without filtering in a geo area
    */
  var aroundRadius: js.UndefOr[Double | all] = js.native
  /**
    * Default list of attributes to highlight. If set to null, all indexed attributes are highlighted.
    * default: null
    */
  var attributesToHighlight: js.UndefOr[js.Array[String]] = js.native
  /**
    * A string that contains the list of attributes you want to retrieve in order to minimize the size of the JSON answer.
    * default: *
    */
  var attributesToRetrieve: js.UndefOr[js.Array[String]] = js.native
  /**
    * Default list of attributes to snippet alongside the number of words to return
    * default: null
    */
  var attributesToSnippet: js.UndefOr[js.Array[String]] = js.native
  /**
    * If set to true, enables the Click Analytics feature
    * default false
    */
  var clickAnalytics: js.UndefOr[Boolean] = js.native
  /**
    * List of attributes on which you want to disable the computation of exact criteria
    * default: []
    */
  var disableExactOnAttributes: js.UndefOr[js.Array[String]] = js.native
  /**
    * List of attributes on which you want to disable typo tolerance
    * default: []
    */
  var disableTypoToleranceOnAttributes: js.UndefOr[js.Array[String]] = js.native
  /**
    * If set to 1, enables the distinct feature, disabled by default, if the attributeForDistinct index setting is set.
    */
  var distinct: js.UndefOr[Double | Boolean] = js.native
  /**
    * allow the usage of an AB-test. This parameter is only allowed for queries, not for settings.
    * default: true
    */
  var enableABTest: js.UndefOr[Boolean] = js.native
  /**
    * This parameter control how the exact ranking criterion is computed when the query contains one word
    * default: attribute
    * 'none': no exact on single word query
    * 'word': exact set to 1 if the query word is found in the record
    * 'attribute': exact set to 1 if there is an attribute containing a string equals to the query
    */
  var exactOnSingleWordQuery: js.UndefOr[attribute | none | word] = js.native
  /**
    * Filter the query by a set of facets.
    * Default: []
    */
  var facetFilters: js.UndefOr[js.Array[String | js.Array[String]]] = js.native
  /**
    * Force faceting to be applied after de-duplication (via the Distinct setting).
    * When using the distinct setting in combination with faceting, facet counts may be higher than expected.
    * This is because the engine, by default, computes faceting before applying de-duplication (distinct).
    * When facetingAfterDistinct is set to true, the engine calculates faceting after the de-duplication has been applied.
    * default ""
    */
  var facetingAfterDistinct: js.UndefOr[Boolean] = js.native
  /**
    * You can use facets to retrieve only a part of your attributes declared in attributesForFaceting attributes
    * default: []
    */
  var facets: js.UndefOr[js.Array[String]] = js.native
  /**
    * Filter the query with numeric, facet or/and tag filters
    * default: ""
    */
  var filters: js.UndefOr[String] = js.native
  /**
    * If set to true, the result hits will contain ranking information in the _rankingInfo attribute.
    * default: false
    */
  var getRankingInfo: js.UndefOr[Boolean] = js.native
  /**
    * Specify the string that is inserted after the highlighted parts in the query result
    * default: </em>
    */
  var highlightPostTag: js.UndefOr[String] = js.native
  /**
    * Specify the string that is inserted before the highlighted parts in the query result
    * default: <em>
    */
  var highlightPreTag: js.UndefOr[String] = js.native
  /**
    * Pagination parameter used to select the number of hits per page
    * default: 20
    */
  var hitsPerPage: js.UndefOr[Double] = js.native
  /**
    * If set to true, plural won't be considered as a typo
    * default: false
    */
  var ignorePlurals: js.UndefOr[Boolean] = js.native
  /**
    * Search entries inside a given area defined by the two extreme points of a rectangle
    * default: null
    */
  var insideBoundingBox: js.UndefOr[js.Array[js.Array[Double]]] = js.native
  /**
    * Search entries inside a given area defined by a set of points
    * defauly: ''
    */
  var insidePolygon: js.UndefOr[js.Array[js.Array[Double]]] = js.native
  /**
    * Number of hits to return.
    * default: null
    */
  var length: js.UndefOr[Double] = js.native
  /**
    * Limit the number of facet values returned for each facet.
    * default: 100
    */
  var maxValuesPerFacet: js.UndefOr[Double] = js.native
  /**
    * Configure the precision of the proximity ranking criterion
    * default: 1
    */
  var minProximity: js.UndefOr[Double] = js.native
  /**
    * The minimum number of characters needed to accept one typo.
    * default: 4
    */
  var minWordSizefor1Typo: js.UndefOr[Double] = js.native
  /**
    * The minimum number of characters needed to accept two typo.
    * fault: 8
    */
  var minWordSizefor2Typos: js.UndefOr[Double] = js.native
  /**
    * Define the minimum radius used for a geo search when aroundRadius is not set.
    * default: null
    */
  var minimumAroundRadius: js.UndefOr[Double] = js.native
  var nbShards: js.UndefOr[Double] = js.native
  /**
    * All numerical attributes are automatically indexed as numerical filters
    */
  var numericAttributesForFiltering: js.UndefOr[js.Array[String]] = js.native
  /**
    * @deprecated Use `numericAttributesForFiltering` instead
    * All numerical attributes are automatically indexed as numerical filters
    */
  var numericAttributesToIndex: js.UndefOr[js.Array[String]] = js.native
  /**
    * @deprecated please use filters instead
    * A string that contains the comma separated list of numeric filters you want to apply.
    */
  var numericFilters: js.UndefOr[js.Array[String]] = js.native
  /**
    * Offset of the first hit to return
    * default: null
    */
  var offset: js.UndefOr[Double] = js.native
  /**
    * A string that contains the comma separated list of words that should be considered as optional when found in the query
    * default: []
    */
  var optionalWords: js.UndefOr[js.Array[String]] = js.native
  /**
    * Pagination parameter used to select the page to retrieve.
    * default: 0
    */
  var page: js.UndefOr[Double] = js.native
  /**
    * Query string used to perform the search
    * default: ''
    */
  var query: js.UndefOr[String] = js.native
  /**
    * Selects how the query words are interpreted
    * default: 'prefixLast'
    * 'prefixAll' All query words are interpreted as prefixes. This option is not recommended.
    * 'prefixLast' Only the last word is interpreted as a prefix (default behavior).
    * 'prefixNone' No query word is interpreted as a prefix. This option is not recommended.
    */
  var queryType: js.UndefOr[prefixAll | prefixLast | prefixNone] = js.native
  /**
    * Remove stop words from the query before executing it
    * default: false
    * true|false: enable or disable stop words for all 41 supported languages; or
    * a list of language ISO codes (as a comma-separated string) for which stop words should be enable
    */
  var removeStopWords: js.UndefOr[Boolean | js.Array[String]] = js.native
  /**
    * This option is used to select a strategy in order to avoid having an empty result page
    * default: 'none'
    * 'lastWords' When a query does not return any results, the last word will be added as optional
    * 'firstWords' When a query does not return any results, the first word will be added as optional
    * 'allOptional' When a query does not return any results, a second trial will be made with all words as optional
    * 'none' No specific processing is done when a query does not return any results
    */
  var removeWordsIfNoResults: js.UndefOr[none | lastWords | firstWords | allOptional] = js.native
  /**
    * If set to false, words matched via synonym expansion will not be replaced by the matched synonym in the highlighted result.
    * default: true
    */
  var replaceSynonymsInHighlight: js.UndefOr[Boolean] = js.native
  /**
    * If set to true, restrict arrays in highlights and snippets to items that matched the query at least partially else return all array items in highlights and snippets
    * default: false
    */
  var restrictHighlightAndSnippetArrays: js.UndefOr[Boolean] = js.native
  /**
    * List of attributes you want to use for textual search
    * default: attributeToIndex
    */
  var restrictSearchableAttributes: js.UndefOr[js.Array[String]] = js.native
  var ruleContexts: js.UndefOr[js.Array[String]] = js.native
  /**
    * String used as an ellipsis indicator when a snippet is truncated.
    * default: …
    */
  var snippetEllipsisText: js.UndefOr[String] = js.native
  var sortFacetValuesBy: js.UndefOr[count | alpha] = js.native
  /**
    * Determines how to calculate the total score for filtering
    * default: false
    * https://www.algolia.com/doc/api-reference/api-parameters/sumOrFiltersScores/
    */
  var sumOrFiltersScores: js.UndefOr[Boolean] = js.native
  /**
    * If set to false, the search will not use the synonyms defined for the targeted index.
    * default: true
    */
  var synonyms: js.UndefOr[Boolean] = js.native
  /**
    * @deprecated
    *
    * Filter the query by a set of tags.
    * Default: []
    */
  var tagFilters: js.UndefOr[js.Array[String | js.Array[String]]] = js.native
  /**
    * This option allows you to control the number of typos allowed in the result set:
    * default: true
    * 'true' The typo tolerance is enabled and all matching hits are retrieved
    * 'false' The typo tolerance is disabled. All results with typos will be hidden.
    * 'min' Only keep results with the minimum number of typos
    * 'strict' Hits matching with 2 typos are not retrieved if there are some matching without typos.
    */
  var typoTolerance: js.UndefOr[Boolean | min | strict] = js.native
  var userData: js.UndefOr[String | js.Object] = js.native
  /**
    * Associates a certain user token with the current search
    * https://www.algolia.com/doc/api-reference/api-parameters/userToken/
    */
  var userToken: js.UndefOr[String] = js.native
}

object QueryParameters {
  @scala.inline
  def apply(): QueryParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryParameters]
  }
  @scala.inline
  implicit class QueryParametersOps[Self <: QueryParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdvancedSyntax(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advancedSyntax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvancedSyntax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advancedSyntax")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowTyposOnNumericTokens(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTyposOnNumericTokens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowTyposOnNumericTokens: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTyposOnNumericTokens")(js.undefined)
        ret
    }
    @scala.inline
    def withAlternativesAsExact(value: js.Array[ignorePlurals | singleWordSynonym | multiWordsSynonym]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternativesAsExact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlternativesAsExact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternativesAsExact")(js.undefined)
        ret
    }
    @scala.inline
    def withAnalytics(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analytics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnalytics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analytics")(js.undefined)
        ret
    }
    @scala.inline
    def withAnalyticsTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyticsTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnalyticsTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyticsTags")(js.undefined)
        ret
    }
    @scala.inline
    def withAroundLatLng(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aroundLatLng")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAroundLatLng: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aroundLatLng")(js.undefined)
        ret
    }
    @scala.inline
    def withAroundLatLngViaIP(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aroundLatLngViaIP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAroundLatLngViaIP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aroundLatLngViaIP")(js.undefined)
        ret
    }
    @scala.inline
    def withAroundPrecision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aroundPrecision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAroundPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aroundPrecision")(js.undefined)
        ret
    }
    @scala.inline
    def withAroundRadius(value: Double | all): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aroundRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAroundRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aroundRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributesToHighlight(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributesToHighlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributesToHighlight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributesToHighlight")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributesToRetrieve(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributesToRetrieve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributesToRetrieve: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributesToRetrieve")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributesToSnippet(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributesToSnippet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributesToSnippet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributesToSnippet")(js.undefined)
        ret
    }
    @scala.inline
    def withClickAnalytics(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickAnalytics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickAnalytics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickAnalytics")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableExactOnAttributes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableExactOnAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableExactOnAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableExactOnAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableTypoToleranceOnAttributes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableTypoToleranceOnAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableTypoToleranceOnAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableTypoToleranceOnAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withDistinct(value: Double | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distinct")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistinct: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distinct")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableABTest(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableABTest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableABTest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableABTest")(js.undefined)
        ret
    }
    @scala.inline
    def withExactOnSingleWordQuery(value: attribute | none | word): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exactOnSingleWordQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExactOnSingleWordQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exactOnSingleWordQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withFacetFilters(value: js.Array[String | js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facetFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFacetFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facetFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withFacetingAfterDistinct(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facetingAfterDistinct")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFacetingAfterDistinct: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facetingAfterDistinct")(js.undefined)
        ret
    }
    @scala.inline
    def withFacets(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFacets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facets")(js.undefined)
        ret
    }
    @scala.inline
    def withFilters(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRankingInfo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRankingInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetRankingInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRankingInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightPostTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightPostTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightPostTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightPostTag")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightPreTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightPreTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightPreTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightPreTag")(js.undefined)
        ret
    }
    @scala.inline
    def withHitsPerPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitsPerPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHitsPerPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitsPerPage")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnorePlurals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorePlurals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnorePlurals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorePlurals")(js.undefined)
        ret
    }
    @scala.inline
    def withInsideBoundingBox(value: js.Array[js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insideBoundingBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsideBoundingBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insideBoundingBox")(js.undefined)
        ret
    }
    @scala.inline
    def withInsidePolygon(value: js.Array[js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insidePolygon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsidePolygon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insidePolygon")(js.undefined)
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxValuesPerFacet(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValuesPerFacet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxValuesPerFacet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValuesPerFacet")(js.undefined)
        ret
    }
    @scala.inline
    def withMinProximity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minProximity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinProximity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minProximity")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWordSizefor1Typo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWordSizefor1Typo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWordSizefor1Typo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWordSizefor1Typo")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWordSizefor2Typos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWordSizefor2Typos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWordSizefor2Typos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWordSizefor2Typos")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumAroundRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumAroundRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumAroundRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumAroundRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withNbShards(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nbShards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNbShards: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nbShards")(js.undefined)
        ret
    }
    @scala.inline
    def withNumericAttributesForFiltering(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numericAttributesForFiltering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumericAttributesForFiltering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numericAttributesForFiltering")(js.undefined)
        ret
    }
    @scala.inline
    def withNumericAttributesToIndex(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numericAttributesToIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumericAttributesToIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numericAttributesToIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withNumericFilters(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numericFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumericFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numericFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionalWords(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalWords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionalWords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalWords")(js.undefined)
        ret
    }
    @scala.inline
    def withPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(js.undefined)
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
    def withQueryType(value: prefixAll | prefixLast | prefixNone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryType")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveStopWords(value: Boolean | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeStopWords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveStopWords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeStopWords")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveWordsIfNoResults(value: none | lastWords | firstWords | allOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeWordsIfNoResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveWordsIfNoResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeWordsIfNoResults")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceSynonymsInHighlight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceSynonymsInHighlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceSynonymsInHighlight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceSynonymsInHighlight")(js.undefined)
        ret
    }
    @scala.inline
    def withRestrictHighlightAndSnippetArrays(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictHighlightAndSnippetArrays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestrictHighlightAndSnippetArrays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictHighlightAndSnippetArrays")(js.undefined)
        ret
    }
    @scala.inline
    def withRestrictSearchableAttributes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictSearchableAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestrictSearchableAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictSearchableAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withRuleContexts(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleContexts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleContexts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleContexts")(js.undefined)
        ret
    }
    @scala.inline
    def withSnippetEllipsisText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snippetEllipsisText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnippetEllipsisText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snippetEllipsisText")(js.undefined)
        ret
    }
    @scala.inline
    def withSortFacetValuesBy(value: count | alpha): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortFacetValuesBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortFacetValuesBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortFacetValuesBy")(js.undefined)
        ret
    }
    @scala.inline
    def withSumOrFiltersScores(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sumOrFiltersScores")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSumOrFiltersScores: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sumOrFiltersScores")(js.undefined)
        ret
    }
    @scala.inline
    def withSynonyms(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synonyms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSynonyms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synonyms")(js.undefined)
        ret
    }
    @scala.inline
    def withTagFilters(value: js.Array[String | js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withTypoTolerance(value: Boolean | min | strict): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typoTolerance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypoTolerance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typoTolerance")(js.undefined)
        ret
    }
    @scala.inline
    def withUserData(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userData")(js.undefined)
        ret
    }
    @scala.inline
    def withUserToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userToken")(js.undefined)
        ret
    }
  }
  
}

