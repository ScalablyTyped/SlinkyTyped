package typingsSlinky.notp.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("notp", "totp")
@js.native
object totp extends js.Object {
  
  /**
    * Generate a time based One Time Password.
    * @param key Key for the one time password. This should be unique and secret
    * for every user as it is the seed used to calculate the HMAC.
    * @param opt TOTP Generate options.
    *
    */
  def gen(key: String): String = js.native
  def gen(key: String, opt: TOTPGenOpt): String = js.native
  def gen(key: Buffer): String = js.native
  def gen(key: Buffer, opt: TOTPGenOpt): String = js.native
  def gen(key: js.typedarray.Uint8Array): String = js.native
  def gen(key: js.typedarray.Uint8Array, opt: TOTPGenOpt): String = js.native
  
  /**
    * Check a One Time Password based on a timer.
    * @param token Passcode to validate.
    * @param key Key for the one time password. This should be unique and secret
    * @param opt TOTP verify options.
    *
    */
  def verify(token: String, key: String): VerifyResult | Null = js.native
  def verify(token: String, key: String, opt: TOTPVerifyOpt): VerifyResult | Null = js.native
  def verify(token: String, key: Buffer): VerifyResult | Null = js.native
  def verify(token: String, key: Buffer, opt: TOTPVerifyOpt): VerifyResult | Null = js.native
  def verify(token: String, key: js.typedarray.Uint8Array): VerifyResult | Null = js.native
  def verify(token: String, key: js.typedarray.Uint8Array, opt: TOTPVerifyOpt): VerifyResult | Null = js.native
}
