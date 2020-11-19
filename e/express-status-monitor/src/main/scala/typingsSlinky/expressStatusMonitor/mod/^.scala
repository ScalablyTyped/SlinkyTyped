package typingsSlinky.expressStatusMonitor.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("express-status-monitor", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(config: ExpressStatusMonitorConfig): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}
