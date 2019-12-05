package typingsSlinky.atJupyterlabImageviewer

import typingsSlinky.atJupyterlabDocregistry.libRegistryMod.DocumentRegistry.Context
import typingsSlinky.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/imageviewer", JSImport.Namespace)
@js.native
object atJupyterlabImageviewerMod extends js.Object {
  @js.native
  class ImageViewer protected ()
    extends typingsSlinky.atJupyterlabImageviewer.libWidgetMod.ImageViewer {
    /**
      * Construct a new image widget.
      */
    def this(context: Context) = this()
  }
  
  @js.native
  class ImageViewerFactory ()
    extends typingsSlinky.atJupyterlabImageviewer.libWidgetMod.ImageViewerFactory
  
  val IImageTracker: Token[typingsSlinky.atJupyterlabImageviewer.libTokensMod.IImageTracker] = js.native
}

