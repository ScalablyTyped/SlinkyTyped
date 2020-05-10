package typingsSlinky.algoliasearch.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.algoliasearch.algoliasearchStrings.alpha
import typingsSlinky.algoliasearch.algoliasearchStrings.count
import typingsSlinky.algoliasearch.algoliasearchStrings.ignorePlurals
import typingsSlinky.algoliasearch.algoliasearchStrings.min
import typingsSlinky.algoliasearch.algoliasearchStrings.multiWordsSynonym
import typingsSlinky.algoliasearch.algoliasearchStrings.prefixAll
import typingsSlinky.algoliasearch.algoliasearchStrings.prefixLast
import typingsSlinky.algoliasearch.algoliasearchStrings.prefixNone
import typingsSlinky.algoliasearch.algoliasearchStrings.singleWordSynonym
import typingsSlinky.algoliasearch.algoliasearchStrings.strict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndexSettings extends js.Object {
  /**
    * Enables the advanced query syntax
    * default: false
    */
  var advancedSyntax: js.UndefOr[Boolean] = js.native
  /**
    * Allows compression of big integer arrays.
    * default: false
    */
  var allowCompressionOfIntegerArray: js.UndefOr[Boolean] = js.native
  /**
    * If set to false, disables typo tolerance on numeric tokens (numbers).
    * default: true
    */
  var allowTyposOnNumericTokens: js.UndefOr[Boolean] = js.native
  /**
    * Specify alternative corrections that you want to consider.
    * default: []
    */
  var altCorrections: js.UndefOr[js.Array[js.Object]] = js.native
  /**
    * Specify the list of approximation that should be considered as an exact match in the ranking formula
    * default: ['ignorePlurals', 'singleWordSynonym']
    * 'ignorePlurals': alternative words added by the ignorePlurals feature
    * 'singleWordSynonym': single-word synonym (For example "NY" = "NYC")
    * 'multiWordsSynonym': multiple-words synonym
    */
  var alternativesAsExact: js.UndefOr[js.Array[ignorePlurals | singleWordSynonym | multiWordsSynonym]] = js.native
  /**
    * The name of the attribute used for the Distinct feature
    * default: null
    */
  var attributeForDistinct: js.UndefOr[String] = js.native
  /**
    * The list of attributes you want to use for faceting
    * default: null
    */
  var attributesForFaceting: js.UndefOr[js.Array[String]] = js.native
  /**
    * Default list of attributes to highlight. If set to null, all indexed attributes are highlighted.
    * default: null
    */
  var attributesToHighlight: js.UndefOr[js.Array[String]] = js.native
  /**
    * The list of attributes you want index
    * default: *
    */
  var attributesToIndex: js.UndefOr[js.Array[String]] = js.native
  /**
    * A string that contains the list of attributes you want to retrieve in order to minimize the size of the JSON answer
    * default: *
    */
  var attributesToRetrieve: js.UndefOr[js.Array[String]] = js.native
  /**
    * Default list of attributes to snippet alongside the number of words to return
    * default: null
    */
  var attributesToSnippet: js.UndefOr[js.Array[String]] = js.native
  /**
    * List of attributes on which to do a decomposition of camel case words.
    */
  var camelCaseAttributes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Lets you specify part of the ranking
    * default: []
    */
  var customRanking: js.UndefOr[js.Array[String]] = js.native
  /**
    * List of attributes on which you want to apply word-splitting ("decompounding") for
    * each of the languages supported (German, Dutch, and Finnish as of 05/2018)
    * default: {de: [], nl: [], fi: []}
    */
  var decompoundedAttributes: js.UndefOr[js.Object] = js.native
  /**
    * List of attributes on which you want to disable the computation of exact criteria
    * default: []
    */
  var disableExactOnAttributes: js.UndefOr[js.Array[String]] = js.native
  /**
    * List of attributes on which you want to disable prefix matching
    * default: []
    */
  var disablePrefixOnAttributes: js.UndefOr[js.Array[String]] = js.native
  /**
    * List of attributes on which you want to disable typo tolerance
    * default: ""
    */
  var disableTypoToleranceOnAttributes: js.UndefOr[String] = js.native
  /**
    * If set to 1, enables the distinct feature, disabled by default, if the attributeForDistinct index setting is set.
    */
  var distinct: js.UndefOr[Boolean | Double] = js.native
  /**
    * This parameter control how the exact ranking criterion is computed when the query contains one word
    * default: attribute
    * 'none': no exact on single word query
    * 'word': exact set to 1 if the query word is found in the record
    * 'attribute': exact set to 1 if there is an attribute containing a string equals to the query
    */
  var exactOnSingleWordQuery: js.UndefOr[String] = js.native
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
    * Limit the number of facet values returned for each facet
    * default: ""
    */
  var maxValuesPerFacet: js.UndefOr[Double] = js.native
  /**
    * Configure the precision of the proximity ranking criterion
    * default: 1
    */
  var minProximity: js.UndefOr[Double] = js.native
  /**
    * The minimum number of characters needed to accept one typo
    * default: 4
    */
  var minWordSizefor1Typo: js.UndefOr[Double] = js.native
  /**
    * The minimum number of characters needed to accept two typos.
    * default: 8
    */
  var minWordSizefor2Typos: js.UndefOr[Double] = js.native
  /**
    * All numerical attributes are automatically indexed as numerical filters
    * default ''
    */
  var numericAttributesToIndex: js.UndefOr[js.Array[String]] = js.native
  /**
    * A string that contains the comma separated list of words that should be considered as optional when found in the query
    * default: []
    */
  var optionalWords: js.UndefOr[js.Array[String]] = js.native
  /**
    * Set the maximum number of hits accessible via pagination.
    * We set the max number of *hits*, not max number of pages.
    * Works with the page and hitsByPage settings to establish the full paging logic.
    * https://www.algolia.com/doc/api-reference/api-parameters/paginationLimitedTo/?language=javascript
    */
  var paginationLimitedTo: js.UndefOr[Double] = js.native
  /**
    * This is an advanced use-case to define a token substitutable by a list of words without having the original token searchable
    * default: {}
    */
  var placeholders: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
  /**
    * Sets the languages to be used by language-specific settings and functionalities
    * such as ignorePlurals, removeStopWords, and CJK word-detection.
    */
  var queryLanguages: js.UndefOr[
    js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 68 */ js.Any
    ]
  ] = js.native
  /**
    * Selects how the query words are interpreted
    * default: 'prefixLast'
    * 'prefixAll' All query words are interpreted as prefixes. This option is not recommended.
    * 'prefixLast' Only the last word is interpreted as a prefix (default behavior).
    * 'prefixNone' No query word is interpreted as a prefix. This option is not recommended.
    */
  var queryType: js.UndefOr[prefixAll | prefixLast | prefixNone] = js.native
  /**
    * Controls the way results are sorted
    * default: ['typo', 'geo', 'words', 'filters', 'proximity', 'attribute', 'exact', 'custom']
    */
  var ranking: js.UndefOr[js.Array[String]] = js.native
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
  var removeWordsIfNoResults: js.UndefOr[String] = js.native
  /**
    * The list of indices on which you want to replicate all write operations
    * default: []
    */
  var replicas: js.UndefOr[js.Array[String]] = js.native
  /**
    * If set to true, restrict arrays in highlights and snippets to items that matched the query at least partially else return all array items in highlights and snippets
    * default: false
    */
  var restrictHighlightAndSnippetArrays: js.UndefOr[Boolean] = js.native
  /**
    * List of attributes you want to use for textual search
    * default: []
    */
  var searchableAttributes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Specify the separators (punctuation characters) to index.
    * default: ""
    */
  var separatorsToIndex: js.UndefOr[String] = js.native
  /**
    * String used as an ellipsis indicator when a snippet is truncated.
    * default: …
    */
  var snippetEllipsisText: js.UndefOr[String] = js.native
  /**
    * Controls how facet values are sorted.
    */
  var sortFacetValuesBy: js.UndefOr[count | alpha] = js.native
  /**
    * This option allows you to control the number of typos allowed in the result set
    * default: true
    * 'true' The typo tolerance is enabled and all matching hits are retrieved (default behavior).
    * 'false' The typo tolerance is disabled. All results with typos will be hidden.
    * 'min' Only keep results with the minimum number of typos. For example, if one result matches without typos, then all results with typos will be hidden.
    * 'strict' Hits matching with 2 typos are not retrieved if there are some matching without typos.
    */
  var typoTolerance: js.UndefOr[Boolean | min | strict] = js.native
  /**
    * The list of attributes that cannot be retrieved at query time
    * default: null
    */
  var unretrievableAttributes: js.UndefOr[js.Array[String]] = js.native
}

