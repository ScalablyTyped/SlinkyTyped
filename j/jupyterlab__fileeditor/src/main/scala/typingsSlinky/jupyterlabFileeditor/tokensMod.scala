package typingsSlinky.jupyterlabFileeditor

import typingsSlinky.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typingsSlinky.jupyterlabDocregistry.registryMod.IDocumentWidget
import typingsSlinky.jupyterlabFileeditor.widgetMod.FileEditor
import typingsSlinky.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokensMod {
  
  @JSImport("@jupyterlab/fileeditor/lib/tokens", "IEditorTracker")
  @js.native
  val IEditorTracker: Token[typingsSlinky.jupyterlabFileeditor.tokensMod.IEditorTracker] = js.native
  type IEditorTracker = IWidgetTracker[IDocumentWidget[FileEditor, IModel]]
}
