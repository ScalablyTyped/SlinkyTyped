package typingsSlinky.atJupyterlabVega4DashExtension

import typingsSlinky.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMime.IExtension
import typingsSlinky.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMime.IRenderer
import typingsSlinky.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMime.IRendererFactory
import typingsSlinky.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMime.IRendererOptions
import typingsSlinky.atJupyterlabVega4DashExtension.atJupyterlabVega4DashExtensionStrings.applicationSlashvndDotvegaDotv4Plussignjson
import typingsSlinky.atJupyterlabVega4DashExtension.atJupyterlabVega4DashExtensionStrings.applicationSlashvndDotvegaliteDotv2Plussignjson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/vega4-extension", JSImport.Namespace)
@js.native
object atJupyterlabVega4DashExtensionMod extends js.Object {
  @js.native
  class RenderedVega protected () extends IRenderer {
    /**
      * Create a new widget for rendering Vega/Vega-Lite.
      */
    def this(options: IRendererOptions) = this()
    var _mimeType: js.Any = js.native
    var _resolver: js.Any = js.native
    var _result: js.Any = js.native
  }
  
  val VEGALITE_MIME_TYPE: applicationSlashvndDotvegaliteDotv2Plussignjson = js.native
  val VEGA_MIME_TYPE: applicationSlashvndDotvegaDotv4Plussignjson = js.native
  val default: IExtension = js.native
  val rendererFactory: IRendererFactory = js.native
}

