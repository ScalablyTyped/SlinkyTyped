package typingsSlinky.libraCore.validatorPublicKeysPbMod.ValidatorPublicKeys

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/validator_public_keys_pb", "ValidatorPublicKeys")
@js.native
object ^ extends js.Object {
  
  def deserializeBinary(bytes: js.typedarray.Uint8Array): typingsSlinky.libraCore.validatorPublicKeysPbMod.ValidatorPublicKeys = js.native
  
  def deserializeBinaryFromReader(
    message: typingsSlinky.libraCore.validatorPublicKeysPbMod.ValidatorPublicKeys,
    reader: BinaryReader
  ): typingsSlinky.libraCore.validatorPublicKeysPbMod.ValidatorPublicKeys = js.native
  
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  
  def serializeBinaryToWriter(
    message: typingsSlinky.libraCore.validatorPublicKeysPbMod.ValidatorPublicKeys,
    writer: BinaryWriter
  ): Unit = js.native
  
  def toObject(
    includeInstance: Boolean,
    msg: typingsSlinky.libraCore.validatorPublicKeysPbMod.ValidatorPublicKeys
  ): AsObject = js.native
}
