package typingsSlinky.jupyterlabServices.workspaceMod.Workspace

import typingsSlinky.jupyterlabServices.anon.Id
import typingsSlinky.phosphorCoreutils.jsonMod.ReadonlyJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface describing a workspace API response.
  */
trait IWorkspace extends js.Object {
  /**
    * The workspace data.
    */
  var data: ReadonlyJSONObject
  /**
    * The metadata for a workspace.
    */
  var metadata: Id
}

object IWorkspace {
  @scala.inline
  def apply(data: ReadonlyJSONObject, metadata: Id): IWorkspace = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWorkspace]
  }
}

