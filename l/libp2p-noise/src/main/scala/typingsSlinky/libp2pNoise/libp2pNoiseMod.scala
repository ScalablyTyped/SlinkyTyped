package typingsSlinky.libp2pNoise

import typingsSlinky.libp2pNoise.basicMod.bytes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libp2p-noise", JSImport.Namespace)
@js.native
object libp2pNoiseMod extends js.Object {
  
  @JSName("NOISE")
  val NOISE_ : typingsSlinky.libp2pNoise.noiseMod.Noise = js.native
  
  @js.native
  /**
    *
    * @param {bytes} staticNoiseKey x25519 private key, reuse for faster handshakes
    * @param {bytes} earlyData
    */
  class Noise ()
    extends typingsSlinky.libp2pNoise.noiseMod.Noise {
    def this(staticNoiseKey: bytes) = this()
    def this(staticNoiseKey: js.UndefOr[scala.Nothing], earlyData: bytes) = this()
    def this(staticNoiseKey: bytes, earlyData: bytes) = this()
  }
}
