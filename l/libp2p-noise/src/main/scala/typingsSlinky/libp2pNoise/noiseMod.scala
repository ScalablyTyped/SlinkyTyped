package typingsSlinky.libp2pNoise

import typingsSlinky.libp2pNoise.anon.FnCall
import typingsSlinky.libp2pNoise.basicMod.bytes
import typingsSlinky.libp2pNoise.libp2pMod.INoiseConnection
import typingsSlinky.libp2pNoise.libp2pMod.SecureOutbound
import typingsSlinky.peerId.mod.^
import typingsSlinky.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noiseMod {
  
  @JSImport("libp2p-noise/dist/src/noise", "Noise")
  @js.native
  /**
    *
    * @param {bytes} staticNoiseKey x25519 private key, reuse for faster handshakes
    * @param {bytes} earlyData
    */
  class Noise () extends INoiseConnection {
    def this(staticNoiseKey: bytes) = this()
    def this(staticNoiseKey: js.UndefOr[scala.Nothing], earlyData: bytes) = this()
    def this(staticNoiseKey: bytes, earlyData: bytes) = this()
    
    var createSecureConnection: js.Any = js.native
    
    val earlyData: js.Any = js.native
    
    /**
      * If Noise pipes supported, tries IK handshake first with XX as fallback if it fails.
      * If noise pipes disabled or remote peer static key is unknown, use XX.
      * @param {HandshakeParams} params
      */
    var performHandshake: js.Any = js.native
    
    var performIKHandshake: js.Any = js.native
    
    var performXXFallbackHandshake: js.Any = js.native
    
    var performXXHandshake: js.Any = js.native
    
    val prologue: js.Any = js.native
    
    var protocol: String = js.native
    
    /**
      * Decrypt incoming data (handshake as responder).
      * @param {PeerId} localPeer - PeerId of the receiving peer.
      * @param {any} connection - streaming iterable duplex that will be encryption.
      * @param {PeerId} remotePeer - optional PeerId of the initiating peer, if known. This may only exist during transport upgrades.
      * @returns {Promise<SecureOutbound>}
      */
    def secureInbound(localPeer: ^, connection: js.Any): js.Promise[SecureOutbound] = js.native
    
    val staticKeys: js.Any = js.native
    
    var useNoisePipes: js.Any = js.native
  }
  
  type WrappedConnection = ReturnType[FnCall]
}
