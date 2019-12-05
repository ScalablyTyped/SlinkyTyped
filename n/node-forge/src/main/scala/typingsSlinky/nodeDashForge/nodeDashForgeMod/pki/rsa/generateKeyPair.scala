package typingsSlinky.nodeDashForge.nodeDashForgeMod.pki.rsa

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "pki.rsa.generateKeyPair")
@js.native
object generateKeyPair extends js.Object {
  def apply(): typingsSlinky.nodeDashForge.nodeDashForgeMod.pki.rsa.KeyPair = js.native
  def apply(bits: Double): typingsSlinky.nodeDashForge.nodeDashForgeMod.pki.rsa.KeyPair = js.native
  def apply(bits: Double, e: Double): typingsSlinky.nodeDashForge.nodeDashForgeMod.pki.rsa.KeyPair = js.native
  def apply(
    bits: Double,
    e: Double,
    callback: js.Function2[
      /* err */ js.Error, 
      /* keypair */ typingsSlinky.nodeDashForge.nodeDashForgeMod.pki.rsa.KeyPair, 
      Unit
    ]
  ): typingsSlinky.nodeDashForge.nodeDashForgeMod.pki.rsa.KeyPair = js.native
  def apply(options: GenerateKeyPairOptions): typingsSlinky.nodeDashForge.nodeDashForgeMod.pki.rsa.KeyPair = js.native
  def apply(
    options: GenerateKeyPairOptions,
    callback: js.Function2[
      /* err */ Error, 
      /* keypair */ typingsSlinky.nodeDashForge.nodeDashForgeMod.pki.rsa.KeyPair, 
      Unit
    ]
  ): typingsSlinky.nodeDashForge.nodeDashForgeMod.pki.rsa.KeyPair = js.native
}

