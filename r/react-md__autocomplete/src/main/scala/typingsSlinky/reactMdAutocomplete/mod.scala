package typingsSlinky.reactMdAutocomplete

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdAutocomplete.highlightedResultMod.HighlightedResultProps
import typingsSlinky.reactMdAutocomplete.typesMod.AutoCompleteData
import typingsSlinky.reactMdAutocomplete.typesMod.AutoCompleteProps
import typingsSlinky.reactMdAutocomplete.useAutoCompleteMod.AutoCompleteOptions
import typingsSlinky.reactMdAutocomplete.useAutoCompleteMod.AutoCompleteReturnValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/autocomplete", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * An AutoComplete is an accessible combobox widget that allows for real-time
    * suggestions as the user types.
    */
  val AutoComplete: ForwardRefExoticComponent[AutoCompleteProps with RefAttributes[HTMLInputElement]] = js.native
  
  def DEFAULT_GET_RESULT_ID(id: String, index: Double): String = js.native
  
  def DEFAULT_GET_RESULT_LABEL(datum: AutoCompleteData, labelKey: String, _query: String): ReactElement = js.native
  
  def DEFAULT_GET_RESULT_VALUE(datum: AutoCompleteData, valueKey: String): String = js.native
  
  /**
    * The `HighlightedResult` component can be used to bold specific letters
    * within the `children` if the `children` is a string.
    */
  val HighlightedResult: ReactComponentClass[HighlightedResultProps] = js.native
  
  def isResultOf[T /* <: js.Object */](datum: AutoCompleteData): /* is T */ Boolean = js.native
  
  def useAutoComplete(
    hasSuggestionsIdDataPropValueDefaultValueFilterFilterOptionsFilterOnNoValueValueKeyGetResultIdGetResultValueOnBlurOnFocusOnClickOnChangeOnKeyDownForwardedRefOnAutoCompleteClearOnAutoCompleteAnchorXMarginYMarginVwMarginVhMarginTransformOriginListboxWidthListboxStylePreventOverlapDisableSwappingDisableVHBoundsCloseOnResizeCloseOnScrollDisableShowOnFocusIsListAutocompleteIsInlineAutocomplete: AutoCompleteOptions
  ): AutoCompleteReturnValue = js.native
}
