package typingsSlinky.jupyterlabTerminal.tokensMod.ITerminal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type for the terminal theme.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jupyterlabTerminal.jupyterlabTerminalStrings.light
  - typingsSlinky.jupyterlabTerminal.jupyterlabTerminalStrings.dark
  - typingsSlinky.jupyterlabTerminal.jupyterlabTerminalStrings.inherit
*/
trait Theme extends js.Object

object Theme {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dark: typingsSlinky.jupyterlabTerminal.jupyterlabTerminalStrings.dark = this.cast("dark")
  @scala.inline
  def inherit: typingsSlinky.jupyterlabTerminal.jupyterlabTerminalStrings.inherit = this.cast("inherit")
  @scala.inline
  def light: typingsSlinky.jupyterlabTerminal.jupyterlabTerminalStrings.light = this.cast("light")
}

