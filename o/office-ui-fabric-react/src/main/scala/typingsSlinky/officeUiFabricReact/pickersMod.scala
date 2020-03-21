package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.officeUiFabricReact.autofillTypesMod.IAutofillProps
import typingsSlinky.officeUiFabricReact.basePickerTypesMod.IBasePickerProps
import typingsSlinky.officeUiFabricReact.basePickerTypesMod.ValidationState
import typingsSlinky.officeUiFabricReact.peoplePickerItemTypesMod.IPeoplePickerItemSelectedProps
import typingsSlinky.officeUiFabricReact.peoplePickerItemTypesMod.IPeoplePickerItemSuggestionProps
import typingsSlinky.officeUiFabricReact.peoplePickerMod.IPeoplePickerProps
import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaProps
import typingsSlinky.officeUiFabricReact.suggestionsTypesMod.ISuggestionsProps
import typingsSlinky.officeUiFabricReact.tagPickerTypesMod.ITagItemProps
import typingsSlinky.officeUiFabricReact.tagPickerTypesMod.ITagItemSuggestionProps
import typingsSlinky.officeUiFabricReact.tagPickerTypesMod.ITagPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/pickers", JSImport.Namespace)
@js.native
object pickersMod extends js.Object {
  @js.native
  class Autofill protected ()
    extends typingsSlinky.officeUiFabricReact.baseAutoFillMod.Autofill {
    def this(props: IAutofillProps) = this()
  }
  
  @js.native
  class BaseAutoFill ()
    extends typingsSlinky.officeUiFabricReact.autofillAutofillMod.Autofill
  
  @js.native
  class BasePeoplePicker ()
    extends typingsSlinky.officeUiFabricReact.basePickerMod.BasePicker[IPersonaProps, IPeoplePickerProps]
  
  @js.native
  class BasePicker[T, P /* <: IBasePickerProps[T] */] protected ()
    extends typingsSlinky.officeUiFabricReact.basePickerMod.BasePicker[T, P] {
    def this(basePickerProps: P) = this()
  }
  
  @js.native
  class BasePickerListBelow[T, P /* <: IBasePickerProps[T] */] ()
    extends typingsSlinky.officeUiFabricReact.basePickerMod.BasePickerListBelow[T, P]
  
  @js.native
  class CompactPeoplePickerBase ()
    extends typingsSlinky.officeUiFabricReact.peoplePickerMod.CompactPeoplePickerBase
  
  @js.native
  class ListPeoplePickerBase ()
    extends typingsSlinky.officeUiFabricReact.peoplePickerMod.ListPeoplePickerBase
  
  @js.native
  class MemberListPeoplePicker ()
    extends typingsSlinky.officeUiFabricReact.basePickerMod.BasePickerListBelow[IPersonaProps, IPeoplePickerProps]
  
  @js.native
  class NormalPeoplePickerBase ()
    extends typingsSlinky.officeUiFabricReact.peoplePickerMod.NormalPeoplePickerBase
  
  @js.native
  class Suggestions[T] protected ()
    extends typingsSlinky.officeUiFabricReact.suggestionsMod.Suggestions[T] {
    def this(suggestionsProps: ISuggestionsProps[T]) = this()
  }
  
  @js.native
  class SuggestionsController[T] ()
    extends typingsSlinky.officeUiFabricReact.suggestionsControllerMod.SuggestionsController[T]
  
  @js.native
  class SuggestionsItem[T] ()
    extends typingsSlinky.officeUiFabricReact.suggestionsItemMod.SuggestionsItem[T]
  
  @js.native
  class TagPickerBase ()
    extends typingsSlinky.officeUiFabricReact.tagPickerMod.TagPickerBase
  
  val CompactPeoplePicker: ReactComponentClass[IPeoplePickerProps] = js.native
  val ListPeoplePicker: ReactComponentClass[IPeoplePickerProps] = js.native
  val NormalPeoplePicker: ReactComponentClass[IPeoplePickerProps] = js.native
  val PeoplePickerItem: ReactComponentClass[IPeoplePickerItemSelectedProps] = js.native
  val PeoplePickerItemSuggestion: ReactComponentClass[IPeoplePickerItemSuggestionProps] = js.native
  val TagItem: ReactComponentClass[ITagItemProps] = js.native
  val TagItemSuggestion: ReactComponentClass[ITagItemSuggestionProps] = js.native
  val TagPicker: ReactComponentClass[ITagPickerProps] = js.native
  def PeoplePickerItemBase(props: IPeoplePickerItemSelectedProps): ReactElement = js.native
  def PeoplePickerItemSuggestionBase(props: IPeoplePickerItemSuggestionProps): ReactElement = js.native
  def TagItemBase(props: ITagItemProps): ReactElement = js.native
  def TagItemSuggestionBase(props: ITagItemSuggestionProps): ReactElement = js.native
  def createGenericItem(name: String, currentValidationState: ValidationState): IGenericItemkeyKey = js.native
  /* static members */
  @js.native
  object Autofill extends js.Object {
    var defaultProps: AnonEnableAutofillOnKeyPress = js.native
  }
  
  /* static members */
  @js.native
  object CompactPeoplePickerBase extends js.Object {
    /** Default props for CompactPeoplePicker. */
    var defaultProps: AnonCreateGenericItem = js.native
  }
  
  /* static members */
  @js.native
  object ListPeoplePickerBase extends js.Object {
    /** Default props for ListPeoplePicker. */
    var defaultProps: AnonCreateGenericItem = js.native
  }
  
  /* static members */
  @js.native
  object NormalPeoplePickerBase extends js.Object {
    /** Default props for NormalPeoplePicker. */
    var defaultProps: AnonCreateGenericItem = js.native
  }
  
  @js.native
  object SuggestionActionType extends js.Object {
    /* 1 */ val forceResolve: typingsSlinky.officeUiFabricReact.suggestionsTypesMod.SuggestionActionType.forceResolve with Double = js.native
    /* 0 */ val none: typingsSlinky.officeUiFabricReact.suggestionsTypesMod.SuggestionActionType.none with Double = js.native
    /* 2 */ val searchMore: typingsSlinky.officeUiFabricReact.suggestionsTypesMod.SuggestionActionType.searchMore with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeUiFabricReact.suggestionsTypesMod.SuggestionActionType with Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object TagPickerBase extends js.Object {
    var defaultProps: AnonOnRenderItem = js.native
  }
  
  @js.native
  object ValidationState extends js.Object {
    /* 2 */ val invalid: typingsSlinky.officeUiFabricReact.basePickerTypesMod.ValidationState.invalid with Double = js.native
    /* 0 */ val valid: typingsSlinky.officeUiFabricReact.basePickerTypesMod.ValidationState.valid with Double = js.native
    /* 1 */ val warning: typingsSlinky.officeUiFabricReact.basePickerTypesMod.ValidationState.warning with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.officeUiFabricReact.basePickerTypesMod.ValidationState with Double] = js.native
  }
  
}

