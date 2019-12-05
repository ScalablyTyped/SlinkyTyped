package typingsSlinky.atJupyterlabObservables.libObservablemapMod.IObservableMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The change types which occur on an observable map.
  */
/* Rewritten from type alias, can be one of: 
  - typings.atJupyterlabObservables.atJupyterlabObservablesStrings.add
  - typings.atJupyterlabObservables.atJupyterlabObservablesStrings.remove
  - typings.atJupyterlabObservables.atJupyterlabObservablesStrings.change
*/
trait ChangeType extends js.Object

object ChangeType {
  @scala.inline
  def add: typingsSlinky.atJupyterlabObservables.atJupyterlabObservablesStrings.add = this.cast("add")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def change: typingsSlinky.atJupyterlabObservables.atJupyterlabObservablesStrings.change = this.cast("change")
  @scala.inline
  def remove: typingsSlinky.atJupyterlabObservables.atJupyterlabObservablesStrings.remove = this.cast("remove")
}

