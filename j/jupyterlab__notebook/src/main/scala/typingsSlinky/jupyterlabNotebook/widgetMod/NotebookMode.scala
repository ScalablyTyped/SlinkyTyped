package typingsSlinky.jupyterlabNotebook.widgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jupyterlabNotebook.jupyterlabNotebookStrings.command
  - typingsSlinky.jupyterlabNotebook.jupyterlabNotebookStrings.edit
*/
trait NotebookMode extends js.Object

object NotebookMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def command: typingsSlinky.jupyterlabNotebook.jupyterlabNotebookStrings.command = this.cast("command")
  @scala.inline
  def edit: typingsSlinky.jupyterlabNotebook.jupyterlabNotebookStrings.edit = this.cast("edit")
}

