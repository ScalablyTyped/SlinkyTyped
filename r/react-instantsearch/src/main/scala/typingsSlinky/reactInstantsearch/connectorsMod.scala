package typingsSlinky.reactInstantsearch

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ComponentType
import typingsSlinky.react.mod.FunctionComponent
import typingsSlinky.reactInstantsearchCore.anon.PartialCurrentRefinements
import typingsSlinky.reactInstantsearchCore.anon.PartialMenuProvided
import typingsSlinky.reactInstantsearchCore.anon.PartialNumericMenuProvide
import typingsSlinky.reactInstantsearchCore.anon.PartialRefinementListProv
import typingsSlinky.reactInstantsearchCore.anon.PartialSearchBoxProvided
import typingsSlinky.reactInstantsearchCore.anon.PartialStateResultsProvid
import typingsSlinky.reactInstantsearchCore.anon.PartialStatsProvided
import typingsSlinky.reactInstantsearchCore.mod.AutocompleteExposed
import typingsSlinky.reactInstantsearchCore.mod.AutocompleteProvided
import typingsSlinky.reactInstantsearchCore.mod.BasicDoc
import typingsSlinky.reactInstantsearchCore.mod.CurrentRefinementsExposed
import typingsSlinky.reactInstantsearchCore.mod.CurrentRefinementsProvided
import typingsSlinky.reactInstantsearchCore.mod.GeoSearchExposed
import typingsSlinky.reactInstantsearchCore.mod.GeoSearchProvided
import typingsSlinky.reactInstantsearchCore.mod.HighlightPassedThru
import typingsSlinky.reactInstantsearchCore.mod.HighlightProps
import typingsSlinky.reactInstantsearchCore.mod.HighlightProvided
import typingsSlinky.reactInstantsearchCore.mod.HitsProvided
import typingsSlinky.reactInstantsearchCore.mod.InfiniteHitsProvided
import typingsSlinky.reactInstantsearchCore.mod.MenuExposed
import typingsSlinky.reactInstantsearchCore.mod.MenuProvided
import typingsSlinky.reactInstantsearchCore.mod.NumericMenuExposed
import typingsSlinky.reactInstantsearchCore.mod.NumericMenuProvided
import typingsSlinky.reactInstantsearchCore.mod.Omit
import typingsSlinky.reactInstantsearchCore.mod.RefinementListExposed
import typingsSlinky.reactInstantsearchCore.mod.RefinementListProvided
import typingsSlinky.reactInstantsearchCore.mod.SearchBoxExposed
import typingsSlinky.reactInstantsearchCore.mod.SearchBoxProvided
import typingsSlinky.reactInstantsearchCore.mod.StateResultsProvided
import typingsSlinky.reactInstantsearchCore.mod.StatsProvided
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectorsMod {
  
  @JSImport("react-instantsearch/connectors", "connectAutoComplete")
  @js.native
  def connectAutoComplete[TDoc](stateless: FunctionComponent[AutocompleteProvided[TDoc]]): ReactComponentClass[AutocompleteExposed] = js.native
  @JSImport("react-instantsearch/connectors", "connectAutoComplete")
  @js.native
  def connectAutoComplete[Props /* <: AutocompleteProvided[TDoc] */, TDoc](Composed: ComponentType[Props]): ReactComponentClass[(Omit[Props, AutocompleteProvided[TDoc]]) with AutocompleteExposed] = js.native
  
  @JSImport("react-instantsearch/connectors", "connectBreadcrumb")
  @js.native
  def connectBreadcrumb(Composed: ReactComponentClass[_]): ReactComponentClass[_] = js.native
  
  @JSImport("react-instantsearch/connectors", "connectConfigure")
  @js.native
  def connectConfigure(Composed: ReactComponentClass[_]): ReactComponentClass[_] = js.native
  
  @JSImport("react-instantsearch/connectors", "connectCurrentRefinements")
  @js.native
  def connectCurrentRefinements(stateless: FunctionComponent[CurrentRefinementsProvided]): ReactComponentClass[CurrentRefinementsExposed] = js.native
  @JSImport("react-instantsearch/connectors", "connectCurrentRefinements")
  @js.native
  def connectCurrentRefinements[TProps /* <: PartialCurrentRefinements */](Composed: ComponentType[TProps]): ReactComponentClass[(Omit[TProps, CurrentRefinementsProvided]) with CurrentRefinementsExposed] = js.native
  
  @JSImport("react-instantsearch/connectors", "connectGeoSearch")
  @js.native
  def connectGeoSearch(stateless: FunctionComponent[GeoSearchProvided[_]]): ReactComponentClass[GeoSearchExposed] = js.native
  @JSImport("react-instantsearch/connectors", "connectGeoSearch")
  @js.native
  def connectGeoSearch[TProps /* <: Partial[GeoSearchProvided[THit]] */, THit](ctor: ComponentType[TProps]): ReactComponentClass[(Omit[TProps, GeoSearchProvided[THit]]) with GeoSearchExposed] = js.native
  
  @JSImport("react-instantsearch/connectors", "connectHierarchicalMenu")
  @js.native
  def connectHierarchicalMenu(Composed: ReactComponentClass[_]): ReactComponentClass[_] = js.native
  
  @JSImport("react-instantsearch/connectors", "connectHighlight")
  @js.native
  def connectHighlight[TDoc](stateless: FunctionComponent[HighlightProps[TDoc]]): ReactComponentClass[HighlightPassedThru[TDoc]] = js.native
  @JSImport("react-instantsearch/connectors", "connectHighlight")
  @js.native
  def connectHighlight[TProps /* <: Partial[HighlightProps[TDoc]] */, TDoc](ctor: ComponentType[TProps]): ReactComponentClass[(Omit[TProps, HighlightProvided[TDoc]]) with js.Object] = js.native
  
  @JSImport("react-instantsearch/connectors", "connectHits")
  @js.native
  def connectHits[THit](stateless: FunctionComponent[HitsProvided[THit]]): ReactComponentClass[js.Object] = js.native
  @JSImport("react-instantsearch/connectors", "connectHits")
  @js.native
  def connectHits[TProps /* <: HitsProvided[THit] */, THit](ctor: ComponentType[TProps]): ReactComponentClass[(Omit[TProps, HitsProvided[THit]]) with js.Object] = js.native
  
  @JSImport("react-instantsearch/connectors", "connectHitsPerPage")
  @js.native
  def connectHitsPerPage(Composed: ReactComponentClass[_]): ReactComponentClass[_] = js.native
  
  @JSImport("react-instantsearch/connectors", "connectInfiniteHits")
  @js.native
  def connectInfiniteHits(Composed: ReactComponentClass[InfiniteHitsProvided[_]]): ReactComponentClass[js.Object] = js.native
  @JSImport("react-instantsearch/connectors", "connectInfiniteHits")
  @js.native
  def connectInfiniteHits_TProps_PartialInfiniteHitsProvidedTHitTHit_ConnectedComponentClass[TProps /* <: Partial[InfiniteHitsProvided[THit]] */, THit](ctor: ReactComponentClass[TProps]): ReactComponentClass[(Omit[TProps, InfiniteHitsProvided[THit]]) with js.Object] = js.native
  
  @JSImport("react-instantsearch/connectors", "connectMenu")
  @js.native
  def connectMenu(stateless: FunctionComponent[MenuProvided]): ReactComponentClass[MenuExposed] = js.native
  @JSImport("react-instantsearch/connectors", "connectMenu")
  @js.native
  def connectMenu[TProps /* <: PartialMenuProvided */](ctor: ComponentType[TProps]): ReactComponentClass[(Omit[TProps, MenuProvided]) with MenuExposed] = js.native
  
  @JSImport("react-instantsearch/connectors", "connectNumericMenu")
  @js.native
  def connectNumericMenu(stateless: FunctionComponent[NumericMenuProvided]): ReactComponentClass[NumericMenuExposed] = js.native
  @JSImport("react-instantsearch/connectors", "connectNumericMenu")
  @js.native
  def connectNumericMenu[TProps /* <: PartialNumericMenuProvide */](ctor: ComponentType[TProps]): ReactComponentClass[(Omit[TProps, NumericMenuProvided]) with NumericMenuExposed] = js.native
  
  @JSImport("react-instantsearch/connectors", "connectPagination")
  @js.native
  def connectPagination(Composed: ReactComponentClass[_]): ReactComponentClass[_] = js.native
  
  @JSImport("react-instantsearch/connectors", "connectPoweredBy")
  @js.native
  def connectPoweredBy(Composed: ReactComponentClass[_]): ReactComponentClass[_] = js.native
  
  @JSImport("react-instantsearch/connectors", "connectRange")
  @js.native
  def connectRange(Composed: ReactComponentClass[_]): ReactComponentClass[_] = js.native
  
  @JSImport("react-instantsearch/connectors", "connectRefinementList")
  @js.native
  def connectRefinementList(stateless: FunctionComponent[RefinementListProvided]): ReactComponentClass[RefinementListExposed] = js.native
  @JSImport("react-instantsearch/connectors", "connectRefinementList")
  @js.native
  def connectRefinementList[TProps /* <: PartialRefinementListProv */](ctor: ComponentType[TProps]): ReactComponentClass[(Omit[TProps, RefinementListProvided]) with RefinementListExposed] = js.native
  
  @JSImport("react-instantsearch/connectors", "connectScrollTo")
  @js.native
  def connectScrollTo(Composed: ReactComponentClass[_]): ReactComponentClass[_] = js.native
  
  @JSImport("react-instantsearch/connectors", "connectSearchBox")
  @js.native
  def connectSearchBox(stateless: FunctionComponent[SearchBoxProvided]): ReactComponentClass[SearchBoxExposed] = js.native
  @JSImport("react-instantsearch/connectors", "connectSearchBox")
  @js.native
  def connectSearchBox[TProps /* <: PartialSearchBoxProvided */](ctor: ComponentType[TProps]): ReactComponentClass[(Omit[TProps, SearchBoxProvided]) with SearchBoxExposed] = js.native
  
  @JSImport("react-instantsearch/connectors", "connectSortBy")
  @js.native
  def connectSortBy(Composed: ReactComponentClass[_]): ReactComponentClass[_] = js.native
  
  @JSImport("react-instantsearch/connectors", "connectStateResults")
  @js.native
  def connectStateResults(stateless: FunctionComponent[StateResultsProvided[BasicDoc]]): ReactComponentClass[js.Object] = js.native
  @JSImport("react-instantsearch/connectors", "connectStateResults")
  @js.native
  def connectStateResults[TProps /* <: PartialStateResultsProvid */](ctor: ComponentType[TProps]): ReactComponentClass[(Omit[TProps, StateResultsProvided[BasicDoc]]) with js.Object] = js.native
  
  @JSImport("react-instantsearch/connectors", "connectStats")
  @js.native
  def connectStats(stateless: FunctionComponent[StatsProvided]): ReactComponentClass[js.Object] = js.native
  @JSImport("react-instantsearch/connectors", "connectStats")
  @js.native
  def connectStats[TProps /* <: PartialStatsProvided */](ctor: ComponentType[TProps]): ReactComponentClass[(Omit[TProps, StatsProvided]) with js.Object] = js.native
  
  @JSImport("react-instantsearch/connectors", "connectToggleRefinement")
  @js.native
  def connectToggleRefinement(Composed: ReactComponentClass[_]): ReactComponentClass[_] = js.native
}
