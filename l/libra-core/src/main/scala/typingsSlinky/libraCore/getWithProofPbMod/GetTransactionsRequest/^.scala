package typingsSlinky.libraCore.getWithProofPbMod.GetTransactionsRequest

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetTransactionsRequest")
@js.native
object ^ extends js.Object {
  
  def deserializeBinary(bytes: js.typedarray.Uint8Array): typingsSlinky.libraCore.getWithProofPbMod.GetTransactionsRequest = js.native
  
  def deserializeBinaryFromReader(message: typingsSlinky.libraCore.getWithProofPbMod.GetTransactionsRequest, reader: BinaryReader): typingsSlinky.libraCore.getWithProofPbMod.GetTransactionsRequest = js.native
  
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  
  def serializeBinaryToWriter(message: typingsSlinky.libraCore.getWithProofPbMod.GetTransactionsRequest, writer: BinaryWriter): Unit = js.native
  
  def toObject(includeInstance: Boolean, msg: typingsSlinky.libraCore.getWithProofPbMod.GetTransactionsRequest): AsObject = js.native
}
