package typingsSlinky.jupyterlabFilebrowserExtension

import typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/filebrowser-extension", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * Export the plugins as default.
    */
  val default: js.Array[JupyterFrontEndPlugin[js.Any]] = js.native
  
  val fileUploadStatus: JupyterFrontEndPlugin[Unit] = js.native
}
