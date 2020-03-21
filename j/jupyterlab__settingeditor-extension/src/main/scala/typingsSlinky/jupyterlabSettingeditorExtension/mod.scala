package typingsSlinky.jupyterlabSettingeditorExtension

import typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import typingsSlinky.jupyterlabSettingeditor.tokensMod.ISettingEditorTracker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/settingeditor-extension", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * The default setting editor extension.
    */
  val default: JupyterFrontEndPlugin[ISettingEditorTracker] = js.native
}

