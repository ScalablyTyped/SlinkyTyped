package typingsSlinky.atJupyterlabMarkdownviewer

import typingsSlinky.atJupyterlabMarkdownviewer.libWidgetMod.MarkdownViewer.IConfig
import typingsSlinky.atJupyterlabMarkdownviewer.libWidgetMod.MarkdownViewer.IOptions
import typingsSlinky.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/markdownviewer", JSImport.Namespace)
@js.native
object atJupyterlabMarkdownviewerMod extends js.Object {
  @js.native
  class MarkdownDocument ()
    extends typingsSlinky.atJupyterlabMarkdownviewer.libWidgetMod.MarkdownDocument
  
  @js.native
  class MarkdownViewer protected ()
    extends typingsSlinky.atJupyterlabMarkdownviewer.libWidgetMod.MarkdownViewer {
    /**
      * Construct a new markdown viewer widget.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  class MarkdownViewerFactory protected ()
    extends typingsSlinky.atJupyterlabMarkdownviewer.libWidgetMod.MarkdownViewerFactory {
    /**
      * Construct a new mimetype widget factory.
      */
    def this(options: typingsSlinky.atJupyterlabMarkdownviewer.libWidgetMod.MarkdownViewerFactory.IOptions) = this()
  }
  
  val IMarkdownViewerTracker: Token[typingsSlinky.atJupyterlabMarkdownviewer.libTokensMod.IMarkdownViewerTracker] = js.native
  @js.native
  object MarkdownViewer extends js.Object {
    /**
      * The default configuration options for an editor.
      */
    val defaultConfig: IConfig = js.native
  }
  
}

