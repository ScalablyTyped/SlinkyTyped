package typingsSlinky.cryptoJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("crypto-js", "EvpKDF")
@js.native
object EvpKDF extends js.Object {
  
  def apply(password: String, salt: String): WordArray = js.native
  def apply(password: String, salt: String, cfg: typingsSlinky.cryptoJs.anon.Hasher): WordArray = js.native
  def apply(password: String, salt: WordArray): WordArray = js.native
  def apply(password: String, salt: WordArray, cfg: typingsSlinky.cryptoJs.anon.Hasher): WordArray = js.native
  def apply(password: WordArray, salt: String): WordArray = js.native
  def apply(password: WordArray, salt: String, cfg: typingsSlinky.cryptoJs.anon.Hasher): WordArray = js.native
  def apply(password: WordArray, salt: WordArray): WordArray = js.native
  def apply(password: WordArray, salt: WordArray, cfg: typingsSlinky.cryptoJs.anon.Hasher): WordArray = js.native
}
