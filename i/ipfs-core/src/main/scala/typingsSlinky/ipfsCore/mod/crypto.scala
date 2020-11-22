package typingsSlinky.ipfsCore.mod

import typingsSlinky.ipfsCore.anon.Typeofaes
import typingsSlinky.ipfsCore.anon.Typeofhmac
import typingsSlinky.ipfsCore.anon.Typeofkeys
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src", "crypto")
@js.native
object crypto extends js.Object {
  
  val aes: Typeofaes = js.native
  
  val hmac: Typeofhmac = js.native
  
  val keys: Typeofkeys = js.native
  
  def pbkdf2(password: String, salt: String, iterations: Double, keySize: Double, hash: String): js.typedarray.Uint8Array = js.native
  def pbkdf2(
    password: String,
    salt: js.typedarray.Uint8Array,
    iterations: Double,
    keySize: Double,
    hash: String
  ): js.typedarray.Uint8Array = js.native
  def pbkdf2(
    password: js.typedarray.Uint8Array,
    salt: String,
    iterations: Double,
    keySize: Double,
    hash: String
  ): js.typedarray.Uint8Array = js.native
  def pbkdf2(
    password: js.typedarray.Uint8Array,
    salt: js.typedarray.Uint8Array,
    iterations: Double,
    keySize: Double,
    hash: String
  ): js.typedarray.Uint8Array = js.native
  
  def randomBytes(number: Double): js.typedarray.Uint8Array = js.native
}
