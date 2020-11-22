package typingsSlinky.jupyterlabVdomExtension

import typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import typingsSlinky.jupyterlabVdom.mod.IVDOMTracker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/vdom-extension", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val MIME_TYPE: /* "application/vdom.v1+json" */ String = js.native
  
  val default: JupyterFrontEndPlugin[IVDOMTracker] = js.native
}
