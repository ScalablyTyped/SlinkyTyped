package typingsSlinky.ipfsCore.startMod

import typingsSlinky.ipfsCore.dagGetMod.DagEntry
import typingsSlinky.ipfsCore.dagGetMod.GetOptions
import typingsSlinky.ipfsCore.dagPutMod.PutOptions
import typingsSlinky.ipfsCore.nameResolveMod.ResolveOptions
import typingsSlinky.ipfsCore.resolveMod.ResolveResult
import typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions
import typingsSlinky.ipfsCore.treeMod.TreeOptions
import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DAG extends js.Object {
  
  def get(ipfsPath: typingsSlinky.cids.mod.^): js.Promise[DagEntry] = js.native
  def get(ipfsPath: typingsSlinky.cids.mod.^, options: GetOptions with AbortOptions): js.Promise[DagEntry] = js.native
  
  def put(dagNode: js.Any): js.Promise[typingsSlinky.cids.mod.^] = js.native
  def put(dagNode: js.Any, options: PutOptions with AbortOptions): js.Promise[typingsSlinky.cids.mod.^] = js.native
  
  def resolve(ipfsPath: String): js.Promise[ResolveResult] = js.native
  def resolve(ipfsPath: String, options: ResolveOptions with AbortOptions): js.Promise[ResolveResult] = js.native
  def resolve(ipfsPath: typingsSlinky.cids.mod.^): js.Promise[ResolveResult] = js.native
  def resolve(ipfsPath: typingsSlinky.cids.mod.^, options: ResolveOptions with AbortOptions): js.Promise[ResolveResult] = js.native
  
  def tree(ipfsPath: typingsSlinky.cids.mod.^): AsyncIterable[String] = js.native
  def tree(ipfsPath: typingsSlinky.cids.mod.^, options: TreeOptions with AbortOptions): AsyncIterable[String] = js.native
}
