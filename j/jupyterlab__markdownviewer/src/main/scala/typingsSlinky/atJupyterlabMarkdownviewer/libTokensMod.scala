package typingsSlinky.atJupyterlabMarkdownviewer

import typingsSlinky.atJupyterlabApputils.libWidgettrackerMod.IWidgetTracker
import typingsSlinky.atJupyterlabMarkdownviewer.libWidgetMod.MarkdownDocument
import typingsSlinky.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/markdownviewer/lib/tokens", JSImport.Namespace)
@js.native
object libTokensMod extends js.Object {
  val IMarkdownViewerTracker: Token[typingsSlinky.atJupyterlabMarkdownviewer.libTokensMod.IMarkdownViewerTracker] = js.native
  type IMarkdownViewerTracker = IWidgetTracker[MarkdownDocument]
}

