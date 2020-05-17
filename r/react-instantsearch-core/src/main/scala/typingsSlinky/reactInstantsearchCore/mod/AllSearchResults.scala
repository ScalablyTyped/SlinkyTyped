package typingsSlinky.reactInstantsearchCore.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[index: string] : react-instantsearch-core.react-instantsearch-core.SearchResults<TDoc>} & react-instantsearch-core.react-instantsearch-core.SearchResults<TDoc> */
@js.native
trait AllSearchResults[TDoc] extends /* index */ StringDictionary[SearchResults[TDoc]] {
  var aroundLatLng: js.UndefOr[String] = js.native
  var automaticRadius: js.UndefOr[String] = js.native
  var disjunctiveFacets: js.Array[_] = js.native
  var exhaustiveNbHits: Boolean = js.native
  var facets: js.Array[_] = js.native
  var hierarchicalFacets: js.Array[_] = js.native
  var hits: js.Array[Hit[TDoc]] = js.native
  var hitsPerPage: Double = js.native
  var index: String = js.native
  var nbHits: Double = js.native
  var nbPages: Double = js.native
  var page: Double = js.native
  var processingTimeMS: Double = js.native
  var query: String = js.native
}

object AllSearchResults {
  @scala.inline
  def apply[TDoc](
    disjunctiveFacets: js.Array[_],
    exhaustiveNbHits: Boolean,
    facets: js.Array[_],
    hierarchicalFacets: js.Array[_],
    hits: js.Array[Hit[TDoc]],
    hitsPerPage: Double,
    index: String,
    nbHits: Double,
    nbPages: Double,
    page: Double,
    processingTimeMS: Double,
    query: String
  ): AllSearchResults[TDoc] = {
    val __obj = js.Dynamic.literal(disjunctiveFacets = disjunctiveFacets.asInstanceOf[js.Any], exhaustiveNbHits = exhaustiveNbHits.asInstanceOf[js.Any], facets = facets.asInstanceOf[js.Any], hierarchicalFacets = hierarchicalFacets.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], hitsPerPage = hitsPerPage.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], nbHits = nbHits.asInstanceOf[js.Any], nbPages = nbPages.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], processingTimeMS = processingTimeMS.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllSearchResults[TDoc]]
  }
  @scala.inline
  implicit class AllSearchResultsOps[Self[tdoc] <: AllSearchResults[tdoc], TDoc] (val x: Self[TDoc]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TDoc] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TDoc]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TDoc] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TDoc] with Other]
    @scala.inline
    def withDisjunctiveFacets(value: js.Array[_]): Self[TDoc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disjunctiveFacets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExhaustiveNbHits(value: Boolean): Self[TDoc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exhaustiveNbHits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFacets(value: js.Array[_]): Self[TDoc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHierarchicalFacets(value: js.Array[_]): Self[TDoc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hierarchicalFacets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHits(value: js.Array[Hit[TDoc]]): Self[TDoc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHitsPerPage(value: Double): Self[TDoc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitsPerPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: String): Self[TDoc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNbHits(value: Double): Self[TDoc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nbHits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNbPages(value: Double): Self[TDoc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nbPages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPage(value: Double): Self[TDoc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcessingTimeMS(value: Double): Self[TDoc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingTimeMS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: String): Self[TDoc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAroundLatLng(value: String): Self[TDoc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aroundLatLng")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAroundLatLng: Self[TDoc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aroundLatLng")(js.undefined)
        ret
    }
    @scala.inline
    def withAutomaticRadius(value: String): Self[TDoc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automaticRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomaticRadius: Self[TDoc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automaticRadius")(js.undefined)
        ret
    }
  }
  
}

