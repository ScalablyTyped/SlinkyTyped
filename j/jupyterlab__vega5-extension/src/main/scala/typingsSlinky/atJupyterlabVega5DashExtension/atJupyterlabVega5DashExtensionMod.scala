package typingsSlinky.atJupyterlabVega5DashExtension

import typingsSlinky.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMime.IExtension
import typingsSlinky.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMime.IRenderer
import typingsSlinky.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMime.IRendererFactory
import typingsSlinky.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMime.IRendererOptions
import typingsSlinky.atJupyterlabVega5DashExtension.atJupyterlabVega5DashExtensionStrings.`application/vndDOTvegaDOTv5+json`
import typingsSlinky.atJupyterlabVega5DashExtension.atJupyterlabVega5DashExtensionStrings.`application/vndDOTvegaliteDOTv3+json`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/vega5-extension", JSImport.Namespace)
@js.native
object atJupyterlabVega5DashExtensionMod extends js.Object {
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
  
  val VEGALITE_MIME_TYPE: `application/vndDOTvegaliteDOTv3+json` = js.native
  val VEGA_MIME_TYPE: `application/vndDOTvegaDOTv5+json` = js.native
  val default: IExtension = js.native
  val rendererFactory: IRendererFactory = js.native
}

