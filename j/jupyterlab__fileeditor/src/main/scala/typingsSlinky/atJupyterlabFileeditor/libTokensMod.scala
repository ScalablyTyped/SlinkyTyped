package typingsSlinky.atJupyterlabFileeditor

import typingsSlinky.atJupyterlabApputils.libWidgettrackerMod.IWidgetTracker
import typingsSlinky.atJupyterlabDocregistry.libRegistryMod.DocumentRegistry.IModel
import typingsSlinky.atJupyterlabDocregistry.libRegistryMod.IDocumentWidget
import typingsSlinky.atJupyterlabFileeditor.libWidgetMod.FileEditor
import typingsSlinky.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/fileeditor/lib/tokens", JSImport.Namespace)
@js.native
object libTokensMod extends js.Object {
  val IEditorTracker: Token[typingsSlinky.atJupyterlabFileeditor.libTokensMod.IEditorTracker] = js.native
  type IEditorTracker = IWidgetTracker[IDocumentWidget[FileEditor, IModel]]
}

