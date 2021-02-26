package typingsSlinky.libp2pNoise

import typingsSlinky.libp2pNoise.basicMod.bytes
import typingsSlinky.libp2pNoise.basicMod.bytes32
import typingsSlinky.libp2pNoise.handshakeXxMod.XXHandshake
import typingsSlinky.libp2pNoise.libp2pMod.KeyPair
import typingsSlinky.libp2pNoise.noiseMod.WrappedConnection
import typingsSlinky.libp2pNoise.xxMod.XX
import typingsSlinky.peerId.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handshakeXxFallbackMod {
  
  @JSImport("libp2p-noise/dist/src/handshake-xx-fallback", "XXFallbackHandshake")
  @js.native
  class XXFallbackHandshake protected () extends XXHandshake {
    def this(
      isInitiator: Boolean,
      payload: bytes,
      prologue: bytes32,
      staticKeypair: KeyPair,
      connection: WrappedConnection,
      initialMsg: bytes
    ) = this()
    def this(
      isInitiator: Boolean,
      payload: bytes,
      prologue: bytes32,
      staticKeypair: KeyPair,
      connection: WrappedConnection,
      initialMsg: bytes,
      remotePeer: ^
    ) = this()
    def this(
      isInitiator: Boolean,
      payload: bytes,
      prologue: bytes32,
      staticKeypair: KeyPair,
      connection: WrappedConnection,
      initialMsg: bytes,
      remotePeer: js.UndefOr[scala.Nothing],
      ephemeralKeys: KeyPair
    ) = this()
    def this(
      isInitiator: Boolean,
      payload: bytes,
      prologue: bytes32,
      staticKeypair: KeyPair,
      connection: WrappedConnection,
      initialMsg: bytes,
      remotePeer: ^,
      ephemeralKeys: KeyPair
    ) = this()
    def this(
      isInitiator: Boolean,
      payload: bytes,
      prologue: bytes32,
      staticKeypair: KeyPair,
      connection: WrappedConnection,
      initialMsg: bytes,
      remotePeer: js.UndefOr[scala.Nothing],
      ephemeralKeys: js.UndefOr[scala.Nothing],
      handshake: XX
    ) = this()
    def this(
      isInitiator: Boolean,
      payload: bytes,
      prologue: bytes32,
      staticKeypair: KeyPair,
      connection: WrappedConnection,
      initialMsg: bytes,
      remotePeer: js.UndefOr[scala.Nothing],
      ephemeralKeys: KeyPair,
      handshake: XX
    ) = this()
    def this(
      isInitiator: Boolean,
      payload: bytes,
      prologue: bytes32,
      staticKeypair: KeyPair,
      connection: WrappedConnection,
      initialMsg: bytes,
      remotePeer: ^,
      ephemeralKeys: js.UndefOr[scala.Nothing],
      handshake: XX
    ) = this()
    def this(
      isInitiator: Boolean,
      payload: bytes,
      prologue: bytes32,
      staticKeypair: KeyPair,
      connection: WrappedConnection,
      initialMsg: bytes,
      remotePeer: ^,
      ephemeralKeys: KeyPair,
      handshake: XX
    ) = this()
    
    var ephemeralKeys: js.Any = js.native
    
    var initialMsg: js.Any = js.native
  }
}
