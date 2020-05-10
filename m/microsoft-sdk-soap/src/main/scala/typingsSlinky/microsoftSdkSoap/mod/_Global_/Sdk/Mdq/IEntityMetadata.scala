package typingsSlinky.microsoftSdkSoap.mod._Global_.Sdk.Mdq

import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.BusinessOwned
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.BusinessParented
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.NoneCharactertabulationOrganizationOwned
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.TeamOwnedCharactertabulationUserOwned
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEntityMetadata extends js.Object {
  var ActivityTypeMask: Double = js.native
  var Attributes: js.Array[IAttributeMetadata] = js.native
  var AutoCreateAccessTeams: js.Any = js.native
  var AutoRouteToOwnerQueue: Boolean = js.native
  var CanBeInManyToMany: ManagedProperty[Boolean] = js.native
  var CanBePrimaryEntityInRelationship: ManagedProperty[Boolean] = js.native
  var CanBeRelatedEntityInRelationship: ManagedProperty[Boolean] = js.native
  var CanCreateAttributes: ManagedProperty[Boolean] = js.native
  var CanCreateCharts: ManagedProperty[Boolean] = js.native
  var CanCreateForms: ManagedProperty[Boolean] = js.native
  var CanCreateViews: ManagedProperty[Boolean] = js.native
  var CanModifyAdditionalSettings: ManagedProperty[Boolean] = js.native
  var CanTriggerWorkflow: Boolean = js.native
  var Description: Label = js.native
  var DisplayCollectionName: Label = js.native
  var DisplayName: Label = js.native
  var IconLargeName: String = js.native
  var IconMediumName: String = js.native
  var IconSmallName: String = js.native
  var IntroducedVersion: js.Any = js.native
  var IsAIRUpdated: Boolean = js.native
  var IsActivity: Boolean = js.native
  var IsActivityParty: Boolean = js.native
  var IsAuditEnabled: ManagedProperty[Boolean] = js.native
  var IsAvailableOffline: Boolean = js.native
  var IsBusinessProcessEnabled: Boolean = js.native
  var IsChildEntity: Boolean = js.native
  var IsConnectionsEnabled: ManagedProperty[Boolean] = js.native
  var IsCustomEntity: Boolean = js.native
  var IsCustomizable: ManagedProperty[Boolean] = js.native
  var IsDocumentManagementEnabled: Boolean = js.native
  var IsDuplicateDetectionEnabled: ManagedProperty[Boolean] = js.native
  var IsEnabledForCharts: Boolean = js.native
  var IsImportable: Boolean = js.native
  var IsIntersect: Boolean = js.native
  var IsMailMergeEnabled: ManagedProperty[Boolean] = js.native
  var IsManaged: Boolean = js.native
  var IsMappable: ManagedProperty[Boolean] = js.native
  var IsQuickCreateEnabled: Boolean = js.native
  var IsReadingPaneEnabled: Boolean = js.native
  var IsRenameable: Boolean = js.native
  var IsValidForAdvancedFind: Boolean = js.native
  var IsValidForQueue: ManagedProperty[Boolean] = js.native
  var IsVisibleInMobile: ManagedProperty[Boolean] = js.native
  var IsVisibleInMobileClient: Boolean = js.native
  var LogicalName: String = js.native
  var ManyToManyRelationships: ManyToManyRelationshipMetadata = js.native
  var ManyToOneRelationships: OneToManyRelationshipMetadata = js.native
  var MetadataId: String = js.native
  var ObjectTypeCode: Double = js.native
  var OneToManyRelationships: OneToManyRelationshipMetadata = js.native
  var OwnershipType: BusinessOwned | BusinessParented | NoneCharactertabulationOrganizationOwned | TeamOwnedCharactertabulationUserOwned = js.native
  var PrimaryIdAttribute: String = js.native
  var PrimaryImageAttribute: String = js.native
  var PrimaryNameAttribute: String = js.native
  var Privileges: js.Array[SecurityPrivilegeMetadata] = js.native
  var RecurrenceBaseEntityLogicalName: String = js.native
  var ReportViewName: String = js.native
  var SchemaName: String = js.native
}

