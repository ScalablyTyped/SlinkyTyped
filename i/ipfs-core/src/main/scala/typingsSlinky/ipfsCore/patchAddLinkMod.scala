package typingsSlinky.ipfsCore

import typingsSlinky.ipfsCore.anon.GcLockIpldPreload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/object/patch/add-link", JSImport.Namespace)
@js.native
object patchAddLinkMod extends js.Object {
  
  def apply(hasIpldGcLockPreload: GcLockIpldPreload): js.Function3[
    /* multihash */ js.UndefOr[js.Any], 
    /* link */ js.UndefOr[js.Any], 
    /* options */ js.UndefOr[js.Any], 
    js.Promise[_]
  ] = js.native
}
