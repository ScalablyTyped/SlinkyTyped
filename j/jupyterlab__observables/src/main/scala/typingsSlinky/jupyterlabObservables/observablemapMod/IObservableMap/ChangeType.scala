package typingsSlinky.jupyterlabObservables.observablemapMod.IObservableMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The change types which occur on an observable map.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jupyterlabObservables.jupyterlabObservablesStrings.add
  - typingsSlinky.jupyterlabObservables.jupyterlabObservablesStrings.remove
  - typingsSlinky.jupyterlabObservables.jupyterlabObservablesStrings.change
*/
trait ChangeType extends js.Object

object ChangeType {
  @scala.inline
  def add: typingsSlinky.jupyterlabObservables.jupyterlabObservablesStrings.add = this.cast("add")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def change: typingsSlinky.jupyterlabObservables.jupyterlabObservablesStrings.change = this.cast("change")
  @scala.inline
  def remove: typingsSlinky.jupyterlabObservables.jupyterlabObservablesStrings.remove = this.cast("remove")
}

