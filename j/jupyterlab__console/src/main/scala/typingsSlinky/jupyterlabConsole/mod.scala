package typingsSlinky.jupyterlabConsole

import typingsSlinky.jupyterlabConsole.widgetMod.CodeConsole.IContentFactory
import typingsSlinky.jupyterlabConsole.widgetMod.CodeConsole.IModelFactoryOptions
import typingsSlinky.jupyterlabConsole.widgetMod.CodeConsole.IOptions
import typingsSlinky.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/console", "CodeConsole")
  @js.native
  class CodeConsole protected ()
    extends typingsSlinky.jupyterlabConsole.widgetMod.CodeConsole {
    /**
      * Construct a console widget.
      */
    def this(options: IOptions) = this()
  }
  object CodeConsole {
    
    /**
      * Default implementation of `IContentFactory`.
      */
    @JSImport("@jupyterlab/console", "CodeConsole.ContentFactory")
    @js.native
    /**
      * Create a content factory for a cell.
      */
    class ContentFactory ()
      extends typingsSlinky.jupyterlabConsole.widgetMod.CodeConsole.ContentFactory {
      def this(options: typingsSlinky.jupyterlabCells.widgetMod.Cell.ContentFactory.IOptions) = this()
    }
    /**
      * A namespace for the code console content factory.
      */
    object ContentFactory
    
    /**
      * The default implementation of an `IModelFactory`.
      */
    @JSImport("@jupyterlab/console", "CodeConsole.ModelFactory")
    @js.native
    /**
      * Create a new cell model factory.
      */
    class ModelFactory ()
      extends typingsSlinky.jupyterlabConsole.widgetMod.CodeConsole.ModelFactory {
      def this(options: IModelFactoryOptions) = this()
    }
    
    /**
      * A default content factory for the code console.
      */
    @JSImport("@jupyterlab/console", "CodeConsole.defaultContentFactory")
    @js.native
    val defaultContentFactory: IContentFactory = js.native
    
    /**
      * The default `ModelFactory` instance.
      */
    @JSImport("@jupyterlab/console", "CodeConsole.defaultModelFactory")
    @js.native
    val defaultModelFactory: typingsSlinky.jupyterlabConsole.widgetMod.CodeConsole.ModelFactory = js.native
  }
  
  @JSImport("@jupyterlab/console", "ConsoleHistory")
  @js.native
  class ConsoleHistory protected ()
    extends typingsSlinky.jupyterlabConsole.historyMod.ConsoleHistory {
    /**
      * Construct a new console history object.
      */
    def this(options: typingsSlinky.jupyterlabConsole.historyMod.ConsoleHistory.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/console", "ConsolePanel")
  @js.native
  class ConsolePanel protected ()
    extends typingsSlinky.jupyterlabConsole.panelMod.ConsolePanel {
    /**
      * Construct a console panel.
      */
    def this(options: typingsSlinky.jupyterlabConsole.panelMod.ConsolePanel.IOptions) = this()
  }
  object ConsolePanel {
    
    /**
      * Default implementation of `IContentFactory`.
      */
    @JSImport("@jupyterlab/console", "ConsolePanel.ContentFactory")
    @js.native
    /**
      * Create a content factory for a cell.
      */
    class ContentFactory ()
      extends typingsSlinky.jupyterlabConsole.panelMod.ConsolePanel.ContentFactory {
      def this(options: typingsSlinky.jupyterlabCells.widgetMod.Cell.ContentFactory.IOptions) = this()
    }
    /**
      * A namespace for the console panel content factory.
      */
    object ContentFactory
    
    /**
      * The console renderer token.
      */
    @JSImport("@jupyterlab/console", "ConsolePanel.IContentFactory")
    @js.native
    val IContentFactory: Token[typingsSlinky.jupyterlabConsole.panelMod.ConsolePanel.IContentFactory] = js.native
    
    /**
      * A default code console content factory.
      */
    @JSImport("@jupyterlab/console", "ConsolePanel.defaultContentFactory")
    @js.native
    val defaultContentFactory: typingsSlinky.jupyterlabConsole.panelMod.ConsolePanel.IContentFactory = js.native
  }
  
  @JSImport("@jupyterlab/console", "ForeignHandler")
  @js.native
  class ForeignHandler protected ()
    extends typingsSlinky.jupyterlabConsole.foreignMod.ForeignHandler {
    /**
      * Construct a new foreign message handler.
      */
    def this(options: typingsSlinky.jupyterlabConsole.foreignMod.ForeignHandler.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/console", "IConsoleTracker")
  @js.native
  val IConsoleTracker: Token[typingsSlinky.jupyterlabConsole.tokensMod.IConsoleTracker] = js.native
}
