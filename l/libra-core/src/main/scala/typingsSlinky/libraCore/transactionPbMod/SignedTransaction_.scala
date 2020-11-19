package typingsSlinky.libraCore.transactionPbMod

import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/transaction_pb", "SignedTransaction")
@js.native
class SignedTransaction_ () extends Message {
  
  def getRawTxnBytes(): js.typedarray.Uint8Array | String = js.native
  
  def getRawTxnBytes_asB64(): String = js.native
  
  def getRawTxnBytes_asU8(): js.typedarray.Uint8Array = js.native
  
  def getSenderPublicKey(): js.typedarray.Uint8Array | String = js.native
  
  def getSenderPublicKey_asB64(): String = js.native
  
  def getSenderPublicKey_asU8(): js.typedarray.Uint8Array = js.native
  
  def getSenderSignature(): js.typedarray.Uint8Array | String = js.native
  
  def getSenderSignature_asB64(): String = js.native
  
  def getSenderSignature_asU8(): js.typedarray.Uint8Array = js.native
  
  def setRawTxnBytes(value: String): Unit = js.native
  def setRawTxnBytes(value: js.typedarray.Uint8Array): Unit = js.native
  
  def setSenderPublicKey(value: String): Unit = js.native
  def setSenderPublicKey(value: js.typedarray.Uint8Array): Unit = js.native
  
  def setSenderSignature(value: String): Unit = js.native
  def setSenderSignature(value: js.typedarray.Uint8Array): Unit = js.native
}
