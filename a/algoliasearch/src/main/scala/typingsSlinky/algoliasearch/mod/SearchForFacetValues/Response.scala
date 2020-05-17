package typingsSlinky.algoliasearch.mod.SearchForFacetValues

import typingsSlinky.algoliasearch.anon.Count
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response extends js.Object {
  var exhaustiveFacetsCount: Boolean = js.native
  var facetHits: js.Array[Count] = js.native
  var processingTimeMS: Double = js.native
}

object Response {
  @scala.inline
  def apply(exhaustiveFacetsCount: Boolean, facetHits: js.Array[Count], processingTimeMS: Double): Response = {
    val __obj = js.Dynamic.literal(exhaustiveFacetsCount = exhaustiveFacetsCount.asInstanceOf[js.Any], facetHits = facetHits.asInstanceOf[js.Any], processingTimeMS = processingTimeMS.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
  @scala.inline
  implicit class ResponseOps[Self <: Response] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExhaustiveFacetsCount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exhaustiveFacetsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFacetHits(value: js.Array[Count]): Self = {
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

