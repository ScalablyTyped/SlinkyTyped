package typingsSlinky.libraCore.admissionControlPbMod.AdmissionControlStatus

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/admission_control_pb", "AdmissionControlStatus")
@js.native
object ^ extends js.Object {
  
  def deserializeBinary(bytes: js.typedarray.Uint8Array): typingsSlinky.libraCore.admissionControlPbMod.AdmissionControlStatus = js.native
  
  def deserializeBinaryFromReader(
    message: typingsSlinky.libraCore.admissionControlPbMod.AdmissionControlStatus,
    reader: BinaryReader
  ): typingsSlinky.libraCore.admissionControlPbMod.AdmissionControlStatus = js.native
  
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  
  def serializeBinaryToWriter(
    message: typingsSlinky.libraCore.admissionControlPbMod.AdmissionControlStatus,
    writer: BinaryWriter
  ): Unit = js.native
  
  def toObject(
    includeInstance: Boolean,
    msg: typingsSlinky.libraCore.admissionControlPbMod.AdmissionControlStatus
  ): AsObject = js.native
}
