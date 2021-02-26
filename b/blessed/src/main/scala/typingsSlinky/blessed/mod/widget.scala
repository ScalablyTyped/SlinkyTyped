package typingsSlinky.blessed.mod

import typingsSlinky.blessed.mod.Widgets.TerminalElement
import typingsSlinky.blessed.mod.Widgets.TerminalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object widget {
  
  @JSImport("blessed", "widget.Terminal")
  @js.native
  class Terminal protected () extends TerminalElement {
    def this(opts: TerminalOptions) = this()
  }
}
