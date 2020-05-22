package typingsSlinky.grpcProtoLoader.mod.protobufjsAugmentingMod

import typingsSlinky.protobufjs.descriptorMod.IDescriptorProto
import typingsSlinky.protobufjs.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  def toDescriptor(protoVersion: String): Message[IDescriptorProto] with IDescriptorProto
}

object Type {
  @scala.inline
  def apply(toDescriptor: String => Message[IDescriptorProto] with IDescriptorProto): Type = {
    val __obj = js.Dynamic.literal(toDescriptor = js.Any.fromFunction1(toDescriptor))
    __obj.asInstanceOf[Type]
  }
}

