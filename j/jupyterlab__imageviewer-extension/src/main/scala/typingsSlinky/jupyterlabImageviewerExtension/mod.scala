package typingsSlinky.jupyterlabImageviewerExtension

import typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEnd.IShell
import typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import typingsSlinky.jupyterlabApplication.mod.JupyterFrontEnd
import typingsSlinky.jupyterlabImageviewer.tokensMod.IImageTracker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/imageviewer-extension", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def addCommands(app: JupyterFrontEnd[IShell], tracker: IImageTracker): Unit = js.native
  
  /**
    * The image file handler extension.
    */
  val default: JupyterFrontEndPlugin[IImageTracker] = js.native
}
