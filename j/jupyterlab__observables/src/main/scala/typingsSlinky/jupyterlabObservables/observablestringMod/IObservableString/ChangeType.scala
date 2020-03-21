package typingsSlinky.jupyterlabObservables.observablestringMod.IObservableString

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The change types which occur on an observable string.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jupyterlabObservables.jupyterlabObservablesStrings.insert
  - typingsSlinky.jupyterlabObservables.jupyterlabObservablesStrings.remove
  - typingsSlinky.jupyterlabObservables.jupyterlabObservablesStrings.set
*/
trait ChangeType extends js.Object

object ChangeType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def insert: typingsSlinky.jupyterlabObservables.jupyterlabObservablesStrings.insert = this.cast("insert")
  @scala.inline
  def remove: typingsSlinky.jupyterlabObservables.jupyterlabObservablesStrings.remove = this.cast("remove")
  @scala.inline
  def set: typingsSlinky.jupyterlabObservables.jupyterlabObservablesStrings.set = this.cast("set")
}

