package typingsSlinky.libraCore.mempoolPbMod.GetBlockRequest

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/mempool_pb", "GetBlockRequest")
@js.native
object ^ extends js.Object {
  
  def deserializeBinary(bytes: js.typedarray.Uint8Array): typingsSlinky.libraCore.mempoolPbMod.GetBlockRequest = js.native
  
  def deserializeBinaryFromReader(message: typingsSlinky.libraCore.mempoolPbMod.GetBlockRequest, reader: BinaryReader): typingsSlinky.libraCore.mempoolPbMod.GetBlockRequest = js.native
  
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  
  def serializeBinaryToWriter(message: typingsSlinky.libraCore.mempoolPbMod.GetBlockRequest, writer: BinaryWriter): Unit = js.native
  
  def toObject(includeInstance: Boolean, msg: typingsSlinky.libraCore.mempoolPbMod.GetBlockRequest): AsObject = js.native
}
