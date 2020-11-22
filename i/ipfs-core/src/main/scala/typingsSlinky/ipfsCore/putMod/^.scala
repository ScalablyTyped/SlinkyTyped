package typingsSlinky.ipfsCore.putMod

import typingsSlinky.ipfsCore.anon.GcLock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/block/put", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(hasBlockServicePinGcLockPreload: GcLock): js.Function2[
    /* block */ js.typedarray.Uint8Array | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ js.Any), 
    /* options */ js.UndefOr[PutOptions with typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions], 
    js.Promise[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ _
    ]
  ] = js.native
}
