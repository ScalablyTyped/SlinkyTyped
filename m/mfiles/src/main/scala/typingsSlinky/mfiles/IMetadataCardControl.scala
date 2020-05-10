package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFBuiltInPropertyDef
import typingsSlinky.mfiles.MFiles.MFBuiltInValueList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMetadataCardControl extends js.Object {
  val AllowAdding: Boolean = js.native
  val Events: IEvents = js.native
  val Hierarchical: Boolean = js.native
  val ID: String = js.native
  var Label: String = js.native
  val Linked: Boolean = js.native
  var Modified: Boolean = js.native
  var MustExist: Boolean = js.native
  val PropertyDef: MFBuiltInPropertyDef | Double = js.native
  var ReadOnly: Boolean = js.native
  val RealObjectType: Boolean = js.native
  val Type: String = js.native
  var Value: js.Any = js.native
  var ValueRequired: Boolean = js.native
  val Valuelist: MFBuiltInValueList | Double = js.native
  var Visible: Boolean = js.native
  def ActivateLink(valuePart: js.Any): Unit = js.native
  def AddNewItem(name: String): js.Any = js.native
  def AddNewSubItem(name: String, valueParent: js.Any): js.Any = js.native
  def AllowHitHighlighting(): Boolean = js.native
  def CanActivateLink(valuePart: js.Any): Boolean = js.native
  def CanAddNewSubItem(name: String, valueParent: js.Any): Boolean = js.native
  def CanEditItem(value: js.Any): Boolean = js.native
  def CreateSelectionList(): IMetadataCardSelectionList = js.native
  def CreateUnvalidatedValue(valueString: String): IMetadataCardUnvalidatedValue = js.native
  def EditItem(value: js.Any): js.Any = js.native
  def FindItem(name: String): js.Any = js.native
  def FindItemByID(itemID: Double): js.Any = js.native
  def GetSelectableValueItemStates(): js.Any = js.native
  def GetValueSuggestions(): js.Any = js.native
  def HasAutomaticValue(): Boolean = js.native
  def HasInitialValue(): Boolean = js.native
  def HasUncalculatedAutomaticValue(): Boolean = js.native
  def IsExternal(): Boolean = js.native
  def RefreshList(): Unit = js.native
  def Remove(): Unit = js.native
  def RevertToInitialValue(): Unit = js.native
  def SetValueItemState(itemID: String, state: js.Any): Unit = js.native
}

