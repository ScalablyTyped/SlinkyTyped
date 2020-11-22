package typingsSlinky.jupyterlabNotebookExtension

import typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/notebook-extension", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val commandEditItem: JupyterFrontEndPlugin[Unit] = js.native
  
  /**
    * Export the plugins as default.
    */
  val default: js.Array[JupyterFrontEndPlugin[js.Any]] = js.native
  
  val notebookTrustItem: JupyterFrontEndPlugin[Unit] = js.native
}
