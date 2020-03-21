package typingsSlinky.jupyterlabRendermime.mod

import typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRendererOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/rendermime", "RenderedCommon")
@js.native
abstract class RenderedCommon protected ()
  extends typingsSlinky.jupyterlabRendermime.widgetsMod.RenderedCommon {
  /**
    * Construct a new rendered common widget.
    *
    * @param options - The options for initializing the widget.
    */
  def this(options: IRendererOptions) = this()
}

