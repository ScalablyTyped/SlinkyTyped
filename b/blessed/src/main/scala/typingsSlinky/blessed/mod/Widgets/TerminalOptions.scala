package typingsSlinky.blessed.mod.Widgets

import typingsSlinky.blessed.blessedStrings.block
import typingsSlinky.blessed.blessedStrings.line
import typingsSlinky.blessed.blessedStrings.underline
import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TerminalOptions extends BoxOptions {
  
  /**
    * args for shell.
    */
  var args: js.UndefOr[js.Any] = js.native
  
  /**
    * can be line, underline, and block.
    */
  var cursor: js.UndefOr[line | underline | block] = js.native
  
  /**
    * Object for process env.
    */
  var env: js.UndefOr[js.Any] = js.native
  
  /**
    * handler for input data.
    */
  var handler: js.UndefOr[js.Function1[/* userInput */ Buffer, Unit]] = js.native
  
  /**
    * name of shell. $SHELL by default.
    */
  var shell: js.UndefOr[String] = js.native
  
  var terminal: js.UndefOr[String] = js.native
}
object TerminalOptions {
  
  @scala.inline
  def apply(): TerminalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminalOptions]
  }
  
  @scala.inline
  implicit class TerminalOptionsMutableBuilder[Self <: TerminalOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Any): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    @scala.inline
    def setCursor(value: line | underline | block): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    @scala.inline
    def setEnv(value: js.Any): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    @scala.inline
    def setHandler(value: /* userInput */ Buffer => Unit): Self = StObject.set(x, "handler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
    
    @scala.inline
    def setShell(value: String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
    
    @scala.inline
    def setTerminal(value: String): Self = StObject.set(x, "terminal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminalUndefined: Self = StObject.set(x, "terminal", js.undefined)
  }
}
