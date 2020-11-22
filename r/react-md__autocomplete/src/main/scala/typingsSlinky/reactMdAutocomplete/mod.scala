package typingsSlinky.reactMdAutocomplete

import org.scalajs.dom.raw.HTMLInputElement
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
  
  val AutoComplete: ForwardRefExoticComponent[AutoCompleteProps with RefAttributes[HTMLInputElement]] = js.native
  
  def DEFAULT_GET_RESULT_ID(id: String, index: Double): String = js.native
  
  def DEFAULT_GET_RESULT_LABEL(datum: AutoCompleteData, labelKey: String, _query: String): ReactElement = js.native
  
  def DEFAULT_GET_RESULT_VALUE(datum: AutoCompleteData, valueKey: String): String = js.native
  
  def isResultOf[T /* <: js.Object */](datum: AutoCompleteData): /* is T */ Boolean = js.native
  
  def useAutoComplete(
    hasSuggestionsIdDataPropValueDefaultValueFilterFilterOptionsFilterOnNoValueValueKeyGetResultIdGetResultValueOnBlurOnFocusOnClickOnChangeOnKeyDownForwardedRefOnAutoCompleteClearOnAutoCompleteAnchorXMarginYMarginVwMarginVhMarginTransformOriginListboxWidthListboxStylePreventOverlapDisableSwappingDisableVHBoundsCloseOnResizeCloseOnScrollDisableShowOnFocusIsListAutocompleteIsInlineAutocomplete: AutoCompleteOptions
  ): AutoCompleteReturnValue = js.native
  
  @js.native
  object HighlightedResult extends js.Object {
    
    def apply(hasIdStyleClassNameEnabledValueChildrenRepeatableIndex: HighlightedResultProps): ReactElement = js.native
    
    @js.native
    object propTypes extends js.Object {
      
      var children: js.Any = js.native
      
      var className: js.Any = js.native
      
      var enabled: js.Any = js.native
      
      var id: js.Any = js.native
      
      var index: js.Any = js.native
      
      var repeatable: js.Any = js.native
      
      var style: js.Any = js.native
      
      var value: js.Any = js.native
    }
  }
}
