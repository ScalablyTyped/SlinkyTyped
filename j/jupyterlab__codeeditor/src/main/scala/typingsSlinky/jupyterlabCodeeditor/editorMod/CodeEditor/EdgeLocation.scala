package typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The location of requested edges.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.top
  - typingsSlinky.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.topLine
  - typingsSlinky.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.bottom
*/
trait EdgeLocation extends js.Object

object EdgeLocation {
  @scala.inline
  def bottom: typingsSlinky.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.bottom = this.cast("bottom")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def top: typingsSlinky.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.top = this.cast("top")
  @scala.inline
  def topLine: typingsSlinky.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.topLine = this.cast("topLine")
}

