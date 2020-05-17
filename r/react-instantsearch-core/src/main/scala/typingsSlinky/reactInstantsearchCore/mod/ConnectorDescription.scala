package typingsSlinky.reactInstantsearchCore.mod

import slinky.core.ReactComponentClass
import typingsSlinky.algoliasearchHelper.mod.SearchParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectorDescription[TProvided, TExposed] extends js.Object {
  /**
    * This method is called when a widget is about to unmount in order to clean the searchState.
    * It takes in the current props of the higher-order component and the searchState of all widgets and expect a new searchState in return.
    * props are the props that were provided to the higher-order component.
    * searchState holds the searchState of all widgets, with the shape {[widgetId]: widgetState}. Stateful widgets describe the format of their searchState
    * in their respective documentation entry.
    */
  var cleanUp: js.UndefOr[
    js.ThisFunction2[
      /* this */ ReactComponentClass[TExposed], 
      /* props */ TExposed, 
      /* searchState */ SearchState, 
      SearchState
    ]
  ] = js.native
  var defaultProps: js.UndefOr[js.Any] = js.native
  var displayName: String = js.native
  /**
    * This method allows the widget to register a custom metadata object for any props and state combination.
    * If your widget is stateful, the corresponding URL key should be declared on the metadata object as the id property, so that the InstantSearch
    * component can determine which URL keys it controls and which are foreign and should be left intact.
    * The metadata object also allows you to declare any data that you would like to pass down to all other widgets. The list of metadata objects of
    * all components is available as the fourth argument to the getProvidedProps method.
    * The CurrentRefinements widget leverages this mechanism in order to allow any widget to declare the filters it has applied. If you want to add
    * your own filter, declare a filters property on your widget’s metadata
    */
  var getMetadata: js.UndefOr[
    js.ThisFunction3[
      /* this */ ReactComponentClass[TExposed], 
      /* props */ TExposed, 
      /* searchState */ SearchState, 
      /* repeated */ js.Any, 
      _
    ]
  ] = js.native
  /**
    * This method applies the current props and state to the provided SearchParameters, and returns a new SearchParameters. The SearchParameters
    * type is described in the Helper’s documentation.
    * Every time the props or state of a widget change, all the getSearchParameters methods of all the registered widgets are called in a chain
    * to produce a new SearchParameters. Then, if the output SearchParameters differs from the previous one, a new search is triggered.
    * As such, the getSearchParameters method allows you to describe how the state and props of a widget should affect the search parameters.
    */
  var getSearchParameters: js.UndefOr[
    js.ThisFunction3[
      /* this */ ReactComponentClass[TExposed], 
      /* searchParameters */ SearchParameters, 
      /* props */ TExposed, 
      /* searchState */ SearchState, 
      SearchParameters
    ]
  ] = js.native
  var propTypes: js.UndefOr[js.Any] = js.native
  /**
    * This method defines exactly how the refine prop of widgets affects the search state.
    * It takes in the current props of the higher-order component, the search state of all widgets, as well as all arguments passed
    * to the refine and createURL props of stateful widgets, and returns a new state.
    */
  var refine: js.UndefOr[
    js.ThisFunction3[
      /* this */ ReactComponentClass[TExposed], 
      /* props */ TExposed, 
      /* searchState */ SearchState, 
      /* repeated */ js.Any, 
      SearchState
    ]
  ] = js.native
  /**
    * This method needs to be implemented if you want to have the ability to perform a search for facet values inside your widget.
    * It takes in the current props of the higher-order component, the search state of all widgets, as well as all arguments passed to the searchForFacetValues
    * props of stateful widgets, and returns an object of the shape: {facetName: string, query: string, maxFacetHits?: number}. The default value for the
    * maxFacetHits is the one set by the API which is 10.
    */
  var searchForFacetValues: js.UndefOr[
    js.ThisFunction2[
      /* this */ ReactComponentClass[TExposed], 
      /* searchState */ SearchState, 
      /* nextRefinement */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.native
  /**
    * This method should return the props to forward to the composed component.
    * props are the props that were provided to the higher-order component.
    * searchState holds the search state of all widgets. You can find the shape of all widgets search state in the corresponding guide.
    * searchResults holds the search results, search errors and search loading state, with the shape
    * {results: ?SearchResults, error: ?Error, searching: boolean, searchingForFacetValues: boolean}. The SearchResults type is described in the Helper’s documentation.
    * meta is the list of metadata from all widgets whose connector defines a getMetadata method.
    * searchForFacetValuesResults holds the search for facet values results.
    */
  def getProvidedProps(
    props: TExposed,
    searchState: SearchState,
    searchResults: ConnectorSearchResults[_],
    metadata: js.Any,
    resultsFacetValues: js.Any
  ): TProvided = js.native
}

object ConnectorDescription {
  @scala.inline
  def apply[TProvided, TExposed](
    displayName: String,
    getProvidedProps: (TExposed, SearchState, ConnectorSearchResults[_], js.Any, js.Any) => TProvided
  ): ConnectorDescription[TProvided, TExposed] = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], getProvidedProps = js.Any.fromFunction5(getProvidedProps))
    __obj.asInstanceOf[ConnectorDescription[TProvided, TExposed]]
  }
  @scala.inline
  implicit class ConnectorDescriptionOps[Self[tprovided, texposed] <: ConnectorDescription[tprovided, texposed], TProvided, TExposed] (val x: Self[TProvided, TExposed]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TProvided, TExposed] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TProvided, TExposed]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TProvided, TExposed]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TProvided, TExposed]) with Other]
    @scala.inline
    def withDisplayName(value: String): Self[TProvided, TExposed] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetProvidedProps(value: (TExposed, SearchState, ConnectorSearchResults[_], js.Any, js.Any) => TProvided): Self[TProvided, TExposed] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProvidedProps")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withCleanUp(
      value: js.ThisFunction2[
          /* this */ ReactComponentClass[TExposed], 
          /* props */ TExposed, 
          /* searchState */ SearchState, 
          SearchState
        ]
    ): Self[TProvided, TExposed] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCleanUp: Self[TProvided, TExposed] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanUp")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultProps(value: js.Any): Self[TProvided, TExposed] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultProps: Self[TProvided, TExposed] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMetadata(
      value: js.ThisFunction3[
          /* this */ ReactComponentClass[TExposed], 
          /* props */ TExposed, 
          /* searchState */ SearchState, 
          /* repeated */ js.Any, 
          _
        ]
    ): Self[TProvided, TExposed] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetMetadata: Self[TProvided, TExposed] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSearchParameters(
      value: js.ThisFunction3[
          /* this */ ReactComponentClass[TExposed], 
          /* searchParameters */ SearchParameters, 
          /* props */ TExposed, 
          /* searchState */ SearchState, 
          SearchParameters
        ]
    ): Self[TProvided, TExposed] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSearchParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetSearchParameters: Self[TProvided, TExposed] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSearchParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withPropTypes(value: js.Any): Self[TProvided, TExposed] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPropTypes: Self[TProvided, TExposed] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withRefine(
      value: js.ThisFunction3[
          /* this */ ReactComponentClass[TExposed], 
          /* props */ TExposed, 
          /* searchState */ SearchState, 
          /* repeated */ js.Any, 
          SearchState
        ]
    ): Self[TProvided, TExposed] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefine: Self[TProvided, TExposed] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refine")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchForFacetValues(
      value: js.ThisFunction2[
          /* this */ ReactComponentClass[TExposed], 
          /* searchState */ SearchState, 
          /* nextRefinement */ js.UndefOr[js.Any], 
          _
        ]
    ): Self[TProvided, TExposed] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchForFacetValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchForFacetValues: Self[TProvided, TExposed] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchForFacetValues")(js.undefined)
        ret
    }
  }
  
}

