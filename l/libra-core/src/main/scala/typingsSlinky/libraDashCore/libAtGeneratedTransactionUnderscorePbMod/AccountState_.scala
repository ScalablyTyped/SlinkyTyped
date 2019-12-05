package typingsSlinky.libraDashCore.libAtGeneratedTransactionUnderscorePbMod

import typingsSlinky.googleDashProtobuf.googleDashProtobufMod.Message
import typingsSlinky.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/transaction_pb", "AccountState")
@js.native
class AccountState_ () extends Message {
  def getAddress(): scala.scalajs.js.typedarray.Uint8Array | String = js.native
  def getAddress_asB64(): String = js.native
  def getAddress_asU8(): scala.scalajs.js.typedarray.Uint8Array = js.native
  def getBlob(): scala.scalajs.js.typedarray.Uint8Array | String = js.native
  def getBlob_asB64(): String = js.native
  def getBlob_asU8(): scala.scalajs.js.typedarray.Uint8Array = js.native
  def setAddress(value: String): Unit = js.native
  def setAddress(value: Uint8Array): Unit = js.native
  def setBlob(value: String): Unit = js.native
  def setBlob(value: Uint8Array): Unit = js.native
}

