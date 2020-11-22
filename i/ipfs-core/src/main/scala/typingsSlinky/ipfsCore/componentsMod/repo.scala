package typingsSlinky.ipfsCore.componentsMod

import typingsSlinky.ipfsCore.anon.NumObjects
import typingsSlinky.ipfsCore.anon.Refs
import typingsSlinky.ipfsCore.anon.RepoAny
import typingsSlinky.ipfsCore.gcMod.BlockID
import typingsSlinky.ipfsCore.gcMod.Err
import typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions
import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components", "repo")
@js.native
object repo extends js.Object {
  
  def gc(hasGcLockPinRefsRepo: Refs): js.Function1[/* _options */ js.UndefOr[AbortOptions], AsyncIterable[Err | BlockID]] = js.native
  
  @JSName("stat_3")
  def stat3(hasRepo: RepoAny): js.Function1[/* options */ js.UndefOr[js.Any], js.Promise[NumObjects]] = js.native
  
  def version(hasRepo: RepoAny): js.Function1[/* options */ js.UndefOr[js.Any], js.Promise[_]] = js.native
}
