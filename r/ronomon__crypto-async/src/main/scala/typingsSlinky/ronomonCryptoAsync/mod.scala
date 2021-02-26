package typingsSlinky.ronomonCryptoAsync

import typingsSlinky.node.Buffer
import typingsSlinky.ronomonCryptoAsync.ronomonCryptoAsyncNumbers.`0`
import typingsSlinky.ronomonCryptoAsync.ronomonCryptoAsyncNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line no-single-declare-module
object mod {
  
  @JSImport("@ronomon/crypto-async", "cipher")
  @js.native
  def cipher(
    algorithm: String,
    cipherDirection: CipherDirection,
    key: Buffer,
    iv: Buffer,
    plaintext: Buffer,
    cb: js.Function2[/* error */ js.UndefOr[js.Error], /* ciphertext */ Buffer, Unit]
  ): Unit = js.native
  @JSImport("@ronomon/crypto-async", "cipher")
  @js.native
  def cipher(
    algorithm: String,
    cipherDirection: CipherDirection,
    key: Buffer,
    keyOffset: Double,
    keySize: Double,
    iv: Buffer,
    ivOffset: Double,
    ivSize: Double,
    source: Buffer,
    sourceOffset: Double,
    sourceSize: Double,
    target: Buffer,
    targetOffset: Double,
    cb: js.Function2[/* error */ js.UndefOr[js.Error], /* targetSize */ Double, Unit]
  ): Unit = js.native
  
  @JSImport("@ronomon/crypto-async", "hash")
  @js.native
  def hash(
    algorithm: String,
    source: Buffer,
    cb: js.Function2[/* error */ js.UndefOr[js.Error], /* hash */ Buffer, Unit]
  ): Unit = js.native
  @JSImport("@ronomon/crypto-async", "hash")
  @js.native
  def hash(
    algorithm: String,
    source: Buffer,
    sourceOffset: Double,
    sourceSize: Double,
    target: Buffer,
    targetOffset: Double,
    cb: js.Function2[/* error */ js.UndefOr[js.Error], /* targetSize */ Double, Unit]
  ): Unit = js.native
  
  @JSImport("@ronomon/crypto-async", "hmac")
  @js.native
  def hmac(
    algorithm: String,
    key: Buffer,
    keyOffset: Double,
    keySize: Double,
    source: Buffer,
    sourceOffset: Double,
    sourceSize: Double,
    target: Buffer,
    targetOffset: Double,
    cb: js.Function2[/* error */ js.UndefOr[js.Error], /* targetSize */ Double, Unit]
  ): Unit = js.native
  @JSImport("@ronomon/crypto-async", "hmac")
  @js.native
  def hmac(
    algorithm: String,
    key: Buffer,
    source: Buffer,
    cb: js.Function2[/* error */ js.UndefOr[js.Error], /* hmac */ Buffer, Unit]
  ): Unit = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.ronomonCryptoAsync.ronomonCryptoAsyncNumbers.`0`
    - typingsSlinky.ronomonCryptoAsync.ronomonCryptoAsyncNumbers.`1`
  */
  trait CipherDirection extends StObject
  object CipherDirection {
    
    @scala.inline
    def Decrypt: `0` = 0.asInstanceOf[`0`]
    
    @scala.inline
    def Encrypt: `1` = 1.asInstanceOf[`1`]
  }
}
