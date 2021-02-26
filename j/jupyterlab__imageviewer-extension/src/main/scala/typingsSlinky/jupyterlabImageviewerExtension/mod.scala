package typingsSlinky.jupyterlabImageviewerExtension

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEnd.IShell
import typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import typingsSlinky.jupyterlabApplication.mod.JupyterFrontEnd
import typingsSlinky.jupyterlabImageviewer.tokensMod.IImageTracker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /**
    * The image file handler extension.
    */
  @JSImport("@jupyterlab/imageviewer-extension", JSImport.Default)
  @js.native
  val default: JupyterFrontEndPlugin[IImageTracker] = js.native
  
  @JSImport("@jupyterlab/imageviewer-extension", "addCommands")
  @js.native
  def addCommands(app: JupyterFrontEnd[IShell], tracker: IImageTracker): Unit = js.native
  
  type _To = JupyterFrontEndPlugin[IImageTracker]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: JupyterFrontEndPlugin[IImageTracker] = default
}
