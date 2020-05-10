package typingsSlinky.libraCore.validatorPublicKeysPbMod

import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/validator_public_keys_pb", "ValidatorPublicKeys")
@js.native
class ValidatorPublicKeys_ () extends Message {
  def getAccountAddress(): js.typedarray.Uint8Array | String = js.native
  def getAccountAddress_asB64(): String = js.native
  def getAccountAddress_asU8(): js.typedarray.Uint8Array = js.native
  def getConsensusPublicKey(): js.typedarray.Uint8Array | String = js.native
  def getConsensusPublicKey_asB64(): String = js.native
  def getConsensusPublicKey_asU8(): js.typedarray.Uint8Array = js.native
  def getNetworkIdentityPublicKey(): js.typedarray.Uint8Array | String = js.native
  def getNetworkIdentityPublicKey_asB64(): String = js.native
  def getNetworkIdentityPublicKey_asU8(): js.typedarray.Uint8Array = js.native
  def getNetworkSigningPublicKey(): js.typedarray.Uint8Array | String = js.native
  def getNetworkSigningPublicKey_asB64(): String = js.native
  def getNetworkSigningPublicKey_asU8(): js.typedarray.Uint8Array = js.native
  def setAccountAddress(value: String): Unit = js.native
  def setAccountAddress(value: js.typedarray.Uint8Array): Unit = js.native
  def setConsensusPublicKey(value: String): Unit = js.native
  def setConsensusPublicKey(value: js.typedarray.Uint8Array): Unit = js.native
  def setNetworkIdentityPublicKey(value: String): Unit = js.native
  def setNetworkIdentityPublicKey(value: js.typedarray.Uint8Array): Unit = js.native
  def setNetworkSigningPublicKey(value: String): Unit = js.native
  def setNetworkSigningPublicKey(value: js.typedarray.Uint8Array): Unit = js.native
}

