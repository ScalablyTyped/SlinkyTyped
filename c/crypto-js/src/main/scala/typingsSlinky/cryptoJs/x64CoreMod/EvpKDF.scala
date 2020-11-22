package typingsSlinky.cryptoJs.x64CoreMod

import typingsSlinky.cryptoJs.anon.Hasher
import typingsSlinky.cryptoJs.mod.WordArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("crypto-js/x64-core", "EvpKDF")
@js.native
object EvpKDF extends js.Object {
  
  def apply(password: String, salt: String): WordArray = js.native
  def apply(password: String, salt: String, cfg: Hasher): WordArray = js.native
  def apply(password: String, salt: WordArray): WordArray = js.native
  def apply(password: String, salt: WordArray, cfg: Hasher): WordArray = js.native
  def apply(password: WordArray, salt: String): WordArray = js.native
  def apply(password: WordArray, salt: String, cfg: Hasher): WordArray = js.native
  def apply(password: WordArray, salt: WordArray): WordArray = js.native
  def apply(password: WordArray, salt: WordArray, cfg: Hasher): WordArray = js.native
}
