package typingsSlinky.ipfsCore.componentsMod

import typingsSlinky.ipfsCore.addAllMod.UnixFSEntry
import typingsSlinky.ipfsCore.addMod.AddOptions
import typingsSlinky.ipfsCore.anon.Dht
import typingsSlinky.ipfsCore.anon.Files
import typingsSlinky.ipfsCore.anon.Ref
import typingsSlinky.ipfsCore.catMod.CatOptions
import typingsSlinky.ipfsCore.componentsLsMod.LSOptions
import typingsSlinky.ipfsCore.componentsVersionMod.Version
import typingsSlinky.ipfsCore.dagGetMod.GetOptions
import typingsSlinky.ipfsCore.dnsMod.DNSSettings
import typingsSlinky.ipfsCore.nameResolveMod.ResolveSettings
import typingsSlinky.ipfsCore.pingMod.PingFailure
import typingsSlinky.ipfsCore.pingMod.PingSettings
import typingsSlinky.ipfsCore.pingMod.Pong
import typingsSlinky.ipfsCore.pingMod.StatusUpdate
import typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions
import typingsSlinky.ipfsCore.srcUtilsMod.Directory
import typingsSlinky.ipfsCore.srcUtilsMod.File
import typingsSlinky.std.AsyncGenerator
import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPFSAPI extends js.Object {
  
  def add(
    source: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.FileInput */ js.Any
  ): js.Promise[UnixFSEntry] = js.native
  def add(
    source: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.FileInput */ js.Any,
    options: AddOptions with AbortOptions
  ): js.Promise[UnixFSEntry] = js.native
  @JSName("add")
  var add_Original: Add_ = js.native
  
  var bitswap: BitSwap_ = js.native
  
  var block: Block_ = js.native
  
  var bootstrap: Bootstrap_ = js.native
  
  def cat(ipfsPath: String): AsyncIterable[js.typedarray.Uint8Array] = js.native
  def cat(ipfsPath: String, options: CatOptions with AbortOptions): AsyncIterable[js.typedarray.Uint8Array] = js.native
  def cat(ipfsPath: typingsSlinky.cids.mod.^): AsyncIterable[js.typedarray.Uint8Array] = js.native
  def cat(ipfsPath: typingsSlinky.cids.mod.^, options: CatOptions with AbortOptions): AsyncIterable[js.typedarray.Uint8Array] = js.native
  @JSName("cat")
  var cat_Original: Cat_ = js.native
  
  var config: Config_ = js.native
  
  var dag: DAG_ = js.native
  
  var dht: DHT_ = js.native
  
  def dns(domain: String): js.Promise[String] = js.native
  def dns(domain: String, options: DNSSettings with AbortOptions): js.Promise[String] = js.native
  @JSName("dns")
  var dns_Original: DNS_ = js.native
  
  var files: Files_ = js.native
  
  def get(ipfsPath: String): AsyncIterable[File | Directory] = js.native
  def get(ipfsPath: String, options: GetOptions with AbortOptions): AsyncIterable[File | Directory] = js.native
  def get(ipfsPath: typingsSlinky.cids.mod.^): AsyncIterable[File | Directory] = js.native
  def get(ipfsPath: typingsSlinky.cids.mod.^, options: GetOptions with AbortOptions): AsyncIterable[File | Directory] = js.native
  @JSName("get")
  var get_Original: Get_ = js.native
  
  def id(): js.Promise[typingsSlinky.ipfsCore.idMod.PeerId] = js.native
  def id(_options: AbortOptions): js.Promise[typingsSlinky.ipfsCore.idMod.PeerId] = js.native
  @JSName("id")
  var id_Original: ID_ = js.native
  
  def init(): js.Promise[Files] = js.native
  def init(options: js.Any): js.Promise[Files] = js.native
  @JSName("init")
  var init_Original: Init_ = js.native
  
  def isOnline(): Boolean = js.native
  @JSName("isOnline")
  var isOnline_Original: IsOnline_ = js.native
  
  var key: Key_ = js.native
  
  var libp2p: js.Any = js.native
  
  def ls(ipfsPath: String): AsyncIterable[File | Directory] = js.native
  def ls(ipfsPath: String, options: LSOptions with AbortOptions): AsyncIterable[File | Directory] = js.native
  def ls(ipfsPath: typingsSlinky.cids.mod.^): AsyncIterable[File | Directory] = js.native
  def ls(ipfsPath: typingsSlinky.cids.mod.^, options: LSOptions with AbortOptions): AsyncIterable[File | Directory] = js.native
  @JSName("ls")
  var ls_Original: LS_ = js.native
  
  var name: Name_ = js.native
  
  var `object`: ObjectAPI = js.native
  
  var pin: Pin_ = js.native
  
  def ping(peerId: typingsSlinky.peerId.mod.^): AsyncIterable[Pong | PingFailure | StatusUpdate] = js.native
  def ping(peerId: typingsSlinky.peerId.mod.^, options: PingSettings with AbortOptions): AsyncIterable[Pong | PingFailure | StatusUpdate] = js.native
  @JSName("ping")
  var ping_Original: Ping_ = js.native
  
  var pubsub: PubSub_ = js.native
  
  def refs(): AsyncGenerator[Ref, Unit, _] = js.native
  def refs(ipfsPath: js.UndefOr[scala.Nothing], options: js.Any): AsyncGenerator[Ref, Unit, _] = js.native
  def refs(ipfsPath: js.Any): AsyncGenerator[Ref, Unit, _] = js.native
  def refs(ipfsPath: js.Any, options: js.Any): AsyncGenerator[Ref, Unit, _] = js.native
  @JSName("refs")
  var refs_Original: Refs_ = js.native
  
  var repo: Repo_ = js.native
  
  def resolve(path: String): js.Promise[String] = js.native
  def resolve(path: String, opts: ResolveSettings with AbortOptions): js.Promise[String] = js.native
  @JSName("resolve")
  var resolve_Original: Resolve_ = js.native
  
  def start(): js.Promise[Dht] = js.native
  @JSName("start")
  var start_Original: Start_ = js.native
  
  var stats: Stats_ = js.native
  
  def stop(_options: AbortOptions): js.Promise[Unit] = js.native
  @JSName("stop")
  var stop_Original: Stop_ = js.native
  
  var swarm: Swarm_ = js.native
  
  def version(): js.Promise[Version] = js.native
  def version(options: AbortOptions): js.Promise[Version] = js.native
  @JSName("version")
  var version_Original: Version_ = js.native
}
