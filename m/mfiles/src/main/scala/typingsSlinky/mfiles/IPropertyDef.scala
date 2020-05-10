package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFAutomaticValueType
import typingsSlinky.mfiles.MFiles.MFBuiltInObjectType
import typingsSlinky.mfiles.MFiles.MFBuiltInValueList
import typingsSlinky.mfiles.MFiles.MFContentType
import typingsSlinky.mfiles.MFiles.MFDataType
import typingsSlinky.mfiles.MFiles.MFDependencyRelation
import typingsSlinky.mfiles.MFiles.MFFormattingType
import typingsSlinky.mfiles.MFiles.MFUpdateType
import typingsSlinky.mfiles.MFiles.MFValidationType
import typingsSlinky.mfiles.MFiles.MFValueListSortingType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPropertyDef extends js.Object {
  var AccessControlList: IAccessControlList = js.native
  var AllObjectTypes: Boolean = js.native
  var AllowedAsGroupingLevel: Boolean = js.native
  var AutomaticValueDefinition: ITypedValue = js.native
  var AutomaticValueType: MFAutomaticValueType = js.native
  var BasedOnValueList: Boolean = js.native
  var ContentType: MFContentType = js.native
  var DataType: MFDataType = js.native
  var DependencyPD: Double = js.native
  var DependencyRelation: MFDependencyRelation = js.native
  var FormattingType: MFFormattingType = js.native
  val GUID: String = js.native
  var ID: Double = js.native
  var Name: String = js.native
  var ObjectType: MFBuiltInObjectType | Double = js.native
  var OwnerPropertyDef: IOwnerPropertyDef = js.native
  var Predefined: Boolean = js.native
  var SortAscending: Boolean = js.native
  var StaticFilter: ISearchConditions = js.native
  val ThisIsConflictPD: Boolean = js.native
  val ThisIsDefaultPD: Boolean = js.native
  val ThisIsOwnerPD: Boolean = js.native
  var UpdateType: MFUpdateType = js.native
  var ValidationType: MFValidationType = js.native
  var ValueList: MFBuiltInValueList | Double = js.native
  var ValueListSortingType: MFValueListSortingType = js.native
  def Clone(): IPropertyDef = js.native
}

object IPropertyDef {
  @scala.inline
  def apply(
    AccessControlList: IAccessControlList,
    AllObjectTypes: Boolean,
    AllowedAsGroupingLevel: Boolean,
    AutomaticValueDefinition: ITypedValue,
    AutomaticValueType: MFAutomaticValueType,
    BasedOnValueList: Boolean,
    Clone: () => IPropertyDef,
    ContentType: MFContentType,
    DataType: MFDataType,
    DependencyPD: Double,
    DependencyRelation: MFDependencyRelation,
    FormattingType: MFFormattingType,
    GUID: String,
    ID: Double,
    Name: String,
    ObjectType: MFBuiltInObjectType | Double,
    OwnerPropertyDef: IOwnerPropertyDef,
    Predefined: Boolean,
    SortAscending: Boolean,
    StaticFilter: ISearchConditions,
    ThisIsConflictPD: Boolean,
    ThisIsDefaultPD: Boolean,
    ThisIsOwnerPD: Boolean,
    UpdateType: MFUpdateType,
    ValidationType: MFValidationType,
    ValueList: MFBuiltInValueList | Double,
    ValueListSortingType: MFValueListSortingType
  ): IPropertyDef = {
    val __obj = js.Dynamic.literal(AccessControlList = AccessControlList.asInstanceOf[js.Any], AllObjectTypes = AllObjectTypes.asInstanceOf[js.Any], AllowedAsGroupingLevel = AllowedAsGroupingLevel.asInstanceOf[js.Any], AutomaticValueDefinition = AutomaticValueDefinition.asInstanceOf[js.Any], AutomaticValueType = AutomaticValueType.asInstanceOf[js.Any], BasedOnValueList = BasedOnValueList.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), ContentType = ContentType.asInstanceOf[js.Any], DataType = DataType.asInstanceOf[js.Any], DependencyPD = DependencyPD.asInstanceOf[js.Any], DependencyRelation = DependencyRelation.asInstanceOf[js.Any], FormattingType = FormattingType.asInstanceOf[js.Any], GUID = GUID.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ObjectType = ObjectType.asInstanceOf[js.Any], OwnerPropertyDef = OwnerPropertyDef.asInstanceOf[js.Any], Predefined = Predefined.asInstanceOf[js.Any], SortAscending = SortAscending.asInstanceOf[js.Any], StaticFilter = StaticFilter.asInstanceOf[js.Any], ThisIsConflictPD = ThisIsConflictPD.asInstanceOf[js.Any], ThisIsDefaultPD = ThisIsDefaultPD.asInstanceOf[js.Any], ThisIsOwnerPD = ThisIsOwnerPD.asInstanceOf[js.Any], UpdateType = UpdateType.asInstanceOf[js.Any], ValidationType = ValidationType.asInstanceOf[js.Any], ValueList = ValueList.asInstanceOf[js.Any], ValueListSortingType = ValueListSortingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyDef]
  }
  @scala.inline
  implicit class IPropertyDefOps[Self <: IPropertyDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessControlList(value: IAccessControlList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessControlList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllObjectTypes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllObjectTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowedAsGroupingLevel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowedAsGroupingLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutomaticValueDefinition(value: ITypedValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutomaticValueDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutomaticValueType(value: MFAutomaticValueType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutomaticValueType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBasedOnValueList(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BasedOnValueList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClone(value: () => IPropertyDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withContentType(value: MFContentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataType(value: MFDataType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDependencyPD(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DependencyPD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDependencyRelation(value: MFDependencyRelation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DependencyRelation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormattingType(value: MFFormattingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FormattingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGUID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GUID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectType(value: MFBuiltInObjectType | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerPropertyDef(value: IOwnerPropertyDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerPropertyDef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPredefined(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Predefined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortAscending(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SortAscending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStaticFilter(value: ISearchConditions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StaticFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThisIsConflictPD(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThisIsConflictPD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThisIsDefaultPD(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThisIsDefaultPD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThisIsOwnerPD(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThisIsOwnerPD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateType(value: MFUpdateType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidationType(value: MFValidationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueList(value: MFBuiltInValueList | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValueList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueListSortingType(value: MFValueListSortingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValueListSortingType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

