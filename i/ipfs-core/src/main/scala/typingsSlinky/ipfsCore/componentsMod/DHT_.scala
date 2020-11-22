package typingsSlinky.ipfsCore.componentsMod

import typingsSlinky.ipfsCore.anon.AddrsArray
import typingsSlinky.ipfsCore.anon.AddrsId
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
trait DHT_ extends js.Object {
  
  def findPeer(peerId: typingsSlinky.cids.mod.^): js.Promise[AddrsId] = js.native
  def findPeer(peerId: typingsSlinky.cids.mod.^, options: AbortOptions): js.Promise[AddrsId] = js.native
  def findPeer(peerId: typingsSlinky.peerId.mod.^): js.Promise[AddrsId] = js.native
  def findPeer(peerId: typingsSlinky.peerId.mod.^, options: AbortOptions): js.Promise[AddrsId] = js.native
  
  def findProvs(cid: typingsSlinky.cids.mod.^): AsyncIterable[PeerInfo] = js.native
  def findProvs(cid: typingsSlinky.cids.mod.^, options: FindProvsOptions with AbortOptions): AsyncIterable[PeerInfo] = js.native
  
  def get(key: String): js.Promise[js.typedarray.Uint8Array] = js.native
  def get(key: String, options: AbortOptions): js.Promise[js.typedarray.Uint8Array] = js.native
  def get(key: js.typedarray.Uint8Array): js.Promise[js.typedarray.Uint8Array] = js.native
  def get(key: js.typedarray.Uint8Array, options: AbortOptions): js.Promise[js.typedarray.Uint8Array] = js.native
  
  def provide(cids: js.Array[typingsSlinky.cids.mod.^]): AsyncIterable[QueryEvent] = js.native
  def provide(cids: js.Array[typingsSlinky.cids.mod.^], options: ProvideOptions with AbortOptions): AsyncIterable[QueryEvent] = js.native
  def provide(cids: typingsSlinky.cids.mod.^): AsyncIterable[QueryEvent] = js.native
  def provide(cids: typingsSlinky.cids.mod.^, options: ProvideOptions with AbortOptions): AsyncIterable[QueryEvent] = js.native
  
  def put(key: js.typedarray.Uint8Array, value: js.typedarray.Uint8Array): AsyncIterable[QueryEvent] = js.native
  def put(key: js.typedarray.Uint8Array, value: js.typedarray.Uint8Array, options: AbortOptions): AsyncIterable[QueryEvent] = js.native
  
  def query(peerId: String): AsyncIterable[AddrsArray] = js.native
  def query(peerId: String, options: AbortOptions): AsyncIterable[AddrsArray] = js.native
  def query(peerId: typingsSlinky.peerId.mod.^): AsyncIterable[AddrsArray] = js.native
  def query(peerId: typingsSlinky.peerId.mod.^, options: AbortOptions): AsyncIterable[AddrsArray] = js.native
}
