package typingsSlinky.ipfsCore.anon

import typingsSlinky.ipfsCore.listMod.Peers
import typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallHasKeychain extends js.Object {
  
  def apply(hasKeychain: Keychain): js.Function1[/* options */ js.UndefOr[js.Any], _] = js.native
  def apply(hasRepo: js.Any): js.Function1[/* options */ js.UndefOr[AbortOptions], js.Promise[Peers]] = js.native
}
