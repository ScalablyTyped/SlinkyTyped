package typingsSlinky.jupyterlabApplication.shellMod.ILabShell

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The areas of the application shell where widgets can reside.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jupyterlabApplication.jupyterlabApplicationStrings.main
  - typingsSlinky.jupyterlabApplication.jupyterlabApplicationStrings.header
  - typingsSlinky.jupyterlabApplication.jupyterlabApplicationStrings.top
  - typingsSlinky.jupyterlabApplication.jupyterlabApplicationStrings.left
  - typingsSlinky.jupyterlabApplication.jupyterlabApplicationStrings.right
  - typingsSlinky.jupyterlabApplication.jupyterlabApplicationStrings.bottom
*/
trait Area extends js.Object

object Area {
  @scala.inline
  def bottom: typingsSlinky.jupyterlabApplication.jupyterlabApplicationStrings.bottom = this.cast("bottom")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def header: typingsSlinky.jupyterlabApplication.jupyterlabApplicationStrings.header = this.cast("header")
  @scala.inline
  def left: typingsSlinky.jupyterlabApplication.jupyterlabApplicationStrings.left = this.cast("left")
  @scala.inline
  def main: typingsSlinky.jupyterlabApplication.jupyterlabApplicationStrings.main = this.cast("main")
  @scala.inline
  def right: typingsSlinky.jupyterlabApplication.jupyterlabApplicationStrings.right = this.cast("right")
  @scala.inline
  def top: typingsSlinky.jupyterlabApplication.jupyterlabApplicationStrings.top = this.cast("top")
}

