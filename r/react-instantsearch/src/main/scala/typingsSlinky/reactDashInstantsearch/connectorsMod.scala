package typingsSlinky.reactDashInstantsearch

import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod.ComponentType
import typingsSlinky.react.reactMod.StatelessComponent
import typingsSlinky.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.AutocompleteExposed
import typingsSlinky.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.AutocompleteProvided
import typingsSlinky.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.BasicDoc
import typingsSlinky.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.ConnectedComponentClass
import typingsSlinky.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.CurrentRefinementsExposed
import typingsSlinky.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.CurrentRefinementsProvided
import typingsSlinky.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.GeoSearchExposed
import typingsSlinky.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.GeoSearchProvided
import typingsSlinky.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.HighlightPassedThru
import typingsSlinky.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.HighlightProps
import typingsSlinky.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.HighlightProvided
import typingsSlinky.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.HitsProvided
import typingsSlinky.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.InfiniteHitsProvided
import typingsSlinky.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.MenuExposed
import typingsSlinky.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.MenuProvided
import typingsSlinky.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.NumericMenuExposed
import typingsSlinky.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.NumericMenuProvided
import typingsSlinky.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.RefinementListExposed
import typingsSlinky.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.RefinementListProvided
import typingsSlinky.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.SearchBoxExposed
import typingsSlinky.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.SearchBoxProvided
import typingsSlinky.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.StateResultsProvided
import typingsSlinky.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.StatsProvided
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch/connectors", JSImport.Namespace)
@js.native
object connectorsMod extends js.Object {
  def connectAutoComplete[TDoc](stateless: StatelessComponent[AutocompleteProvided[TDoc]]): ReactComponentClass[AutocompleteExposed] = js.native
  def connectAutoComplete[Props /* <: AutocompleteProvided[TDoc] */, TDoc](Composed: ComponentType[Props]): ConnectedComponentClass[Props, AutocompleteProvided[TDoc], AutocompleteExposed] = js.native
  def connectBreadcrumb(Composed: ReactComponentClass[_]): ReactComponentClass[_] = js.native
  def connectConfigure(Composed: ReactComponentClass[_]): ReactComponentClass[_] = js.native
  def connectCurrentRefinements(stateless: StatelessComponent[CurrentRefinementsProvided]): ReactComponentClass[CurrentRefinementsExposed] = js.native
  def connectCurrentRefinements[TProps /* <: Partial[CurrentRefinementsProvided] */](Composed: ComponentType[TProps]): ConnectedComponentClass[TProps, CurrentRefinementsProvided, CurrentRefinementsExposed] = js.native
  def connectGeoSearch(stateless: StatelessComponent[GeoSearchProvided[_]]): ReactComponentClass[GeoSearchExposed] = js.native
  def connectGeoSearch[TProps /* <: Partial[GeoSearchProvided[THit]] */, THit](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, GeoSearchProvided[THit], GeoSearchExposed] = js.native
  def connectHierarchicalMenu(Composed: ReactComponentClass[_]): ReactComponentClass[_] = js.native
  def connectHighlight[TDoc](stateless: StatelessComponent[HighlightProps[TDoc]]): ReactComponentClass[HighlightPassedThru[TDoc]] = js.native
  def connectHighlight[TProps /* <: Partial[HighlightProps[TDoc]] */, TDoc](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, HighlightProvided[TDoc], js.Object] = js.native
  def connectHits[THit](stateless: StatelessComponent[HitsProvided[THit]]): ReactComponentClass[js.Object] = js.native
  def connectHits[TProps /* <: HitsProvided[THit] */, THit](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, HitsProvided[THit], js.Object] = js.native
  def connectHitsPerPage(Composed: ReactComponentClass[_]): ReactComponentClass[_] = js.native
  def connectInfiniteHits(Composed: ReactComponentClass[InfiniteHitsProvided[_]]): ReactComponentClass[js.Object] = js.native
  @JSName("connectInfiniteHits")
  def connectInfiniteHits_TProps_PartialInfiniteHitsProvidedTHitTHit_ConnectedComponentClass[TProps /* <: Partial[InfiniteHitsProvided[THit]] */, THit](ctor: ReactComponentClass[TProps]): ConnectedComponentClass[TProps, InfiniteHitsProvided[THit], js.Object] = js.native
  def connectMenu(stateless: StatelessComponent[MenuProvided]): ReactComponentClass[MenuExposed] = js.native
  def connectMenu[TProps /* <: Partial[MenuProvided] */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, MenuProvided, MenuExposed] = js.native
  def connectNumericMenu(stateless: StatelessComponent[NumericMenuProvided]): ReactComponentClass[NumericMenuExposed] = js.native
  def connectNumericMenu[TProps /* <: Partial[NumericMenuProvided] */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, NumericMenuProvided, NumericMenuExposed] = js.native
  def connectPagination(Composed: ReactComponentClass[_]): ReactComponentClass[_] = js.native
  def connectPoweredBy(Composed: ReactComponentClass[_]): ReactComponentClass[_] = js.native
  def connectRange(Composed: ReactComponentClass[_]): ReactComponentClass[_] = js.native
  def connectRefinementList(stateless: StatelessComponent[RefinementListProvided]): ReactComponentClass[RefinementListExposed] = js.native
  def connectRefinementList[TProps /* <: Partial[RefinementListProvided] */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, RefinementListProvided, RefinementListExposed] = js.native
  def connectScrollTo(Composed: ReactComponentClass[_]): ReactComponentClass[_] = js.native
  def connectSearchBox(stateless: StatelessComponent[SearchBoxProvided]): ReactComponentClass[SearchBoxExposed] = js.native
  def connectSearchBox[TProps /* <: Partial[SearchBoxProvided] */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, SearchBoxProvided, SearchBoxExposed] = js.native
  def connectSortBy(Composed: ReactComponentClass[_]): ReactComponentClass[_] = js.native
  def connectStateResults(stateless: StatelessComponent[StateResultsProvided[BasicDoc]]): ReactComponentClass[js.Object] = js.native
  def connectStateResults[TProps /* <: Partial[StateResultsProvided[_]] */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, StateResultsProvided[BasicDoc], js.Object] = js.native
  def connectStats(stateless: StatelessComponent[StatsProvided]): ReactComponentClass[js.Object] = js.native
  def connectStats[TProps /* <: Partial[StatsProvided] */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, StatsProvided, js.Object] = js.native
  def connectToggleRefinement(Composed: ReactComponentClass[_]): ReactComponentClass[_] = js.native
}

