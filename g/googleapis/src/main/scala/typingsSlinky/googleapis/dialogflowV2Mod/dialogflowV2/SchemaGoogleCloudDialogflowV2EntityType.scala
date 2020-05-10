package typingsSlinky.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an entity type. Entity types serve as a tool for extracting
  * parameter values from natural language queries.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2EntityType extends js.Object {
  /**
    * Optional. Indicates whether the entity type can be automatically
    * expanded.
    */
  var autoExpansionMode: js.UndefOr[String] = js.native
  /**
    * Required. The name of the entity type.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Optional. The collection of entity entries associated with the entity
    * type.
    */
  var entities: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2EntityTypeEntity]] = js.native
  /**
    * Required. Indicates the kind of entity type.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The unique identifier of the entity type. Required for
    * EntityTypes.UpdateEntityType and EntityTypes.BatchUpdateEntityTypes
    * methods. Format: `projects/&lt;Project
    * ID&gt;/agent/entityTypes/&lt;Entity Type ID&gt;`.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2EntityType {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2EntityType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2EntityType]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2EntityTypeOps[Self <: SchemaGoogleCloudDialogflowV2EntityType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoExpansionMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoExpansionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoExpansionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoExpansionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withEntities(value: js.Array[SchemaGoogleCloudDialogflowV2EntityTypeEntity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entities")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

