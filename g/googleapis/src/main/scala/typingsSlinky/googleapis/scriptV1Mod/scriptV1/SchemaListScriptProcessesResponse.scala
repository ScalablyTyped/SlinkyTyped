package typingsSlinky.googleapis.scriptV1Mod.scriptV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response with the list of Process resources.
  */
@js.native
trait SchemaListScriptProcessesResponse extends js.Object {
  /**
    * Token for the next page of results. If empty, there are no more pages
    * remaining.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * List of processes matching request parameters.
    */
  var processes: js.UndefOr[js.Array[SchemaGoogleAppsScriptTypeProcess]] = js.native
}

object SchemaListScriptProcessesResponse {
  @scala.inline
  def apply(): SchemaListScriptProcessesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListScriptProcessesResponse]
  }
  @scala.inline
  implicit class SchemaListScriptProcessesResponseOps[Self <: SchemaListScriptProcessesResponse] (val x: Self) extends AnyVal {
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
    def withProcesses(value: js.Array[SchemaGoogleAppsScriptTypeProcess]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcesses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processes")(js.undefined)
        ret
    }
  }
  
}

