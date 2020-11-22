package typingsSlinky.algoliaClientSearch.mod

import typingsSlinky.algoliaClientSearch.algoliaClientSearchStrings.all
import typingsSlinky.algoliaClientSearch.algoliaClientSearchStrings.allOptional
import typingsSlinky.algoliaClientSearch.algoliaClientSearchStrings.alpha
import typingsSlinky.algoliaClientSearch.algoliaClientSearchStrings.attribute
import typingsSlinky.algoliaClientSearch.algoliaClientSearchStrings.count
import typingsSlinky.algoliaClientSearch.algoliaClientSearchStrings.exactPhrase
import typingsSlinky.algoliaClientSearch.algoliaClientSearchStrings.excludeWords
import typingsSlinky.algoliaClientSearch.algoliaClientSearchStrings.firstWords
import typingsSlinky.algoliaClientSearch.algoliaClientSearchStrings.ignorePlurals
import typingsSlinky.algoliaClientSearch.algoliaClientSearchStrings.lastWords
import typingsSlinky.algoliaClientSearch.algoliaClientSearchStrings.min
import typingsSlinky.algoliaClientSearch.algoliaClientSearchStrings.multiWordsSynonym
import typingsSlinky.algoliaClientSearch.algoliaClientSearchStrings.none
import typingsSlinky.algoliaClientSearch.algoliaClientSearchStrings.prefixAll
import typingsSlinky.algoliaClientSearch.algoliaClientSearchStrings.prefixLast
import typingsSlinky.algoliaClientSearch.algoliaClientSearchStrings.prefixNone
import typingsSlinky.algoliaClientSearch.algoliaClientSearchStrings.singleWordSynonym
import typingsSlinky.algoliaClientSearch.algoliaClientSearchStrings.strict
import typingsSlinky.algoliaClientSearch.algoliaClientSearchStrings.word
import typingsSlinky.algoliaClientSearch.anon.From
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @algolia/client-search.@algolia/client-search.SearchOptions & { readonly validUntil :number | undefined,  readonly restrictIndices :std.Array<string> | string | undefined,  readonly restrictSources :string | undefined,  readonly userToken :string | undefined} */
@js.native
trait SecuredApiKeyRestrictions extends js.Object {
  
  /**
    * Enables the advanced query syntax.
    */
  val advancedSyntax: js.UndefOr[Boolean] = js.native
  
  /**
    * AdvancedSyntaxFeatures can be exactPhrase or excludeWords
    */
  val advancedSyntaxFeatures: js.UndefOr[js.Array[exactPhrase | excludeWords]] = js.native
  
  /**
    * Whether to allow typos on numbers (“numeric tokens”) in the query string.
    */
  val allowTyposOnNumericTokens: js.UndefOr[Boolean] = js.native
  
  /**
    * List of alternatives that should be considered an exact match by the exact ranking criterion.
    */
  val alternativesAsExact: js.UndefOr[
    js.Array[
      typingsSlinky.algoliaClientSearch.algoliaClientSearchStrings.ignorePlurals | singleWordSynonym | multiWordsSynonym
    ]
  ] = js.native
  
  /**
    * Whether the current query will be taken into account in the Analytics
    */
  val analytics: js.UndefOr[Boolean] = js.native
  
  /**
    * List of tags to apply to the query in the analytics.
    */
  val analyticsTags: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Search for entries around a central geolocation, enabling a geo search within a circular area.
    */
  val aroundLatLng: js.UndefOr[String] = js.native
  
  /**
    * Search for entries around a given location automatically computed from the requester’s IP address.
    */
  val aroundLatLngViaIP: js.UndefOr[Boolean] = js.native
  
  /**
    * Precision of geo search (in meters), to add grouping by geo location to the ranking formula.
    */
  val aroundPrecision: js.UndefOr[Double | js.Array[From]] = js.native
  
  /**
    * Search for entries around a given location automatically computed from the requester’s IP address.
    */
  val aroundRadius: js.UndefOr[Double | all] = js.native
  
