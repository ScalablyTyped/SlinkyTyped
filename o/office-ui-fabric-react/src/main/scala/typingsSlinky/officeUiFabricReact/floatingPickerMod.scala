package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.baseFloatingPickerTypesMod.IBaseFloatingPickerProps
import typingsSlinky.officeUiFabricReact.floatingPeoplePickerMod.IPeopleFloatingPickerProps
import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaProps
import typingsSlinky.officeUiFabricReact.suggestionsDottypesMod.ISuggestionsControlProps
import typingsSlinky.officeUiFabricReact.suggestionsDottypesMod.ISuggestionsCoreProps
import typingsSlinky.officeUiFabricReact.suggestionsDottypesMod.ISuggestionsHeaderFooterItemProps
import typingsSlinky.officeUiFabricReact.suggestionsStoreMod.SuggestionsStoreOptions
import typingsSlinky.officeUiFabricReact.suggestionsTypesMod.ISuggestionModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/FloatingPicker", JSImport.Namespace)
@js.native
object floatingPickerMod extends js.Object {
  
  def createItem(name: String, isValid: Boolean): ISuggestionModel[IPersonaProps] = js.native
  
  @js.native
  class BaseFloatingPeoplePicker ()
    extends typingsSlinky.officeUiFabricReact.baseFloatingPickerMod.BaseFloatingPicker[IPersonaProps, IPeopleFloatingPickerProps]
  
  @js.native
  class BaseFloatingPicker[T, P /* <: IBaseFloatingPickerProps[T] */] protected ()
    extends typingsSlinky.officeUiFabricReact.baseFloatingPickerMod.BaseFloatingPicker[T, P] {
    def this(basePickerProps: P) = this()
  }
  
  @js.native
  class FloatingPeoplePicker ()
    extends typingsSlinky.officeUiFabricReact.floatingPeoplePickerMod.FloatingPeoplePicker
  /* static members */
  @js.native
  object FloatingPeoplePicker extends js.Object {
    
    var defaultProps: js.Any = js.native
  }
  
  @js.native
  object SuggestionItemType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeUiFabricReact.suggestionsControlMod.SuggestionItemType with Double
      ] = js.native
    
    /* 2 */ val footer: typingsSlinky.officeUiFabricReact.suggestionsControlMod.SuggestionItemType.footer with Double = js.native
    
    /* 0 */ val header: typingsSlinky.officeUiFabricReact.suggestionsControlMod.SuggestionItemType.header with Double = js.native
    
    /* 1 */ val suggestion: typingsSlinky.officeUiFabricReact.suggestionsControlMod.SuggestionItemType.suggestion with Double = js.native
  }
  
  @js.native
  class SuggestionsControl[T] protected ()
    extends typingsSlinky.officeUiFabricReact.suggestionsControlMod.SuggestionsControl[T] {
    def this(suggestionsProps: ISuggestionsControlProps[T]) = this()
  }
  
  @js.native
  class SuggestionsCore[T] protected ()
    extends typingsSlinky.officeUiFabricReact.suggestionsCoreMod.SuggestionsCore[T] {
    def this(suggestionsProps: ISuggestionsCoreProps[T]) = this()
  }
  
  @js.native
  class SuggestionsHeaderFooterItem protected ()
    extends typingsSlinky.officeUiFabricReact.suggestionsControlMod.SuggestionsHeaderFooterItem {
    def this(props: ISuggestionsHeaderFooterItemProps) = this()
  }
  
  @js.native
  class SuggestionsStore[T] ()
    extends typingsSlinky.officeUiFabricReact.suggestionsStoreMod.SuggestionsStore[T] {
    def this(options: SuggestionsStoreOptions[T]) = this()
  }
}
