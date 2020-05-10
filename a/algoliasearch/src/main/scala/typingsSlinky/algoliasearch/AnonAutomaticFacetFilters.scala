package typingsSlinky.algoliasearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAutomaticFacetFilters extends js.Object {
  /**
    * Names of facets to which automatic filtering must be applied;
    * they must match the facet name of a facet value placeholder in the query pattern.
    */
  var automaticFacetFilters: js.UndefOr[js.Array[String]] = js.native
  /**
    * Same as automaticFacetFilters, but for optionalFacetFilters.
    * The same syntax as query parameters can be used to specify a score: facetName<score=1>.
    */
  var automaticOptionalFacetFilters: js.UndefOr[js.Array[String]] = js.native
  /**
    * When a string, it replaces the entire query string.
    * When an object, describes incremental edits to be made to the query string.
    */
  var query: js.UndefOr[String | AnonRemove] = js.native
}

object AnonAutomaticFacetFilters {
  @scala.inline
  def apply(): AnonAutomaticFacetFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAutomaticFacetFilters]
  }
  @scala.inline
  implicit class AnonAutomaticFacetFiltersOps[Self <: AnonAutomaticFacetFilters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutomaticFacetFilters(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automaticFacetFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomaticFacetFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automaticFacetFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withAutomaticOptionalFacetFilters(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automaticOptionalFacetFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomaticOptionalFacetFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automaticOptionalFacetFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: String | AnonRemove): Self = {
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
  }
  
}

