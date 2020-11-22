package typingsSlinky.ipfsCore.anon

import typingsSlinky.cids.mod.^
import typingsSlinky.ipfsCore.componentsLsMod.LSOptions
import typingsSlinky.ipfsCore.lsMod.UnixFSEntry
import typingsSlinky.ipfsCore.pinLsMod.LsEntry
import typingsSlinky.ipfsCore.pinLsMod.LsSettings
import typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions
import typingsSlinky.ipfsCore.srcUtilsMod.Directory
import typingsSlinky.ipfsCore.srcUtilsMod.File
import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallHasPinManagerDag extends js.Object {
  
  def apply(context: js.Any): js.Function2[
    /* path */ String, 
    /* options */ js.UndefOr[AbortOptions], 
    AsyncIterable[UnixFSEntry]
  ] = js.native
  def apply(hasIpldPreload: Ipld): js.Function2[
    /* ipfsPath */ String | ^ , 
    /* options */ js.UndefOr[LSOptions with AbortOptions], 
    AsyncIterable[File | Directory]
  ] = js.native
  def apply(hasPinManagerDag: DagPinManager): js.Function1[/* options */ js.UndefOr[LsSettings with AbortOptions], AsyncIterable[LsEntry]] = js.native
}
