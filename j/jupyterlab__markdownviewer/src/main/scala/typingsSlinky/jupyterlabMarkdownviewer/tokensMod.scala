package typingsSlinky.jupyterlabMarkdownviewer

import typingsSlinky.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typingsSlinky.jupyterlabMarkdownviewer.widgetMod.MarkdownDocument
import typingsSlinky.luminoCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/markdownviewer/lib/tokens", JSImport.Namespace)
@js.native
object tokensMod extends js.Object {
  
  val IMarkdownViewerTracker: Token[typingsSlinky.jupyterlabMarkdownviewer.tokensMod.IMarkdownViewerTracker] = js.native
  type IMarkdownViewerTracker = IWidgetTracker[MarkdownDocument]
}
