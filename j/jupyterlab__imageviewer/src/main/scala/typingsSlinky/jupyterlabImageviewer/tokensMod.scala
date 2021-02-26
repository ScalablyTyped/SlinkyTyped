package typingsSlinky.jupyterlabImageviewer

import typingsSlinky.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typingsSlinky.jupyterlabDocregistry.registryMod.IDocumentWidget
import typingsSlinky.jupyterlabImageviewer.widgetMod.ImageViewer
import typingsSlinky.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokensMod {
  
  @JSImport("@jupyterlab/imageviewer/lib/tokens", "IImageTracker")
  @js.native
  val IImageTracker: Token[typingsSlinky.jupyterlabImageviewer.tokensMod.IImageTracker] = js.native
  type IImageTracker = IWidgetTracker[IDocumentWidget[ImageViewer, IModel]]
}
