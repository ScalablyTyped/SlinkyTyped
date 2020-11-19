package typingsSlinky.libraCore.mempoolPbMod.HealthCheckResponse

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/mempool_pb", "HealthCheckResponse")
@js.native
object ^ extends js.Object {
  
  def deserializeBinary(bytes: js.typedarray.Uint8Array): typingsSlinky.libraCore.mempoolPbMod.HealthCheckResponse = js.native
  
  def deserializeBinaryFromReader(message: typingsSlinky.libraCore.mempoolPbMod.HealthCheckResponse, reader: BinaryReader): typingsSlinky.libraCore.mempoolPbMod.HealthCheckResponse = js.native
  
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  
  def serializeBinaryToWriter(message: typingsSlinky.libraCore.mempoolPbMod.HealthCheckResponse, writer: BinaryWriter): Unit = js.native
  
  def toObject(includeInstance: Boolean, msg: typingsSlinky.libraCore.mempoolPbMod.HealthCheckResponse): AsObject = js.native
}
