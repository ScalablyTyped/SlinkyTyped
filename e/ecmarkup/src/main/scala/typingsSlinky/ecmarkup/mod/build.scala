package typingsSlinky.ecmarkup.mod

import typingsSlinky.ecmarkup.specMod.Spec
import typingsSlinky.prex.mod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ecmarkup", "build")
@js.native
object build extends js.Object {
  
  def apply(
    path: String,
    fetch: js.Function2[/* path */ String, /* token */ CancellationToken, js.Thenable[String]]
  ): js.Promise[Spec] = js.native
  def apply(
    path: String,
    fetch: js.Function2[/* path */ String, /* token */ CancellationToken, js.Thenable[String]],
    opts: js.UndefOr[scala.Nothing],
    token: CancellationToken
  ): js.Promise[Spec] = js.native
  def apply(
    path: String,
    fetch: js.Function2[/* path */ String, /* token */ CancellationToken, js.Thenable[String]],
    opts: Options
  ): js.Promise[Spec] = js.native
  def apply(
    path: String,
    fetch: js.Function2[/* path */ String, /* token */ CancellationToken, js.Thenable[String]],
    opts: Options,
    token: CancellationToken
  ): js.Promise[Spec] = js.native
}
