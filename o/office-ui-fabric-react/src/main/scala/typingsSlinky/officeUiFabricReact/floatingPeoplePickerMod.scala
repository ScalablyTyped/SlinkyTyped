package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.baseFloatingPickerMod.BaseFloatingPicker
import typingsSlinky.officeUiFabricReact.baseFloatingPickerTypesMod.IBaseFloatingPickerProps
import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaProps
import typingsSlinky.officeUiFabricReact.suggestionsTypesMod.ISuggestionModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object floatingPeoplePickerMod {
  
  @JSImport("office-ui-fabric-react/lib/components/FloatingPicker/PeoplePicker/FloatingPeoplePicker", "BaseFloatingPeoplePicker")
  @js.native
  class BaseFloatingPeoplePicker protected () extends BaseFloatingPicker[IPersonaProps, IPeopleFloatingPickerProps] {
    def this(basePickerProps: IPeopleFloatingPickerProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/FloatingPicker/PeoplePicker/FloatingPeoplePicker", "FloatingPeoplePicker")
  @js.native
  class FloatingPeoplePicker protected () extends BaseFloatingPeoplePicker {
    def this(basePickerProps: IPeopleFloatingPickerProps) = this()
  }
  /* static members */
  object FloatingPeoplePicker {
    
    @JSImport("office-ui-fabric-react/lib/components/FloatingPicker/PeoplePicker/FloatingPeoplePicker", "FloatingPeoplePicker")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/FloatingPicker/PeoplePicker/FloatingPeoplePicker", "FloatingPeoplePicker.defaultProps")
    @js.native
    def defaultProps: js.Any = js.native
    @scala.inline
    def defaultProps_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/FloatingPicker/PeoplePicker/FloatingPeoplePicker", "createItem")
  @js.native
  def createItem(name: String, isValid: Boolean): ISuggestionModel[IPersonaProps] = js.native
  
  type IPeopleFloatingPickerProps = IBaseFloatingPickerProps[IPersonaProps]
}
