package typingsSlinky.expressWinston.mod

import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.expressServeStaticCore.mod.Request
import typingsSlinky.expressWinston.anon.Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpressWinstonRequest
  extends Request[ParamsDictionary, js.Any, js.Any, Query] {
  
  var _routeWhitelists: Body = js.native
}
