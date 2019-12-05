package typingsSlinky.officeDashUiDashFabricDashReact

import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsFloatingPickerBaseFloatingPickerDotTypesMod.IBaseFloatingPickerProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsFloatingPickerPeoplePickerFloatingPeoplePickerMod.IPeopleFloatingPickerProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsFloatingPickerSuggestionsSuggestionsDotTypesMod.ISuggestionsControlProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsFloatingPickerSuggestionsSuggestionsDotTypesMod.ISuggestionsCoreProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsFloatingPickerSuggestionsSuggestionsStoreMod.SuggestionsStoreOptions
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaDotTypesMod.IPersonaProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersSuggestionsSuggestionsDotTypesMod.ISuggestionModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/FloatingPicker", JSImport.Namespace)
@js.native
object libFloatingPickerMod extends js.Object {
  @js.native
  class BaseFloatingPeoplePicker ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsFloatingPickerBaseFloatingPickerMod.BaseFloatingPicker[IPersonaProps, IPeopleFloatingPickerProps]
  
  @js.native
  class BaseFloatingPicker[T, P /* <: IBaseFloatingPickerProps[T] */] protected ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsFloatingPickerMod.BaseFloatingPicker[T, P] {
    def this(basePickerProps: P) = this()
  }
  
  @js.native
  class FloatingPeoplePicker ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsFloatingPickerMod.FloatingPeoplePicker
  
  @js.native
  class SuggestionsControl[T] protected ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsFloatingPickerMod.SuggestionsControl[T] {
    def this(suggestionsProps: ISuggestionsControlProps[T]) = this()
  }
  
  @js.native
  class SuggestionsCore[T] protected ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsFloatingPickerMod.SuggestionsCore[T] {
    def this(suggestionsProps: ISuggestionsCoreProps[T]) = this()
  }
  
  @js.native
  class SuggestionsHeaderFooterItem ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsFloatingPickerSuggestionsSuggestionsControlMod.SuggestionsHeaderFooterItem
  
  @js.native
  class SuggestionsStore[T] ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsFloatingPickerMod.SuggestionsStore[T] {
    def this(options: SuggestionsStoreOptions[T]) = this()
  }
  
  def createItem(name: String, isValid: Boolean): ISuggestionModel[IPersonaProps] = js.native
  /* static members */
  @js.native
  object FloatingPeoplePicker extends js.Object {
    var defaultProps: js.Any = js.native
  }
  
  @js.native
  object SuggestionItemType extends js.Object {
    /* 2 */ val footer: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsFloatingPickerSuggestionsSuggestionsControlMod.SuggestionItemType.footer with Double = js.native
    /* 0 */ val header: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsFloatingPickerSuggestionsSuggestionsControlMod.SuggestionItemType.header with Double = js.native
    /* 1 */ val suggestion: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsFloatingPickerSuggestionsSuggestionsControlMod.SuggestionItemType.suggestion with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeDashUiDashFabricDashReact.libComponentsFloatingPickerSuggestionsSuggestionsControlMod.SuggestionItemType with Double
      ] = js.native
  }
  
}

