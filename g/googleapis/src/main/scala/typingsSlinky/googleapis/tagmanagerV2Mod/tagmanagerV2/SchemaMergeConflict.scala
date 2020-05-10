package typingsSlinky.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a merge conflict.
  */
@js.native
trait SchemaMergeConflict extends js.Object {
  /**
    * The base version entity (since the latest sync operation) that has
    * conflicting changes compared to the workspace. If this field is missing,
    * it means the workspace entity is deleted from the base version.
    */
  var entityInBaseVersion: js.UndefOr[SchemaEntity] = js.native
  /**
    * The workspace entity that has conflicting changes compared to the base
    * version. If an entity is deleted in a workspace, it will still appear
    * with a deleted change status.
    */
  var entityInWorkspace: js.UndefOr[SchemaEntity] = js.native
}

object SchemaMergeConflict {
  @scala.inline
  def apply(): SchemaMergeConflict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMergeConflict]
  }
  @scala.inline
  implicit class SchemaMergeConflictOps[Self <: SchemaMergeConflict] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntityInBaseVersion(value: SchemaEntity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityInBaseVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityInBaseVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityInBaseVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withEntityInWorkspace(value: SchemaEntity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityInWorkspace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityInWorkspace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityInWorkspace")(js.undefined)
        ret
    }
  }
  
}

