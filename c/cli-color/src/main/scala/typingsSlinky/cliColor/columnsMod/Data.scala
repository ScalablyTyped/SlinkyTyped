package typingsSlinky.cliColor.columnsMod

import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Iterable[typingsSlinky.cliColor.columnsMod.Row]
  - typingsSlinky.std.ArrayLike[typingsSlinky.cliColor.columnsMod.Row]
*/
trait Data extends js.Object

object Data {
  @scala.inline
  implicit def apply(value: ArrayLike[Row]): Data = value.asInstanceOf[Data]
  @scala.inline
  implicit def apply(value: js.Iterable[Row]): Data = value.asInstanceOf[Data]
}

