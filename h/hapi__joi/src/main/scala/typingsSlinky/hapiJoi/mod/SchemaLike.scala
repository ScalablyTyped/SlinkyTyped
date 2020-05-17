package typingsSlinky.hapiJoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - scala.Boolean
  - js.Object
  - scala.Null
  - typingsSlinky.hapiJoi.mod.Schema
  - typingsSlinky.hapiJoi.mod.SchemaMap[js.Any]
*/
trait SchemaLike extends js.Object

object SchemaLike {
  @scala.inline
  implicit def apply(value: Boolean): SchemaLike = value.asInstanceOf[SchemaLike]
  @scala.inline
  implicit def apply(value: Double): SchemaLike = value.asInstanceOf[SchemaLike]
  @scala.inline
  implicit def apply(value: Null): SchemaLike = value.asInstanceOf[SchemaLike]
  @scala.inline
  implicit def apply(value: js.Object): SchemaLike = value.asInstanceOf[SchemaLike]
  @scala.inline
  implicit def apply(value: Schema): SchemaLike = value.asInstanceOf[SchemaLike]
  @scala.inline
  implicit def apply(value: SchemaMap[js.Any]): SchemaLike = value.asInstanceOf[SchemaLike]
  @scala.inline
  implicit def apply(value: String): SchemaLike = value.asInstanceOf[SchemaLike]
}

