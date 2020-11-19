package typingsSlinky.libraCore.mempoolPbMod

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/mempool_pb", "HealthCheckRequest")
@js.native
class HealthCheckRequest () extends Message
/* static members */
@JSImport("libra-core/lib/@/generated/mempool_pb", "HealthCheckRequest")
@js.native
object HealthCheckRequest extends js.Object {
  
  def deserializeBinary(bytes: js.typedarray.Uint8Array): HealthCheckRequest = js.native
  
  def deserializeBinaryFromReader(message: HealthCheckRequest, reader: BinaryReader): HealthCheckRequest = js.native
  
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  
  def serializeBinaryToWriter(message: HealthCheckRequest, writer: BinaryWriter): Unit = js.native
  
  def toObject(includeInstance: Boolean, msg: HealthCheckRequest): AsObject = js.native
  
  type AsObject = js.Object
}
