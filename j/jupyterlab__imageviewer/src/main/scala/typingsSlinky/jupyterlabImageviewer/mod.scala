package typingsSlinky.jupyterlabImageviewer

import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.Context
import typingsSlinky.phosphorCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/imageviewer", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class ImageViewer protected ()
    extends typingsSlinky.jupyterlabImageviewer.widgetMod.ImageViewer {
    /**
      * Construct a new image widget.
      */
    def this(context: Context) = this()
  }
  
  @js.native
  class ImageViewerFactory ()
    extends typingsSlinky.jupyterlabImageviewer.widgetMod.ImageViewerFactory
  
  val IImageTracker: Token[typingsSlinky.jupyterlabImageviewer.tokensMod.IImageTracker] = js.native
}

