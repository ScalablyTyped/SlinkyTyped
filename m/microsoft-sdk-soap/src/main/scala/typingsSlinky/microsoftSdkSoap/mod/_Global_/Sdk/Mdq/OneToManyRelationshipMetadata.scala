package typingsSlinky.microsoftSdkSoap.mod._Global_.Sdk.Mdq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OneToManyRelationshipMetadata extends js.Object {
  var AssociatedMenuConfiguration: typingsSlinky.microsoftSdkSoap.mod._Global_.Sdk.Mdq.AssociatedMenuConfiguration = js.native
  var CascadeConfiguration: typingsSlinky.microsoftSdkSoap.mod._Global_.Sdk.Mdq.CascadeConfiguration = js.native
  var HasChanged: js.Any = js.native
  var IntroducedVersion: js.Any = js.native
  var IsCustomRelationship: Boolean = js.native
  var IsCustomizable: ManagedProperty[Boolean] = js.native
  var IsHierarchical: js.Any = js.native
  var IsManaged: Boolean = js.native
  var IsValidForAdvancedFind: Boolean = js.native
  var MetadataId: String = js.native
  var ReferencedAttribute: String = js.native
  var ReferencedEntity: String = js.native
  var ReferencingAttribute: String = js.native
  var ReferencingEntity: String = js.native
  var RelationshipType: String = js.native
  var SchemaName: String = js.native
  var SecurityTypes: js.Any = js.native
}

object OneToManyRelationshipMetadata {
  @scala.inline
  def apply(
    AssociatedMenuConfiguration: AssociatedMenuConfiguration,
    CascadeConfiguration: CascadeConfiguration,
    HasChanged: js.Any,
    IntroducedVersion: js.Any,
    IsCustomRelationship: Boolean,
    IsCustomizable: ManagedProperty[Boolean],
    IsHierarchical: js.Any,
    IsManaged: Boolean,
    IsValidForAdvancedFind: Boolean,
    MetadataId: String,
    ReferencedAttribute: String,
    ReferencedEntity: String,
    ReferencingAttribute: String,
    ReferencingEntity: String,
    RelationshipType: String,
    SchemaName: String,
    SecurityTypes: js.Any
  ): OneToManyRelationshipMetadata = {
    val __obj = js.Dynamic.literal(AssociatedMenuConfiguration = AssociatedMenuConfiguration.asInstanceOf[js.Any], CascadeConfiguration = CascadeConfiguration.asInstanceOf[js.Any], HasChanged = HasChanged.asInstanceOf[js.Any], IntroducedVersion = IntroducedVersion.asInstanceOf[js.Any], IsCustomRelationship = IsCustomRelationship.asInstanceOf[js.Any], IsCustomizable = IsCustomizable.asInstanceOf[js.Any], IsHierarchical = IsHierarchical.asInstanceOf[js.Any], IsManaged = IsManaged.asInstanceOf[js.Any], IsValidForAdvancedFind = IsValidForAdvancedFind.asInstanceOf[js.Any], MetadataId = MetadataId.asInstanceOf[js.Any], ReferencedAttribute = ReferencedAttribute.asInstanceOf[js.Any], ReferencedEntity = ReferencedEntity.asInstanceOf[js.Any], ReferencingAttribute = ReferencingAttribute.asInstanceOf[js.Any], ReferencingEntity = ReferencingEntity.asInstanceOf[js.Any], RelationshipType = RelationshipType.asInstanceOf[js.Any], SchemaName = SchemaName.asInstanceOf[js.Any], SecurityTypes = SecurityTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[OneToManyRelationshipMetadata]
  }
  @scala.inline
  implicit class OneToManyRelationshipMetadataOps[Self <: OneToManyRelationshipMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociatedMenuConfiguration(value: AssociatedMenuConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociatedMenuConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCascadeConfiguration(value: CascadeConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CascadeConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasChanged(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntroducedVersion(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntroducedVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCustomRelationship(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsCustomRelationship")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCustomizable(value: ManagedProperty[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsCustomizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsHierarchical(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsHierarchical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsManaged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsManaged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsValidForAdvancedFind(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsValidForAdvancedFind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadataId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetadataId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferencedAttribute(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReferencedAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferencedEntity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReferencedEntity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferencingAttribute(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReferencingAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferencingEntity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReferencingEntity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelationshipType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelationshipType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchemaName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SchemaName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecurityTypes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityTypes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

