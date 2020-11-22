package typingsSlinky.ipfsCore.componentsMod

import typingsSlinky.ipfsCore.anon.Default
import typingsSlinky.ipfsCore.anon.Ref
import typingsSlinky.ipfsCore.anon.RepoAny
import typingsSlinky.ipfsCore.anon.Resolve
import typingsSlinky.std.AsyncGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components", "refs")
@js.native
object refs extends js.Object {
  
  def apply(hasIpldResolvePreload: Resolve): js.Function2[
    /* ipfsPath */ js.UndefOr[js.Any], 
    /* options */ js.UndefOr[js.Any], 
    AsyncGenerator[Ref, Unit, _]
  ] = js.native
  
  var Format: Default = js.native
  
  def local(hasRepo: RepoAny): js.Function1[/* options */ js.UndefOr[js.Any], AsyncGenerator[Ref, Unit, _]] = js.native
}
