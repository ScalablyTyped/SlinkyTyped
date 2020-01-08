package typingsSlinky.atJupyterlabDocumentsearchDashExtension

import typingsSlinky.atJupyterlabApplication.atJupyterlabApplicationMod.JupyterFrontEnd
import typingsSlinky.atJupyterlabApplication.libFrontendMod.JupyterFrontEnd.IShell
import typingsSlinky.atJupyterlabDocumentsearch.libTokensMod.ISearchProviderRegistry
import typingsSlinky.atPhosphorApplication.atPhosphorApplicationMod.IPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/documentsearch-extension", JSImport.Namespace)
@js.native
object atJupyterlabDocumentsearchDashExtensionMod extends js.Object {
  val default: js.Array[IPlugin[JupyterFrontEnd[IShell], ISearchProviderRegistry | Unit]] = js.native
}

