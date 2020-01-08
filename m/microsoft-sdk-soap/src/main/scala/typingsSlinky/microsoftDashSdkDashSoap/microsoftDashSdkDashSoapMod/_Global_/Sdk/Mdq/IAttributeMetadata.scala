package typingsSlinky.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq

import typingsSlinky.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.BigIntType
import typingsSlinky.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.BooleanType
import typingsSlinky.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.CalendarRulesType
import typingsSlinky.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.Customer
import typingsSlinky.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.CustomerType
import typingsSlinky.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.DateTime
import typingsSlinky.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.DateTimeType
import typingsSlinky.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.Decimal
import typingsSlinky.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.DecimalType
import typingsSlinky.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.Double
import typingsSlinky.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.DoubleType
import typingsSlinky.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.EntityName
import typingsSlinky.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.EntityNameType
import typingsSlinky.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.ImageType
import typingsSlinky.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.Integer
import typingsSlinky.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.IntegerType
import typingsSlinky.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.Lookup
import typingsSlinky.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.LookupType
import typingsSlinky.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.ManagedPropertyType
import typingsSlinky.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.Memo
import typingsSlinky.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.MemoType
import typingsSlinky.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.Money
import typingsSlinky.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.MoneyType
import typingsSlinky.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.Owner
import typingsSlinky.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.OwnerType
import typingsSlinky.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.PartyList
import typingsSlinky.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.PartyListType
import typingsSlinky.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.Picklist
import typingsSlinky.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.PicklistType
import typingsSlinky.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.State
import typingsSlinky.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.StateTypeCharactertabulationStatusType
import typingsSlinky.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.Status
import typingsSlinky.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.StringType
import typingsSlinky.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.Uniqueidentifier
import typingsSlinky.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.UniqueidentifierType
import typingsSlinky.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.Virtual
import typingsSlinky.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.VirtualType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAttributeMetadata extends js.Object {
  var AttributeOf: String
  var AttributeType: Customer | DateTime | Decimal | Double | EntityName | Integer | Lookup | typingsSlinky.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.ManagedProperty | Memo | Money | Owner | PartyList | Picklist | State | Status | Uniqueidentifier | Virtual
  var AttributeTypeName: BigIntType | BooleanType | CalendarRulesType | CustomerType | DateTimeType | DecimalType | DoubleType | EntityNameType | ImageType | IntegerType | LookupType | ManagedPropertyType | MemoType | MoneyType | OwnerType | PartyListType | PicklistType | StateTypeCharactertabulationStatusType | StringType | UniqueidentifierType | VirtualType
  var CalculationOf: js.Any
  var CanBeSecuredForCreate: Boolean
  var CanBeSecuredForRead: Boolean
  var CanBeSecuredForUpdate: Boolean
  var CanModifyAdditionalSettings: ManagedProperty[Boolean]
  var ColumnNumber: scala.Double
  var DefaultFormValue: js.Any
  var DefaultValue: js.Any
  var DeprecatedVersion: js.Any
  var Description: Label
  var DisplayName: Label
  var EntityLogicalName: String
  var Format: js.Any
  var FormatName: String
  var ImeMode: js.Any
  var IntroducedVersion: js.Any
  var IsAuditEnabled: Boolean
  var IsCustomAttribute: Boolean
  var IsCustomizable: ManagedProperty[Boolean]
  var IsManaged: Boolean
  var IsPrimaryId: Boolean
  var IsPrimaryName: Boolean
  var IsRenameable: ManagedProperty[Boolean]
  var IsSecured: Boolean
  var IsValidForAdvancedFind: ManagedProperty[Boolean]
  var IsValidForCreate: Boolean
  var IsValidForRead: Boolean
  var IsValidForUpdate: Boolean
  var LinkedAttributeId: String
  var LogicalName: String
  var MaxLength: scala.Double
  var MaxValue: js.Any
  var MetadataId: String
  var MinValue: scala.Double
  var OptionSet: js.Any
  var Precision: js.Any
  var PrecisionSource: js.Any
  var RequiredLevel: ManagedProperty[String]
  var SchemaName: String
  var Targets: js.Array[String]
  var YomiOf: js.Any
}

object IAttributeMetadata {
  @scala.inline
  def apply(
    AttributeOf: String,
    AttributeType: Customer | DateTime | Decimal | Double | EntityName | Integer | Lookup | typingsSlinky.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.ManagedProperty | Memo | Money | Owner | PartyList | Picklist | State | Status | Uniqueidentifier | Virtual,
    AttributeTypeName: BigIntType | BooleanType | CalendarRulesType | CustomerType | DateTimeType | DecimalType | DoubleType | EntityNameType | ImageType | IntegerType | LookupType | ManagedPropertyType | MemoType | MoneyType | OwnerType | PartyListType | PicklistType | StateTypeCharactertabulationStatusType | StringType | UniqueidentifierType | VirtualType,
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
}

