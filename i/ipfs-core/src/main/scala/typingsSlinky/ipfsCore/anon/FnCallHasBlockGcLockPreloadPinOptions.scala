package typingsSlinky.ipfsCore.anon

import typingsSlinky.cids.mod.^
import typingsSlinky.ipfsCore.addAllMod.AddAllOptions
import typingsSlinky.ipfsCore.addAllMod.UnixFSEntry
import typingsSlinky.ipfsCore.pinAddAllMod.AddSettings
import typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions
import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallHasBlockGcLockPreloadPinOptions extends js.Object {
  
  def apply(hasBlockGcLockPreloadPinOptions: Block): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.Source */ /* source */ js.Any, 
    /* options */ js.UndefOr[AddAllOptions with AbortOptions], 
    AsyncIterable[UnixFSEntry]
  ] = js.native
  def apply(hasPinManagerGcLockDag: DagDAG): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.Source */ /* source */ js.Any, 
    /* options */ js.UndefOr[AddSettings with AbortOptions], 
    AsyncIterable[^]
  ] = js.native
}
