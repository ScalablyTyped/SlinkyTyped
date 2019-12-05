package typingsSlinky.officeDashUiDashFabricDashReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsAutofillAutofillDotTypesMod.IAutofillProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaDotTypesMod.IPersonaProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersBasePickerDotTypesMod.IBasePickerProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersBasePickerDotTypesMod.ValidationState
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersPeoplePickerPeoplePickerItemsPeoplePickerItemDotTypesMod.IPeoplePickerItemSelectedProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersPeoplePickerPeoplePickerItemsPeoplePickerItemDotTypesMod.IPeoplePickerItemSuggestionProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersPeoplePickerPeoplePickerMod.IGenericItem
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersPeoplePickerPeoplePickerMod.IPeoplePickerProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersSuggestionsSuggestionsDotTypesMod.ISuggestionsProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersTagPickerTagPickerDotTypesMod.ITagItemProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersTagPickerTagPickerDotTypesMod.ITagItemSuggestionProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersTagPickerTagPickerDotTypesMod.ITagPickerProps
import typingsSlinky.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Pickers", JSImport.Namespace)
@js.native
object libPickersMod extends js.Object {
  @js.native
  class Autofill protected ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersMod.Autofill {
    def this(props: IAutofillProps) = this()
  }
  
  @js.native
  class BaseAutoFill ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsAutofillAutofillMod.Autofill
  
  @js.native
  class BasePeoplePicker ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersBasePickerMod.BasePicker[IPersonaProps, IPeoplePickerProps]
  
  @js.native
  class BasePicker[T, P /* <: IBasePickerProps[T] */] protected ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersMod.BasePicker[T, P] {
    def this(basePickerProps: P) = this()
  }
  
  @js.native
  class BasePickerListBelow[T, P /* <: IBasePickerProps[T] */] ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersBasePickerMod.BasePickerListBelow[T, P]
  
  @js.native
  class CompactPeoplePickerBase ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersMod.CompactPeoplePickerBase
  
  @js.native
  class ListPeoplePickerBase ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersMod.ListPeoplePickerBase
  
  @js.native
  class MemberListPeoplePicker ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersBasePickerMod.BasePickerListBelow[IPersonaProps, IPeoplePickerProps]
  
  @js.native
  class NormalPeoplePickerBase ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersMod.NormalPeoplePickerBase
  
  @js.native
  class Suggestions[T] protected ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersMod.Suggestions[T] {
    def this(suggestionsProps: ISuggestionsProps[T]) = this()
  }
  
  @js.native
  class SuggestionsController[T] ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersMod.SuggestionsController[T]
  
  @js.native
  class SuggestionsItem[T] ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersSuggestionsSuggestionsItemMod.SuggestionsItem[T]
  
  @js.native
  class TagPickerBase ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersMod.TagPickerBase
  
  val CompactPeoplePicker: ReactComponentClass[IPeoplePickerProps] = js.native
  val ListPeoplePicker: ReactComponentClass[IPeoplePickerProps] = js.native
  val NormalPeoplePicker: ReactComponentClass[IPeoplePickerProps] = js.native
  val PeoplePickerItem: ReactComponentClass[IPeoplePickerItemSelectedProps] = js.native
  val PeoplePickerItemSuggestion: ReactComponentClass[IPeoplePickerItemSuggestionProps] = js.native
  val TagItem: ReactComponentClass[ITagItemProps] = js.native
  val TagItemSuggestion: ReactComponentClass[ITagItemSuggestionProps] = js.native
  val TagPicker: ReactComponentClass[ITagPickerProps] = js.native
  def PeoplePickerItemBase(props: IPeoplePickerItemSelectedProps): Element = js.native
  def PeoplePickerItemSuggestionBase(props: IPeoplePickerItemSuggestionProps): Element = js.native
  def TagItemBase(props: ITagItemProps): Element = js.native
  def TagItemSuggestionBase(props: ITagItemSuggestionProps): Element = js.native
  def createGenericItem(name: String, currentValidationState: ValidationState): IGenericItem with Anon_Key = js.native
  /* static members */
  @js.native
  object Autofill extends js.Object {
    var defaultProps: Anon_EnableAutofillOnKeyPress = js.native
  }
  
  /* static members */
  @js.native
  object CompactPeoplePickerBase extends js.Object {
    /** Default props for CompactPeoplePicker. */
    var defaultProps: Anon_CreateGenericItem = js.native
  }
  
  /* static members */
  @js.native
  object ListPeoplePickerBase extends js.Object {
    /** Default props for ListPeoplePicker. */
    var defaultProps: Anon_CreateGenericItem = js.native
  }
  
  /* static members */
  @js.native
  object NormalPeoplePickerBase extends js.Object {
    /** Default props for NormalPeoplePicker. */
    var defaultProps: Anon_CreateGenericItem = js.native
  }
  
  @js.native
  object SuggestionActionType extends js.Object {
    /* 1 */ val forceResolve: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersSuggestionsSuggestionsDotTypesMod.SuggestionActionType.forceResolve with Double = js.native
    /* 0 */ val none: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersSuggestionsSuggestionsDotTypesMod.SuggestionActionType.none with Double = js.native
    /* 2 */ val searchMore: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersSuggestionsSuggestionsDotTypesMod.SuggestionActionType.searchMore with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersSuggestionsSuggestionsDotTypesMod.SuggestionActionType with Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object TagPickerBase extends js.Object {
    var defaultProps: Anon_OnRenderItem = js.native
  }
  
  @js.native
  object ValidationState extends js.Object {
    /* 2 */ val invalid: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersBasePickerDotTypesMod.ValidationState.invalid with Double = js.native
    /* 0 */ val valid: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersBasePickerDotTypesMod.ValidationState.valid with Double = js.native
    /* 1 */ val warning: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersBasePickerDotTypesMod.ValidationState.warning with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersBasePickerDotTypesMod.ValidationState with Double
      ] = js.native
  }
  
}

