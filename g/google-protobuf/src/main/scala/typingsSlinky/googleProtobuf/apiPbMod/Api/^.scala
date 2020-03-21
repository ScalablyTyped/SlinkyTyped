package typingsSlinky.googleProtobuf.apiPbMod.Api

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/api_pb", "Api")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: scala.scalajs.js.typedarray.Uint8Array): typingsSlinky.googleProtobuf.apiPbMod.Api = js.native
  def deserializeBinaryFromReader(message: typingsSlinky.googleProtobuf.apiPbMod.Api, reader: BinaryReader): typingsSlinky.googleProtobuf.apiPbMod.Api = js.native
  def serializeBinaryToWriter(message: typingsSlinky.googleProtobuf.apiPbMod.Api, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: typingsSlinky.googleProtobuf.apiPbMod.Api): AsObject = js.native
}

