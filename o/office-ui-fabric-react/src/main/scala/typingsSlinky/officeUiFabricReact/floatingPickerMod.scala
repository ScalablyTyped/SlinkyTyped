package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.baseFloatingPickerTypesMod.IBaseFloatingPickerProps
import typingsSlinky.officeUiFabricReact.floatingPeoplePickerMod.IPeopleFloatingPickerProps
import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaProps
import typingsSlinky.officeUiFabricReact.suggestionsDottypesMod.ISuggestionsControlProps
import typingsSlinky.officeUiFabricReact.suggestionsDottypesMod.ISuggestionsCoreProps
import typingsSlinky.officeUiFabricReact.suggestionsDottypesMod.ISuggestionsHeaderFooterItemProps
import typingsSlinky.officeUiFabricReact.suggestionsStoreMod.SuggestionsStoreOptions
import typingsSlinky.officeUiFabricReact.suggestionsTypesMod.ISuggestionModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object floatingPickerMod {
  
  @JSImport("office-ui-fabric-react/lib/components/FloatingPicker", "BaseFloatingPeoplePicker")
  @js.native
  class BaseFloatingPeoplePicker protected ()
    extends typingsSlinky.officeUiFabricReact.floatingPeoplePickerMod.BaseFloatingPeoplePicker {
    def this(basePickerProps: IPeopleFloatingPickerProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/FloatingPicker", "BaseFloatingPicker")
  @js.native
  class BaseFloatingPicker[T, P /* <: IBaseFloatingPickerProps[T] */] protected ()
    extends typingsSlinky.officeUiFabricReact.baseFloatingPickerMod.BaseFloatingPicker[T, P] {
    def this(basePickerProps: P) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/FloatingPicker", "FloatingPeoplePicker")
  @js.native
  class FloatingPeoplePicker protected ()
    extends typingsSlinky.officeUiFabricReact.floatingPeoplePickerMod.FloatingPeoplePicker {
    def this(basePickerProps: IPeopleFloatingPickerProps) = this()
  }
  /* static members */
  object FloatingPeoplePicker {
    
    @JSImport("office-ui-fabric-react/lib/components/FloatingPicker", "FloatingPeoplePicker")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/FloatingPicker", "FloatingPeoplePicker.defaultProps")
    @js.native
    def defaultProps: js.Any = js.native
    @scala.inline
    def defaultProps_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/FloatingPicker", "SuggestionItemType")
  @js.native
  object SuggestionItemType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeUiFabricReact.suggestionsControlMod.SuggestionItemType with Double
      ] = js.native
    
    /* 2 */ val footer: typingsSlinky.officeUiFabricReact.suggestionsControlMod.SuggestionItemType.footer with Double = js.native
    
    /* 0 */ val header: typingsSlinky.officeUiFabricReact.suggestionsControlMod.SuggestionItemType.header with Double = js.native
    
    /* 1 */ val suggestion: typingsSlinky.officeUiFabricReact.suggestionsControlMod.SuggestionItemType.suggestion with Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/FloatingPicker", "SuggestionsControl")
  @js.native
  class SuggestionsControl[T] protected ()
    extends typingsSlinky.officeUiFabricReact.suggestionsControlMod.SuggestionsControl[T] {
    def this(suggestionsProps: ISuggestionsControlProps[T]) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/FloatingPicker", "SuggestionsCore")
  @js.native
  class SuggestionsCore[T] protected ()
    extends typingsSlinky.officeUiFabricReact.suggestionsCoreMod.SuggestionsCore[T] {
    def this(suggestionsProps: ISuggestionsCoreProps[T]) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/FloatingPicker", "SuggestionsHeaderFooterItem")
  @js.native
  class SuggestionsHeaderFooterItem protected ()
    extends typingsSlinky.officeUiFabricReact.suggestionsControlMod.SuggestionsHeaderFooterItem {
    def this(props: ISuggestionsHeaderFooterItemProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/FloatingPicker", "SuggestionsStore")
  @js.native
  class SuggestionsStore[T] ()
    extends typingsSlinky.officeUiFabricReact.suggestionsStoreMod.SuggestionsStore[T] {
    def this(options: SuggestionsStoreOptions[T]) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/FloatingPicker", "createItem")
  @js.native
  def createItem(name: String, isValid: Boolean): ISuggestionModel[IPersonaProps] = js.native
}
