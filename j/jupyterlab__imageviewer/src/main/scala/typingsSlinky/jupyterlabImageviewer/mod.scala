package typingsSlinky.jupyterlabImageviewer

import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.Context
import typingsSlinky.luminoCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/imageviewer", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val IImageTracker: Token[typingsSlinky.jupyterlabImageviewer.tokensMod.IImageTracker] = js.native
  
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
}
