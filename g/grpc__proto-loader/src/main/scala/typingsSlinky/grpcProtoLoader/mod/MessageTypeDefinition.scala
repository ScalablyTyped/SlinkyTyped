package typingsSlinky.grpcProtoLoader.mod

import typingsSlinky.grpcProtoLoader.grpcProtoLoaderStrings.`Protocol Buffer 3 DescriptorProto`
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageTypeDefinition
  extends ProtobufTypeDefinition
     with AnyDefinition {
  @JSName("format")
  var format_MessageTypeDefinition: `Protocol Buffer 3 DescriptorProto` = js.native
}

object MessageTypeDefinition {
  @scala.inline
  def apply(
    fileDescriptorProtos: js.Array[Buffer],
    format: `Protocol Buffer 3 DescriptorProto`,
    `type`: js.Object
  ): MessageTypeDefinition = {
    val __obj = js.Dynamic.literal(fileDescriptorProtos = fileDescriptorProtos.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageTypeDefinition]
  }
  @scala.inline
  implicit class MessageTypeDefinitionOps[Self <: MessageTypeDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: `Protocol Buffer 3 DescriptorProto`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

