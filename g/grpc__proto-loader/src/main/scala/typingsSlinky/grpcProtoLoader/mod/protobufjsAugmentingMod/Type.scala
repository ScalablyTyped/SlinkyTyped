package typingsSlinky.grpcProtoLoader.mod.protobufjsAugmentingMod

import typingsSlinky.protobufjs.descriptorMod.IDescriptorProto
import typingsSlinky.protobufjs.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Type extends js.Object {
  def toDescriptor(protoVersion: String): Message[IDescriptorProto] with IDescriptorProto = js.native
}

object Type {
  @scala.inline
  def apply(toDescriptor: String => Message[IDescriptorProto] with IDescriptorProto): Type = {
    val __obj = js.Dynamic.literal(toDescriptor = js.Any.fromFunction1(toDescriptor))
    __obj.asInstanceOf[Type]
  }
  @scala.inline
  implicit class TypeOps[Self <: Type] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withToDescriptor(value: String => Message[IDescriptorProto] with IDescriptorProto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toDescriptor")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

