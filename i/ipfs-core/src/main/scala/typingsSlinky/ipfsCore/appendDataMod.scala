package typingsSlinky.ipfsCore

import typingsSlinky.ipfsCore.anon.GcLockIpldPreload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/object/patch/append-data", JSImport.Namespace)
@js.native
object appendDataMod extends js.Object {
  
  def apply(hasIpldGcLockPreload: GcLockIpldPreload): js.Function3[
    /* multihash */ js.UndefOr[js.Any], 
    /* data */ js.UndefOr[js.Any], 
    /* options */ js.UndefOr[js.Any], 
    js.Promise[_]
  ] = js.native
}
