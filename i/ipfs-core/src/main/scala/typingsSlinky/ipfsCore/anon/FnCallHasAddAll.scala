package typingsSlinky.ipfsCore.anon

import typingsSlinky.ipfsCore.addAllMod.UnixFSEntry
import typingsSlinky.ipfsCore.addMod.AddOptions
import typingsSlinky.ipfsCore.addMod.Source
import typingsSlinky.ipfsCore.bootstrapAddMod.Peers
import typingsSlinky.ipfsCore.pinAddMod.CID
import typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions
import typingsSlinky.multiaddr.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallHasAddAll extends js.Object {
  
  def apply(hasAddAll: AddAll): js.Function2[
    /* source */ Source, 
    /* options */ js.UndefOr[AddOptions with AbortOptions], 
    js.Promise[UnixFSEntry]
  ] = js.native
  def apply(hasAddAll: AddAllReturnType): js.Function2[
    /* path */ CID | String, 
    /* options */ js.UndefOr[typingsSlinky.ipfsCore.pinAddMod.AddOptions with AbortOptions], 
    js.Promise[CID]
  ] = js.native
  def apply(hasRepo: js.Any): js.Function2[/* multiaddr */ ^, /* options */ js.UndefOr[AbortOptions], js.Promise[Peers]] = js.native
}
