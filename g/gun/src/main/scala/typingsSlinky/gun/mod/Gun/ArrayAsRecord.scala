package typingsSlinky.gun.mod.Gun

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Record[java.lang.String, js.Any]
  - DataType
*/
trait ArrayAsRecord[DataType] extends js.Object

object ArrayAsRecord {
  @scala.inline
  implicit def apply[DataType](value: DataType): ArrayAsRecord[DataType] = value.asInstanceOf[ArrayAsRecord[DataType]]
  @scala.inline
  implicit def apply[DataType](value: Record[String, js.Any]): ArrayAsRecord[DataType] = value.asInstanceOf[ArrayAsRecord[DataType]]
}

