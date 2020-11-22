package typingsSlinky.ipfsCore.anon

import typingsSlinky.cids.mod.^
import typingsSlinky.ipfsCore.catMod.CatOptions
import typingsSlinky.ipfsCore.componentsLsMod.LSOptions
import typingsSlinky.ipfsCore.componentsVersionMod.Version
import typingsSlinky.ipfsCore.dagGetMod.GetOptions
import typingsSlinky.ipfsCore.dnsMod.DNSSettings
import typingsSlinky.ipfsCore.filesMod.MFS
import typingsSlinky.ipfsCore.nameResolveMod.ResolveSettings
import typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions
import typingsSlinky.ipfsCore.srcUtilsMod.Directory
import typingsSlinky.ipfsCore.srcUtilsMod.File
import typingsSlinky.std.AsyncGenerator
import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cat extends js.Object {
  
  var add: js.Any = js.native
  
  var addAll: js.Any = js.native
  
  var bitswap: Stat = js.native
  
  var block: js.Any = js.native
  
  var bootstrap: Add = js.native
  
  def cat(ipfsPath: String): AsyncIterable[js.typedarray.Uint8Array] = js.native
  def cat(ipfsPath: String, options: CatOptions with AbortOptions): AsyncIterable[js.typedarray.Uint8Array] = js.native
  def cat(ipfsPath: ^): AsyncIterable[js.typedarray.Uint8Array] = js.native
  def cat(ipfsPath: ^, options: CatOptions with AbortOptions): AsyncIterable[js.typedarray.Uint8Array] = js.native
  
  var config: typingsSlinky.ipfsCore.configMod.Config = js.native
  
  var dag: js.Any = js.native
  
  def dns(domain: String): js.Promise[String] = js.native
  def dns(domain: String, options: DNSSettings with AbortOptions): js.Promise[String] = js.native
  
  var files: MFS = js.native
  
  def get(ipfsPath: String): AsyncIterable[File | Directory] = js.native
  def get(ipfsPath: String, options: GetOptions with AbortOptions): AsyncIterable[File | Directory] = js.native
  def get(ipfsPath: ^): AsyncIterable[File | Directory] = js.native
  def get(ipfsPath: ^, options: GetOptions with AbortOptions): AsyncIterable[File | Directory] = js.native
  
  def id(): js.Promise[typingsSlinky.ipfsCore.idMod.PeerId] = js.native
  def id(_options: AbortOptions): js.Promise[typingsSlinky.ipfsCore.idMod.PeerId] = js.native
  
  def init(): js.Promise[scala.Nothing] = js.native
  
  def isOnline(): Boolean = js.native
  
  var key: Export = js.native
  
  def ls(ipfsPath: String): AsyncIterable[File | Directory] = js.native
  def ls(ipfsPath: String, options: LSOptions with AbortOptions): AsyncIterable[File | Directory] = js.native
  def ls(ipfsPath: ^): AsyncIterable[File | Directory] = js.native
  def ls(ipfsPath: ^, options: LSOptions with AbortOptions): AsyncIterable[File | Directory] = js.native
  
  var `object`: js.Any = js.native
  
  var pin: js.Any = js.native
  
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
  
  def start(): js.Promise[Bootstrap] = js.native
  
  var stats: BitswapBw = js.native
  
  def stop(): Unit = js.native
  
  var swarm: Disconnect = js.native
  
  def version(): js.Promise[Version] = js.native
  def version(options: AbortOptions): js.Promise[Version] = js.native
}
