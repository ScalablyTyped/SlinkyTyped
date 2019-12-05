package typingsSlinky.reactDashInstantsearchDashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashInstantsearchDashCoreMod {
  import org.scalablytyped.runtime.StringDictionary
  import slinky.core.ReactComponentClass
  import typingsSlinky.reactDashInstantsearchDashCore.Anon_Args
  import typingsSlinky.reactDashInstantsearchDashCore.Anon_Attribute
  import typingsSlinky.reactDashInstantsearchDashCore.Anon_CurrentRefinement
  import typingsSlinky.reactDashInstantsearchDashCore.Anon_CurrentRefinementItems
  import typingsSlinky.reactDashInstantsearchDashCore.Anon_HighlightResult
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Pick

  type AllSearchResults[TDoc] = StringDictionary[SearchResults[TDoc]] with SearchResults[TDoc]
  type BasicDoc = StringDictionary[String]
  type ConnectedComponentClass[TProps, TProvidedProps, TExposedProps] = ReactComponentClass[(Omit[TProps, TProvidedProps]) with TExposedProps]
  type ConnectorProvided[TProvided] = Anon_Args with TProvided
  type HighlightProps[TDoc] = HighlightProvided[TDoc] with HighlightPassedThru[TDoc]
  type HighlightResult[TDoc] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof TDoc ]:? react-instantsearch-core.react-instantsearch-core.HighlightResultField<TDoc[K]>}
    */ typingsSlinky.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreStrings.HighlightResult with TDoc
  type HighlightResultArray[TItem] = js.Array[HighlightResult[TItem] | HighlightResultPrimitive]
  type HighlightResultField[TField] = HighlightResult[TField] | HighlightResultPrimitive | HighlightResultArray[js.Any]
  type Hit[TDoc] = TDoc with Anon_HighlightResult[TDoc]
  type Omit[T1, T2] = Pick[T1, Exclude[String, String]]
  type Refinement = Anon_Attribute with (Anon_CurrentRefinement | Anon_CurrentRefinementItems)
  type RefinementValue = js.Function1[/* searchState */ SearchState, SearchState]
}
