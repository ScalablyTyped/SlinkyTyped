package typingsSlinky.jupyterlabConsole

import typingsSlinky.jupyterlabConsole.widgetMod.CodeConsole.IContentFactory
import typingsSlinky.jupyterlabConsole.widgetMod.CodeConsole.IModelFactoryOptions
import typingsSlinky.jupyterlabConsole.widgetMod.CodeConsole.IOptions
import typingsSlinky.luminoCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/console", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val IConsoleTracker: Token[typingsSlinky.jupyterlabConsole.tokensMod.IConsoleTracker] = js.native
  
  @js.native
  class CodeConsole protected ()
    extends typingsSlinky.jupyterlabConsole.widgetMod.CodeConsole {
    /**
      * Construct a console widget.
      */
    def this(options: IOptions) = this()
  }
  @js.native
  object CodeConsole extends js.Object {
    
    /**
      * A default content factory for the code console.
      */
    val defaultContentFactory: IContentFactory = js.native
    
    /**
      * The default `ModelFactory` instance.
      */
    val defaultModelFactory: typingsSlinky.jupyterlabConsole.widgetMod.CodeConsole.ModelFactory = js.native
    
    /**
      * Default implementation of `IContentFactory`.
      */
    @js.native
    class ContentFactory ()
      extends typingsSlinky.jupyterlabConsole.widgetMod.CodeConsole.ContentFactory
    /**
      * A namespace for the code console content factory.
      */
    @js.native
    object ContentFactory extends js.Object
    
    /**
      * The default implementation of an `IModelFactory`.
      */
    @js.native
    /**
      * Create a new cell model factory.
      */
    class ModelFactory ()
      extends typingsSlinky.jupyterlabConsole.widgetMod.CodeConsole.ModelFactory {
      def this(options: IModelFactoryOptions) = this()
    }
  }
  
  @js.native
  class ConsoleHistory protected ()
    extends typingsSlinky.jupyterlabConsole.historyMod.ConsoleHistory {
    /**
      * Construct a new console history object.
      */
    def this(options: typingsSlinky.jupyterlabConsole.historyMod.ConsoleHistory.IOptions) = this()
  }
  
  @js.native
  class ConsolePanel protected ()
    extends typingsSlinky.jupyterlabConsole.panelMod.ConsolePanel {
    /**
      * Construct a console panel.
      */
    def this(options: typingsSlinky.jupyterlabConsole.panelMod.ConsolePanel.IOptions) = this()
  }
  @js.native
  object ConsolePanel extends js.Object {
    
    /**
      * The console renderer token.
      */
    val IContentFactory: Token[typingsSlinky.jupyterlabConsole.panelMod.ConsolePanel.IContentFactory] = js.native
    
    /**
      * A default code console content factory.
      */
    val defaultContentFactory: typingsSlinky.jupyterlabConsole.panelMod.ConsolePanel.IContentFactory = js.native
    
    /**
      * Default implementation of `IContentFactory`.
      */
    @js.native
    class ContentFactory ()
      extends typingsSlinky.jupyterlabConsole.panelMod.ConsolePanel.ContentFactory
    /**
      * A namespace for the console panel content factory.
      */
    @js.native
    object ContentFactory extends js.Object
  }
  
  @js.native
  class ForeignHandler protected ()
    extends typingsSlinky.jupyterlabConsole.foreignMod.ForeignHandler {
    /**
      * Construct a new foreign message handler.
      */
    def this(options: typingsSlinky.jupyterlabConsole.foreignMod.ForeignHandler.IOptions) = this()
  }
}
