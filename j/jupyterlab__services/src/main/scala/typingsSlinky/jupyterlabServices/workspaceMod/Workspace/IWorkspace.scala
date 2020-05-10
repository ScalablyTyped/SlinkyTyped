package typingsSlinky.jupyterlabServices.workspaceMod.Workspace

import typingsSlinky.jupyterlabServices.AnonId
import typingsSlinky.phosphorCoreutils.jsonMod.ReadonlyJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface describing a workspace API response.
  */
@js.native
trait IWorkspace extends js.Object {
  /**
    * The workspace data.
    */
  var data: ReadonlyJSONObject = js.native
  /**
    * The metadata for a workspace.
    */
  var metadata: AnonId = js.native
}

object IWorkspace {
  @scala.inline
  def apply(data: ReadonlyJSONObject, metadata: AnonId): IWorkspace = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWorkspace]
  }
  @scala.inline
  implicit class IWorkspaceOps[Self <: IWorkspace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: ReadonlyJSONObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: AnonId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

