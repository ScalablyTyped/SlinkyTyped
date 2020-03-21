package typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jupyterlabDocregistry.jupyterlabDocregistryStrings.started
  - typingsSlinky.jupyterlabDocregistry.jupyterlabDocregistryStrings.completed
  - typingsSlinky.jupyterlabDocregistry.jupyterlabDocregistryStrings.failed
*/
trait SaveState extends js.Object

object SaveState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def completed: typingsSlinky.jupyterlabDocregistry.jupyterlabDocregistryStrings.completed = this.cast("completed")
  @scala.inline
  def failed: typingsSlinky.jupyterlabDocregistry.jupyterlabDocregistryStrings.failed = this.cast("failed")
  @scala.inline
  def started: typingsSlinky.jupyterlabDocregistry.jupyterlabDocregistryStrings.started = this.cast("started")
}

