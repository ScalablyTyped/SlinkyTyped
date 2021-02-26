package typingsSlinky.jupyterlabRendermimeExtension

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import typingsSlinky.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /**
    * A plugin providing a rendermime registry.
    */
  @JSImport("@jupyterlab/rendermime-extension", JSImport.Default)
  @js.native
  val default: JupyterFrontEndPlugin[IRenderMimeRegistry] = js.native
  
  type _To = JupyterFrontEndPlugin[IRenderMimeRegistry]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: JupyterFrontEndPlugin[IRenderMimeRegistry] = default
}
