package typingsSlinky.jupyterlabObservables.modeldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jupyterlabObservables.jupyterlabObservablesStrings.Map
  - typingsSlinky.jupyterlabObservables.jupyterlabObservablesStrings.List
  - typingsSlinky.jupyterlabObservables.jupyterlabObservablesStrings.String
  - typingsSlinky.jupyterlabObservables.jupyterlabObservablesStrings.Value
*/
trait ObservableType extends js.Object

object ObservableType {
  @scala.inline
  def List: typingsSlinky.jupyterlabObservables.jupyterlabObservablesStrings.List = this.cast("List")
  @scala.inline
  def Map: typingsSlinky.jupyterlabObservables.jupyterlabObservablesStrings.Map = this.cast("Map")
  @scala.inline
  def String: typingsSlinky.jupyterlabObservables.jupyterlabObservablesStrings.String = this.cast("String")
  @scala.inline
  def Value: typingsSlinky.jupyterlabObservables.jupyterlabObservablesStrings.Value = this.cast("Value")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

