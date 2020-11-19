package typingsSlinky.jupyterlabServices.workspaceMod

import typingsSlinky.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typingsSlinky.jupyterlabServices.workspaceMod.Workspace.IWorkspace
import typingsSlinky.jupyterlabServices.workspaceMod.WorkspaceManager.IOptions
import typingsSlinky.jupyterlabStatedb.dataconnectorMod.DataConnector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/services/lib/workspace", "WorkspaceManager")
@js.native
/**
  * Create a new workspace manager.
  */
class WorkspaceManager_ () extends DataConnector[IWorkspace, IWorkspace, String, String] {
  def this(options: IOptions) = this()
  
  /**
    * The server settings used to make API requests.
    */
  val serverSettings: ISettings = js.native
}
