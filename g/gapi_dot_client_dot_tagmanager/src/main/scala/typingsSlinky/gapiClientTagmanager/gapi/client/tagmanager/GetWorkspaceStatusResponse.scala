package typingsSlinky.gapiClientTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetWorkspaceStatusResponse extends js.Object {
  /** The merge conflict after sync. */
  var mergeConflict: js.UndefOr[js.Array[MergeConflict]] = js.native
  /** Entities that have been changed in the workspace. */
  var workspaceChange: js.UndefOr[js.Array[Entity]] = js.native
}

object GetWorkspaceStatusResponse {
  @scala.inline
  def apply(): GetWorkspaceStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWorkspaceStatusResponse]
  }
  @scala.inline
  implicit class GetWorkspaceStatusResponseOps[Self <: GetWorkspaceStatusResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMergeConflict(value: js.Array[MergeConflict]): Self = {
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
    def withWorkspaceChange(value: js.Array[Entity]): Self = {
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

