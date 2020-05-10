package typingsSlinky.microsoftSdkSoap.mod._Global_.Sdk.Mdq

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
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.StateTypeCharactertabulationStatusType
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.Status
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.StringType
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.Uniqueidentifier
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.UniqueidentifierType
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.Virtual
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.VirtualType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAttributeMetadata extends js.Object {
  var AttributeOf: String = js.native
  var AttributeType: Customer | DateTime | Decimal | Double | EntityName | Integer | Lookup | typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.ManagedProperty | Memo | Money | Owner | PartyList | Picklist | State | Status | Uniqueidentifier | Virtual = js.native
  var AttributeTypeName: BigIntType | BooleanType | CalendarRulesType | CustomerType | DateTimeType | DecimalType | DoubleType | EntityNameType | ImageType | IntegerType | LookupType | ManagedPropertyType | MemoType | MoneyType | OwnerType | PartyListType | PicklistType | StateTypeCharactertabulationStatusType | StringType | UniqueidentifierType | VirtualType = js.native
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
  @scala.inline
  implicit class IAttributeMetadataOps[Self <: IAttributeMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeOf(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeOf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributeType(
      value: Customer | DateTime | Decimal | Double | EntityName | Integer | Lookup | typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.ManagedProperty | Memo | Money | Owner | PartyList | Picklist | State | Status | Uniqueidentifier | Virtual
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributeTypeName(
      value: BigIntType | BooleanType | CalendarRulesType | CustomerType | DateTimeType | DecimalType | DoubleType | EntityNameType | ImageType | IntegerType | LookupType | ManagedPropertyType | MemoType | MoneyType | OwnerType | PartyListType | PicklistType | StateTypeCharactertabulationStatusType | StringType | UniqueidentifierType | VirtualType
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeTypeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCalculationOf(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CalculationOf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanBeSecuredForCreate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanBeSecuredForCreate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanBeSecuredForRead(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanBeSecuredForRead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanBeSecuredForUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanBeSecuredForUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanModifyAdditionalSettings(value: ManagedProperty[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanModifyAdditionalSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnNumber(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColumnNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultFormValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultFormValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeprecatedVersion(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeprecatedVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: Label): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: Label): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntityLogicalName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntityLogicalName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormatName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FormatName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImeMode(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImeMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntroducedVersion(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntroducedVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAuditEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsAuditEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCustomAttribute(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsCustomAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCustomizable(value: ManagedProperty[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsCustomizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsManaged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsManaged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPrimaryId(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsPrimaryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPrimaryName(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsPrimaryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRenameable(value: ManagedProperty[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsRenameable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSecured(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsSecured")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsValidForAdvancedFind(value: ManagedProperty[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsValidForAdvancedFind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsValidForCreate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsValidForCreate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsValidForRead(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsValidForRead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsValidForUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsValidForUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkedAttributeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinkedAttributeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogicalName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogicalName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxLength(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadataId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetadataId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinValue(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptionSet(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrecision(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Precision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrecisionSource(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrecisionSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequiredLevel(value: ManagedProperty[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequiredLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchemaName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SchemaName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargets(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Targets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYomiOf(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("YomiOf")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

