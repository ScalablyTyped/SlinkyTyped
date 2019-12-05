package typingsSlinky.atJupyterlabImageviewerDashExtension

import typingsSlinky.atJupyterlabApplication.atJupyterlabApplicationMod.JupyterFrontEnd
import typingsSlinky.atJupyterlabApplication.libFrontendMod.JupyterFrontEnd.IShell
import typingsSlinky.atJupyterlabApplication.libFrontendMod.JupyterFrontEndPlugin
import typingsSlinky.atJupyterlabImageviewer.libTokensMod.IImageTracker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/imageviewer-extension", JSImport.Namespace)
@js.native
object atJupyterlabImageviewerDashExtensionMod extends js.Object {
  /**
    * The image file handler extension.
    */
  val default: JupyterFrontEndPlugin[IImageTracker] = js.native
  def addCommands(app: JupyterFrontEnd[IShell], tracker: IImageTracker): Unit = js.native
}

