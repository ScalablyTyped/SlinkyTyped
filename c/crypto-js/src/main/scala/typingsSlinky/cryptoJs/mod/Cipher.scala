package typingsSlinky.cryptoJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cipher extends Base {
  
  def createDecryptor(secretPassphrase: String): Decryptor = js.native
  def createDecryptor(secretPassphrase: String, option: CipherOption): Decryptor = js.native
  
  def createEncryptor(secretPassphrase: String): Encryptor = js.native
  def createEncryptor(secretPassphrase: String, option: CipherOption): Encryptor = js.native
}
