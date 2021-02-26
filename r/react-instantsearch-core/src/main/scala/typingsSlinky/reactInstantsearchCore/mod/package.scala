package typingsSlinky.reactInstantsearchCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BasicDoc = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  type ConnectedComponentClass[TProps, TProvidedProps, TExposedProps] = slinky.core.ReactComponentClass[
    (typingsSlinky.reactInstantsearchCore.mod.Omit[TProps, TProvidedProps]) with TExposedProps
  ]
  
  type ConnectorProvided[TProvided] = typingsSlinky.reactInstantsearchCore.anon.CreateURL with TProvided
  
  @scala.inline
  def EXPERIMENTALConnectConfigureRelatedItems(Composed: slinky.core.ReactComponentClass[_]): slinky.core.ReactComponentClass[_] = typingsSlinky.reactInstantsearchCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("EXPERIMENTAL_connectConfigureRelatedItems")(Composed.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[_]]
  
  type HighlightProps[TDoc] = typingsSlinky.reactInstantsearchCore.mod.HighlightProvided[TDoc] with typingsSlinky.reactInstantsearchCore.mod.HighlightPassedThru[TDoc]
  
  type HighlightResult[TDoc] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof TDoc ]:? react-instantsearch-core.react-instantsearch-core.HighlightResultField<TDoc[K]>}
    */ typingsSlinky.reactInstantsearchCore.reactInstantsearchCoreStrings.HighlightResult with org.scalablytyped.runtime.TopLevel[TDoc]
  
  type HighlightResultArray[TItem] = js.Array[
    typingsSlinky.reactInstantsearchCore.mod.HighlightResult[TItem] | typingsSlinky.reactInstantsearchCore.mod.HighlightResultPrimitive
  ]
  
  type HighlightResultField[TField] = typingsSlinky.reactInstantsearchCore.mod.HighlightResult[TField] | typingsSlinky.reactInstantsearchCore.mod.HighlightResultPrimitive | typingsSlinky.reactInstantsearchCore.mod.HighlightResultArray[js.Any]
  
  type Hit[TDoc] = TDoc with typingsSlinky.reactInstantsearchCore.anon.HighlightResult[TDoc]
  
  type Omit[T1, T2] = typingsSlinky.std.Pick[
    T1, 
    typingsSlinky.std.Exclude[/* keyof T1 */ java.lang.String, /* keyof T2 */ java.lang.String]
  ]
  
  type Refinement = typingsSlinky.reactInstantsearchCore.anon.Attribute with (typingsSlinky.reactInstantsearchCore.anon.CurrentRefinement | typingsSlinky.reactInstantsearchCore.anon.Items)
  
  type RefinementValue = js.Function1[
    /* searchState */ typingsSlinky.reactInstantsearchCore.mod.SearchState, 
    typingsSlinky.reactInstantsearchCore.mod.SearchState
  ]
  
  @scala.inline
  def connectAutoComplete[TDoc](
    stateless: typingsSlinky.react.mod.FunctionComponent[typingsSlinky.reactInstantsearchCore.mod.AutocompleteProvided[TDoc]]
  ): slinky.core.ReactComponentClass[typingsSlinky.reactInstantsearchCore.mod.AutocompleteExposed] = typingsSlinky.reactInstantsearchCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connectAutoComplete")(stateless.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[typingsSlinky.reactInstantsearchCore.mod.AutocompleteExposed]]
  @scala.inline
  def connectAutoComplete[Props /* <: typingsSlinky.reactInstantsearchCore.mod.AutocompleteProvided[TDoc] */, TDoc](Composed: typingsSlinky.react.mod.ComponentType[Props]): slinky.core.ReactComponentClass[
    (typingsSlinky.reactInstantsearchCore.mod.Omit[Props, typingsSlinky.reactInstantsearchCore.mod.AutocompleteProvided[TDoc]]) with typingsSlinky.reactInstantsearchCore.mod.AutocompleteExposed
  ] = typingsSlinky.reactInstantsearchCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connectAutoComplete")(Composed.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[
    (typingsSlinky.reactInstantsearchCore.mod.Omit[Props, typingsSlinky.reactInstantsearchCore.mod.AutocompleteProvided[TDoc]]) with typingsSlinky.reactInstantsearchCore.mod.AutocompleteExposed
  ]]
  
  @scala.inline
  def connectBreadcrumb(Composed: slinky.core.ReactComponentClass[_]): slinky.core.ReactComponentClass[_] = typingsSlinky.reactInstantsearchCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connectBreadcrumb")(Composed.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[_]]
  
  @scala.inline
  def connectConfigure(Composed: slinky.core.ReactComponentClass[_]): slinky.core.ReactComponentClass[_] = typingsSlinky.reactInstantsearchCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connectConfigure")(Composed.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[_]]
  
  @scala.inline
  def connectCurrentRefinements(
    stateless: typingsSlinky.react.mod.FunctionComponent[typingsSlinky.reactInstantsearchCore.mod.CurrentRefinementsProvided]
  ): slinky.core.ReactComponentClass[typingsSlinky.reactInstantsearchCore.mod.CurrentRefinementsExposed] = typingsSlinky.reactInstantsearchCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connectCurrentRefinements")(stateless.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[typingsSlinky.reactInstantsearchCore.mod.CurrentRefinementsExposed]]
  @scala.inline
  def connectCurrentRefinements[TProps /* <: typingsSlinky.reactInstantsearchCore.anon.PartialCurrentRefinements */](Composed: typingsSlinky.react.mod.ComponentType[TProps]): slinky.core.ReactComponentClass[
    (typingsSlinky.reactInstantsearchCore.mod.Omit[TProps, typingsSlinky.reactInstantsearchCore.mod.CurrentRefinementsProvided]) with typingsSlinky.reactInstantsearchCore.mod.CurrentRefinementsExposed
  ] = typingsSlinky.reactInstantsearchCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connectCurrentRefinements")(Composed.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[
    (typingsSlinky.reactInstantsearchCore.mod.Omit[TProps, typingsSlinky.reactInstantsearchCore.mod.CurrentRefinementsProvided]) with typingsSlinky.reactInstantsearchCore.mod.CurrentRefinementsExposed
  ]]
  
  @scala.inline
  def connectGeoSearch(
    stateless: typingsSlinky.react.mod.FunctionComponent[typingsSlinky.reactInstantsearchCore.mod.GeoSearchProvided[_]]
  ): slinky.core.ReactComponentClass[typingsSlinky.reactInstantsearchCore.mod.GeoSearchExposed] = typingsSlinky.reactInstantsearchCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connectGeoSearch")(stateless.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[typingsSlinky.reactInstantsearchCore.mod.GeoSearchExposed]]
  @scala.inline
  def connectGeoSearch[TProps /* <: typingsSlinky.std.Partial[typingsSlinky.reactInstantsearchCore.mod.GeoSearchProvided[THit]] */, THit](ctor: typingsSlinky.react.mod.ComponentType[TProps]): slinky.core.ReactComponentClass[
    (typingsSlinky.reactInstantsearchCore.mod.Omit[TProps, typingsSlinky.reactInstantsearchCore.mod.GeoSearchProvided[THit]]) with typingsSlinky.reactInstantsearchCore.mod.GeoSearchExposed
  ] = typingsSlinky.reactInstantsearchCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connectGeoSearch")(ctor.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[
    (typingsSlinky.reactInstantsearchCore.mod.Omit[TProps, typingsSlinky.reactInstantsearchCore.mod.GeoSearchProvided[THit]]) with typingsSlinky.reactInstantsearchCore.mod.GeoSearchExposed
  ]]
  
  @scala.inline
  def connectHierarchicalMenu(Composed: slinky.core.ReactComponentClass[_]): slinky.core.ReactComponentClass[_] = typingsSlinky.reactInstantsearchCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connectHierarchicalMenu")(Composed.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[_]]
  
  @scala.inline
  def connectHighlight[TDoc](
    stateless: typingsSlinky.react.mod.FunctionComponent[typingsSlinky.reactInstantsearchCore.mod.HighlightProps[TDoc]]
  ): slinky.core.ReactComponentClass[typingsSlinky.reactInstantsearchCore.mod.HighlightPassedThru[TDoc]] = typingsSlinky.reactInstantsearchCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connectHighlight")(stateless.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[typingsSlinky.reactInstantsearchCore.mod.HighlightPassedThru[TDoc]]]
  @scala.inline
  def connectHighlight[TProps /* <: typingsSlinky.std.Partial[typingsSlinky.reactInstantsearchCore.mod.HighlightProps[TDoc]] */, TDoc](ctor: typingsSlinky.react.mod.ComponentType[TProps]): slinky.core.ReactComponentClass[
    (typingsSlinky.reactInstantsearchCore.mod.Omit[TProps, typingsSlinky.reactInstantsearchCore.mod.HighlightProvided[TDoc]]) with js.Object
  ] = typingsSlinky.reactInstantsearchCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connectHighlight")(ctor.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[
    (typingsSlinky.reactInstantsearchCore.mod.Omit[TProps, typingsSlinky.reactInstantsearchCore.mod.HighlightProvided[TDoc]]) with js.Object
  ]]
  
  @scala.inline
  def connectHitInsights(Composed: slinky.core.ReactComponentClass[_]): slinky.core.ReactComponentClass[_] = typingsSlinky.reactInstantsearchCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connectHitInsights")(Composed.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[_]]
  
  @scala.inline
  def connectHits[THit](
    stateless: typingsSlinky.react.mod.FunctionComponent[typingsSlinky.reactInstantsearchCore.mod.HitsProvided[THit]]
  ): slinky.core.ReactComponentClass[js.Object] = typingsSlinky.reactInstantsearchCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connectHits")(stateless.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[js.Object]]
  @scala.inline
  def connectHits[TProps /* <: typingsSlinky.reactInstantsearchCore.mod.HitsProvided[THit] */, THit](ctor: typingsSlinky.react.mod.ComponentType[TProps]): slinky.core.ReactComponentClass[
    (typingsSlinky.reactInstantsearchCore.mod.Omit[TProps, typingsSlinky.reactInstantsearchCore.mod.HitsProvided[THit]]) with js.Object
  ] = typingsSlinky.reactInstantsearchCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connectHits")(ctor.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[
    (typingsSlinky.reactInstantsearchCore.mod.Omit[TProps, typingsSlinky.reactInstantsearchCore.mod.HitsProvided[THit]]) with js.Object
  ]]
  
  @scala.inline
  def connectHitsPerPage(Composed: slinky.core.ReactComponentClass[_]): slinky.core.ReactComponentClass[_] = typingsSlinky.reactInstantsearchCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connectHitsPerPage")(Composed.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[_]]
  
  @scala.inline
  def connectInfiniteHits(
    Composed: slinky.core.ReactComponentClass[typingsSlinky.reactInstantsearchCore.mod.InfiniteHitsProvided[_]]
  ): slinky.core.ReactComponentClass[js.Object] = typingsSlinky.reactInstantsearchCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connectInfiniteHits")(Composed.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[js.Object]]
  
  @scala.inline
  def connectInfiniteHits_TProps_PartialInfiniteHitsProvidedTHitTHit_ConnectedComponentClass[TProps /* <: typingsSlinky.std.Partial[typingsSlinky.reactInstantsearchCore.mod.InfiniteHitsProvided[THit]] */, THit](ctor: slinky.core.ReactComponentClass[TProps]): slinky.core.ReactComponentClass[
    (typingsSlinky.reactInstantsearchCore.mod.Omit[TProps, typingsSlinky.reactInstantsearchCore.mod.InfiniteHitsProvided[THit]]) with js.Object
  ] = typingsSlinky.reactInstantsearchCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connectInfiniteHits")(ctor.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[
    (typingsSlinky.reactInstantsearchCore.mod.Omit[TProps, typingsSlinky.reactInstantsearchCore.mod.InfiniteHitsProvided[THit]]) with js.Object
  ]]
  
  @scala.inline
  def connectMenu(
    stateless: typingsSlinky.react.mod.FunctionComponent[typingsSlinky.reactInstantsearchCore.mod.MenuProvided]
  ): slinky.core.ReactComponentClass[typingsSlinky.reactInstantsearchCore.mod.MenuExposed] = typingsSlinky.reactInstantsearchCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connectMenu")(stateless.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[typingsSlinky.reactInstantsearchCore.mod.MenuExposed]]
  @scala.inline
  def connectMenu[TProps /* <: typingsSlinky.reactInstantsearchCore.anon.PartialMenuProvided */](ctor: typingsSlinky.react.mod.ComponentType[TProps]): slinky.core.ReactComponentClass[
    (typingsSlinky.reactInstantsearchCore.mod.Omit[TProps, typingsSlinky.reactInstantsearchCore.mod.MenuProvided]) with typingsSlinky.reactInstantsearchCore.mod.MenuExposed
  ] = typingsSlinky.reactInstantsearchCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connectMenu")(ctor.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[
    (typingsSlinky.reactInstantsearchCore.mod.Omit[TProps, typingsSlinky.reactInstantsearchCore.mod.MenuProvided]) with typingsSlinky.reactInstantsearchCore.mod.MenuExposed
  ]]
  
  @scala.inline
  def connectNumericMenu(
    stateless: typingsSlinky.react.mod.FunctionComponent[typingsSlinky.reactInstantsearchCore.mod.NumericMenuProvided]
  ): slinky.core.ReactComponentClass[typingsSlinky.reactInstantsearchCore.mod.NumericMenuExposed] = typingsSlinky.reactInstantsearchCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connectNumericMenu")(stateless.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[typingsSlinky.reactInstantsearchCore.mod.NumericMenuExposed]]
  @scala.inline
  def connectNumericMenu[TProps /* <: typingsSlinky.reactInstantsearchCore.anon.PartialNumericMenuProvide */](ctor: typingsSlinky.react.mod.ComponentType[TProps]): slinky.core.ReactComponentClass[
    (typingsSlinky.reactInstantsearchCore.mod.Omit[TProps, typingsSlinky.reactInstantsearchCore.mod.NumericMenuProvided]) with typingsSlinky.reactInstantsearchCore.mod.NumericMenuExposed
  ] = typingsSlinky.reactInstantsearchCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connectNumericMenu")(ctor.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[
    (typingsSlinky.reactInstantsearchCore.mod.Omit[TProps, typingsSlinky.reactInstantsearchCore.mod.NumericMenuProvided]) with typingsSlinky.reactInstantsearchCore.mod.NumericMenuExposed
  ]]
  
  @scala.inline
  def connectPagination(Composed: slinky.core.ReactComponentClass[_]): slinky.core.ReactComponentClass[_] = typingsSlinky.reactInstantsearchCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connectPagination")(Composed.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[_]]
  
  @scala.inline
  def connectPoweredBy(Composed: slinky.core.ReactComponentClass[_]): slinky.core.ReactComponentClass[_] = typingsSlinky.reactInstantsearchCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connectPoweredBy")(Composed.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[_]]
  
  @scala.inline
  def connectQueryRules(Composed: slinky.core.ReactComponentClass[_]): slinky.core.ReactComponentClass[_] = typingsSlinky.reactInstantsearchCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connectQueryRules")(Composed.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[_]]
  
  @scala.inline
  def connectRange(Composed: slinky.core.ReactComponentClass[_]): slinky.core.ReactComponentClass[_] = typingsSlinky.reactInstantsearchCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connectRange")(Composed.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[_]]
  
  @scala.inline
  def connectRefinementList(
    stateless: typingsSlinky.react.mod.FunctionComponent[typingsSlinky.reactInstantsearchCore.mod.RefinementListProvided]
  ): slinky.core.ReactComponentClass[typingsSlinky.reactInstantsearchCore.mod.RefinementListExposed] = typingsSlinky.reactInstantsearchCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connectRefinementList")(stateless.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[typingsSlinky.reactInstantsearchCore.mod.RefinementListExposed]]
  @scala.inline
  def connectRefinementList[TProps /* <: typingsSlinky.reactInstantsearchCore.anon.PartialRefinementListProv */](ctor: typingsSlinky.react.mod.ComponentType[TProps]): slinky.core.ReactComponentClass[
    (typingsSlinky.reactInstantsearchCore.mod.Omit[TProps, typingsSlinky.reactInstantsearchCore.mod.RefinementListProvided]) with typingsSlinky.reactInstantsearchCore.mod.RefinementListExposed
  ] = typingsSlinky.reactInstantsearchCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connectRefinementList")(ctor.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[
    (typingsSlinky.reactInstantsearchCore.mod.Omit[TProps, typingsSlinky.reactInstantsearchCore.mod.RefinementListProvided]) with typingsSlinky.reactInstantsearchCore.mod.RefinementListExposed
  ]]
  
  @scala.inline
  def connectScrollTo(Composed: slinky.core.ReactComponentClass[_]): slinky.core.ReactComponentClass[_] = typingsSlinky.reactInstantsearchCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connectScrollTo")(Composed.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[_]]
  
  @scala.inline
  def connectSearchBox(
    stateless: typingsSlinky.react.mod.FunctionComponent[typingsSlinky.reactInstantsearchCore.mod.SearchBoxProvided]
  ): slinky.core.ReactComponentClass[typingsSlinky.reactInstantsearchCore.mod.SearchBoxExposed] = typingsSlinky.reactInstantsearchCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connectSearchBox")(stateless.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[typingsSlinky.reactInstantsearchCore.mod.SearchBoxExposed]]
  @scala.inline
  def connectSearchBox[TProps /* <: typingsSlinky.reactInstantsearchCore.anon.PartialSearchBoxProvided */](ctor: typingsSlinky.react.mod.ComponentType[TProps]): slinky.core.ReactComponentClass[
    (typingsSlinky.reactInstantsearchCore.mod.Omit[TProps, typingsSlinky.reactInstantsearchCore.mod.SearchBoxProvided]) with typingsSlinky.reactInstantsearchCore.mod.SearchBoxExposed
  ] = typingsSlinky.reactInstantsearchCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connectSearchBox")(ctor.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[
    (typingsSlinky.reactInstantsearchCore.mod.Omit[TProps, typingsSlinky.reactInstantsearchCore.mod.SearchBoxProvided]) with typingsSlinky.reactInstantsearchCore.mod.SearchBoxExposed
  ]]
  
  @scala.inline
  def connectSortBy(Composed: slinky.core.ReactComponentClass[_]): slinky.core.ReactComponentClass[_] = typingsSlinky.reactInstantsearchCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connectSortBy")(Composed.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[_]]
  
  @scala.inline
  def connectStateResults(
    stateless: typingsSlinky.react.mod.FunctionComponent[
      typingsSlinky.reactInstantsearchCore.mod.StateResultsProvided[typingsSlinky.reactInstantsearchCore.mod.BasicDoc]
    ]
  ): slinky.core.ReactComponentClass[js.Object] = typingsSlinky.reactInstantsearchCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connectStateResults")(stateless.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[js.Object]]
  @scala.inline
  def connectStateResults[TProps /* <: typingsSlinky.reactInstantsearchCore.anon.PartialStateResultsProvid */](ctor: typingsSlinky.react.mod.ComponentType[TProps]): slinky.core.ReactComponentClass[
    (typingsSlinky.reactInstantsearchCore.mod.Omit[
      TProps, 
      typingsSlinky.reactInstantsearchCore.mod.StateResultsProvided[typingsSlinky.reactInstantsearchCore.mod.BasicDoc]
    ]) with js.Object
  ] = typingsSlinky.reactInstantsearchCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connectStateResults")(ctor.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[
    (typingsSlinky.reactInstantsearchCore.mod.Omit[
      TProps, 
      typingsSlinky.reactInstantsearchCore.mod.StateResultsProvided[typingsSlinky.reactInstantsearchCore.mod.BasicDoc]
    ]) with js.Object
  ]]
  
  @scala.inline
  def connectStats(
    stateless: typingsSlinky.react.mod.FunctionComponent[typingsSlinky.reactInstantsearchCore.mod.StatsProvided]
  ): slinky.core.ReactComponentClass[js.Object] = typingsSlinky.reactInstantsearchCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connectStats")(stateless.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[js.Object]]
  @scala.inline
  def connectStats[TProps /* <: typingsSlinky.reactInstantsearchCore.anon.PartialStatsProvided */](ctor: typingsSlinky.react.mod.ComponentType[TProps]): slinky.core.ReactComponentClass[
    (typingsSlinky.reactInstantsearchCore.mod.Omit[TProps, typingsSlinky.reactInstantsearchCore.mod.StatsProvided]) with js.Object
  ] = typingsSlinky.reactInstantsearchCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connectStats")(ctor.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[
    (typingsSlinky.reactInstantsearchCore.mod.Omit[TProps, typingsSlinky.reactInstantsearchCore.mod.StatsProvided]) with js.Object
  ]]
  
  @scala.inline
  def connectToggleRefinement(Composed: slinky.core.ReactComponentClass[_]): slinky.core.ReactComponentClass[_] = typingsSlinky.reactInstantsearchCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connectToggleRefinement")(Composed.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[_]]
  
  @scala.inline
  def connectVoiceSearch(Composed: slinky.core.ReactComponentClass[_]): slinky.core.ReactComponentClass[_] = typingsSlinky.reactInstantsearchCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connectVoiceSearch")(Composed.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[_]]
  
  @scala.inline
  def createConnector[TProvided, TExposed](connectorDesc: typingsSlinky.reactInstantsearchCore.mod.ConnectorDescription[TProvided, TExposed]): (js.Function1[
    /* stateless */ slinky.core.ReactComponentClass[typingsSlinky.reactInstantsearchCore.mod.ConnectorProvided[TProvided]], 
    slinky.core.ReactComponentClass[TExposed]
  ]) with (js.Function1[
    /* Composed */ slinky.core.ReactComponentClass[
      typingsSlinky.std.Partial[typingsSlinky.reactInstantsearchCore.mod.ConnectorProvided[TProvided]]
    ], 
    slinky.core.ReactComponentClass[
      (typingsSlinky.reactInstantsearchCore.mod.Omit[
        typingsSlinky.std.Partial[typingsSlinky.reactInstantsearchCore.mod.ConnectorProvided[TProvided]], 
        typingsSlinky.reactInstantsearchCore.mod.ConnectorProvided[TProvided]
      ]) with TExposed
    ]
  ]) = typingsSlinky.reactInstantsearchCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createConnector")(connectorDesc.asInstanceOf[js.Any]).asInstanceOf[(js.Function1[
    /* stateless */ slinky.core.ReactComponentClass[typingsSlinky.reactInstantsearchCore.mod.ConnectorProvided[TProvided]], 
    slinky.core.ReactComponentClass[TExposed]
  ]) with (js.Function1[
    /* Composed */ slinky.core.ReactComponentClass[
      typingsSlinky.std.Partial[typingsSlinky.reactInstantsearchCore.mod.ConnectorProvided[TProvided]]
    ], 
    slinky.core.ReactComponentClass[
      (typingsSlinky.reactInstantsearchCore.mod.Omit[
        typingsSlinky.std.Partial[typingsSlinky.reactInstantsearchCore.mod.ConnectorProvided[TProvided]], 
        typingsSlinky.reactInstantsearchCore.mod.ConnectorProvided[TProvided]
      ]) with TExposed
    ]
  ])]
  
  @scala.inline
  def translatable(
    defaultTranslations: org.scalablytyped.runtime.StringDictionary[java.lang.String | (js.Function1[/* repeated */ js.Any, java.lang.String])]
  ): js.Function1[
    /* ctor */ slinky.core.ReactComponentClass[typingsSlinky.reactInstantsearchCore.mod.TranslatableProvided], 
    slinky.core.ReactComponentClass[
      (typingsSlinky.reactInstantsearchCore.mod.Omit[
        typingsSlinky.reactInstantsearchCore.mod.TranslatableProvided, 
        typingsSlinky.reactInstantsearchCore.mod.TranslatableProvided
      ]) with typingsSlinky.reactInstantsearchCore.mod.TranslatableExposed
    ]
  ] = typingsSlinky.reactInstantsearchCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("translatable")(defaultTranslations.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ctor */ slinky.core.ReactComponentClass[typingsSlinky.reactInstantsearchCore.mod.TranslatableProvided], 
    slinky.core.ReactComponentClass[
      (typingsSlinky.reactInstantsearchCore.mod.Omit[
        typingsSlinky.reactInstantsearchCore.mod.TranslatableProvided, 
        typingsSlinky.reactInstantsearchCore.mod.TranslatableProvided
      ]) with typingsSlinky.reactInstantsearchCore.mod.TranslatableExposed
    ]
  ]]
  
  @scala.inline
  def version: java.lang.String = typingsSlinky.reactInstantsearchCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]
}
