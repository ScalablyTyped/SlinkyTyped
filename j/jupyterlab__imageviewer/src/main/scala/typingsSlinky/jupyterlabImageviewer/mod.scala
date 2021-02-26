package typingsSlinky.jupyterlabImageviewer

import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.Context
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IWidgetFactoryOptions
import typingsSlinky.jupyterlabDocregistry.registryMod.IDocumentWidget
import typingsSlinky.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/imageviewer", "IImageTracker")
  @js.native
  val IImageTracker: Token[typingsSlinky.jupyterlabImageviewer.tokensMod.IImageTracker] = js.native
  
  @JSImport("@jupyterlab/imageviewer", "ImageViewer")
  @js.native
  class ImageViewer protected ()
    extends typingsSlinky.jupyterlabImageviewer.widgetMod.ImageViewer {
    /**
      * Construct a new image widget.
      */
    def this(context: Context) = this()
  }
  
  @JSImport("@jupyterlab/imageviewer", "ImageViewerFactory")
  @js.native
  class ImageViewerFactory protected ()
    extends typingsSlinky.jupyterlabImageviewer.widgetMod.ImageViewerFactory {
    /**
      * Construct a new `ABCWidgetFactory`.
      */
    def this(options: IWidgetFactoryOptions[
            IDocumentWidget[typingsSlinky.jupyterlabImageviewer.widgetMod.ImageViewer, IModel]
          ]) = this()
  }
}
