package typingsSlinky.ipfsCore.componentsMod

import typingsSlinky.ipfsCore.anon.GcLockIpld
import typingsSlinky.ipfsCore.anon.IpldPreload
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

@JSImport("ipfs-core/dist/src/components", "dag")
@js.native
object dag extends js.Object {
  
  @JSName("get_1")
  def get1(hasIpldPreload: IpldPreload): js.Function2[
    /* ipfsPath */ typingsSlinky.cids.mod.^, 
    /* options */ js.UndefOr[GetOptions with AbortOptions], 
    js.Promise[DagEntry]
  ] = js.native
  
  @JSName("put_1")
  def put1(hasIpldPinGcLockPreload: GcLockIpld): js.Function2[
    /* dagNode */ js.Any, 
    /* options */ js.UndefOr[PutOptions with AbortOptions], 
    js.Promise[typingsSlinky.cids.mod.^]
  ] = js.native
  
  def resolve(hasIpldPreload: IpldPreload): js.Function2[
    /* ipfsPath */ String | typingsSlinky.cids.mod.^ , 
    /* options */ js.UndefOr[ResolveOptions with AbortOptions], 
    js.Promise[ResolveResult]
  ] = js.native
  
  def tree(hasIpldPreload: IpldPreload): js.Function2[
    /* ipfsPath */ typingsSlinky.cids.mod.^, 
    /* options */ js.UndefOr[TreeOptions with AbortOptions], 
    AsyncIterable[String]
  ] = js.native
}
