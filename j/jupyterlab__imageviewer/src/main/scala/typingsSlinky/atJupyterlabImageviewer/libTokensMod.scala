package typingsSlinky.atJupyterlabImageviewer

import typingsSlinky.atJupyterlabApputils.libWidgettrackerMod.IWidgetTracker
import typingsSlinky.atJupyterlabDocregistry.libRegistryMod.DocumentRegistry.IModel
import typingsSlinky.atJupyterlabDocregistry.libRegistryMod.IDocumentWidget
import typingsSlinky.atJupyterlabImageviewer.libWidgetMod.ImageViewer
import typingsSlinky.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/imageviewer/lib/tokens", JSImport.Namespace)
@js.native
object libTokensMod extends js.Object {
  val IImageTracker: Token[typingsSlinky.atJupyterlabImageviewer.libTokensMod.IImageTracker] = js.native
  type IImageTracker = IWidgetTracker[IDocumentWidget[ImageViewer, IModel]]
}

