package typingsSlinky.expressDashWechatDashAccess

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressDashWechatDashAccessMod {
  import typingsSlinky.express.expressMod.NextFunction
  import typingsSlinky.express.expressMod.Response
  import typingsSlinky.node.httpMod.ServerResponse

  type WeMiddleware = js.Function3[/* req */ js.Any, /* res */ Response | ServerResponse, /* next */ NextFunction, js.Any]
}
