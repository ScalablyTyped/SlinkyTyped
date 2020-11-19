package typingsSlinky.libraCore.accountStateBlobPbMod

import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/account_state_blob_pb", "AccountStateBlob")
@js.native
class AccountStateBlob_ () extends Message {
  
  def getBlob(): js.typedarray.Uint8Array | String = js.native
  
  def getBlob_asB64(): String = js.native
  
  def getBlob_asU8(): js.typedarray.Uint8Array = js.native
  
  def setBlob(value: String): Unit = js.native
  def setBlob(value: js.typedarray.Uint8Array): Unit = js.native
}
