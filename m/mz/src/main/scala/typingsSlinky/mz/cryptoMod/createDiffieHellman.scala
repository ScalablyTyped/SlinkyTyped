package typingsSlinky.mz.cryptoMod

import typingsSlinky.node.NodeJS.ArrayBufferView
import typingsSlinky.node.cryptoMod.HexBase64Latin1Encoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mz/crypto", "createDiffieHellman")
@js.native
object createDiffieHellman extends js.Object {
  
  def apply(prime_length: Double): typingsSlinky.node.cryptoMod.DiffieHellman_ = js.native
  def apply(prime_length: Double, generator: Double): typingsSlinky.node.cryptoMod.DiffieHellman_ = js.native
  def apply(prime_length: Double, generator: ArrayBufferView): typingsSlinky.node.cryptoMod.DiffieHellman_ = js.native
  def apply(prime: String, prime_encoding: HexBase64Latin1Encoding): typingsSlinky.node.cryptoMod.DiffieHellman_ = js.native
  def apply(
    prime: String,
    prime_encoding: HexBase64Latin1Encoding,
    generator: String,
    generator_encoding: HexBase64Latin1Encoding
  ): typingsSlinky.node.cryptoMod.DiffieHellman_ = js.native
  def apply(prime: String, prime_encoding: HexBase64Latin1Encoding, generator: Double): typingsSlinky.node.cryptoMod.DiffieHellman_ = js.native
  def apply(prime: String, prime_encoding: HexBase64Latin1Encoding, generator: ArrayBufferView): typingsSlinky.node.cryptoMod.DiffieHellman_ = js.native
  def apply(prime: ArrayBufferView): typingsSlinky.node.cryptoMod.DiffieHellman_ = js.native
}
