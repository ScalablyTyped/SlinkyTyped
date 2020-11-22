package typingsSlinky.ipfsCore

import typingsSlinky.ipfsCore.anon.Ref
import typingsSlinky.ipfsCore.anon.RepoAny
import typingsSlinky.std.AsyncGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/refs/local", JSImport.Namespace)
@js.native
object localMod extends js.Object {
  
  def apply(hasRepo: RepoAny): js.Function1[/* options */ js.UndefOr[js.Any], AsyncGenerator[Ref, Unit, _]] = js.native
}
