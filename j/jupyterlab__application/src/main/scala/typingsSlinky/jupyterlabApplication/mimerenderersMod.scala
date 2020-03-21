package typingsSlinky.jupyterlabApplication

import typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import typingsSlinky.jupyterlabApputils.mod.WidgetTracker
import typingsSlinky.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typingsSlinky.jupyterlabDocregistry.mod.MimeDocument
import typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime.IExtension
import typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime.IExtensionModule
import typingsSlinky.phosphorCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/application/lib/mimerenderers", JSImport.Namespace)
@js.native
object mimerenderersMod extends js.Object {
  val IMimeDocumentTracker: Token[typingsSlinky.jupyterlabApplication.mimerenderersMod.IMimeDocumentTracker] = js.native
  def createRendermimePlugin(tracker: WidgetTracker[MimeDocument], item: IExtension): JupyterFrontEndPlugin[Unit] = js.native
  def createRendermimePlugins(extensions: js.Array[IExtensionModule]): js.Array[
    JupyterFrontEndPlugin[Unit | typingsSlinky.jupyterlabApplication.mimerenderersMod.IMimeDocumentTracker]
  ] = js.native
  type IMimeDocumentTracker = IWidgetTracker[MimeDocument]
}

