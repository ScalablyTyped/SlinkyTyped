package typingsSlinky.jupyterlabMarkdownviewer

import typingsSlinky.jupyterlabDocregistry.defaultMod.DocumentWidget.IOptions
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typingsSlinky.jupyterlabMarkdownviewer.widgetMod.MarkdownViewer.IConfig
import typingsSlinky.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/markdownviewer", "IMarkdownViewerTracker")
  @js.native
  val IMarkdownViewerTracker: Token[typingsSlinky.jupyterlabMarkdownviewer.tokensMod.IMarkdownViewerTracker] = js.native
  
  @JSImport("@jupyterlab/markdownviewer", "MarkdownDocument")
  @js.native
  class MarkdownDocument protected ()
    extends typingsSlinky.jupyterlabMarkdownviewer.widgetMod.MarkdownDocument {
    def this(options: IOptions[typingsSlinky.jupyterlabMarkdownviewer.widgetMod.MarkdownViewer, IModel]) = this()
  }
  
  @JSImport("@jupyterlab/markdownviewer", "MarkdownViewer")
  @js.native
  class MarkdownViewer protected ()
    extends typingsSlinky.jupyterlabMarkdownviewer.widgetMod.MarkdownViewer {
    /**
      * Construct a new markdown viewer widget.
      */
    def this(options: typingsSlinky.jupyterlabMarkdownviewer.widgetMod.MarkdownViewer.IOptions) = this()
  }
  object MarkdownViewer {
    
    /**
      * The default configuration options for an editor.
      */
    @JSImport("@jupyterlab/markdownviewer", "MarkdownViewer.defaultConfig")
    @js.native
    val defaultConfig: IConfig = js.native
  }
  
  @JSImport("@jupyterlab/markdownviewer", "MarkdownViewerFactory")
  @js.native
  class MarkdownViewerFactory protected ()
    extends typingsSlinky.jupyterlabMarkdownviewer.widgetMod.MarkdownViewerFactory {
    /**
      * Construct a new markdown viewer widget factory.
      */
    def this(options: typingsSlinky.jupyterlabMarkdownviewer.widgetMod.MarkdownViewerFactory.IOptions) = this()
  }
}
