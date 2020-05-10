package typingsSlinky.algoliasearch.mod.SearchForFacetValues

import typingsSlinky.algoliasearch.mod.QueryParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parameters extends QueryParameters {
  /**
    * The facet to search in
    */
  var facetName: String = js.native
  /**
    * The query for the search in this facet
    */
  var facetQuery: String = js.native
  /**
    * The maximum number of facets to fetch
    */
  var maxFacetHits: js.UndefOr[Double] = js.native
}

object Parameters {
  @scala.inline
  def apply(facetName: String, facetQuery: String): Parameters = {
    val __obj = js.Dynamic.literal(facetName = facetName.asInstanceOf[js.Any], facetQuery = facetQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters]
  }
  @scala.inline
  implicit class ParametersOps[Self <: Parameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFacetName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFacetQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facetQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxFacetHits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFacetHits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFacetHits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFacetHits")(js.undefined)
        ret
    }
  }
  
}

