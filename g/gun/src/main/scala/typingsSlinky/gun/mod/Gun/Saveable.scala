package typingsSlinky.gun.mod.Gun

import typingsSlinky.gun.gunBooleans.`false`
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Partial[DataType]
  - java.lang.String
  - scala.Double
  - scala.Boolean
  - scala.Null
  - typingsSlinky.gun.mod.Gun.ChainReference[DataType, js.Any, typingsSlinky.gun.gunBooleans.`false`]
*/
trait Saveable[DataType] extends js.Object

object Saveable {
  @scala.inline
  implicit def apply[DataType](value: Boolean): Saveable[DataType] = value.asInstanceOf[Saveable[DataType]]
  @scala.inline
  implicit def apply[DataType](value: ChainReference[DataType, js.Any, `false`]): Saveable[DataType] = value.asInstanceOf[Saveable[DataType]]
  @scala.inline
  implicit def apply[DataType](value: Double): Saveable[DataType] = value.asInstanceOf[Saveable[DataType]]
  @scala.inline
  implicit def apply[DataType](value: Null): Saveable[DataType] = value.asInstanceOf[Saveable[DataType]]
  @scala.inline
  implicit def apply[DataType](value: Partial[DataType]): Saveable[DataType] = value.asInstanceOf[Saveable[DataType]]
  @scala.inline
  implicit def apply[DataType](value: String): Saveable[DataType] = value.asInstanceOf[Saveable[DataType]]
}

