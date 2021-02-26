package typingsSlinky.libp2pNoise

import typingsSlinky.libp2pNoise.basicMod.bytes
import typingsSlinky.libp2pNoise.basicMod.bytes32
import typingsSlinky.libp2pNoise.handshakeMod.Hkdf
import typingsSlinky.libp2pNoise.libp2pMod.KeyPair
import typingsSlinky.libp2pNoise.payloadMod.pb.INoiseHandshakePayload
import typingsSlinky.peerId.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("libp2p-noise/dist/src/utils", "createHandshakePayload")
  @js.native
  def createHandshakePayload(libp2pPublicKey: js.typedarray.Uint8Array, signedPayload: js.typedarray.Uint8Array): bytes = js.native
  @JSImport("libp2p-noise/dist/src/utils", "createHandshakePayload")
  @js.native
  def createHandshakePayload(
    libp2pPublicKey: js.typedarray.Uint8Array,
    signedPayload: js.typedarray.Uint8Array,
    earlyData: js.typedarray.Uint8Array
  ): bytes = js.native
  
  @JSImport("libp2p-noise/dist/src/utils", "decodePayload")
  @js.native
  def decodePayload(payload: js.typedarray.Uint8Array): INoiseHandshakePayload = js.native
  @JSImport("libp2p-noise/dist/src/utils", "decodePayload")
  @js.native
  def decodePayload(payload: bytes): INoiseHandshakePayload = js.native
  
  @JSImport("libp2p-noise/dist/src/utils", "generateKeypair")
  @js.native
  def generateKeypair(): KeyPair = js.native
  
  @JSImport("libp2p-noise/dist/src/utils", "getHandshakePayload")
  @js.native
  def getHandshakePayload(publicKey: bytes): bytes = js.native
  
  @JSImport("libp2p-noise/dist/src/utils", "getHkdf")
  @js.native
  def getHkdf(ck: bytes32, ikm: bytes): Hkdf = js.native
  
  @JSImport("libp2p-noise/dist/src/utils", "getPayload")
  @js.native
  def getPayload(localPeer: ^, staticPublicKey: bytes): js.Promise[bytes] = js.native
  @JSImport("libp2p-noise/dist/src/utils", "getPayload")
  @js.native
  def getPayload(localPeer: ^, staticPublicKey: bytes, earlyData: bytes): js.Promise[bytes] = js.native
  
  @JSImport("libp2p-noise/dist/src/utils", "getPeerIdFromPayload")
  @js.native
  def getPeerIdFromPayload(payload: INoiseHandshakePayload): js.Promise[^] = js.native
  
  @JSImport("libp2p-noise/dist/src/utils", "isValidPublicKey")
  @js.native
  def isValidPublicKey(pk: bytes): Boolean = js.native
  
  @JSImport("libp2p-noise/dist/src/utils", "signPayload")
  @js.native
  def signPayload(peerId: ^, payload: bytes): js.Promise[bytes] = js.native
  
  @JSImport("libp2p-noise/dist/src/utils", "verifySignedPayload")
  @js.native
  def verifySignedPayload(noiseStaticKey: bytes, payload: INoiseHandshakePayload, remotePeer: ^): js.Promise[^] = js.native
}
