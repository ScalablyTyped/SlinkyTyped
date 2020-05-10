package typingsSlinky.algoliasearchHelper.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.algoliasearchHelper.mod.SearchParameters.FacetList
import typingsSlinky.algoliasearchHelper.mod.SearchParameters.OperatorList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryParameters
  extends typingsSlinky.algoliasearch.mod.QueryParameters {
  /**
    * This attribute contains the list of all the disjunctive facets
    * used. This list will be added to requested facets in the
    * [facets attribute](https://www.algolia.com/doc/rest-api/search#param-facets) sent to algolia.
    */
  var disjunctiveFacets: js.UndefOr[js.Array[String]] = js.native
  /**
    * This attribute contains all the filters that need to be
    * applied on the disjunctive facets. Each facet must be properly
    * defined in the `disjunctiveFacets` attribute.
    *
    * The key is the name of the facet, and the `FacetList` contains all
    * filters selected for the associated facet name.
    *
    * When querying algolia, the values stored in this attribute will
    * be translated into the `facetFilters` attribute.
    */
  var disjunctiveFacetsRefinements: js.UndefOr[StringDictionary[FacetList]] = js.native
  // Misc. parameters
  /**
    * Applies 'exact' on single word queries if the word contains at least 3 characters
    * and is not a stop word.
    * Can take two values?: true or false.
    * By default, its set to false.
    * @see https://www.algolia.com/doc/rest#param-enableExactOnSingleWordQuery
    */
  var enableExactOnSingleWordQuery: js.UndefOr[Boolean] = js.native
  /**
    * This attribute contains all the filters that need to be
    * excluded from the conjunctive facets. Each facet must be properly
    * defined in the `facets` attribute.
    *
    * The key is the name of the facet, and the `FacetList` contains all
    * filters excluded for the associated facet name.
    *
    * When querying algolia, the values stored in this attribute will
    * be translated into the `facetFilters` attribute.
    */
  var facetsExcludes: js.UndefOr[StringDictionary[FacetList]] = js.native
  // Refinements
  /**
    * This attribute contains all the filters that need to be
    * applied on the conjunctive facets. Each facet must be properly
    * defined in the `facets` attribute.
    *
    * The key is the name of the facet, and the `FacetList` contains all
    * filters selected for the associated facet name.
    *
    * When querying algolia, the values stored in this attribute will
    * be translated into the `facetFilters` attribute.
    */
  var facetsRefinements: js.UndefOr[StringDictionary[FacetList]] = js.native
  /**
    * This attribute contains the list of all the hierarchical facets
    * used. This list will be added to requested facets in the
    * [facets attribute](https://www.algolia.com/doc/rest-api/search#param-facets) sent to algolia.
    * Hierarchical facets are a sub type of disjunctive facets that
    * let you filter faceted attributes hierarchically.
    */
  var hierarchicalFacets: js.UndefOr[js.Array[js.Object | String]] = js.native
  /**
    * This attribute contains all the filters that need to be
    * applied on the hierarchical facets. Each facet must be properly
    * defined in the `hierarchicalFacets` attribute.
    *
    * The key is the name of the facet, and the `FacetList` contains all
    * filters selected for the associated facet name. The FacetList values
    * are structured as a string that contain the values for each level
    * separated by the configured separator.
    *
    * When querying algolia, the values stored in this attribute will
    * be translated into the `facetFilters` attribute.
    */
  var hierarchicalFacetsRefinements: js.UndefOr[StringDictionary[FacetList]] = js.native
  /**
    * Targeted index. This parameter is mandatory.
    */
  var index: js.UndefOr[String] = js.native
  /**
    * This attribute contains all the filters that need to be
    * applied on the numeric attributes.
    *
    * The key is the name of the attribute, and the value is the
    * filters to apply to this attribute.
    *
    * When querying algolia, the values stored in this attribute will
    * be translated into the `numericFilters` attribute.
    */
  var numericRefinements: js.UndefOr[StringDictionary[OperatorList]] = js.native
  /**
    * Contains the optional facet filters in the raw format of the Algolia API.
    * @see https://www.algolia.com/doc/rest#param-tagFilters
    */
  var optionalFacetFilters: js.UndefOr[String] = js.native
  /**
    * Contains the optional tag filters in the raw format of the Algolia API.
    * @see https://www.algolia.com/doc/rest#param-tagFilters
    */
  var optionalTagFilters: js.UndefOr[String] = js.native
  /**
    * This attribute contains all the tags used to refine the query.
    *
    * When querying algolia, the values stored in this attribute will
    * be translated into the `tagFilters` attribute.
    */
  var tagRefinements: js.UndefOr[js.Array[String]] = js.native
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
    def withDisjunctiveFacets(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disjunctiveFacets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisjunctiveFacets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disjunctiveFacets")(js.undefined)
        ret
    }
    @scala.inline
    def withDisjunctiveFacetsRefinements(value: StringDictionary[FacetList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disjunctiveFacetsRefinements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisjunctiveFacetsRefinements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disjunctiveFacetsRefinements")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableExactOnSingleWordQuery(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableExactOnSingleWordQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableExactOnSingleWordQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableExactOnSingleWordQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withFacetsExcludes(value: StringDictionary[FacetList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facetsExcludes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFacetsExcludes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facetsExcludes")(js.undefined)
        ret
    }
    @scala.inline
    def withFacetsRefinements(value: StringDictionary[FacetList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facetsRefinements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFacetsRefinements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facetsRefinements")(js.undefined)
        ret
    }
    @scala.inline
    def withHierarchicalFacets(value: js.Array[js.Object | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hierarchicalFacets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHierarchicalFacets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hierarchicalFacets")(js.undefined)
        ret
    }
    @scala.inline
    def withHierarchicalFacetsRefinements(value: StringDictionary[FacetList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hierarchicalFacetsRefinements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHierarchicalFacetsRefinements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hierarchicalFacetsRefinements")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withNumericRefinements(value: StringDictionary[OperatorList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numericRefinements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumericRefinements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numericRefinements")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionalFacetFilters(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalFacetFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionalFacetFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalFacetFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionalTagFilters(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalTagFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionalTagFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalTagFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withTagRefinements(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagRefinements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagRefinements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagRefinements")(js.undefined)
        ret
    }
  }
  
}