object IEntityMetadata {
  @scala.inline
  def apply(
    ActivityTypeMask: Double,
    Attributes: js.Array[IAttributeMetadata],
    AutoCreateAccessTeams: js.Any,
    AutoRouteToOwnerQueue: Boolean,
    CanBeInManyToMany: ManagedProperty[Boolean],
    CanBePrimaryEntityInRelationship: ManagedProperty[Boolean],
    CanBeRelatedEntityInRelationship: ManagedProperty[Boolean],
    CanCreateAttributes: ManagedProperty[Boolean],
    CanCreateCharts: ManagedProperty[Boolean],
    CanCreateForms: ManagedProperty[Boolean],
    CanCreateViews: ManagedProperty[Boolean],
    CanModifyAdditionalSettings: ManagedProperty[Boolean],
    CanTriggerWorkflow: Boolean,
    Description: Label,
    DisplayCollectionName: Label,
    DisplayName: Label,
    IconLargeName: String,
    IconMediumName: String,
    IconSmallName: String,
    IntroducedVersion: js.Any,
    IsAIRUpdated: Boolean,
    IsActivity: Boolean,
    IsActivityParty: Boolean,
    IsAuditEnabled: ManagedProperty[Boolean],
    IsAvailableOffline: Boolean,
    IsBusinessProcessEnabled: Boolean,
    IsChildEntity: Boolean,
    IsConnectionsEnabled: ManagedProperty[Boolean],
    IsCustomEntity: Boolean,
    IsCustomizable: ManagedProperty[Boolean],
    IsDocumentManagementEnabled: Boolean,
    IsDuplicateDetectionEnabled: ManagedProperty[Boolean],
    IsEnabledForCharts: Boolean,
    IsImportable: Boolean,
    IsIntersect: Boolean,
    IsMailMergeEnabled: ManagedProperty[Boolean],
    IsManaged: Boolean,
    IsMappable: ManagedProperty[Boolean],
    IsQuickCreateEnabled: Boolean,
    IsReadingPaneEnabled: Boolean,
    IsRenameable: Boolean,
    IsValidForAdvancedFind: Boolean,
    IsValidForQueue: ManagedProperty[Boolean],
    IsVisibleInMobile: ManagedProperty[Boolean],
    IsVisibleInMobileClient: Boolean,
    LogicalName: String,
    ManyToManyRelationships: ManyToManyRelationshipMetadata,
    ManyToOneRelationships: OneToManyRelationshipMetadata,
    MetadataId: String,
    ObjectTypeCode: Double,
    OneToManyRelationships: OneToManyRelationshipMetadata,
    OwnershipType: BusinessOwned | BusinessParented | NoneCharactertabulationOrganizationOwned | TeamOwnedCharactertabulationUserOwned,
    PrimaryIdAttribute: String,
    PrimaryImageAttribute: String,
    PrimaryNameAttribute: String,
    Privileges: js.Array[SecurityPrivilegeMetadata],
    RecurrenceBaseEntityLogicalName: String,
    ReportViewName: String,
    SchemaName: String
  ): IEntityMetadata = {
    val __obj = js.Dynamic.literal(ActivityTypeMask = ActivityTypeMask.asInstanceOf[js.Any], Attributes = Attributes.asInstanceOf[js.Any], AutoCreateAccessTeams = AutoCreateAccessTeams.asInstanceOf[js.Any], AutoRouteToOwnerQueue = AutoRouteToOwnerQueue.asInstanceOf[js.Any], CanBeInManyToMany = CanBeInManyToMany.asInstanceOf[js.Any], CanBePrimaryEntityInRelationship = CanBePrimaryEntityInRelationship.asInstanceOf[js.Any], CanBeRelatedEntityInRelationship = CanBeRelatedEntityInRelationship.asInstanceOf[js.Any], CanCreateAttributes = CanCreateAttributes.asInstanceOf[js.Any], CanCreateCharts = CanCreateCharts.asInstanceOf[js.Any], CanCreateForms = CanCreateForms.asInstanceOf[js.Any], CanCreateViews = CanCreateViews.asInstanceOf[js.Any], CanModifyAdditionalSettings = CanModifyAdditionalSettings.asInstanceOf[js.Any], CanTriggerWorkflow = CanTriggerWorkflow.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], DisplayCollectionName = DisplayCollectionName.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], IconLargeName = IconLargeName.asInstanceOf[js.Any], IconMediumName = IconMediumName.asInstanceOf[js.Any], IconSmallName = IconSmallName.asInstanceOf[js.Any], IntroducedVersion = IntroducedVersion.asInstanceOf[js.Any], IsAIRUpdated = IsAIRUpdated.asInstanceOf[js.Any], IsActivity = IsActivity.asInstanceOf[js.Any], IsActivityParty = IsActivityParty.asInstanceOf[js.Any], IsAuditEnabled = IsAuditEnabled.asInstanceOf[js.Any], IsAvailableOffline = IsAvailableOffline.asInstanceOf[js.Any], IsBusinessProcessEnabled = IsBusinessProcessEnabled.asInstanceOf[js.Any], IsChildEntity = IsChildEntity.asInstanceOf[js.Any], IsConnectionsEnabled = IsConnectionsEnabled.asInstanceOf[js.Any], IsCustomEntity = IsCustomEntity.asInstanceOf[js.Any], IsCustomizable = IsCustomizable.asInstanceOf[js.Any], IsDocumentManagementEnabled = IsDocumentManagementEnabled.asInstanceOf[js.Any], IsDuplicateDetectionEnabled = IsDuplicateDetectionEnabled.asInstanceOf[js.Any], IsEnabledForCharts = IsEnabledForCharts.asInstanceOf[js.Any], IsImportable = IsImportable.asInstanceOf[js.Any], IsIntersect = IsIntersect.asInstanceOf[js.Any], IsMailMergeEnabled = IsMailMergeEnabled.asInstanceOf[js.Any], IsManaged = IsManaged.asInstanceOf[js.Any], IsMappable = IsMappable.asInstanceOf[js.Any], IsQuickCreateEnabled = IsQuickCreateEnabled.asInstanceOf[js.Any], IsReadingPaneEnabled = IsReadingPaneEnabled.asInstanceOf[js.Any], IsRenameable = IsRenameable.asInstanceOf[js.Any], IsValidForAdvancedFind = IsValidForAdvancedFind.asInstanceOf[js.Any], IsValidForQueue = IsValidForQueue.asInstanceOf[js.Any], IsVisibleInMobile = IsVisibleInMobile.asInstanceOf[js.Any], IsVisibleInMobileClient = IsVisibleInMobileClient.asInstanceOf[js.Any], LogicalName = LogicalName.asInstanceOf[js.Any], ManyToManyRelationships = ManyToManyRelationships.asInstanceOf[js.Any], ManyToOneRelationships = ManyToOneRelationships.asInstanceOf[js.Any], MetadataId = MetadataId.asInstanceOf[js.Any], ObjectTypeCode = ObjectTypeCode.asInstanceOf[js.Any], OneToManyRelationships = OneToManyRelationships.asInstanceOf[js.Any], OwnershipType = OwnershipType.asInstanceOf[js.Any], PrimaryIdAttribute = PrimaryIdAttribute.asInstanceOf[js.Any], PrimaryImageAttribute = PrimaryImageAttribute.asInstanceOf[js.Any], PrimaryNameAttribute = PrimaryNameAttribute.asInstanceOf[js.Any], Privileges = Privileges.asInstanceOf[js.Any], RecurrenceBaseEntityLogicalName = RecurrenceBaseEntityLogicalName.asInstanceOf[js.Any], ReportViewName = ReportViewName.asInstanceOf[js.Any], SchemaName = SchemaName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEntityMetadata]
  }
  @scala.inline
  implicit class IEntityMetadataOps[Self <: IEntityMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivityTypeMask(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActivityTypeMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributes(value: js.Array[IAttributeMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoCreateAccessTeams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoCreateAccessTeams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoRouteToOwnerQueue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoRouteToOwnerQueue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanBeInManyToMany(value: ManagedProperty[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanBeInManyToMany")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanBePrimaryEntityInRelationship(value: ManagedProperty[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanBePrimaryEntityInRelationship")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanBeRelatedEntityInRelationship(value: ManagedProperty[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanBeRelatedEntityInRelationship")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanCreateAttributes(value: ManagedProperty[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanCreateAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanCreateCharts(value: ManagedProperty[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanCreateCharts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanCreateForms(value: ManagedProperty[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanCreateForms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanCreateViews(value: ManagedProperty[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanCreateViews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanModifyAdditionalSettings(value: ManagedProperty[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanModifyAdditionalSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanTriggerWorkflow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanTriggerWorkflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: Label): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayCollectionName(value: Label): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayCollectionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: Label): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconLargeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IconLargeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconMediumName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IconMediumName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconSmallName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IconSmallName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntroducedVersion(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntroducedVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAIRUpdated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsAIRUpdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsActivity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsActivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsActivityParty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsActivityParty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAuditEnabled(value: ManagedProperty[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsAuditEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAvailableOffline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsAvailableOffline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsBusinessProcessEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsBusinessProcessEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsChildEntity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsChildEntity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsConnectionsEnabled(value: ManagedProperty[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsConnectionsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCustomEntity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsCustomEntity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCustomizable(value: ManagedProperty[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsCustomizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDocumentManagementEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsDocumentManagementEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDuplicateDetectionEnabled(value: ManagedProperty[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsDuplicateDetectionEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEnabledForCharts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsEnabledForCharts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsImportable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsImportable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsIntersect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsIntersect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMailMergeEnabled(value: ManagedProperty[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsMailMergeEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsManaged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsManaged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMappable(value: ManagedProperty[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsMappable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsQuickCreateEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsQuickCreateEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsReadingPaneEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsReadingPaneEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRenameable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsRenameable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsValidForAdvancedFind(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsValidForAdvancedFind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsValidForQueue(value: ManagedProperty[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsValidForQueue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsVisibleInMobile(value: ManagedProperty[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsVisibleInMobile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsVisibleInMobileClient(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsVisibleInMobileClient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogicalName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogicalName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManyToManyRelationships(value: ManyToManyRelationshipMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManyToManyRelationships")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManyToOneRelationships(value: OneToManyRelationshipMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManyToOneRelationships")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadataId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetadataId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectTypeCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectTypeCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOneToManyRelationships(value: OneToManyRelationshipMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OneToManyRelationships")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnershipType(
      value: BusinessOwned | BusinessParented | NoneCharactertabulationOrganizationOwned | TeamOwnedCharactertabulationUserOwned
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnershipType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryIdAttribute(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrimaryIdAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryImageAttribute(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrimaryImageAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryNameAttribute(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrimaryNameAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivileges(value: js.Array[SecurityPrivilegeMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Privileges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecurrenceBaseEntityLogicalName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecurrenceBaseEntityLogicalName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReportViewName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReportViewName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchemaName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SchemaName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

