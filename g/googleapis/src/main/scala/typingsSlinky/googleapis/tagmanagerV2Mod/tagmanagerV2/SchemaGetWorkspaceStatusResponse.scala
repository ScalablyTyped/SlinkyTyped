package typingsSlinky.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The changes that have occurred in the workspace since the base container
  * version.
  */
@js.native
trait SchemaGetWorkspaceStatusResponse extends js.Object {
  /**
    * The merge conflict after sync.
    */
  var mergeConflict: js.UndefOr[js.Array[SchemaMergeConflict]] = js.native
  /**
    * Entities that have been changed in the workspace.
    */
  var workspaceChange: js.UndefOr[js.Array[SchemaEntity]] = js.native
}

object SchemaGetWorkspaceStatusResponse {
  @scala.inline
  def apply(): SchemaGetWorkspaceStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetWorkspaceStatusResponse]
  }
  @scala.inline
  implicit class SchemaGetWorkspaceStatusResponseOps[Self <: SchemaGetWorkspaceStatusResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMergeConflict(value: js.Array[SchemaMergeConflict]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeConflict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergeConflict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeConflict")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkspaceChange(value: js.Array[SchemaEntity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspaceChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkspaceChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspaceChange")(js.undefined)
        ret
    }
  }
  
}

