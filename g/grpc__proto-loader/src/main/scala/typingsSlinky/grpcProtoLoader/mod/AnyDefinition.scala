package typingsSlinky.grpcProtoLoader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.grpcProtoLoader.mod.ServiceDefinition
  - typingsSlinky.grpcProtoLoader.mod.MessageTypeDefinition
  - typingsSlinky.grpcProtoLoader.mod.EnumTypeDefinition
*/
trait AnyDefinition extends js.Object

object AnyDefinition {
  @scala.inline
  implicit def apply(value: EnumTypeDefinition): AnyDefinition = value.asInstanceOf[AnyDefinition]
  @scala.inline
  implicit def apply(value: MessageTypeDefinition): AnyDefinition = value.asInstanceOf[AnyDefinition]
  @scala.inline
  implicit def apply(value: ServiceDefinition): AnyDefinition = value.asInstanceOf[AnyDefinition]
}

