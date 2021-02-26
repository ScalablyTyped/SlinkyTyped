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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPropertyDef extends StObject {
  
  var AccessControlList: IAccessControlList = js.native
  
  var AllObjectTypes: Boolean = js.native
  
  var AllowedAsGroupingLevel: Boolean = js.native
  
  var AutomaticValueDefinition: ITypedValue = js.native
  
  var AutomaticValueType: MFAutomaticValueType = js.native
  
  var BasedOnValueList: Boolean = js.native
  
  def Clone(): IPropertyDef = js.native
  
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
  implicit class IPropertyDefMutableBuilder[Self <: IPropertyDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessControlList(value: IAccessControlList): Self = StObject.set(x, "AccessControlList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllObjectTypes(value: Boolean): Self = StObject.set(x, "AllObjectTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedAsGroupingLevel(value: Boolean): Self = StObject.set(x, "AllowedAsGroupingLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomaticValueDefinition(value: ITypedValue): Self = StObject.set(x, "AutomaticValueDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomaticValueType(value: MFAutomaticValueType): Self = StObject.set(x, "AutomaticValueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasedOnValueList(value: Boolean): Self = StObject.set(x, "BasedOnValueList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone(value: () => IPropertyDef): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setContentType(value: MFContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataType(value: MFDataType): Self = StObject.set(x, "DataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependencyPD(value: Double): Self = StObject.set(x, "DependencyPD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependencyRelation(value: MFDependencyRelation): Self = StObject.set(x, "DependencyRelation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattingType(value: MFFormattingType): Self = StObject.set(x, "FormattingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGUID(value: String): Self = StObject.set(x, "GUID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectType(value: MFBuiltInObjectType | Double): Self = StObject.set(x, "ObjectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerPropertyDef(value: IOwnerPropertyDef): Self = StObject.set(x, "OwnerPropertyDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredefined(value: Boolean): Self = StObject.set(x, "Predefined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortAscending(value: Boolean): Self = StObject.set(x, "SortAscending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticFilter(value: ISearchConditions): Self = StObject.set(x, "StaticFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThisIsConflictPD(value: Boolean): Self = StObject.set(x, "ThisIsConflictPD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThisIsDefaultPD(value: Boolean): Self = StObject.set(x, "ThisIsDefaultPD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThisIsOwnerPD(value: Boolean): Self = StObject.set(x, "ThisIsOwnerPD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateType(value: MFUpdateType): Self = StObject.set(x, "UpdateType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationType(value: MFValidationType): Self = StObject.set(x, "ValidationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueList(value: MFBuiltInValueList | Double): Self = StObject.set(x, "ValueList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueListSortingType(value: MFValueListSortingType): Self = StObject.set(x, "ValueListSortingType", value.asInstanceOf[js.Any])
  }
}
