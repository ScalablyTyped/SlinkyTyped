package typingsSlinky.libp2pNoise

import typingsSlinky.libp2pNoise.basicMod.bytes
import typingsSlinky.libp2pNoise.basicMod.bytes32
import typingsSlinky.libp2pNoise.handshakeMod.Hkdf
import typingsSlinky.libp2pNoise.libp2pMod.KeyPair
import typingsSlinky.libp2pNoise.payloadMod.pb.INoiseHandshakePayload
import typingsSlinky.peerId.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libp2p-noise/dist/src/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  def createHandshakePayload(libp2pPublicKey: js.typedarray.Uint8Array, signedPayload: js.typedarray.Uint8Array): bytes = js.native
  def createHandshakePayload(
    libp2pPublicKey: js.typedarray.Uint8Array,
    signedPayload: js.typedarray.Uint8Array,
    earlyData: js.typedarray.Uint8Array
  ): bytes = js.native
  
  def decodePayload(payload: bytes): INoiseHandshakePayload = js.native
  def decodePayload(payload: js.typedarray.Uint8Array): INoiseHandshakePayload = js.native
  
  def generateKeypair(): KeyPair = js.native
  
  def getHandshakePayload(publicKey: bytes): bytes = js.native
  
  def getHkdf(ck: bytes32, ikm: bytes): Hkdf = js.native
  
  def getPayload(localPeer: ^, staticPublicKey: bytes): js.Promise[bytes] = js.native
  def getPayload(localPeer: ^, staticPublicKey: bytes, earlyData: bytes): js.Promise[bytes] = js.native
  
  def getPeerIdFromPayload(payload: INoiseHandshakePayload): js.Promise[^] = js.native
  
  def isValidPublicKey(pk: bytes): Boolean = js.native
  
  def signPayload(peerId: ^, payload: bytes): js.Promise[bytes] = js.native
  
  def verifySignedPayload(noiseStaticKey: bytes, payload: INoiseHandshakePayload, remotePeer: ^): js.Promise[^] = js.native
}
