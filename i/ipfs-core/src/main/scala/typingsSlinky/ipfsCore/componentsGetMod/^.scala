package typingsSlinky.ipfsCore.componentsGetMod

import typingsSlinky.ipfsCore.anon.Ipld
import typingsSlinky.ipfsCore.srcUtilsMod.Directory
import typingsSlinky.ipfsCore.srcUtilsMod.File
import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/get", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(hasIpldPreload: Ipld): js.Function2[
    /* ipfsPath */ String | typingsSlinky.cids.mod.^ , 
    /* options */ js.UndefOr[GetOptions with typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions], 
    AsyncIterable[File | Directory]
  ] = js.native
}
