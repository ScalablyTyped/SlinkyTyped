package typingsSlinky.ipfsCore.anon

import typingsSlinky.cids.mod.^
import typingsSlinky.peerId.mod.CreateOptions
import typingsSlinky.peerId.mod.JSONPeerId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedPeerId extends js.Object {
  
  /**
    * Create a new PeerId.
    * @param opts Options.
    */
  def create(): js.Promise[typingsSlinky.peerId.mod.PeerId] = js.native
  def create(opts: CreateOptions): js.Promise[typingsSlinky.peerId.mod.PeerId] = js.native
  
  /**
    * Create PeerId from base58-encoded string.
    * @param str The base58-encoded string.
    */
  def createFromB58String(str: String): typingsSlinky.peerId.mod.PeerId = js.native
  
  /**
    * Create PeerId from raw bytes.
    * @param buf The raw bytes.
    */
  def createFromBytes(buf: js.typedarray.Uint8Array): typingsSlinky.peerId.mod.PeerId = js.native
  
  def createFromCID(cid: String): typingsSlinky.peerId.mod.PeerId = js.native
  def createFromCID(cid: js.Object): typingsSlinky.peerId.mod.PeerId = js.native
  /**
    * Create PeerId from CID.
    * @param cid The CID.
    */
  def createFromCID(cid: ^): typingsSlinky.peerId.mod.PeerId = js.native
  def createFromCID(cid: js.typedarray.Uint8Array): typingsSlinky.peerId.mod.PeerId = js.native
  
  /**
    * Create PeerId from hex string.
    * @param str The input hex string.
    */
  def createFromHexString(str: String): typingsSlinky.peerId.mod.PeerId = js.native
  
  /**
    * Create PeerId from PeerId JSON formatted object.
    * @see {@link PeerId#toJSON}
    * @param json PeerId in JSON format.
    */
  def createFromJSON(json: JSONPeerId): js.Promise[typingsSlinky.peerId.mod.PeerId] = js.native
  
  def createFromPrivKey(key: String): js.Promise[typingsSlinky.peerId.mod.PeerId] = js.native
  /**
    * Create PeerId from private key.
    * @param key Private key, as Uint8Array or base64-encoded string.
    */
  def createFromPrivKey(key: js.typedarray.Uint8Array): js.Promise[typingsSlinky.peerId.mod.PeerId] = js.native
  
  def createFromProtobuf(buf: String): js.Promise[typingsSlinky.peerId.mod.PeerId] = js.native
  /**
    * Create PeerId from Protobuf bytes.
    * @param buf Protobuf bytes, as Uint8Array or hex-encoded string.
    */
  def createFromProtobuf(buf: js.typedarray.Uint8Array): js.Promise[typingsSlinky.peerId.mod.PeerId] = js.native
  
  def createFromPubKey(key: String): js.Promise[typingsSlinky.peerId.mod.PeerId] = js.native
  /**
    * Create PeerId from public key.
    * @param key Public key, as Uint8Array or base64-encoded string.
    */
  def createFromPubKey(key: js.typedarray.Uint8Array): js.Promise[typingsSlinky.peerId.mod.PeerId] = js.native
  
  /**
    * Checks if a value is an instance of PeerId.
    * @param id The value to check.
    */
  def isPeerId(id: js.Any): /* is peer-id.peer-id.PeerId */ Boolean = js.native
}
