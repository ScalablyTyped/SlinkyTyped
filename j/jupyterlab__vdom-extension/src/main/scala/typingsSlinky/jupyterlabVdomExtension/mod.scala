package typingsSlinky.jupyterlabVdomExtension

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import typingsSlinky.jupyterlabVdom.mod.IVDOMTracker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@jupyterlab/vdom-extension", JSImport.Default)
  @js.native
  val default: JupyterFrontEndPlugin[IVDOMTracker] = js.native
  
  @JSImport("@jupyterlab/vdom-extension", "MIME_TYPE")
  @js.native
  val MIME_TYPE: /* "application/vdom.v1+json" */ String = js.native
  
  type _To = JupyterFrontEndPlugin[IVDOMTracker]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: JupyterFrontEndPlugin[IVDOMTracker] = default
}
