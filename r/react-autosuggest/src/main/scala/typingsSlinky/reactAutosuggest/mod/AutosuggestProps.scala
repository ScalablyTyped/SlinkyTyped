package typingsSlinky.reactAutosuggest.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactAutosuggest.reactAutosuggestBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactAutosuggest.mod.AutosuggestPropsSingleSection[TSuggestion]
  - typingsSlinky.reactAutosuggest.mod.AutosuggestPropsMultiSection[TSuggestion, TSection]
*/
trait AutosuggestProps[TSuggestion, TSection] extends js.Object
object AutosuggestProps {
  
  @scala.inline
  def AutosuggestPropsSingleSection[TSuggestion, TSection](
    getSuggestionValue: TSuggestion => String,
    inputProps: InputProps[TSuggestion],
    onSuggestionsFetchRequested: /* request */ SuggestionsFetchRequestedParams => Unit,
    renderSuggestion: (TSuggestion, /* params */ RenderSuggestionParams) => ReactElement,
    suggestions: js.Array[TSuggestion]
  ): AutosuggestProps[TSuggestion, TSection] = {
    val __obj = js.Dynamic.literal(getSuggestionValue = js.Any.fromFunction1(getSuggestionValue), inputProps = inputProps.asInstanceOf[js.Any], onSuggestionsFetchRequested = js.Any.fromFunction1(onSuggestionsFetchRequested), renderSuggestion = js.Any.fromFunction2(renderSuggestion), suggestions = suggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutosuggestProps[TSuggestion, TSection]]
  }
  
  @scala.inline
  def AutosuggestPropsMultiSection[TSuggestion, TSection](
    getSuggestionValue: TSuggestion => String,
    inputProps: InputProps[TSuggestion],
    multiSection: `true`,
    onSuggestionsFetchRequested: /* request */ SuggestionsFetchRequestedParams => Unit,
    renderSuggestion: (TSuggestion, /* params */ RenderSuggestionParams) => ReactElement,
    suggestions: js.Array[TSection]
  ): AutosuggestProps[TSuggestion, TSection] = {
    val __obj = js.Dynamic.literal(getSuggestionValue = js.Any.fromFunction1(getSuggestionValue), inputProps = inputProps.asInstanceOf[js.Any], multiSection = multiSection.asInstanceOf[js.Any], onSuggestionsFetchRequested = js.Any.fromFunction1(onSuggestionsFetchRequested), renderSuggestion = js.Any.fromFunction2(renderSuggestion), suggestions = suggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutosuggestProps[TSuggestion, TSection]]
  }
}
