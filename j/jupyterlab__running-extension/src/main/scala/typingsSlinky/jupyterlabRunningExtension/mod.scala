package typingsSlinky.jupyterlabRunningExtension

import typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import typingsSlinky.jupyterlabRunning.mod.IRunningSessionManagers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/running-extension", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * The default running sessions extension.
    */
  val default: JupyterFrontEndPlugin[IRunningSessionManagers] = js.native
}
