package typingsSlinky.microsoftSdkSoap.mod.global.Sdk.Mdq

import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.BigIntType
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.BooleanType
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.CalendarRulesType
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.Customer
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.CustomerType
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.DateTime
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.DateTimeType
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.Decimal
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.DecimalType
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.Double
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.DoubleType
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.EntityName
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.EntityNameType
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.ImageType
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.Integer
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.IntegerType
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.Lookup
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.LookupType
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.ManagedPropertyType
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.Memo
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.MemoType
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.Money
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.MoneyType
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.Owner
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.OwnerType
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.PartyList
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.PartyListType
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.Picklist
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.PicklistType
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.State
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.Status
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.StringType
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.Uniqueidentifier
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.UniqueidentifierType
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.Virtual
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.VirtualType
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.`StateType    StatusType`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAttributeMetadata extends StObject {
  
  var AttributeOf: String = js.native
  
  var AttributeType: Customer | DateTime | Decimal | Double | EntityName | Integer | Lookup | typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.ManagedProperty | Memo | Money | Owner | PartyList | Picklist | State | Status | Uniqueidentifier | Virtual = js.native
  
  var AttributeTypeName: BigIntType | BooleanType | CalendarRulesType | CustomerType | DateTimeType | DecimalType | DoubleType | EntityNameType | ImageType | IntegerType | LookupType | ManagedPropertyType | MemoType | MoneyType | OwnerType | PartyListType | PicklistType | (`StateType    StatusType`) | StringType | UniqueidentifierType | VirtualType = js.native
  
  var CalculationOf: js.Any = js.native
  
  var CanBeSecuredForCreate: Boolean = js.native
  
  var CanBeSecuredForRead: Boolean = js.native
  
  var CanBeSecuredForUpdate: Boolean = js.native
  
  var CanModifyAdditionalSettings: ManagedProperty[Boolean] = js.native
  
  var ColumnNumber: scala.Double = js.native
  
  var DefaultFormValue: js.Any = js.native
  
  var DefaultValue: js.Any = js.native
  
  var DeprecatedVersion: js.Any = js.native
  
  var Description: Label = js.native
  
  var DisplayName: Label = js.native
  
  var EntityLogicalName: String = js.native
  
  var Format: js.Any = js.native
  
  var FormatName: String = js.native
  
  var ImeMode: js.Any = js.native
  
  var IntroducedVersion: js.Any = js.native
  
  var IsAuditEnabled: Boolean = js.native
  
  var IsCustomAttribute: Boolean = js.native
  
  var IsCustomizable: ManagedProperty[Boolean] = js.native
  
  var IsManaged: Boolean = js.native
  
  var IsPrimaryId: Boolean = js.native
  
  var IsPrimaryName: Boolean = js.native
  
  var IsRenameable: ManagedProperty[Boolean] = js.native
  
  var IsSecured: Boolean = js.native
  
  var IsValidForAdvancedFind: ManagedProperty[Boolean] = js.native
  
  var IsValidForCreate: Boolean = js.native
  
  var IsValidForRead: Boolean = js.native
  
  var IsValidForUpdate: Boolean = js.native
  
  var LinkedAttributeId: String = js.native
  
  var LogicalName: String = js.native
  
  var MaxLength: scala.Double = js.native
  
  var MaxValue: js.Any = js.native
  
  var MetadataId: String = js.native
  
  var MinValue: scala.Double = js.native
  
  var OptionSet: js.Any = js.native
  
  var Precision: js.Any = js.native
  
  var PrecisionSource: js.Any = js.native
  
  var RequiredLevel: ManagedProperty[String] = js.native
  
  var SchemaName: String = js.native
  
  var Targets: js.Array[String] = js.native
  
  var YomiOf: js.Any = js.native
}
object IAttributeMetadata {
  
