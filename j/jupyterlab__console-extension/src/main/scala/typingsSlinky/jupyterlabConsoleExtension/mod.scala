package typingsSlinky.jupyterlabConsoleExtension

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /**
    * Export the plugins as the default.
    */
  @JSImport("@jupyterlab/console-extension", JSImport.Default)
  @js.native
  val default: js.Array[JupyterFrontEndPlugin[js.Any]] = js.native
  
  type _To = js.Array[JupyterFrontEndPlugin[js.Any]]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: js.Array[JupyterFrontEndPlugin[js.Any]] = default
}
