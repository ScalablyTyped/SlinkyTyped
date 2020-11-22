package typingsSlinky.ipfsCore.anon

import typingsSlinky.cids.mod.^
import typingsSlinky.ipfsCore.putMod.PutOptions
import typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallHasIpldPinGcLockPreload extends js.Object {
  
  def apply(hasBlockServicePinGcLockPreload: GcLock): js.Function2[
    /* block */ js.typedarray.Uint8Array | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ js.Any), 
    /* options */ js.UndefOr[PutOptions with AbortOptions], 
    js.Promise[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ _
    ]
  ] = js.native
  def apply(hasIpldGcLockPreload: GcLockIpldPreload): js.Function2[/* obj */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], js.Promise[_]] = js.native
  def apply(hasIpldPinGcLockPreload: Pin): js.Function2[
    /* dagNode */ js.Any, 
    /* options */ js.UndefOr[typingsSlinky.ipfsCore.dagPutMod.PutOptions with AbortOptions], 
    js.Promise[^]
  ] = js.native
}
