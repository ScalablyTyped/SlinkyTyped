package typingsSlinky.atJupyterlabLauncherDashExtension

import typingsSlinky.atJupyterlabApplication.libFrontendMod.JupyterFrontEndPlugin
import typingsSlinky.atJupyterlabLauncher.atJupyterlabLauncherMod.ILauncher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/launcher-extension", JSImport.Namespace)
@js.native
object atJupyterlabLauncherDashExtensionMod extends js.Object {
  /**
    * A service providing an interface to the the launcher.
    */
  val default: JupyterFrontEndPlugin[ILauncher] = js.native
}

