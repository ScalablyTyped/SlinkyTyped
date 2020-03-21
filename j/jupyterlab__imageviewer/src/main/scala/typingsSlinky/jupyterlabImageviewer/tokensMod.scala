package typingsSlinky.jupyterlabImageviewer

import typingsSlinky.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typingsSlinky.jupyterlabDocregistry.registryMod.IDocumentWidget
import typingsSlinky.jupyterlabImageviewer.widgetMod.ImageViewer
import typingsSlinky.phosphorCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/imageviewer/lib/tokens", JSImport.Namespace)
@js.native
object tokensMod extends js.Object {
  val IImageTracker: Token[typingsSlinky.jupyterlabImageviewer.tokensMod.IImageTracker] = js.native
  type IImageTracker = IWidgetTracker[IDocumentWidget[ImageViewer, IModel]]
}

