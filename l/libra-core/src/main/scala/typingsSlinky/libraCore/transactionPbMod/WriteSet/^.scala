package typingsSlinky.libraCore.transactionPbMod.WriteSet

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/transaction_pb", "WriteSet")
@js.native
object ^ extends js.Object {
  
  def deserializeBinary(bytes: js.typedarray.Uint8Array): typingsSlinky.libraCore.transactionPbMod.WriteSet = js.native
  
  def deserializeBinaryFromReader(message: typingsSlinky.libraCore.transactionPbMod.WriteSet, reader: BinaryReader): typingsSlinky.libraCore.transactionPbMod.WriteSet = js.native
  
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  
  def serializeBinaryToWriter(message: typingsSlinky.libraCore.transactionPbMod.WriteSet, writer: BinaryWriter): Unit = js.native
  
  def toObject(includeInstance: Boolean, msg: typingsSlinky.libraCore.transactionPbMod.WriteSet): AsObject = js.native
}
