package typingsSlinky.jupyterlabApplication

import typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import typingsSlinky.jupyterlabApputils.mod.WidgetTracker
import typingsSlinky.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typingsSlinky.jupyterlabDocregistry.mod.MimeDocument
import typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime.IExtension
import typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime.IExtensionModule
import typingsSlinky.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mimerenderersMod {
  
  @JSImport("@jupyterlab/application/lib/mimerenderers", "IMimeDocumentTracker")
  @js.native
  val IMimeDocumentTracker: Token[typingsSlinky.jupyterlabApplication.mimerenderersMod.IMimeDocumentTracker] = js.native
  type IMimeDocumentTracker = IWidgetTracker[MimeDocument]
  
  @JSImport("@jupyterlab/application/lib/mimerenderers", "createRendermimePlugin")
  @js.native
  def createRendermimePlugin(tracker: WidgetTracker[MimeDocument], item: IExtension): JupyterFrontEndPlugin[Unit] = js.native
  
  @JSImport("@jupyterlab/application/lib/mimerenderers", "createRendermimePlugins")
  @js.native
  def createRendermimePlugins(extensions: js.Array[IExtensionModule]): js.Array[
    JupyterFrontEndPlugin[Unit | typingsSlinky.jupyterlabApplication.mimerenderersMod.IMimeDocumentTracker]
  ] = js.native
}
