package typingsSlinky.libp2pNoise

import typingsSlinky.libp2pNoise.basicMod.bytes
import typingsSlinky.libp2pNoise.basicMod.bytes32
import typingsSlinky.libp2pNoise.handshakeInterfaceMod.IHandshake
import typingsSlinky.libp2pNoise.libp2pMod.KeyPair
import typingsSlinky.libp2pNoise.noiseMod.WrappedConnection
import typingsSlinky.libp2pNoise.xxMod.XX
import typingsSlinky.peerId.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handshakeXxMod {
  
  @JSImport("libp2p-noise/dist/src/handshake-xx", "XXHandshake")
  @js.native
  class XXHandshake protected () extends IHandshake {
    def this(
      isInitiator: Boolean,
      payload: bytes,
      prologue: bytes32,
      staticKeypair: KeyPair,
      connection: WrappedConnection
    ) = this()
    def this(
      isInitiator: Boolean,
      payload: bytes,
      prologue: bytes32,
      staticKeypair: KeyPair,
      connection: WrappedConnection,
      remotePeer: ^
    ) = this()
    def this(
      isInitiator: Boolean,
      payload: bytes,
      prologue: bytes32,
      staticKeypair: KeyPair,
      connection: WrappedConnection,
      remotePeer: js.UndefOr[scala.Nothing],
      handshake: XX
    ) = this()
    def this(
      isInitiator: Boolean,
      payload: bytes,
      prologue: bytes32,
      staticKeypair: KeyPair,
      connection: WrappedConnection,
      remotePeer: ^,
      handshake: XX
    ) = this()
    
    var connection: WrappedConnection = js.native
    
    def exchange(): js.Promise[Unit] = js.native
    
    def finish(): js.Promise[Unit] = js.native
    
    var getCS: js.Any = js.native
    
    def getRemoteStaticKey(): bytes = js.native
    
    var isInitiator: Boolean = js.native
    
    var payload: bytes = js.native
    
    var prologue: js.Any = js.native
    
    def propose(): js.Promise[Unit] = js.native
    
    /* protected */ def setRemoteEarlyData(): Unit = js.native
    /* protected */ def setRemoteEarlyData(data: js.typedarray.Uint8Array): Unit = js.native
    
    var staticKeypair: KeyPair = js.native
    
    var xx: XX = js.native
  }
}
