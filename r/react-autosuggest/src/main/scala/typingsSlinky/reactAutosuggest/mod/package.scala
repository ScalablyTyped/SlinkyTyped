package typingsSlinky.reactAutosuggest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  // types for functions - allowing reuse externally - e.g. as props and bound in the constructor
  type GetSectionSuggestions[TSuggestion, TSection] = js.Function1[/* section */ TSection, js.Array[TSuggestion]]
  
  type GetSuggestionValue[TSuggestion] = js.Function1[/* suggestion */ TSuggestion, java.lang.String]
  
  /**
    * Utilies types based on:
    * https://github.com/Microsoft/TypeScript/issues/12215#issuecomment-307871458
    */
  /** @internal */
  type Omit[T, K /* <: /* keyof T */ java.lang.String */] = typingsSlinky.std.Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: P} & {[ P in K ]: never} & {[x: string] : never, [x: number] : never}[keyof T] */ js.Any
  ]
  
  type OnSuggestionHighlighted = js.Function1[
    /* params */ typingsSlinky.reactAutosuggest.mod.SuggestionHighlightedParams, 
    scala.Unit
  ]
  
  type OnSuggestionSelected[TSuggestion] = js.Function2[
    slinky.core.SyntheticEvent[org.scalajs.dom.raw.EventTarget with js.Any, org.scalajs.dom.raw.Event], 
    /* data */ typingsSlinky.reactAutosuggest.mod.SuggestionSelectedEventData[TSuggestion], 
    scala.Unit
  ]
  
  type OnSuggestionsClearRequested = js.Function0[scala.Unit]
  
  type RenderInputComponent[TSuggestion] = js.Function1[
    /* inputProps */ typingsSlinky.reactAutosuggest.mod.InputProps[TSuggestion], 
    slinky.core.facade.ReactElement
  ]
  
  type RenderSectionTitle = js.Function1[/* section */ js.Any, slinky.core.facade.ReactElement]
  
  type RenderSuggestion[TSuggestion] = js.Function2[
    /* suggestion */ TSuggestion, 
    /* params */ typingsSlinky.reactAutosuggest.mod.RenderSuggestionParams, 
    slinky.core.facade.ReactElement
  ]
  
  type RenderSuggestionsContainer = js.Function1[
    /* params */ typingsSlinky.reactAutosuggest.mod.RenderSuggestionsContainerParams, 
    slinky.core.facade.ReactElement
  ]
  
  type ShouldRenderSuggestions = js.Function2[
    /* value */ java.lang.String, 
    /* reason */ typingsSlinky.reactAutosuggest.mod.ShouldRenderReasons, 
    scala.Boolean
  ]
  
  type SuggestionsFetchRequested = js.Function1[
    /* request */ typingsSlinky.reactAutosuggest.mod.SuggestionsFetchRequestedParams, 
    scala.Unit
  ]
  
  type Theme = (typingsSlinky.std.Record[java.lang.String, java.lang.String | typingsSlinky.react.mod.CSSProperties]) | typingsSlinky.reactAutosuggest.anon.PartialRecordThemeKeystri
}
