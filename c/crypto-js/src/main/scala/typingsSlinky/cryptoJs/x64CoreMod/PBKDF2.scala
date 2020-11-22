package typingsSlinky.cryptoJs.x64CoreMod

import typingsSlinky.cryptoJs.mod.KDFOption
import typingsSlinky.cryptoJs.mod.WordArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("crypto-js/x64-core", "PBKDF2")
@js.native
object PBKDF2 extends js.Object {
  
  def apply(password: String, salt: String): WordArray = js.native
  def apply(password: String, salt: String, cfg: KDFOption): WordArray = js.native
  def apply(password: String, salt: WordArray): WordArray = js.native
  def apply(password: String, salt: WordArray, cfg: KDFOption): WordArray = js.native
  def apply(password: WordArray, salt: String): WordArray = js.native
  def apply(password: WordArray, salt: String, cfg: KDFOption): WordArray = js.native
  def apply(password: WordArray, salt: WordArray): WordArray = js.native
  def apply(password: WordArray, salt: WordArray, cfg: KDFOption): WordArray = js.native
}
