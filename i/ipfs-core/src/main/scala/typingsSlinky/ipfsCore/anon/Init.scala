package typingsSlinky.ipfsCore.anon

import typingsSlinky.cids.mod.^
import typingsSlinky.ipfsCore.addAllMod.AddAllOptions
import typingsSlinky.ipfsCore.addAllMod.UnixFSEntry
import typingsSlinky.ipfsCore.addMod.AddOptions
import typingsSlinky.ipfsCore.catMod.CatOptions
import typingsSlinky.ipfsCore.componentsGetMod.GetOptions
import typingsSlinky.ipfsCore.componentsLsMod.LSOptions
import typingsSlinky.ipfsCore.componentsMod.Block_
import typingsSlinky.ipfsCore.componentsMod.DAG_
import typingsSlinky.ipfsCore.componentsMod.Pin_
import typingsSlinky.ipfsCore.componentsVersionMod.Version
import typingsSlinky.ipfsCore.dnsMod.DNSSettings
import typingsSlinky.ipfsCore.filesMod.MFS
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
trait Init extends js.Object {
  
  def add(
    source: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.FileInput */ js.Any
  ): js.Promise[UnixFSEntry] = js.native
  def add(
    source: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.FileInput */ js.Any,
    options: AddOptions with AbortOptions
  ): js.Promise[UnixFSEntry] = js.native
  
  def addAll(
    source: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.Source */ js.Any
  ): AsyncIterable[UnixFSEntry] = js.native
  def addAll(
    source: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.Source */ js.Any,
    options: AddAllOptions with AbortOptions
  ): AsyncIterable[UnixFSEntry] = js.native
  
  var bitswap: Unwant = js.native
  
  var block: Block_ = js.native
  
  var bootstrap: Clear = js.native
  
  def cat(ipfsPath: String): AsyncIterable[js.typedarray.Uint8Array] = js.native
  def cat(ipfsPath: String, options: CatOptions with AbortOptions): AsyncIterable[js.typedarray.Uint8Array] = js.native
  def cat(ipfsPath: ^): AsyncIterable[js.typedarray.Uint8Array] = js.native
  def cat(ipfsPath: ^, options: CatOptions with AbortOptions): AsyncIterable[js.typedarray.Uint8Array] = js.native
  
  var config: typingsSlinky.ipfsCore.configMod.Config = js.native
  
  var dag: DAG_ = js.native
  
  var dht: FindProvs | Get = js.native
  
  def dns(domain: String): js.Promise[String] = js.native
  def dns(domain: String, options: DNSSettings with AbortOptions): js.Promise[String] = js.native
  
  var files: js.UndefOr[MFS] = js.native
  
  def get(ipfsPath: String): AsyncIterable[File | Directory] = js.native
  def get(ipfsPath: String, options: GetOptions with AbortOptions): AsyncIterable[File | Directory] = js.native
  def get(ipfsPath: ^): AsyncIterable[File | Directory] = js.native
  def get(ipfsPath: ^, options: GetOptions with AbortOptions): AsyncIterable[File | Directory] = js.native
  
  def id(): js.Promise[typingsSlinky.ipfsCore.idMod.PeerId] = js.native
  def id(_options: AbortOptions): js.Promise[typingsSlinky.ipfsCore.idMod.PeerId] = js.native
  
  def init(): js.Promise[scala.Nothing] = js.native
  
  var ipld: TypeofimportedComponents = js.native
  
  def isOnline(): Boolean = js.native
  
  var key: Export = js.native
  
  var libp2p: js.Any = js.native
  
  def ls(ipfsPath: String): AsyncIterable[File | Directory] = js.native
  def ls(ipfsPath: String, options: LSOptions with AbortOptions): AsyncIterable[File | Directory] = js.native
  def ls(ipfsPath: ^): AsyncIterable[File | Directory] = js.native
  def ls(ipfsPath: ^, options: LSOptions with AbortOptions): AsyncIterable[File | Directory] = js.native
  
  var name: Publish = js.native
  
  var `object`: Data = js.native
  
  var pin: Pin_ = js.native
  
  def ping(peerId: typingsSlinky.peerId.mod.^): AsyncIterable[Pong | PingFailure | StatusUpdate] = js.native
  def ping(peerId: typingsSlinky.peerId.mod.^, options: PingSettings with AbortOptions): AsyncIterable[Pong | PingFailure | StatusUpdate] = js.native
  
  var pubsub: Ls = js.native
  
  def refs(): AsyncGenerator[Ref, Unit, _] = js.native
  def refs(ipfsPath: js.UndefOr[scala.Nothing], options: js.Any): AsyncGenerator[Ref, Unit, _] = js.native
  def refs(ipfsPath: js.Any): AsyncGenerator[Ref, Unit, _] = js.native
  def refs(ipfsPath: js.Any, options: js.Any): AsyncGenerator[Ref, Unit, _] = js.native
  @JSName("refs")
  var refs_Original: (js.Function2[
    /* ipfsPath */ js.UndefOr[js.Any], 
    /* options */ js.UndefOr[js.Any], 
    AsyncGenerator[Ref, Unit, _]
  ]) with Local = js.native
  
  var repo: Gc = js.native
  
  def resolve(path: String): js.Promise[String] = js.native
  def resolve(path: String, opts: ResolveSettings with AbortOptions): js.Promise[String] = js.native
  
  def start(): js.Object = js.native
  
  var stats: Bw = js.native
  
  def stop(_options: AbortOptions): js.Promise[Unit] = js.native
  
  var swarm: Connect = js.native
  
  def version(): js.Promise[Version] = js.native
  def version(options: AbortOptions): js.Promise[Version] = js.native
}
