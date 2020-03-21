package typingsSlinky.jupyterlabVega5Extension

import typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime.IExtension
import typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRenderer
import typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRendererFactory
import typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRendererOptions
import typingsSlinky.jupyterlabVega5Extension.jupyterlabVega5ExtensionStrings.applicationSlashvndDotvegaDotv5Plussignjson
import typingsSlinky.jupyterlabVega5Extension.jupyterlabVega5ExtensionStrings.applicationSlashvndDotvegaliteDotv3Plussignjson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/vega5-extension", JSImport.Namespace)
@js.native
object mod extends js.Object {
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
  
  val VEGALITE_MIME_TYPE: applicationSlashvndDotvegaliteDotv3Plussignjson = js.native
  val VEGA_MIME_TYPE: applicationSlashvndDotvegaDotv5Plussignjson = js.native
  val default: IExtension = js.native
  val rendererFactory: IRendererFactory = js.native
}

