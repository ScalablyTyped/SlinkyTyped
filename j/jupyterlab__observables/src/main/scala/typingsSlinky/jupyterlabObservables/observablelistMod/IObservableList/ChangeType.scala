package typingsSlinky.jupyterlabObservables.observablelistMod.IObservableList

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The change types which occur on an observable list.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jupyterlabObservables.jupyterlabObservablesStrings.add
  - typingsSlinky.jupyterlabObservables.jupyterlabObservablesStrings.move
  - typingsSlinky.jupyterlabObservables.jupyterlabObservablesStrings.remove
  - typingsSlinky.jupyterlabObservables.jupyterlabObservablesStrings.set
*/
trait ChangeType extends js.Object

object ChangeType {
  @scala.inline
  def add: typingsSlinky.jupyterlabObservables.jupyterlabObservablesStrings.add = this.cast("add")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def move: typingsSlinky.jupyterlabObservables.jupyterlabObservablesStrings.move = this.cast("move")
  @scala.inline
  def remove: typingsSlinky.jupyterlabObservables.jupyterlabObservablesStrings.remove = this.cast("remove")
  @scala.inline
  def set: typingsSlinky.jupyterlabObservables.jupyterlabObservablesStrings.set = this.cast("set")
}

