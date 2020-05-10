package typingsSlinky.libraCore.languageStoragePbMod.ModuleId

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/language_storage_pb", "ModuleId")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: js.typedarray.Uint8Array): typingsSlinky.libraCore.languageStoragePbMod.ModuleId = js.native
  def deserializeBinaryFromReader(message: typingsSlinky.libraCore.languageStoragePbMod.ModuleId, reader: BinaryReader): typingsSlinky.libraCore.languageStoragePbMod.ModuleId = js.native
  def serializeBinaryToWriter(message: typingsSlinky.libraCore.languageStoragePbMod.ModuleId, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: typingsSlinky.libraCore.languageStoragePbMod.ModuleId): AsObject = js.native
}

