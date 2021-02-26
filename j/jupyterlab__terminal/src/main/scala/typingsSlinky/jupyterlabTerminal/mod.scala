package typingsSlinky.jupyterlabTerminal

import typingsSlinky.jupyterlabServices.terminalTerminalMod.ITerminalConnection
import typingsSlinky.jupyterlabTerminal.anon.PartialIOptions
import typingsSlinky.jupyterlabTerminal.tokensMod.ITerminal.IOptions
import typingsSlinky.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object ITerminal {
    
    /**
      * The default options used for creating terminals.
      */
    @JSImport("@jupyterlab/terminal", "ITerminal.defaultOptions")
    @js.native
    val defaultOptions: IOptions = js.native
  }
  
  @JSImport("@jupyterlab/terminal", "ITerminalTracker")
  @js.native
  val ITerminalTracker: Token[typingsSlinky.jupyterlabTerminal.tokensMod.ITerminalTracker] = js.native
  
  @JSImport("@jupyterlab/terminal", "Terminal")
  @js.native
  class Terminal protected ()
    extends typingsSlinky.jupyterlabTerminal.widgetMod.Terminal {
    /**
      * Construct a new terminal widget.
      *
      * @param session - The terminal session object.
      *
      * @param options - The terminal configuration options.
      */
    def this(session: ITerminalConnection) = this()
    def this(session: ITerminalConnection, options: PartialIOptions) = this()
  }
}
