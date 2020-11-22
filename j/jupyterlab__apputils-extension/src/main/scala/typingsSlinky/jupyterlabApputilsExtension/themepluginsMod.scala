package typingsSlinky.jupyterlabApputilsExtension

import typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import typingsSlinky.jupyterlabApputils.tokensMod.IThemeManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/apputils-extension/lib/themeplugins", JSImport.Namespace)
@js.native
object themepluginsMod extends js.Object {
  
  val themesPaletteMenuPlugin: JupyterFrontEndPlugin[Unit] = js.native
  
  val themesPlugin: JupyterFrontEndPlugin[IThemeManager] = js.native
}
