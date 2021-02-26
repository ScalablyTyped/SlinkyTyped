package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.anon.CreateGenericItem
import typingsSlinky.officeUiFabricReact.anon.IGenericItemkeyKey
import typingsSlinky.officeUiFabricReact.basePickerMod.BasePicker
import typingsSlinky.officeUiFabricReact.basePickerMod.BasePickerListBelow
import typingsSlinky.officeUiFabricReact.basePickerTypesMod.IBasePickerProps
import typingsSlinky.officeUiFabricReact.basePickerTypesMod.ValidationState
import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object peoplePickerMod {
  
  @JSImport("office-ui-fabric-react/lib/components/pickers/PeoplePicker/PeoplePicker", "BasePeoplePicker")
  @js.native
  class BasePeoplePicker protected () extends BasePicker[IPersonaProps, IPeoplePickerProps] {
    def this(basePickerProps: IPeoplePickerProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/pickers/PeoplePicker/PeoplePicker", "CompactPeoplePicker")
  @js.native
  val CompactPeoplePicker: ReactComponentClass[IPeoplePickerProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/pickers/PeoplePicker/PeoplePicker", "CompactPeoplePickerBase")
  @js.native
  class CompactPeoplePickerBase protected () extends BasePeoplePicker {
    def this(basePickerProps: IPeoplePickerProps) = this()
  }
  /* static members */
  object CompactPeoplePickerBase {
    
    @JSImport("office-ui-fabric-react/lib/components/pickers/PeoplePicker/PeoplePicker", "CompactPeoplePickerBase")
    @js.native
    val ^ : js.Any = js.native
    
    /** Default props for CompactPeoplePicker. */
    @JSImport("office-ui-fabric-react/lib/components/pickers/PeoplePicker/PeoplePicker", "CompactPeoplePickerBase.defaultProps")
    @js.native
    def defaultProps: CreateGenericItem = js.native
    @scala.inline
    def defaultProps_=(x: CreateGenericItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/pickers/PeoplePicker/PeoplePicker", "ListPeoplePicker")
  @js.native
  val ListPeoplePicker: ReactComponentClass[IPeoplePickerProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/pickers/PeoplePicker/PeoplePicker", "ListPeoplePickerBase")
  @js.native
  class ListPeoplePickerBase protected () extends MemberListPeoplePicker {
    def this(basePickerProps: IPeoplePickerProps) = this()
  }
  /* static members */
  object ListPeoplePickerBase {
    
    @JSImport("office-ui-fabric-react/lib/components/pickers/PeoplePicker/PeoplePicker", "ListPeoplePickerBase")
    @js.native
    val ^ : js.Any = js.native
    
    /** Default props for ListPeoplePicker. */
    @JSImport("office-ui-fabric-react/lib/components/pickers/PeoplePicker/PeoplePicker", "ListPeoplePickerBase.defaultProps")
    @js.native
    def defaultProps: CreateGenericItem = js.native
    @scala.inline
    def defaultProps_=(x: CreateGenericItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/pickers/PeoplePicker/PeoplePicker", "MemberListPeoplePicker")
  @js.native
  class MemberListPeoplePicker protected () extends BasePickerListBelow[IPersonaProps, IPeoplePickerProps] {
    def this(basePickerProps: IPeoplePickerProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/pickers/PeoplePicker/PeoplePicker", "NormalPeoplePicker")
  @js.native
  val NormalPeoplePicker: ReactComponentClass[IPeoplePickerProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/pickers/PeoplePicker/PeoplePicker", "NormalPeoplePickerBase")
  @js.native
  class NormalPeoplePickerBase protected () extends BasePeoplePicker {
    def this(basePickerProps: IPeoplePickerProps) = this()
  }
  /* static members */
  object NormalPeoplePickerBase {
    
    @JSImport("office-ui-fabric-react/lib/components/pickers/PeoplePicker/PeoplePicker", "NormalPeoplePickerBase")
    @js.native
    val ^ : js.Any = js.native
    
    /** Default props for NormalPeoplePicker. */
    @JSImport("office-ui-fabric-react/lib/components/pickers/PeoplePicker/PeoplePicker", "NormalPeoplePickerBase.defaultProps")
    @js.native
    def defaultProps: CreateGenericItem = js.native
    @scala.inline
    def defaultProps_=(x: CreateGenericItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/pickers/PeoplePicker/PeoplePicker", "createGenericItem")
  @js.native
  def createGenericItem(name: String, currentValidationState: ValidationState): IGenericItemkeyKey = js.native
  
  @js.native
  trait IGenericItem extends StObject {
    
    var ValidationState: typingsSlinky.officeUiFabricReact.basePickerTypesMod.ValidationState = js.native
    
    var imageInitials: String = js.native
    
    var primaryText: String = js.native
  }
  object IGenericItem {
    
    @scala.inline
    def apply(ValidationState: ValidationState, imageInitials: String, primaryText: String): IGenericItem = {
      val __obj = js.Dynamic.literal(ValidationState = ValidationState.asInstanceOf[js.Any], imageInitials = imageInitials.asInstanceOf[js.Any], primaryText = primaryText.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGenericItem]
    }
    
    @scala.inline
    implicit class IGenericItemMutableBuilder[Self <: IGenericItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImageInitials(value: String): Self = StObject.set(x, "imageInitials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryText(value: String): Self = StObject.set(x, "primaryText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationState(value: ValidationState): Self = StObject.set(x, "ValidationState", value.asInstanceOf[js.Any])
    }
  }
  
  type IPeoplePickerProps = IBasePickerProps[IPersonaProps]
}