object IMetadataCardControl {
  @scala.inline
  def apply(
    ActivateLink: js.Any => Unit,
    AddNewItem: String => js.Any,
    AddNewSubItem: (String, js.Any) => js.Any,
    AllowAdding: Boolean,
    AllowHitHighlighting: () => Boolean,
    CanActivateLink: js.Any => Boolean,
    CanAddNewSubItem: (String, js.Any) => Boolean,
    CanEditItem: js.Any => Boolean,
    CreateSelectionList: () => IMetadataCardSelectionList,
    CreateUnvalidatedValue: String => IMetadataCardUnvalidatedValue,
    EditItem: js.Any => js.Any,
    Events: IEvents,
    FindItem: String => js.Any,
    FindItemByID: Double => js.Any,
    GetSelectableValueItemStates: () => js.Any,
    GetValueSuggestions: () => js.Any,
    HasAutomaticValue: () => Boolean,
    HasInitialValue: () => Boolean,
    HasUncalculatedAutomaticValue: () => Boolean,
    Hierarchical: Boolean,
    ID: String,
    IsExternal: () => Boolean,
    Label: String,
    Linked: Boolean,
    Modified: Boolean,
    MustExist: Boolean,
    PropertyDef: MFBuiltInPropertyDef | Double,
    ReadOnly: Boolean,
    RealObjectType: Boolean,
    RefreshList: () => Unit,
    Remove: () => Unit,
    RevertToInitialValue: () => Unit,
    SetValueItemState: (String, js.Any) => Unit,
    Type: String,
    Value: js.Any,
    ValueRequired: Boolean,
    Valuelist: MFBuiltInValueList | Double,
    Visible: Boolean
  ): IMetadataCardControl = {
    val __obj = js.Dynamic.literal(ActivateLink = js.Any.fromFunction1(ActivateLink), AddNewItem = js.Any.fromFunction1(AddNewItem), AddNewSubItem = js.Any.fromFunction2(AddNewSubItem), AllowAdding = AllowAdding.asInstanceOf[js.Any], AllowHitHighlighting = js.Any.fromFunction0(AllowHitHighlighting), CanActivateLink = js.Any.fromFunction1(CanActivateLink), CanAddNewSubItem = js.Any.fromFunction2(CanAddNewSubItem), CanEditItem = js.Any.fromFunction1(CanEditItem), CreateSelectionList = js.Any.fromFunction0(CreateSelectionList), CreateUnvalidatedValue = js.Any.fromFunction1(CreateUnvalidatedValue), EditItem = js.Any.fromFunction1(EditItem), Events = Events.asInstanceOf[js.Any], FindItem = js.Any.fromFunction1(FindItem), FindItemByID = js.Any.fromFunction1(FindItemByID), GetSelectableValueItemStates = js.Any.fromFunction0(GetSelectableValueItemStates), GetValueSuggestions = js.Any.fromFunction0(GetValueSuggestions), HasAutomaticValue = js.Any.fromFunction0(HasAutomaticValue), HasInitialValue = js.Any.fromFunction0(HasInitialValue), HasUncalculatedAutomaticValue = js.Any.fromFunction0(HasUncalculatedAutomaticValue), Hierarchical = Hierarchical.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], IsExternal = js.Any.fromFunction0(IsExternal), Label = Label.asInstanceOf[js.Any], Linked = Linked.asInstanceOf[js.Any], Modified = Modified.asInstanceOf[js.Any], MustExist = MustExist.asInstanceOf[js.Any], PropertyDef = PropertyDef.asInstanceOf[js.Any], ReadOnly = ReadOnly.asInstanceOf[js.Any], RealObjectType = RealObjectType.asInstanceOf[js.Any], RefreshList = js.Any.fromFunction0(RefreshList), Remove = js.Any.fromFunction0(Remove), RevertToInitialValue = js.Any.fromFunction0(RevertToInitialValue), SetValueItemState = js.Any.fromFunction2(SetValueItemState), Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], ValueRequired = ValueRequired.asInstanceOf[js.Any], Valuelist = Valuelist.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMetadataCardControl]
  }
  @scala.inline
  implicit class IMetadataCardControlOps[Self <: IMetadataCardControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivateLink(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActivateLink")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddNewItem(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddNewItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddNewSubItem(value: (String, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddNewSubItem")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAllowAdding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowAdding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowHitHighlighting(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowHitHighlighting")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCanActivateLink(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanActivateLink")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCanAddNewSubItem(value: (String, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanAddNewSubItem")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCanEditItem(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanEditItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateSelectionList(value: () => IMetadataCardSelectionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateSelectionList")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreateUnvalidatedValue(value: String => IMetadataCardUnvalidatedValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateUnvalidatedValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEditItem(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EditItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEvents(value: IEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFindItem(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FindItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFindItemByID(value: Double => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FindItemByID")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetSelectableValueItemStates(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetSelectableValueItemStates")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetValueSuggestions(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetValueSuggestions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasAutomaticValue(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasAutomaticValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasInitialValue(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasInitialValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasUncalculatedAutomaticValue(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasUncalculatedAutomaticValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHierarchical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hierarchical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsExternal(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsExternal")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Linked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Modified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMustExist(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MustExist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropertyDef(value: MFBuiltInPropertyDef | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PropertyDef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRealObjectType(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RealObjectType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefreshList(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RefreshList")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemove(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Remove")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRevertToInitialValue(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RevertToInitialValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetValueItemState(value: (String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetValueItemState")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValueRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValuelist(value: MFBuiltInValueList | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Valuelist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Visible")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