  @scala.inline
  def apply(
    AttributeOf: String,
    AttributeType: Customer | DateTime | Decimal | Double | EntityName | Integer | Lookup | typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.ManagedProperty | Memo | Money | Owner | PartyList | Picklist | State | Status | Uniqueidentifier | Virtual,
    AttributeTypeName: BigIntType | BooleanType | CalendarRulesType | CustomerType | DateTimeType | DecimalType | DoubleType | EntityNameType | ImageType | IntegerType | LookupType | ManagedPropertyType | MemoType | MoneyType | OwnerType | PartyListType | PicklistType | (`StateType    StatusType`) | StringType | UniqueidentifierType | VirtualType,
    CalculationOf: js.Any,
    CanBeSecuredForCreate: Boolean,
    CanBeSecuredForRead: Boolean,
    CanBeSecuredForUpdate: Boolean,
    CanModifyAdditionalSettings: ManagedProperty[Boolean],
    ColumnNumber: scala.Double,
    DefaultFormValue: js.Any,
    DefaultValue: js.Any,
    DeprecatedVersion: js.Any,
    Description: Label,
    DisplayName: Label,
    EntityLogicalName: String,
    Format: js.Any,
    FormatName: String,
    ImeMode: js.Any,
    IntroducedVersion: js.Any,
    IsAuditEnabled: Boolean,
    IsCustomAttribute: Boolean,
    IsCustomizable: ManagedProperty[Boolean],
    IsManaged: Boolean,
    IsPrimaryId: Boolean,
    IsPrimaryName: Boolean,
    IsRenameable: ManagedProperty[Boolean],
    IsSecured: Boolean,
    IsValidForAdvancedFind: ManagedProperty[Boolean],
    IsValidForCreate: Boolean,
    IsValidForRead: Boolean,
    IsValidForUpdate: Boolean,
    LinkedAttributeId: String,
    LogicalName: String,
    MaxLength: scala.Double,
    MaxValue: js.Any,
    MetadataId: String,
    MinValue: scala.Double,
    OptionSet: js.Any,
    Precision: js.Any,
    PrecisionSource: js.Any,
    RequiredLevel: ManagedProperty[String],
    SchemaName: String,
    Targets: js.Array[String],
    YomiOf: js.Any
  ): IAttributeMetadata = {
    val __obj = js.Dynamic.literal(AttributeOf = AttributeOf.asInstanceOf[js.Any], AttributeType = AttributeType.asInstanceOf[js.Any], AttributeTypeName = AttributeTypeName.asInstanceOf[js.Any], CalculationOf = CalculationOf.asInstanceOf[js.Any], CanBeSecuredForCreate = CanBeSecuredForCreate.asInstanceOf[js.Any], CanBeSecuredForRead = CanBeSecuredForRead.asInstanceOf[js.Any], CanBeSecuredForUpdate = CanBeSecuredForUpdate.asInstanceOf[js.Any], CanModifyAdditionalSettings = CanModifyAdditionalSettings.asInstanceOf[js.Any], ColumnNumber = ColumnNumber.asInstanceOf[js.Any], DefaultFormValue = DefaultFormValue.asInstanceOf[js.Any], DefaultValue = DefaultValue.asInstanceOf[js.Any], DeprecatedVersion = DeprecatedVersion.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], EntityLogicalName = EntityLogicalName.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], FormatName = FormatName.asInstanceOf[js.Any], ImeMode = ImeMode.asInstanceOf[js.Any], IntroducedVersion = IntroducedVersion.asInstanceOf[js.Any], IsAuditEnabled = IsAuditEnabled.asInstanceOf[js.Any], IsCustomAttribute = IsCustomAttribute.asInstanceOf[js.Any], IsCustomizable = IsCustomizable.asInstanceOf[js.Any], IsManaged = IsManaged.asInstanceOf[js.Any], IsPrimaryId = IsPrimaryId.asInstanceOf[js.Any], IsPrimaryName = IsPrimaryName.asInstanceOf[js.Any], IsRenameable = IsRenameable.asInstanceOf[js.Any], IsSecured = IsSecured.asInstanceOf[js.Any], IsValidForAdvancedFind = IsValidForAdvancedFind.asInstanceOf[js.Any], IsValidForCreate = IsValidForCreate.asInstanceOf[js.Any], IsValidForRead = IsValidForRead.asInstanceOf[js.Any], IsValidForUpdate = IsValidForUpdate.asInstanceOf[js.Any], LinkedAttributeId = LinkedAttributeId.asInstanceOf[js.Any], LogicalName = LogicalName.asInstanceOf[js.Any], MaxLength = MaxLength.asInstanceOf[js.Any], MaxValue = MaxValue.asInstanceOf[js.Any], MetadataId = MetadataId.asInstanceOf[js.Any], MinValue = MinValue.asInstanceOf[js.Any], OptionSet = OptionSet.asInstanceOf[js.Any], Precision = Precision.asInstanceOf[js.Any], PrecisionSource = PrecisionSource.asInstanceOf[js.Any], RequiredLevel = RequiredLevel.asInstanceOf[js.Any], SchemaName = SchemaName.asInstanceOf[js.Any], Targets = Targets.asInstanceOf[js.Any], YomiOf = YomiOf.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAttributeMetadata]
  }
  
  @scala.inline
  implicit class IAttributeMetadataMutableBuilder[Self <: IAttributeMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeOf(value: String): Self = StObject.set(x, "AttributeOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeType(
      value: Customer | DateTime | Decimal | Double | EntityName | Integer | Lookup | typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.ManagedProperty | Memo | Money | Owner | PartyList | Picklist | State | Status | Uniqueidentifier | Virtual
    ): Self = StObject.set(x, "AttributeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeTypeName(
      value: BigIntType | BooleanType | CalendarRulesType | CustomerType | DateTimeType | DecimalType | DoubleType | EntityNameType | ImageType | IntegerType | LookupType | ManagedPropertyType | MemoType | MoneyType | OwnerType | PartyListType | PicklistType | (`StateType    StatusType`) | StringType | UniqueidentifierType | VirtualType
    ): Self = StObject.set(x, "AttributeTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalculationOf(value: js.Any): Self = StObject.set(x, "CalculationOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanBeSecuredForCreate(value: Boolean): Self = StObject.set(x, "CanBeSecuredForCreate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanBeSecuredForRead(value: Boolean): Self = StObject.set(x, "CanBeSecuredForRead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanBeSecuredForUpdate(value: Boolean): Self = StObject.set(x, "CanBeSecuredForUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanModifyAdditionalSettings(value: ManagedProperty[Boolean]): Self = StObject.set(x, "CanModifyAdditionalSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnNumber(value: scala.Double): Self = StObject.set(x, "ColumnNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultFormValue(value: js.Any): Self = StObject.set(x, "DefaultFormValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValue(value: js.Any): Self = StObject.set(x, "DefaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecatedVersion(value: js.Any): Self = StObject.set(x, "DeprecatedVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Label): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: Label): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityLogicalName(value: String): Self = StObject.set(x, "EntityLogicalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: js.Any): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatName(value: String): Self = StObject.set(x, "FormatName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImeMode(value: js.Any): Self = StObject.set(x, "ImeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntroducedVersion(value: js.Any): Self = StObject.set(x, "IntroducedVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAuditEnabled(value: Boolean): Self = StObject.set(x, "IsAuditEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCustomAttribute(value: Boolean): Self = StObject.set(x, "IsCustomAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCustomizable(value: ManagedProperty[Boolean]): Self = StObject.set(x, "IsCustomizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsManaged(value: Boolean): Self = StObject.set(x, "IsManaged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPrimaryId(value: Boolean): Self = StObject.set(x, "IsPrimaryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPrimaryName(value: Boolean): Self = StObject.set(x, "IsPrimaryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRenameable(value: ManagedProperty[Boolean]): Self = StObject.set(x, "IsRenameable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSecured(value: Boolean): Self = StObject.set(x, "IsSecured", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsValidForAdvancedFind(value: ManagedProperty[Boolean]): Self = StObject.set(x, "IsValidForAdvancedFind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsValidForCreate(value: Boolean): Self = StObject.set(x, "IsValidForCreate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsValidForRead(value: Boolean): Self = StObject.set(x, "IsValidForRead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsValidForUpdate(value: Boolean): Self = StObject.set(x, "IsValidForUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkedAttributeId(value: String): Self = StObject.set(x, "LinkedAttributeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogicalName(value: String): Self = StObject.set(x, "LogicalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLength(value: scala.Double): Self = StObject.set(x, "MaxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxValue(value: js.Any): Self = StObject.set(x, "MaxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataId(value: String): Self = StObject.set(x, "MetadataId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValue(value: scala.Double): Self = StObject.set(x, "MinValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionSet(value: js.Any): Self = StObject.set(x, "OptionSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecision(value: js.Any): Self = StObject.set(x, "Precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecisionSource(value: js.Any): Self = StObject.set(x, "PrecisionSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredLevel(value: ManagedProperty[String]): Self = StObject.set(x, "RequiredLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaName(value: String): Self = StObject.set(x, "SchemaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargets(value: js.Array[String]): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetsVarargs(value: String*): Self = StObject.set(x, "Targets", js.Array(value :_*))
    
    @scala.inline
    def setYomiOf(value: js.Any): Self = StObject.set(x, "YomiOf", value.asInstanceOf[js.Any])
  }
}
