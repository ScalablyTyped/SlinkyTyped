package typingsSlinky.authmosphere

import typingsSlinky.authmosphere.anon.Scope
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.expressServeStaticCore.mod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extendedRequestMod {
  
  @js.native
  trait ExtendedRequest
    extends Request[ParamsDictionary, js.Any, js.Any, Query] {
    
    @JSName("$$tokeninfo")
    var DollarDollartokeninfo: js.UndefOr[Scope] = js.native
  }
}
