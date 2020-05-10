package typingsSlinky.googleAppsScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListWorkspacesResponse extends js.Object {
  var nextPageToken: js.UndefOr[String] = js.native
  var workspace: js.UndefOr[js.Array[Workspace]] = js.native
}

object ListWorkspacesResponse {
  @scala.inline
  def apply(): ListWorkspacesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWorkspacesResponse]
  }
  @scala.inline
  implicit class ListWorkspacesResponseOps[Self <: ListWorkspacesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkspace(value: js.Array[Workspace]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkspace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspace")(js.undefined)
        ret
    }
  }
  
}

