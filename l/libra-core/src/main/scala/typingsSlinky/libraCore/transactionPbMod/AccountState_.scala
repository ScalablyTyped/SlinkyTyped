package typingsSlinky.libraCore.transactionPbMod

import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/transaction_pb", "AccountState")
@js.native
class AccountState_ () extends Message {
  
  def getAddress(): js.typedarray.Uint8Array | String = js.native
  
  def getAddress_asB64(): String = js.native
  
  def getAddress_asU8(): js.typedarray.Uint8Array = js.native
  
  def getBlob(): js.typedarray.Uint8Array | String = js.native
  
  def getBlob_asB64(): String = js.native
  
  def getBlob_asU8(): js.typedarray.Uint8Array = js.native
  
  def setAddress(value: String): Unit = js.native
  def setAddress(value: js.typedarray.Uint8Array): Unit = js.native
  
  def setBlob(value: String): Unit = js.native
  def setBlob(value: js.typedarray.Uint8Array): Unit = js.native
}
