package typingsSlinky.libraCore.accessPathPbMod.AccessPath

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/access_path_pb", "AccessPath")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: js.typedarray.Uint8Array): typingsSlinky.libraCore.accessPathPbMod.AccessPath = js.native
  def deserializeBinaryFromReader(message: typingsSlinky.libraCore.accessPathPbMod.AccessPath, reader: BinaryReader): typingsSlinky.libraCore.accessPathPbMod.AccessPath = js.native
  def serializeBinaryToWriter(message: typingsSlinky.libraCore.accessPathPbMod.AccessPath, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: typingsSlinky.libraCore.accessPathPbMod.AccessPath): AsObject = js.native
}

