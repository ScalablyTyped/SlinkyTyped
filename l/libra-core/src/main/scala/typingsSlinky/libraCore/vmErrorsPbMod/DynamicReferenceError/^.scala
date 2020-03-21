package typingsSlinky.libraCore.vmErrorsPbMod.DynamicReferenceError

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/vm_errors_pb", "DynamicReferenceError")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: scala.scalajs.js.typedarray.Uint8Array): typingsSlinky.libraCore.vmErrorsPbMod.DynamicReferenceError = js.native
  def deserializeBinaryFromReader(message: typingsSlinky.libraCore.vmErrorsPbMod.DynamicReferenceError, reader: BinaryReader): typingsSlinky.libraCore.vmErrorsPbMod.DynamicReferenceError = js.native
  def serializeBinaryToWriter(message: typingsSlinky.libraCore.vmErrorsPbMod.DynamicReferenceError, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: typingsSlinky.libraCore.vmErrorsPbMod.DynamicReferenceError): AsObject = js.native
}

