package typingsSlinky.libraCore.vmErrorsPbMod.VMVerificationStatus

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMVerificationStatus")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: js.typedarray.Uint8Array): typingsSlinky.libraCore.vmErrorsPbMod.VMVerificationStatus = js.native
  def deserializeBinaryFromReader(message: typingsSlinky.libraCore.vmErrorsPbMod.VMVerificationStatus, reader: BinaryReader): typingsSlinky.libraCore.vmErrorsPbMod.VMVerificationStatus = js.native
  def serializeBinaryToWriter(message: typingsSlinky.libraCore.vmErrorsPbMod.VMVerificationStatus, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: typingsSlinky.libraCore.vmErrorsPbMod.VMVerificationStatus): AsObject = js.native
}

