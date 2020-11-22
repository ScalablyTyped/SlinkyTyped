package typingsSlinky.jupyterlabMarkdownviewerExtension

import typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import typingsSlinky.jupyterlabMarkdownviewer.tokensMod.IMarkdownViewerTracker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/markdownviewer-extension", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * The markdown viewer plugin.
    */
  val default: JupyterFrontEndPlugin[IMarkdownViewerTracker] = js.native
}
