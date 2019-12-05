package typingsSlinky.atJupyterlabApplication

import typingsSlinky.atJupyterlabApplication.libFrontendMod.JupyterFrontEndPlugin
import typingsSlinky.atJupyterlabApputils.atJupyterlabApputilsMod.WidgetTracker
import typingsSlinky.atJupyterlabApputils.libWidgettrackerMod.IWidgetTracker
import typingsSlinky.atJupyterlabDocregistry.atJupyterlabDocregistryMod.MimeDocument
import typingsSlinky.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMime.IExtension
import typingsSlinky.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMime.IExtensionModule
import typingsSlinky.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/application/lib/mimerenderers", JSImport.Namespace)
@js.native
object libMimerenderersMod extends js.Object {
  val IMimeDocumentTracker: Token[typingsSlinky.atJupyterlabApplication.libMimerenderersMod.IMimeDocumentTracker] = js.native
  def createRendermimePlugin(tracker: WidgetTracker[MimeDocument], item: IExtension): JupyterFrontEndPlugin[Unit] = js.native
  def createRendermimePlugins(extensions: js.Array[IExtensionModule]): js.Array[
    JupyterFrontEndPlugin[
      Unit | typingsSlinky.atJupyterlabApplication.libMimerenderersMod.IMimeDocumentTracker
    ]
  ] = js.native
  type IMimeDocumentTracker = IWidgetTracker[MimeDocument]
}

