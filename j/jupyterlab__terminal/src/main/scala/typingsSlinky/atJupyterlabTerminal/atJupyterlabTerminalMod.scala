package typingsSlinky.atJupyterlabTerminal

import typingsSlinky.atJupyterlabServices.libTerminalTerminalMod.TerminalSession.ISession
import typingsSlinky.atJupyterlabTerminal.libTokensMod.ITerminal.IOptions
import typingsSlinky.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/terminal", JSImport.Namespace)
@js.native
object atJupyterlabTerminalMod extends js.Object {
  @js.native
  class Terminal protected ()
    extends typingsSlinky.atJupyterlabTerminal.libWidgetMod.Terminal {
    /**
      * Construct a new terminal widget.
      *
      * @param session - The terminal session object.
      *
      * @param options - The terminal configuration options.
      */
    def this(session: ISession) = this()
    def this(session: ISession, options: Partial[IOptions]) = this()
  }
  
  val ITerminalTracker: Token[typingsSlinky.atJupyterlabTerminal.libTokensMod.ITerminalTracker] = js.native
  @js.native
  object ITerminal extends js.Object {
    /**
      * The default options used for creating terminals.
      */
    val defaultOptions: IOptions = js.native
  }
  
}

