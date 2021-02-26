package typingsSlinky.ethereumCryptography

import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ethereum-cryptography/aes", "decrypt")
  @js.native
  def decrypt(cypherText: Buffer, key: Buffer, iv: Buffer): Buffer = js.native
  @JSImport("ethereum-cryptography/aes", "decrypt")
  @js.native
  def decrypt(
    cypherText: Buffer,
    key: Buffer,
    iv: Buffer,
    mode: js.UndefOr[scala.Nothing],
    pkcs7PaddingEnabled: Boolean
  ): Buffer = js.native
  @JSImport("ethereum-cryptography/aes", "decrypt")
  @js.native
  def decrypt(cypherText: Buffer, key: Buffer, iv: Buffer, mode: String): Buffer = js.native
  @JSImport("ethereum-cryptography/aes", "decrypt")
  @js.native
  def decrypt(cypherText: Buffer, key: Buffer, iv: Buffer, mode: String, pkcs7PaddingEnabled: Boolean): Buffer = js.native
  
  @JSImport("ethereum-cryptography/aes", "encrypt")
  @js.native
  def encrypt(msg: Buffer, key: Buffer, iv: Buffer): Buffer = js.native
  @JSImport("ethereum-cryptography/aes", "encrypt")
  @js.native
  def encrypt(
    msg: Buffer,
    key: Buffer,
    iv: Buffer,
    mode: js.UndefOr[scala.Nothing],
    pkcs7PaddingEnabled: Boolean
  ): Buffer = js.native
  @JSImport("ethereum-cryptography/aes", "encrypt")
  @js.native
  def encrypt(msg: Buffer, key: Buffer, iv: Buffer, mode: String): Buffer = js.native
  @JSImport("ethereum-cryptography/aes", "encrypt")
  @js.native
  def encrypt(msg: Buffer, key: Buffer, iv: Buffer, mode: String, pkcs7PaddingEnabled: Boolean): Buffer = js.native
}
