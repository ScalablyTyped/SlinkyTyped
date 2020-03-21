package typingsSlinky.jupyterlabDocumentsearchExtension

import typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEnd.IShell
import typingsSlinky.jupyterlabApplication.mod.JupyterFrontEnd
import typingsSlinky.jupyterlabDocumentsearch.tokensMod.ISearchProviderRegistry
import typingsSlinky.phosphorApplication.mod.IPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/documentsearch-extension", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val default: js.Array[IPlugin[JupyterFrontEnd[IShell], ISearchProviderRegistry | Unit]] = js.native
}

