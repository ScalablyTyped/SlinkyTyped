package typingsSlinky.ipfsCore.componentsMod

import typingsSlinky.ipfsCore.addMod.AddOptions
import typingsSlinky.ipfsCore.anon.DagGcLock
import typingsSlinky.ipfsCore.anon.DagGcLockPinManager
import typingsSlinky.ipfsCore.anon.DagPinManager
import typingsSlinky.ipfsCore.anon.RmAll
import typingsSlinky.ipfsCore.anon.`1`
import typingsSlinky.ipfsCore.pinAddAllMod.AddSettings
import typingsSlinky.ipfsCore.pinLsMod.LsEntry
import typingsSlinky.ipfsCore.pinLsMod.LsSettings
import typingsSlinky.ipfsCore.pinRmMod.RmSettings
import typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions
import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components", "pin")
@js.native
object pin extends js.Object {
  
  @JSName("add_1")
  def add1(hasAddAll: `1`): js.Function2[
    /* path */ String | typingsSlinky.cids.mod.^ , 
    /* options */ js.UndefOr[AddOptions with AbortOptions], 
    js.Promise[typingsSlinky.cids.mod.^]
  ] = js.native
  
  def addAll(hasPinManagerGcLockDag: DagGcLock): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.Source */ /* source */ js.Any, 
    /* options */ js.UndefOr[AddSettings with AbortOptions], 
    AsyncIterable[typingsSlinky.cids.mod.^]
  ] = js.native
  
  def ls(hasPinManagerDag: DagPinManager): js.Function1[/* options */ js.UndefOr[LsSettings with AbortOptions], AsyncIterable[LsEntry]] = js.native
  
  @JSName("rm_3")
  def rm3(hasRmAll: RmAll): js.Function2[
    /* path */ String | typingsSlinky.cids.mod.^ , 
    /* options */ js.UndefOr[RmSettings with AbortOptions], 
    js.Promise[typingsSlinky.cids.mod.^]
  ] = js.native
  
  def rmAll(hasPinManagerGcLockDag: DagGcLockPinManager): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.Source */ /* source */ js.Any, 
    /* _options */ js.UndefOr[AbortOptions], 
    AsyncIterable[typingsSlinky.cids.mod.^]
  ] = js.native
}
