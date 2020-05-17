package typingsSlinky.apolloProtobufjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Any extension field descriptor. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.apolloProtobufjs.mod.IExtensionField
  - typingsSlinky.apolloProtobufjs.mod.IExtensionMapField
*/
trait AnyExtensionField extends AnyNestedObject

object AnyExtensionField {
  @scala.inline
  implicit def apply(value: IExtensionField): AnyExtensionField = value.asInstanceOf[AnyExtensionField]
  @scala.inline
  implicit def apply(value: IExtensionMapField): AnyExtensionField = value.asInstanceOf[AnyExtensionField]
}

