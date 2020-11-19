package typingsSlinky.grpcProtoLoader.mod.protobufjsAugmentingMod

import typingsSlinky.protobufjs.descriptorMod.IEnumDescriptorProto
import typingsSlinky.protobufjs.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Enum extends js.Object {
  
  def toDescriptor(protoVersion: String): Message[IEnumDescriptorProto] with IEnumDescriptorProto = js.native
}
object Enum {
  
  @scala.inline
  def apply(toDescriptor: String => Message[IEnumDescriptorProto] with IEnumDescriptorProto): Enum = {
    val __obj = js.Dynamic.literal(toDescriptor = js.Any.fromFunction1(toDescriptor))
    __obj.asInstanceOf[Enum]
  }
  
  @scala.inline
  implicit class EnumOps[Self <: Enum] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setToDescriptor(value: String => Message[IEnumDescriptorProto] with IEnumDescriptorProto): Self = this.set("toDescriptor", js.Any.fromFunction1(value))
  }
}
