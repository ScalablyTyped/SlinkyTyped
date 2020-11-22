package typingsSlinky.ipfsCore.anon

import typingsSlinky.cids.mod.^
import typingsSlinky.ipfsCore.dhtMod.FindProvsOptions
import typingsSlinky.ipfsCore.dhtMod.PeerInfo
import typingsSlinky.ipfsCore.dhtMod.ProvideOptions
import typingsSlinky.ipfsCore.dhtMod.QueryEvent
import typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions
import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindProvs extends js.Object {
  
  def findPeer(peerId: ^): js.Promise[AddrsId] = js.native
  def findPeer(peerId: ^, options: AbortOptions): js.Promise[AddrsId] = js.native
  def findPeer(peerId: typingsSlinky.peerId.mod.^): js.Promise[AddrsId] = js.native
  def findPeer(peerId: typingsSlinky.peerId.mod.^, options: AbortOptions): js.Promise[AddrsId] = js.native
  
  def findProvs(cid: ^): AsyncIterable[PeerInfo] = js.native
  def findProvs(cid: ^, options: FindProvsOptions with AbortOptions): AsyncIterable[PeerInfo] = js.native
  
  def get(key: String): js.Promise[js.typedarray.Uint8Array] = js.native
  def get(key: String, options: AbortOptions): js.Promise[js.typedarray.Uint8Array] = js.native
  def get(key: js.typedarray.Uint8Array): js.Promise[js.typedarray.Uint8Array] = js.native
  def get(key: js.typedarray.Uint8Array, options: AbortOptions): js.Promise[js.typedarray.Uint8Array] = js.native
  
  def provide(cids: js.Array[^]): AsyncIterable[QueryEvent] = js.native
  def provide(cids: js.Array[^], options: ProvideOptions with AbortOptions): AsyncIterable[QueryEvent] = js.native
  def provide(cids: ^): AsyncIterable[QueryEvent] = js.native
  def provide(cids: ^, options: ProvideOptions with AbortOptions): AsyncIterable[QueryEvent] = js.native
  
  def put(key: js.typedarray.Uint8Array, value: js.typedarray.Uint8Array): AsyncIterable[QueryEvent] = js.native
  def put(key: js.typedarray.Uint8Array, value: js.typedarray.Uint8Array, options: AbortOptions): AsyncIterable[QueryEvent] = js.native
  
  def query(peerId: String): AsyncIterable[AddrsArray] = js.native
  def query(peerId: String, options: AbortOptions): AsyncIterable[AddrsArray] = js.native
  def query(peerId: typingsSlinky.peerId.mod.^): AsyncIterable[AddrsArray] = js.native
  def query(peerId: typingsSlinky.peerId.mod.^, options: AbortOptions): AsyncIterable[AddrsArray] = js.native
}