  /**
    * List of attributes to highlight.
    */
  val attributesToHighlight: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Gives control over which attributes to retrieve and which not to retrieve.
    */
  val attributesToRetrieve: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * List of attributes to snippet, with an optional maximum number of words to snippet.
    */
  val attributesToSnippet: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Enable the Click Analytics feature.
    */
  val clickAnalytics: js.UndefOr[Boolean] = js.native
  
  /**
    * List of attributes on which you want to disable the exact ranking criterion.
    */
  val disableExactOnAttributes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * List of attributes on which you want to disable typo tolerance.
    */
  val disableTypoToleranceOnAttributes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Enables de-duplication or grouping of results.
    */
  val distinct: js.UndefOr[Boolean | Double] = js.native
  
  /**
    * Can be to enable or disable A/B tests at query time.
    * Engine's default: true
    */
  val enableABTest: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable personalization for the query
    */
  val enablePersonalization: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether rules should be globally enabled.
    */
  val enableRules: js.UndefOr[Boolean] = js.native
  
  /**
    * Controls how the exact ranking criterion is computed when the query contains only one word.
    */
  val exactOnSingleWordQuery: js.UndefOr[attribute | none | word] = js.native
  
  /**
    *  Filter hits by facet value.
    */
  val facetFilters: js.UndefOr[String | (js.Array[js.Array[String] | String])] = js.native
  
  /**
    *  Force faceting to be applied after de-duplication (via the Distinct setting).
    */
  val facetingAfterDistinct: js.UndefOr[Boolean] = js.native
  
  /**
    * Facets to retrieve.
    */
  val facets: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Filter the query with numeric, facet and/or tag filters.
    */
  val filters: js.UndefOr[String] = js.native
  
  /**
    * When true, each hit in the response contains an additional _rankingInfo object.
    */
  val getRankingInfo: js.UndefOr[Boolean] = js.native
  
  /**
    * The HTML string to insert after the highlighted parts in all highlight and snippet results
    */
  val highlightPostTag: js.UndefOr[String] = js.native
  
  /**
    * The HTML string to insert before the highlighted parts in all highlight and snippet results.
    */
  val highlightPreTag: js.UndefOr[String] = js.native
  
  /**
    * Set the number of hits per page.
    */
  val hitsPerPage: js.UndefOr[Double] = js.native
  
  /**
    * Treats singular, plurals, and other forms of declensions as matching terms.
    */
  val ignorePlurals: js.UndefOr[Boolean | js.Array[String]] = js.native
  
  /**
    * Search inside a rectangular area (in geo coordinates).
    */
  val insideBoundingBox: js.UndefOr[js.Array[js.Array[Double]]] = js.native
  
  /**
    * Search inside a polygon (in geo coordinates).
    */
  val insidePolygon: js.UndefOr[js.Array[js.Array[Double]]] = js.native
  
  /**
    * Set the number of hits to retrieve (used only with offset).
    */
  val length: js.UndefOr[Double] = js.native
  
  /**
    * Maximum number of facet hits to return during a search for facet values.
    */
  val maxFacetHits: js.UndefOr[Double] = js.native
  
  /**
    * Maximum number of facet values to return for each facet during a regular search.
    */
  val maxValuesPerFacet: js.UndefOr[Double] = js.native
  
  /**
    * Precision of the proximity ranking criterion.
    */
  val minProximity: js.UndefOr[Double] = js.native
  
  /**
    * Minimum number of characters a word in the query string must contain to accept matches with 1 typo
    */
  val minWordSizefor1Typo: js.UndefOr[Double] = js.native
  
  /**
    * Minimum number of characters a word in the query string must contain to accept matches with 2 typos.
    */
  val minWordSizefor2Typos: js.UndefOr[Double] = js.native
  
  /**
    * Minimum radius (in meters) used for a geo search when aroundRadius is not set.
    */
  val minimumAroundRadius: js.UndefOr[Double] = js.native
  
  /**
    * List of supported languages with their associated language ISO code.
    *
    * Apply a set of natural language best practices such as ignorePlurals,
    * removeStopWords, removeWordsIfNoResults, analyticsTags and ruleContexts.
    */
  val naturalLanguages: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Filter on numeric attributes.
    */
  val numericFilters: js.UndefOr[String | (js.Array[js.Array[String] | String])] = js.native
  
