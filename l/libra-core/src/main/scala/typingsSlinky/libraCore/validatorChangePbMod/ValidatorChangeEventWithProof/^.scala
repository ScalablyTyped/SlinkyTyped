package typingsSlinky.libraCore.validatorChangePbMod.ValidatorChangeEventWithProof

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/validator_change_pb", "ValidatorChangeEventWithProof")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: scala.scalajs.js.typedarray.Uint8Array): typingsSlinky.libraCore.validatorChangePbMod.ValidatorChangeEventWithProof = js.native
  def deserializeBinaryFromReader(
    message: typingsSlinky.libraCore.validatorChangePbMod.ValidatorChangeEventWithProof,
    reader: BinaryReader
  ): typingsSlinky.libraCore.validatorChangePbMod.ValidatorChangeEventWithProof = js.native
  def serializeBinaryToWriter(
    message: typingsSlinky.libraCore.validatorChangePbMod.ValidatorChangeEventWithProof,
    writer: BinaryWriter
  ): Unit = js.native
  def toObject(
    includeInstance: Boolean,
    msg: typingsSlinky.libraCore.validatorChangePbMod.ValidatorChangeEventWithProof
  ): AsObject = js.native
}

