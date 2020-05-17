package typingsSlinky.apolloProtobufjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Any nested object descriptor. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.apolloProtobufjs.mod.IEnum
  - typingsSlinky.apolloProtobufjs.mod.IType
  - typingsSlinky.apolloProtobufjs.mod.IService
  - typingsSlinky.apolloProtobufjs.mod.AnyExtensionField
  - typingsSlinky.apolloProtobufjs.mod.INamespace
*/
trait AnyNestedObject extends js.Object

object AnyNestedObject {
  @scala.inline
  implicit def apply(value: AnyExtensionField): AnyNestedObject = value.asInstanceOf[AnyNestedObject]
  @scala.inline
  implicit def apply(value: IEnum): AnyNestedObject = value.asInstanceOf[AnyNestedObject]
  @scala.inline
  implicit def apply(value: INamespace): AnyNestedObject = value.asInstanceOf[AnyNestedObject]
  @scala.inline
  implicit def apply(value: IService): AnyNestedObject = value.asInstanceOf[AnyNestedObject]
  @scala.inline
  implicit def apply(value: IType): AnyNestedObject = value.asInstanceOf[AnyNestedObject]
}

