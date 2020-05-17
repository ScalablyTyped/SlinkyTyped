package typingsSlinky.googleProtobuf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.googleProtobuf.mod.ScalarFieldType
  - typingsSlinky.googleProtobuf.mod.RepeatedFieldType
  - typingsSlinky.std.Uint8Array
*/
trait AnyFieldType extends js.Object

object AnyFieldType {
  @scala.inline
  implicit def apply(value: RepeatedFieldType): AnyFieldType = value.asInstanceOf[AnyFieldType]
  @scala.inline
  implicit def apply(value: ScalarFieldType): AnyFieldType = value.asInstanceOf[AnyFieldType]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): AnyFieldType = value.asInstanceOf[AnyFieldType]
}

