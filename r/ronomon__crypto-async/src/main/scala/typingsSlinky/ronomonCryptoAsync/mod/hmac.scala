package typingsSlinky.ronomonCryptoAsync.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ronomon/crypto-async", "hmac")
@js.native
object hmac extends js.Object {
  
  def apply(
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
  def apply(
    algorithm: String,
    key: Buffer,
    source: Buffer,
    cb: js.Function2[/* error */ js.UndefOr[js.Error], /* hmac */ Buffer, Unit]
  ): Unit = js.native
}
