package typingsSlinky.atGrpcProtoDashLoader.atGrpcProtoDashLoaderMod.protobufjsMod

import typingsSlinky.protobufjs.extDescriptorMod.IFileDescriptorSet
import typingsSlinky.protobufjs.protobufjsMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Root extends js.Object {
  def toDescriptor(protoVersion: String): Message[IFileDescriptorSet] with IFileDescriptorSet
}

object Root {
  @scala.inline
  def apply(toDescriptor: String => Message[IFileDescriptorSet] with IFileDescriptorSet): Root = {
    val __obj = js.Dynamic.literal(toDescriptor = js.Any.fromFunction1(toDescriptor))
  
    __obj.asInstanceOf[Root]
  }
}