object IndexSettings {
  @scala.inline
  def apply(): IndexSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndexSettings]
  }
  @scala.inline
  implicit class IndexSettingsOps[Self <: IndexSettings] (val x: Self) extends AnyVal {
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
    def withAllowCompressionOfIntegerArray(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCompressionOfIntegerArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowCompressionOfIntegerArray: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCompressionOfIntegerArray")(js.undefined)
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
    def withAltCorrections(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altCorrections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltCorrections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altCorrections")(js.undefined)
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
    def withAttributeForDistinct(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeForDistinct")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeForDistinct: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeForDistinct")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributesForFaceting(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributesForFaceting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributesForFaceting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributesForFaceting")(js.undefined)
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
    def withAttributesToIndex(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributesToIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributesToIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributesToIndex")(js.undefined)
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
    def withCamelCaseAttributes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camelCaseAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCamelCaseAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camelCaseAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomRanking(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customRanking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomRanking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customRanking")(js.undefined)
        ret
    }
    @scala.inline
    def withDecompoundedAttributes(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decompoundedAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecompoundedAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decompoundedAttributes")(js.undefined)
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
    def withDisablePrefixOnAttributes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablePrefixOnAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisablePrefixOnAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablePrefixOnAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableTypoToleranceOnAttributes(value: String): Self = {
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
    def withDistinct(value: Boolean | Double): Self = {
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
    def withExactOnSingleWordQuery(value: String): Self = {
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
    def withPaginationLimitedTo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationLimitedTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginationLimitedTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationLimitedTo")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholders(value: StringDictionary[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholders")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryLanguages(
      value: js.Array[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 68 */ js.Any
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryLanguages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryLanguages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryLanguages")(js.undefined)
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
    def withRanking(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRanking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranking")(js.undefined)
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
    def withRemoveWordsIfNoResults(value: String): Self = {
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
    def withReplicas(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicas")(js.undefined)
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
    def withSearchableAttributes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchableAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchableAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchableAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withSeparatorsToIndex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separatorsToIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparatorsToIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separatorsToIndex")(js.undefined)
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
    def withUnretrievableAttributes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unretrievableAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnretrievableAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unretrievableAttributes")(js.undefined)
        ret
    }
  }
  
}

