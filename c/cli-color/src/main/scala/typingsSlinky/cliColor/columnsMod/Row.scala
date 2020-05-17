package typingsSlinky.cliColor.columnsMod

import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Iterable[js.Any]
  - typingsSlinky.std.ArrayLike[js.Any]
*/
trait Row extends js.Object

object Row {
  @scala.inline
  implicit def apply(value: ArrayLike[js.Any]): Row = value.asInstanceOf[Row]
  @scala.inline
  implicit def apply(value: js.Iterable[js.Any]): Row = value.asInstanceOf[Row]
}

