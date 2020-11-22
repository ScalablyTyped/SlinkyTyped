package typingsSlinky.ipfsCore.componentsMod

import typingsSlinky.ipfsCore.anon.BlockServiceGcLock
import typingsSlinky.ipfsCore.anon.BlockServicePreload
import typingsSlinky.ipfsCore.anon.GcLockPinManager
import typingsSlinky.ipfsCore.blockStatMod.Stat
import typingsSlinky.ipfsCore.blockStatMod.StatOptions
import typingsSlinky.ipfsCore.dagGetMod.GetOptions
import typingsSlinky.ipfsCore.dagPutMod.PutOptions
import typingsSlinky.ipfsCore.pinRmMod.RmOptions
import typingsSlinky.ipfsCore.rmMod.RmFailure
import typingsSlinky.ipfsCore.rmMod.RmSucceess
import typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions
import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components", "block")
@js.native
object block extends js.Object {
  
  def get(hasBlockServicePreload: BlockServicePreload): js.Function2[
    /* cid */ String | typingsSlinky.cids.mod.^  | js.typedarray.Uint8Array, 
    /* options */ js.UndefOr[GetOptions with AbortOptions], 
    js.Promise[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ _
    ]
  ] = js.native
  
  def put(hasBlockServicePinGcLockPreload: BlockServiceGcLock): js.Function2[
    /* block */ js.typedarray.Uint8Array | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ js.Any), 
    /* options */ js.UndefOr[PutOptions with AbortOptions], 
    js.Promise[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ _
    ]
  ] = js.native
  
  def rm(hasBlockServiceGcLockPinManager: GcLockPinManager): js.Function2[
    /* cids */ typingsSlinky.cids.mod.^  | js.Array[typingsSlinky.cids.mod.^], 
    /* options */ js.UndefOr[RmOptions with AbortOptions], 
    AsyncIterable[RmSucceess | RmFailure]
  ] = js.native
  
  def stat(hasBlockServicePreload: BlockServicePreload): js.Function2[
    /* cid */ typingsSlinky.cids.mod.^, 
    /* options */ js.UndefOr[StatOptions with AbortOptions], 
    js.Promise[Stat]
  ] = js.native
}
