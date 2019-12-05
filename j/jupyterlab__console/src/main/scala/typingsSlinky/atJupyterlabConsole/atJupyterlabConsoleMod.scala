package typingsSlinky.atJupyterlabConsole

import typingsSlinky.atJupyterlabConsole.libWidgetMod.CodeConsole.IContentFactory
import typingsSlinky.atJupyterlabConsole.libWidgetMod.CodeConsole.IModelFactoryOptions
import typingsSlinky.atJupyterlabConsole.libWidgetMod.CodeConsole.IOptions
import typingsSlinky.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/console", JSImport.Namespace)
@js.native
object atJupyterlabConsoleMod extends js.Object {
  @js.native
  class CodeConsole protected ()
    extends typingsSlinky.atJupyterlabConsole.libWidgetMod.CodeConsole {
    /**
      * Construct a console widget.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  class ConsoleHistory protected ()
    extends typingsSlinky.atJupyterlabConsole.libHistoryMod.ConsoleHistory {
    /**
      * Construct a new console history object.
      */
    def this(options: typingsSlinky.atJupyterlabConsole.libHistoryMod.ConsoleHistory.IOptions) = this()
  }
  
  @js.native
  class ConsolePanel protected ()
    extends typingsSlinky.atJupyterlabConsole.libPanelMod.ConsolePanel {
    /**
      * Construct a console panel.
      */
    def this(options: typingsSlinky.atJupyterlabConsole.libPanelMod.ConsolePanel.IOptions) = this()
  }
  
  @js.native
  class ForeignHandler protected ()
    extends typingsSlinky.atJupyterlabConsole.libForeignMod.ForeignHandler {
    /**
      * Construct a new foreign message handler.
      */
    def this(options: typingsSlinky.atJupyterlabConsole.libForeignMod.ForeignHandler.IOptions) = this()
  }
  
  val IConsoleTracker: Token[typingsSlinky.atJupyterlabConsole.libTokensMod.IConsoleTracker] = js.native
  @js.native
  object CodeConsole extends js.Object {
    /**
      * Default implementation of `IContentFactory`.
      */
    @js.native
    class ContentFactory ()
      extends typingsSlinky.atJupyterlabConsole.libWidgetMod.CodeConsole.ContentFactory
    
    /**
      * The default implementation of an `IModelFactory`.
      */
    @js.native
    /**
      * Create a new cell model factory.
      */
    class ModelFactory ()
      extends typingsSlinky.atJupyterlabConsole.libWidgetMod.CodeConsole.ModelFactory {
      def this(options: IModelFactoryOptions) = this()
    }
    
    /**
      * A default content factory for the code console.
      */
    val defaultContentFactory: IContentFactory = js.native
    /**
      * The default `ModelFactory` instance.
      */
    val defaultModelFactory: typingsSlinky.atJupyterlabConsole.libWidgetMod.CodeConsole.ModelFactory = js.native
    /**
      * A namespace for the code console content factory.
      */
    @js.native
    object ContentFactory extends js.Object
    
  }
  
  @js.native
  object ConsolePanel extends js.Object {
    /**
      * Default implementation of `IContentFactory`.
      */
    @js.native
    class ContentFactory ()
      extends typingsSlinky.atJupyterlabConsole.libPanelMod.ConsolePanel.ContentFactory
    
    /**
      * The console renderer token.
      */
    val IContentFactory: Token[typingsSlinky.atJupyterlabConsole.libPanelMod.ConsolePanel.IContentFactory] = js.native
    /**
      * A default code console content factory.
      */
    val defaultContentFactory: typingsSlinky.atJupyterlabConsole.libPanelMod.ConsolePanel.IContentFactory = js.native
    /**
      * A namespace for the console panel content factory.
      */
    @js.native
    object ContentFactory extends js.Object
    
  }
  
}

