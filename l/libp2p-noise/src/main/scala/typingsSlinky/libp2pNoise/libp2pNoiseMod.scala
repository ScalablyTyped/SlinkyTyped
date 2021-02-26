package typingsSlinky.libp2pNoise

import typingsSlinky.libp2pNoise.basicMod.bytes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libp2pNoiseMod {
  
  @JSImport("libp2p-noise", "NOISE")
  @js.native
  val NOISE_ : typingsSlinky.libp2pNoise.noiseMod.Noise = js.native
  
  @JSImport("libp2p-noise", "Noise")
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
