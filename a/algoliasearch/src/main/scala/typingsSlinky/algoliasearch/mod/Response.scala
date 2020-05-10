package typingsSlinky.algoliasearch.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.algoliasearch.AnonAvg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response[T] extends js.Object {
  /**
    * If a search encounters an index that is being A/B tested, abTestVariantID
    * reports the variant ID of the index used (note, this is the ID not the name).
    * The variant ID is the position in the array of variants (starting at 1).
    *
    * For example, abTestVariantID=1 is variant A (the main index), abTestVariantID=2
    * is variant B (the replica you chose when creating the A/B test , or the queries
    * with the changed query parameters if the A/B test is based on query parameters).
    * Returned only if getRankingInfo is set to true.
    */
  var abTestVariantID: js.UndefOr[Double] = js.native
  /**
    * The computed geo location. Warning: for legacy reasons, this parameter is
    * a string and not an object. Format: ${lat},${lng}, where the latitude and
    * longitude are expressed as decimal floating point numbers.
    * Only returned when aroundLatLngViaIP or aroundLatLng is set.
    */
  var aroundLatLng: js.UndefOr[String] = js.native
  /**
    * The automatically computed radius. For legacy reasons, this parameter is a
    * string and not an integer.
    * Only returned for geo queries without an explicitly specified radius (see aroundRadius).
    */
  var automaticRadius: js.UndefOr[String] = js.native
  /**
    * The cursor is only set when browsing the index.
    */
  var cursor: js.UndefOr[String] = js.native
  /**
    * Whether the facet count is exhaustive (true) or approximate (false).
    */
  var exhaustiveFacetsCount: Boolean = js.native
  /**
    * Whether the nbHits is exhaustive (true) or approximate (false).
    * An approximation is done when the query takes more than 50ms to be processed
    * (this can happen when using complex filters on millions on records).
    */
  var exhaustiveNbHits: Boolean = js.native
  /**
    * A mapping of each facet name to the corresponding facet counts.
    */
  var facets: js.UndefOr[StringDictionary[StringDictionary[Double]]] = js.native
  /**
    * Statistics for numerical facets.
    */
  var facets_stats: js.UndefOr[StringDictionary[AnonAvg]] = js.native
  /**
    * Contains all the hits matching the query
    */
  var hits: js.Array[T] = js.native
  /**
    * Number of hits per pages
    */
  var hitsPerPage: Double = js.native
  /**
    * The index name is only set when searching multiple indices.
    */
  var index: js.UndefOr[String] = js.native
  /**
    * Index name used for the query. In the case of an A/B test, the targeted
    * index isn’t always the index used by the query.
    * Returned only if getRankingInfo is set to true.
    */
  var indexUsed: js.UndefOr[String] = js.native
  /**
    * Used to return warnings about the query.
    */
  var message: js.UndefOr[String] = js.native
  /**
    * Number of total hits matching the query
    */
  var nbHits: Double = js.native
  /**
    * Number of pages
    */
  var nbPages: Double = js.native
  /**
    * Current page
    */
  var page: Double = js.native
  /**
    * GET parameters used to perform the search
    */
  var params: String = js.native
  /**
    * The query string that will be searched, after normalization. Normalization
    * includes removing stop words (if removeStopWords is enabled), and transforming
    * portions of the query string into phrase queries (see advancedSyntax).
    * Returned only if getRankingInfo is set to true.
    */
  var parsedQuery: js.UndefOr[String] = js.native
  /**
    * Whether the query was processed. Only returned when strategy: stopIfEnoughmatches.
    */
  var processed: js.UndefOr[Boolean] = js.native
  /**
    * Engine processing time (excluding network transfer)
    */
  var processingTimeMS: Double = js.native
  /**
    * Query used to perform the search
    */
  var query: String = js.native
  /**
    * A markup text indicating which parts of the original query have been removed
    * in order to retrieve a non-empty result set.
    * The removed parts are surrounded by <em> tags.
    * Only returned when removeWordsIfNoResults is set to lastWords or firstWords.
    */
  var queryAfterRemoval: js.UndefOr[String] = js.native
  /**
    * The unique identifier of this search, only returned if clickAnalytics: true
    */
  var queryID: js.UndefOr[String] = js.native
  /**
    * Actual host name of the server that processed the request. Our DNS
    * supports automatic failover and load balancing, so this may differ from
    * the host name used in the request.
    * Returned only if getRankingInfo is set to true.
    */
  var serverUsed: js.UndefOr[String] = js.native
  /**
    * user data is returned if a matching query rule was set up to do so
    */
  var userData: js.UndefOr[js.Array[StringDictionary[_]]] = js.native
}

object Response {
  @scala.inline
  def apply[T](
    exhaustiveFacetsCount: Boolean,
    exhaustiveNbHits: Boolean,
    hits: js.Array[T],
    hitsPerPage: Double,
    nbHits: Double,
    nbPages: Double,
    page: Double,
    params: String,
    processingTimeMS: Double,
    query: String
  ): Response[T] = {
    val __obj = js.Dynamic.literal(exhaustiveFacetsCount = exhaustiveFacetsCount.asInstanceOf[js.Any], exhaustiveNbHits = exhaustiveNbHits.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], hitsPerPage = hitsPerPage.asInstanceOf[js.Any], nbHits = nbHits.asInstanceOf[js.Any], nbPages = nbPages.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], processingTimeMS = processingTimeMS.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response[T]]
  }
  @scala.inline
  implicit class ResponseOps[Self[t] <: Response[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withExhaustiveFacetsCount(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exhaustiveFacetsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExhaustiveNbHits(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exhaustiveNbHits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHits(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHitsPerPage(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitsPerPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNbHits(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nbHits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNbPages(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nbPages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPage(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParams(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcessingTimeMS(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingTimeMS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAbTestVariantID(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abTestVariantID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbTestVariantID: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abTestVariantID")(js.undefined)
        ret
    }
    @scala.inline
    def withAroundLatLng(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aroundLatLng")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAroundLatLng: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aroundLatLng")(js.undefined)
        ret
    }
    @scala.inline
    def withAutomaticRadius(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automaticRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomaticRadius: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automaticRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withCursor(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursor: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(js.undefined)
        ret
    }
    @scala.inline
    def withFacets(value: StringDictionary[StringDictionary[Double]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFacets: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facets")(js.undefined)
        ret
    }
    @scala.inline
    def withFacets_stats(value: StringDictionary[AnonAvg]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facets_stats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFacets_stats: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facets_stats")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexUsed(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexUsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexUsed: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexUsed")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withParsedQuery(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsedQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParsedQuery: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsedQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessed(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessed: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processed")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryAfterRemoval(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryAfterRemoval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryAfterRemoval: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryAfterRemoval")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryID(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryID: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryID")(js.undefined)
        ret
    }
    @scala.inline
    def withServerUsed(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverUsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerUsed: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverUsed")(js.undefined)
        ret
    }
    @scala.inline
    def withUserData(value: js.Array[StringDictionary[_]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserData: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userData")(js.undefined)
        ret
    }
  }
  
}