  /**
    * Specify the offset of the first hit to return.
    */
  val offset: js.UndefOr[Double] = js.native
  
  /**
    * Create filters for ranking purposes, where records that match the filter are ranked highest.
    */
  val optionalFilters: js.UndefOr[String | (js.Array[js.Array[String] | String])] = js.native
  
  /**
    * A list of words that should be considered as optional when found in the query.
    */
  val optionalWords: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * Specify the page to retrieve.
    */
  val page: js.UndefOr[Double] = js.native
  
  /**
    * Whether to include or exclude a query from the processing-time percentile computation.
    */
  val percentileComputation: js.UndefOr[Boolean] = js.native
  
  /**
    * The `personalizationImpact` parameter sets the percentage of the impact that personalization has on ranking records. The
    * value must be between 0 and 100 (inclusive). This parameter will not be taken into account if `enablePersonalization`
    * is **false**.
    */
  val personalizationImpact: js.UndefOr[Double] = js.native
  
  /**
    * Create a new query with an empty search query.
    */
  val query: js.UndefOr[String] = js.native
  
  /**
    * Controls if and how query words are interpreted as prefixes.
    */
  val queryType: js.UndefOr[prefixLast | prefixAll | prefixNone] = js.native
  
  /**
    * Removes stop (common) words from the query before executing it.
    */
  val removeStopWords: js.UndefOr[Boolean | js.Array[String]] = js.native
  
  /**
    * Selects a strategy to remove words from the query when it doesn’t match any hits.
    */
  val removeWordsIfNoResults: js.UndefOr[none | lastWords | firstWords | allOptional] = js.native
  
  /**
    * Whether to highlight and snippet the original word that matches the synonym or the synonym itself.
    */
  val replaceSynonymsInHighlight: js.UndefOr[Boolean] = js.native
  
  /**
    * Choose which fields the response will contain. Applies to search and browse queries.
    */
  val responseFields: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Restrict highlighting and snippeting to items that matched the query.
    */
  val restrictHighlightAndSnippetArrays: js.UndefOr[Boolean] = js.native
  
  /**
    * List of index names that can be queried.
    */
  val restrictIndices: js.UndefOr[js.Array[String] | String] = js.native
  
  /**
    * Restricts a given query to look in only a subset of your searchable attributes.
    */
  val restrictSearchableAttributes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * IPv4 network allowed to use the generated key. This is used for more protection against API key leaking and reuse.
    */
  val restrictSources: js.UndefOr[String] = js.native
  
  /**
    * Enables contextual rules.
    */
  val ruleContexts: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Allows a search for similar objects, but the query has to be constructed on your end and included alongside an empty query.
    *
    * The similarQuery should be made from the tags and keywords of the relevant object.
    */
  val similarQuery: js.UndefOr[String] = js.native
  
  /**
    * String used as an ellipsis indicator when a snippet is truncated.
    */
  val snippetEllipsisText: js.UndefOr[String] = js.native
  
  /**
    * Restricts a given query to look in only a subset of your searchable attributes.
    */
  val sortFacetValuesBy: js.UndefOr[count | alpha] = js.native
  
  /**
    * Determines how to calculate the total score for filtering.
    */
  val sumOrFiltersScores: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to take into account an index’s synonyms for a particular search.
    */
  val synonyms: js.UndefOr[Boolean] = js.native
  
  /**
    * Filter hits by tags. tagFilters is a different way of filtering, which relies on the _tags
    * attribute. It uses a simpler syntax than filters. You can use it when you want to do
    * simple filtering based on tags.
    */
  val tagFilters: js.UndefOr[String | (js.Array[js.Array[String] | String])] = js.native
  
  /**
    * Controls whether typo tolerance is enabled and how it is applied.
    */
  val typoTolerance: js.UndefOr[Boolean | min | strict] = js.native
  
