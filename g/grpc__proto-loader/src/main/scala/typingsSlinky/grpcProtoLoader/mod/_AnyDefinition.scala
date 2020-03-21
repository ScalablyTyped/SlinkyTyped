package typingsSlinky.grpcProtoLoader.mod

import typingsSlinky.grpcProtoLoader.grpcProtoLoaderStrings.`Protocol Buffer 3 DescriptorProto`
import typingsSlinky.grpcProtoLoader.grpcProtoLoaderStrings.`Protocol Buffer 3 EnumDescriptorProto`
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _AnyDefinition extends js.Object

object _AnyDefinition {
  @scala.inline
  def MessageTypeDefinition(
    fileDescriptorProtos: js.Array[Buffer],
    format: `Protocol Buffer 3 DescriptorProto`,
    `type`: js.Object
  ): _AnyDefinition = {
    val __obj = js.Dynamic.literal(fileDescriptorProtos = fileDescriptorProtos.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_AnyDefinition]
  }
  @scala.inline
  def EnumTypeDefinition(
    fileDescriptorProtos: js.Array[Buffer],
    format: `Protocol Buffer 3 EnumDescriptorProto`,
    `type`: js.Object
  ): _AnyDefinition = {
    val __obj = js.Dynamic.literal(fileDescriptorProtos = fileDescriptorProtos.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_AnyDefinition]
  }
}

