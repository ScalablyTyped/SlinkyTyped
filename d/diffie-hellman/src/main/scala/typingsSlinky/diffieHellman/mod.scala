package typingsSlinky.diffieHellman

import typingsSlinky.node.NodeJS.ArrayBufferView
import typingsSlinky.node.cryptoMod.HexBase64Latin1Encoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("diffie-hellman", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def createDiffieHellman(prime_length: Double): typingsSlinky.node.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(prime_length: Double, generator: Double): typingsSlinky.node.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(prime_length: Double, generator: ArrayBufferView): typingsSlinky.node.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(prime: String, prime_encoding: HexBase64Latin1Encoding): typingsSlinky.node.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(
    prime: String,
    prime_encoding: HexBase64Latin1Encoding,
    generator: String,
    generator_encoding: HexBase64Latin1Encoding
  ): typingsSlinky.node.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(prime: String, prime_encoding: HexBase64Latin1Encoding, generator: Double): typingsSlinky.node.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(prime: String, prime_encoding: HexBase64Latin1Encoding, generator: ArrayBufferView): typingsSlinky.node.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(prime: ArrayBufferView): typingsSlinky.node.cryptoMod.DiffieHellman = js.native
  
  def getDiffieHellman(group_name: String): typingsSlinky.node.cryptoMod.DiffieHellman = js.native
  
  @js.native
  class DiffieHellman protected ()
    extends typingsSlinky.node.cryptoMod.DiffieHellman
}
