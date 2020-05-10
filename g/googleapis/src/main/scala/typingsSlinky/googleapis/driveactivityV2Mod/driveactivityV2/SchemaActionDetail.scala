package typingsSlinky.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Data describing the type and additional information of an action.
  */
@js.native
trait SchemaActionDetail extends js.Object {
  /**
    * A change about comments was made.
    */
  var comment: js.UndefOr[SchemaComment] = js.native
  /**
    * An object was created.
    */
  var create: js.UndefOr[SchemaCreate] = js.native
  /**
    * An object was deleted.
    */
  var delete: js.UndefOr[SchemaDelete] = js.native
  /**
    * A change happened in data leak prevention status.
    */
  var dlpChange: js.UndefOr[SchemaDataLeakPreventionChange] = js.native
  /**
    * An object was edited.
    */
  var edit: js.UndefOr[SchemaEdit] = js.native
  /**
    * An object was moved.
    */
  var move: js.UndefOr[SchemaMove] = js.native
  /**
    * The permission on an object was changed.
    */
  var permissionChange: js.UndefOr[SchemaPermissionChange] = js.native
  /**
    * An object was referenced in an application outside of Drive/Docs.
    */
  var reference: js.UndefOr[SchemaApplicationReference] = js.native
  /**
    * An object was renamed.
    */
  var rename: js.UndefOr[SchemaRename] = js.native
  /**
    * A deleted object was restored.
    */
  var restore: js.UndefOr[SchemaRestore] = js.native
  /**
    * Settings were changed.
    */
  var settingsChange: js.UndefOr[SchemaSettingsChange] = js.native
}

object SchemaActionDetail {
  @scala.inline
  def apply(): SchemaActionDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActionDetail]
  }
  @scala.inline
  implicit class SchemaActionDetailOps[Self <: SchemaActionDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComment(value: SchemaComment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.undefined)
        ret
    }
    @scala.inline
    def withCreate(value: SchemaCreate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
        ret
    }
    @scala.inline
    def withDelete(value: SchemaDelete): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.undefined)
        ret
    }
    @scala.inline
    def withDlpChange(value: SchemaDataLeakPreventionChange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dlpChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDlpChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dlpChange")(js.undefined)
        ret
    }
    @scala.inline
    def withEdit(value: SchemaEdit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edit")(js.undefined)
        ret
    }
    @scala.inline
    def withMove(value: SchemaMove): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move")(js.undefined)
        ret
    }
    @scala.inline
    def withPermissionChange(value: SchemaPermissionChange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissionChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissionChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissionChange")(js.undefined)
        ret
    }
    @scala.inline
    def withReference(value: SchemaApplicationReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reference")(js.undefined)
        ret
    }
    @scala.inline
    def withRename(value: SchemaRename): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rename")(js.undefined)
        ret
    }
    @scala.inline
    def withRestore(value: SchemaRestore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restore")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingsChange(value: SchemaSettingsChange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettingsChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsChange")(js.undefined)
        ret
    }
  }
  
}

