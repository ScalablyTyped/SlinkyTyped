package typingsSlinky.authmosphere

import typingsSlinky.authmosphere.anon.Scope
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.expressServeStaticCore.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("authmosphere/lib/src/types/ExtendedRequest", JSImport.Namespace)
@js.native
object extendedRequestMod extends js.Object {
  @js.native
  trait ExtendedRequest
    extends Request[ParamsDictionary, js.Any, js.Any, Query] {
    @JSName("$$tokeninfo")
    var DollarDollartokeninfo: js.UndefOr[Scope] = js.native
  }
  
}

