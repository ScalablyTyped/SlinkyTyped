package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.officeUiFabricReact.anon.CreateGenericItem
import typingsSlinky.officeUiFabricReact.anon.EnableAutofillOnKeyPress
import typingsSlinky.officeUiFabricReact.anon.IGenericItemkeyKey
import typingsSlinky.officeUiFabricReact.anon.OnRenderItem
import typingsSlinky.officeUiFabricReact.autofillTypesMod.IAutofillProps
import typingsSlinky.officeUiFabricReact.basePickerTypesMod.IBasePickerProps
import typingsSlinky.officeUiFabricReact.basePickerTypesMod.ValidationState
import typingsSlinky.officeUiFabricReact.peoplePickerItemTypesMod.IPeoplePickerItemSelectedProps
import typingsSlinky.officeUiFabricReact.peoplePickerItemTypesMod.IPeoplePickerItemSuggestionProps
import typingsSlinky.officeUiFabricReact.peoplePickerMod.IPeoplePickerProps
import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaProps
import typingsSlinky.officeUiFabricReact.suggestionsItemTypesMod.ISuggestionItemProps
import typingsSlinky.officeUiFabricReact.suggestionsTypesMod.ISuggestionsProps
import typingsSlinky.officeUiFabricReact.tagPickerTypesMod.ITagItemProps
import typingsSlinky.officeUiFabricReact.tagPickerTypesMod.ITagItemSuggestionProps
import typingsSlinky.officeUiFabricReact.tagPickerTypesMod.ITagPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/Pickers", JSImport.Namespace)
@js.native
object libPickersMod extends js.Object {
  
  val CompactPeoplePicker: ReactComponentClass[IPeoplePickerProps] = js.native
  
  val ListPeoplePicker: ReactComponentClass[IPeoplePickerProps] = js.native
  
  val NormalPeoplePicker: ReactComponentClass[IPeoplePickerProps] = js.native
  
  val PeoplePickerItem: ReactComponentClass[IPeoplePickerItemSelectedProps] = js.native
  
  def PeoplePickerItemBase(props: IPeoplePickerItemSelectedProps): ReactElement = js.native
  
  val PeoplePickerItemSuggestion: ReactComponentClass[IPeoplePickerItemSuggestionProps] = js.native
  
  def PeoplePickerItemSuggestionBase(props: IPeoplePickerItemSuggestionProps): ReactElement = js.native
  
  val TagItem: ReactComponentClass[ITagItemProps] = js.native
  
  def TagItemBase(props: ITagItemProps): ReactElement = js.native
  
  val TagItemSuggestion: ReactComponentClass[ITagItemSuggestionProps] = js.native
  
  def TagItemSuggestionBase(props: ITagItemSuggestionProps): ReactElement = js.native
  
  val TagPicker: ReactComponentClass[ITagPickerProps] = js.native
  
  def createGenericItem(name: String, currentValidationState: ValidationState): IGenericItemkeyKey = js.native
  
  @js.native
  class Autofill protected ()
    extends typingsSlinky.officeUiFabricReact.pickersMod.Autofill {
    def this(props: IAutofillProps) = this()
  }
  /* static members */
  @js.native
  object Autofill extends js.Object {
    
    var defaultProps: EnableAutofillOnKeyPress = js.native
  }
  
  @js.native
  class BaseAutoFill ()
    extends typingsSlinky.officeUiFabricReact.autofillAutofillMod.Autofill
  
  @js.native
  class BasePeoplePicker ()
    extends typingsSlinky.officeUiFabricReact.basePickerMod.BasePicker[IPersonaProps, IPeoplePickerProps]
  
  @js.native
  class BasePicker[T, P /* <: IBasePickerProps[T] */] protected ()
    extends typingsSlinky.officeUiFabricReact.pickersMod.BasePicker[T, P] {
    def this(basePickerProps: P) = this()
  }
  
  @js.native
  class BasePickerListBelow[T, P /* <: IBasePickerProps[T] */] ()
    extends typingsSlinky.officeUiFabricReact.basePickerMod.BasePickerListBelow[T, P]
  
  @js.native
  class CompactPeoplePickerBase ()
    extends typingsSlinky.officeUiFabricReact.pickersMod.CompactPeoplePickerBase
  /* static members */
  @js.native
  object CompactPeoplePickerBase extends js.Object {
    
    /** Default props for CompactPeoplePicker. */
    var defaultProps: CreateGenericItem = js.native
  }
  
  @js.native
  class ListPeoplePickerBase ()
    extends typingsSlinky.officeUiFabricReact.pickersMod.ListPeoplePickerBase
  /* static members */
  @js.native
  object ListPeoplePickerBase extends js.Object {
    
    /** Default props for ListPeoplePicker. */
    var defaultProps: CreateGenericItem = js.native
  }
  
  @js.native
  class MemberListPeoplePicker ()
    extends typingsSlinky.officeUiFabricReact.basePickerMod.BasePickerListBelow[IPersonaProps, IPeoplePickerProps]
  
  @js.native
  class NormalPeoplePickerBase ()
    extends typingsSlinky.officeUiFabricReact.pickersMod.NormalPeoplePickerBase
  /* static members */
  @js.native
  object NormalPeoplePickerBase extends js.Object {
    
    /** Default props for NormalPeoplePicker. */
    var defaultProps: CreateGenericItem = js.native
  }
  
  @js.native
  object SuggestionActionType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeUiFabricReact.suggestionsTypesMod.SuggestionActionType with Double
      ] = js.native
    
    /* 1 */ val forceResolve: typingsSlinky.officeUiFabricReact.suggestionsTypesMod.SuggestionActionType.forceResolve with Double = js.native
    
    /* 0 */ val none: typingsSlinky.officeUiFabricReact.suggestionsTypesMod.SuggestionActionType.none with Double = js.native
    
    /* 2 */ val searchMore: typingsSlinky.officeUiFabricReact.suggestionsTypesMod.SuggestionActionType.searchMore with Double = js.native
  }
  
  @js.native
  class Suggestions[T] protected ()
    extends typingsSlinky.officeUiFabricReact.pickersMod.Suggestions[T] {
    def this(suggestionsProps: ISuggestionsProps[T]) = this()
  }
  
  @js.native
  class SuggestionsController[T] ()
    extends typingsSlinky.officeUiFabricReact.pickersMod.SuggestionsController[T]
  
  @js.native
  class SuggestionsItem[T] protected ()
    extends typingsSlinky.officeUiFabricReact.pickersMod.SuggestionsItem[T] {
    def this(props: ISuggestionItemProps[T]) = this()
  }
  
  @js.native
  class TagPickerBase protected ()
    extends typingsSlinky.officeUiFabricReact.pickersMod.TagPickerBase {
    def this(props: ITagPickerProps) = this()
  }
  /* static members */
  @js.native
  object TagPickerBase extends js.Object {
    
    var defaultProps: OnRenderItem = js.native
  }
  
  @js.native
  object ValidationState extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.officeUiFabricReact.basePickerTypesMod.ValidationState with Double] = js.native
    
    /* 2 */ val invalid: typingsSlinky.officeUiFabricReact.basePickerTypesMod.ValidationState.invalid with Double = js.native
    
    /* 0 */ val valid: typingsSlinky.officeUiFabricReact.basePickerTypesMod.ValidationState.valid with Double = js.native
    
    /* 1 */ val warning: typingsSlinky.officeUiFabricReact.basePickerTypesMod.ValidationState.warning with Double = js.native
  }
}
