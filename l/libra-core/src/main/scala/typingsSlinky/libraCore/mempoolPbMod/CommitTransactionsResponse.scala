package typingsSlinky.libraCore.mempoolPbMod

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/mempool_pb", "CommitTransactionsResponse")
@js.native
class CommitTransactionsResponse () extends Message
/* static members */
object CommitTransactionsResponse {
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "CommitTransactionsResponse")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "CommitTransactionsResponse.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: js.typedarray.Uint8Array): CommitTransactionsResponse = js.native
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "CommitTransactionsResponse.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: CommitTransactionsResponse, reader: BinaryReader): CommitTransactionsResponse = js.native
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "CommitTransactionsResponse.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "CommitTransactionsResponse.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "CommitTransactionsResponse.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: CommitTransactionsResponse, writer: BinaryWriter): Unit = js.native
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "CommitTransactionsResponse.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: CommitTransactionsResponse): AsObject = js.native
  
  type AsObject = js.Object
}
