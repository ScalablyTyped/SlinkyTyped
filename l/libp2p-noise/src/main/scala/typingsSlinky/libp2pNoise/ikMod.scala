package typingsSlinky.libp2pNoise

import typingsSlinky.libp2pNoise.abstractHandshakeMod.AbstractHandshake
import typingsSlinky.libp2pNoise.anon.Plaintext
import typingsSlinky.libp2pNoise.basicMod.bytes
import typingsSlinky.libp2pNoise.basicMod.bytes32
import typingsSlinky.libp2pNoise.handshakeMod.MessageBuffer
import typingsSlinky.libp2pNoise.handshakeMod.NoiseSession
import typingsSlinky.libp2pNoise.libp2pMod.KeyPair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ikMod {
  
  @JSImport("libp2p-noise/dist/src/handshakes/ik", "IK")
  @js.native
  class IK () extends AbstractHandshake {
    
    def initSession(initiator: Boolean, prologue: bytes32, s: KeyPair, rs: bytes32): NoiseSession = js.native
    
    var initializeInitiator: js.Any = js.native
    
    var initializeResponder: js.Any = js.native
    
    var readMessageA: js.Any = js.native
    
    var readMessageB: js.Any = js.native
    
    def recvMessage(session: NoiseSession, message: MessageBuffer): Plaintext = js.native
    
    def sendMessage(session: NoiseSession, message: bytes): MessageBuffer = js.native
    
    var writeMessageA: js.Any = js.native
    
    var writeMessageB: js.Any = js.native
  }
}
