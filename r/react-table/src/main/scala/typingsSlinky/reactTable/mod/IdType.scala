package typingsSlinky.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactTable.mod.StringKey[D]
  - java.lang.String
*/
trait IdType[D] extends js.Object

object IdType {
  @scala.inline
  implicit def apply[D](value: String | StringKey[D]): IdType[D] = value.asInstanceOf[IdType[D]]
}

