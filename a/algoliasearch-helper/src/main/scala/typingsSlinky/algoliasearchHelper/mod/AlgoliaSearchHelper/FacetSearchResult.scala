package typingsSlinky.algoliasearchHelper.mod.AlgoliaSearchHelper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Structure of the data resolved by the
  * [`searchForFacetValues()`](reference.html#AlgoliaSearchHelper#searchForFacetValues)
  * promise.
  */
@js.native
trait FacetSearchResult extends js.Object {
  var facetHits: FacetSearchHit = js.native
  var processingTimeMS: Double = js.native
}

object FacetSearchResult {
  @scala.inline
  def apply(facetHits: FacetSearchHit, processingTimeMS: Double): FacetSearchResult = {
    val __obj = js.Dynamic.literal(facetHits = facetHits.asInstanceOf[js.Any], processingTimeMS = processingTimeMS.asInstanceOf[js.Any])
    __obj.asInstanceOf[FacetSearchResult]
  }
  @scala.inline
  implicit class FacetSearchResultOps[Self <: FacetSearchResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFacetHits(value: FacetSearchHit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facetHits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcessingTimeMS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingTimeMS")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

