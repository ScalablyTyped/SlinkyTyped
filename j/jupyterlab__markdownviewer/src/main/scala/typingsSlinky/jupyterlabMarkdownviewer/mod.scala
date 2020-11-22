package typingsSlinky.jupyterlabMarkdownviewer

import typingsSlinky.jupyterlabMarkdownviewer.widgetMod.MarkdownViewer.IConfig
import typingsSlinky.jupyterlabMarkdownviewer.widgetMod.MarkdownViewer.IOptions
import typingsSlinky.luminoCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/markdownviewer", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val IMarkdownViewerTracker: Token[typingsSlinky.jupyterlabMarkdownviewer.tokensMod.IMarkdownViewerTracker] = js.native
  
  @js.native
  class MarkdownDocument ()
    extends typingsSlinky.jupyterlabMarkdownviewer.widgetMod.MarkdownDocument
  
  @js.native
  class MarkdownViewer protected ()
    extends typingsSlinky.jupyterlabMarkdownviewer.widgetMod.MarkdownViewer {
    /**
      * Construct a new markdown viewer widget.
      */
    def this(options: IOptions) = this()
  }
  @js.native
  object MarkdownViewer extends js.Object {
    
    /**
      * The default configuration options for an editor.
      */
    val defaultConfig: IConfig = js.native
  }
  
  @js.native
  class MarkdownViewerFactory protected ()
    extends typingsSlinky.jupyterlabMarkdownviewer.widgetMod.MarkdownViewerFactory {
    /**
      * Construct a new markdown viewer widget factory.
      */
    def this(options: typingsSlinky.jupyterlabMarkdownviewer.widgetMod.MarkdownViewerFactory.IOptions) = this()
  }
}