  /**
    * A user identifier.
    * Format: alpha numeric string [a-zA-Z0-9_-]
    * Length: between 1 and 64 characters.
    */
  /**
    * Specify a user identifier. This is often used with rate limits.
    */
  val userToken: js.UndefOr[String] = js.native
  
  /**
    * A Unix timestamp used to define the expiration date of the API key.
    */
  val validUntil: js.UndefOr[Double] = js.native
}
object SecuredApiKeyRestrictions {
  
  @scala.inline
  def apply(): SecuredApiKeyRestrictions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecuredApiKeyRestrictions]
  }
  
  @scala.inline
  implicit class SecuredApiKeyRestrictionsOps[Self <: SecuredApiKeyRestrictions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdvancedSyntax(value: Boolean): Self = this.set("advancedSyntax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvancedSyntax: Self = this.set("advancedSyntax", js.undefined)
    
    @scala.inline
    def setAdvancedSyntaxFeaturesVarargs(value: (exactPhrase | excludeWords)*): Self = this.set("advancedSyntaxFeatures", js.Array(value :_*))
    
    @scala.inline
    def setAdvancedSyntaxFeatures(value: js.Array[exactPhrase | excludeWords]): Self = this.set("advancedSyntaxFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvancedSyntaxFeatures: Self = this.set("advancedSyntaxFeatures", js.undefined)
    
    @scala.inline
    def setAllowTyposOnNumericTokens(value: Boolean): Self = this.set("allowTyposOnNumericTokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowTyposOnNumericTokens: Self = this.set("allowTyposOnNumericTokens", js.undefined)
    
    @scala.inline
    def setAlternativesAsExactVarargs(value: (ignorePlurals | singleWordSynonym | multiWordsSynonym)*): Self = this.set("alternativesAsExact", js.Array(value :_*))
    
    @scala.inline
    def setAlternativesAsExact(value: js.Array[ignorePlurals | singleWordSynonym | multiWordsSynonym]): Self = this.set("alternativesAsExact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlternativesAsExact: Self = this.set("alternativesAsExact", js.undefined)
    
    @scala.inline
    def setAnalytics(value: Boolean): Self = this.set("analytics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalytics: Self = this.set("analytics", js.undefined)
    
    @scala.inline
    def setAnalyticsTagsVarargs(value: String*): Self = this.set("analyticsTags", js.Array(value :_*))
    
    @scala.inline
    def setAnalyticsTags(value: js.Array[String]): Self = this.set("analyticsTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalyticsTags: Self = this.set("analyticsTags", js.undefined)
    
    @scala.inline
    def setAroundLatLng(value: String): Self = this.set("aroundLatLng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAroundLatLng: Self = this.set("aroundLatLng", js.undefined)
    
    @scala.inline
    def setAroundLatLngViaIP(value: Boolean): Self = this.set("aroundLatLngViaIP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAroundLatLngViaIP: Self = this.set("aroundLatLngViaIP", js.undefined)
    
    @scala.inline
    def setAroundPrecisionVarargs(value: From*): Self = this.set("aroundPrecision", js.Array(value :_*))
    
    @scala.inline
    def setAroundPrecision(value: Double | js.Array[From]): Self = this.set("aroundPrecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAroundPrecision: Self = this.set("aroundPrecision", js.undefined)
    
    @scala.inline
    def setAroundRadius(value: Double | all): Self = this.set("aroundRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAroundRadius: Self = this.set("aroundRadius", js.undefined)
    
    @scala.inline
    def setAttributesToHighlightVarargs(value: String*): Self = this.set("attributesToHighlight", js.Array(value :_*))
    
    @scala.inline
    def setAttributesToHighlight(value: js.Array[String]): Self = this.set("attributesToHighlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributesToHighlight: Self = this.set("attributesToHighlight", js.undefined)
    
    @scala.inline
    def setAttributesToRetrieveVarargs(value: String*): Self = this.set("attributesToRetrieve", js.Array(value :_*))
    
    @scala.inline
    def setAttributesToRetrieve(value: js.Array[String]): Self = this.set("attributesToRetrieve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributesToRetrieve: Self = this.set("attributesToRetrieve", js.undefined)
    
    @scala.inline
    def setAttributesToSnippetVarargs(value: String*): Self = this.set("attributesToSnippet", js.Array(value :_*))
    
    @scala.inline
    def setAttributesToSnippet(value: js.Array[String]): Self = this.set("attributesToSnippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributesToSnippet: Self = this.set("attributesToSnippet", js.undefined)
    
    @scala.inline
    def setClickAnalytics(value: Boolean): Self = this.set("clickAnalytics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickAnalytics: Self = this.set("clickAnalytics", js.undefined)
    
    @scala.inline
    def setDisableExactOnAttributesVarargs(value: String*): Self = this.set("disableExactOnAttributes", js.Array(value :_*))
    
    @scala.inline
    def setDisableExactOnAttributes(value: js.Array[String]): Self = this.set("disableExactOnAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableExactOnAttributes: Self = this.set("disableExactOnAttributes", js.undefined)
    
    @scala.inline
    def setDisableTypoToleranceOnAttributesVarargs(value: String*): Self = this.set("disableTypoToleranceOnAttributes", js.Array(value :_*))
    
    @scala.inline
    def setDisableTypoToleranceOnAttributes(value: js.Array[String]): Self = this.set("disableTypoToleranceOnAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableTypoToleranceOnAttributes: Self = this.set("disableTypoToleranceOnAttributes", js.undefined)
    
    @scala.inline
    def setDistinct(value: Boolean | Double): Self = this.set("distinct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistinct: Self = this.set("distinct", js.undefined)
    
    @scala.inline
    def setEnableABTest(value: Boolean): Self = this.set("enableABTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableABTest: Self = this.set("enableABTest", js.undefined)
    
    @scala.inline
    def setEnablePersonalization(value: Boolean): Self = this.set("enablePersonalization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePersonalization: Self = this.set("enablePersonalization", js.undefined)
    
    @scala.inline
    def setEnableRules(value: Boolean): Self = this.set("enableRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableRules: Self = this.set("enableRules", js.undefined)
    
    @scala.inline
    def setExactOnSingleWordQuery(value: attribute | none | word): Self = this.set("exactOnSingleWordQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExactOnSingleWordQuery: Self = this.set("exactOnSingleWordQuery", js.undefined)
    
    @scala.inline
    def setFacetFiltersVarargs(value: (js.Array[String] | String)*): Self = this.set("facetFilters", js.Array(value :_*))
    
    @scala.inline
    def setFacetFilters(value: String | (js.Array[js.Array[String] | String])): Self = this.set("facetFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFacetFilters: Self = this.set("facetFilters", js.undefined)
    
    @scala.inline
    def setFacetingAfterDistinct(value: Boolean): Self = this.set("facetingAfterDistinct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFacetingAfterDistinct: Self = this.set("facetingAfterDistinct", js.undefined)
    
    @scala.inline
    def setFacetsVarargs(value: String*): Self = this.set("facets", js.Array(value :_*))
    
    @scala.inline
    def setFacets(value: js.Array[String]): Self = this.set("facets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFacets: Self = this.set("facets", js.undefined)
    
    @scala.inline
    def setFilters(value: String): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setGetRankingInfo(value: Boolean): Self = this.set("getRankingInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetRankingInfo: Self = this.set("getRankingInfo", js.undefined)
    
    @scala.inline
    def setHighlightPostTag(value: String): Self = this.set("highlightPostTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightPostTag: Self = this.set("highlightPostTag", js.undefined)
    
    @scala.inline
    def setHighlightPreTag(value: String): Self = this.set("highlightPreTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightPreTag: Self = this.set("highlightPreTag", js.undefined)
    
    @scala.inline
    def setHitsPerPage(value: Double): Self = this.set("hitsPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHitsPerPage: Self = this.set("hitsPerPage", js.undefined)
    
    @scala.inline
    def setIgnorePluralsVarargs(value: String*): Self = this.set("ignorePlurals", js.Array(value :_*))
    
    @scala.inline
    def setIgnorePlurals(value: Boolean | js.Array[String]): Self = this.set("ignorePlurals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnorePlurals: Self = this.set("ignorePlurals", js.undefined)
    
    @scala.inline
    def setInsideBoundingBoxVarargs(value: js.Array[Double]*): Self = this.set("insideBoundingBox", js.Array(value :_*))
    
    @scala.inline
    def setInsideBoundingBox(value: js.Array[js.Array[Double]]): Self = this.set("insideBoundingBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsideBoundingBox: Self = this.set("insideBoundingBox", js.undefined)
    
    @scala.inline
    def setInsidePolygonVarargs(value: js.Array[Double]*): Self = this.set("insidePolygon", js.Array(value :_*))
    
    @scala.inline
    def setInsidePolygon(value: js.Array[js.Array[Double]]): Self = this.set("insidePolygon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsidePolygon: Self = this.set("insidePolygon", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    
    @scala.inline
    def setMaxFacetHits(value: Double): Self = this.set("maxFacetHits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxFacetHits: Self = this.set("maxFacetHits", js.undefined)
    
    @scala.inline
    def setMaxValuesPerFacet(value: Double): Self = this.set("maxValuesPerFacet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxValuesPerFacet: Self = this.set("maxValuesPerFacet", js.undefined)
    
    @scala.inline
    def setMinProximity(value: Double): Self = this.set("minProximity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinProximity: Self = this.set("minProximity", js.undefined)
    
    @scala.inline
    def setMinWordSizefor1Typo(value: Double): Self = this.set("minWordSizefor1Typo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinWordSizefor1Typo: Self = this.set("minWordSizefor1Typo", js.undefined)
    
    @scala.inline
    def setMinWordSizefor2Typos(value: Double): Self = this.set("minWordSizefor2Typos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinWordSizefor2Typos: Self = this.set("minWordSizefor2Typos", js.undefined)
    
    @scala.inline
    def setMinimumAroundRadius(value: Double): Self = this.set("minimumAroundRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumAroundRadius: Self = this.set("minimumAroundRadius", js.undefined)
    
    @scala.inline
    def setNaturalLanguagesVarargs(value: String*): Self = this.set("naturalLanguages", js.Array(value :_*))
    
    @scala.inline
    def setNaturalLanguages(value: js.Array[String]): Self = this.set("naturalLanguages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNaturalLanguages: Self = this.set("naturalLanguages", js.undefined)
    
    @scala.inline
    def setNumericFiltersVarargs(value: (js.Array[String] | String)*): Self = this.set("numericFilters", js.Array(value :_*))
    
    @scala.inline
    def setNumericFilters(value: String | (js.Array[js.Array[String] | String])): Self = this.set("numericFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumericFilters: Self = this.set("numericFilters", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOptionalFiltersVarargs(value: (js.Array[String] | String)*): Self = this.set("optionalFilters", js.Array(value :_*))
    
    @scala.inline
    def setOptionalFilters(value: String | (js.Array[js.Array[String] | String])): Self = this.set("optionalFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionalFilters: Self = this.set("optionalFilters", js.undefined)
    
    @scala.inline
    def setOptionalWordsVarargs(value: String*): Self = this.set("optionalWords", js.Array(value :_*))
    
    @scala.inline
    def setOptionalWords(value: String | js.Array[String]): Self = this.set("optionalWords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionalWords: Self = this.set("optionalWords", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    
    @scala.inline
    def setPercentileComputation(value: Boolean): Self = this.set("percentileComputation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePercentileComputation: Self = this.set("percentileComputation", js.undefined)
    
    @scala.inline
    def setPersonalizationImpact(value: Double): Self = this.set("personalizationImpact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersonalizationImpact: Self = this.set("personalizationImpact", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setQueryType(value: prefixLast | prefixAll | prefixNone): Self = this.set("queryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryType: Self = this.set("queryType", js.undefined)
    
    @scala.inline
    def setRemoveStopWordsVarargs(value: String*): Self = this.set("removeStopWords", js.Array(value :_*))
    
    @scala.inline
    def setRemoveStopWords(value: Boolean | js.Array[String]): Self = this.set("removeStopWords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveStopWords: Self = this.set("removeStopWords", js.undefined)
    
    @scala.inline
    def setRemoveWordsIfNoResults(value: none | lastWords | firstWords | allOptional): Self = this.set("removeWordsIfNoResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveWordsIfNoResults: Self = this.set("removeWordsIfNoResults", js.undefined)
    
    @scala.inline
    def setReplaceSynonymsInHighlight(value: Boolean): Self = this.set("replaceSynonymsInHighlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplaceSynonymsInHighlight: Self = this.set("replaceSynonymsInHighlight", js.undefined)
    
    @scala.inline
    def setResponseFieldsVarargs(value: String*): Self = this.set("responseFields", js.Array(value :_*))
    
    @scala.inline
    def setResponseFields(value: js.Array[String]): Self = this.set("responseFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseFields: Self = this.set("responseFields", js.undefined)
    
    @scala.inline
    def setRestrictHighlightAndSnippetArrays(value: Boolean): Self = this.set("restrictHighlightAndSnippetArrays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestrictHighlightAndSnippetArrays: Self = this.set("restrictHighlightAndSnippetArrays", js.undefined)
    
    @scala.inline
    def setRestrictIndicesVarargs(value: String*): Self = this.set("restrictIndices", js.Array(value :_*))
    
    @scala.inline
    def setRestrictIndices(value: js.Array[String] | String): Self = this.set("restrictIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestrictIndices: Self = this.set("restrictIndices", js.undefined)
    
    @scala.inline
    def setRestrictSearchableAttributesVarargs(value: String*): Self = this.set("restrictSearchableAttributes", js.Array(value :_*))
    
    @scala.inline
    def setRestrictSearchableAttributes(value: js.Array[String]): Self = this.set("restrictSearchableAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestrictSearchableAttributes: Self = this.set("restrictSearchableAttributes", js.undefined)
    
    @scala.inline
    def setRestrictSources(value: String): Self = this.set("restrictSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestrictSources: Self = this.set("restrictSources", js.undefined)
    
    @scala.inline
    def setRuleContextsVarargs(value: String*): Self = this.set("ruleContexts", js.Array(value :_*))
    
    @scala.inline
    def setRuleContexts(value: js.Array[String]): Self = this.set("ruleContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuleContexts: Self = this.set("ruleContexts", js.undefined)
    
    @scala.inline
    def setSimilarQuery(value: String): Self = this.set("similarQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSimilarQuery: Self = this.set("similarQuery", js.undefined)
    
    @scala.inline
    def setSnippetEllipsisText(value: String): Self = this.set("snippetEllipsisText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnippetEllipsisText: Self = this.set("snippetEllipsisText", js.undefined)
    
    @scala.inline
    def setSortFacetValuesBy(value: count | alpha): Self = this.set("sortFacetValuesBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortFacetValuesBy: Self = this.set("sortFacetValuesBy", js.undefined)
    
    @scala.inline
    def setSumOrFiltersScores(value: Boolean): Self = this.set("sumOrFiltersScores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSumOrFiltersScores: Self = this.set("sumOrFiltersScores", js.undefined)
    
    @scala.inline
    def setSynonyms(value: Boolean): Self = this.set("synonyms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSynonyms: Self = this.set("synonyms", js.undefined)
    
    @scala.inline
    def setTagFiltersVarargs(value: (js.Array[String] | String)*): Self = this.set("tagFilters", js.Array(value :_*))
    
    @scala.inline
    def setTagFilters(value: String | (js.Array[js.Array[String] | String])): Self = this.set("tagFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagFilters: Self = this.set("tagFilters", js.undefined)
    
    @scala.inline
    def setTypoTolerance(value: Boolean | min | strict): Self = this.set("typoTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypoTolerance: Self = this.set("typoTolerance", js.undefined)
    
    @scala.inline
    def setUserToken(value: String): Self = this.set("userToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserToken: Self = this.set("userToken", js.undefined)
    
    @scala.inline
    def setValidUntil(value: Double): Self = this.set("validUntil", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidUntil: Self = this.set("validUntil", js.undefined)
  }
}
