package typingsSlinky.koaDashBunyanDashLogger.koaDashBunyanDashLoggerMod

import typingsSlinky.koa.koaMod.Request
import typingsSlinky.koa.koaMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseData extends js.Object {
  var req: Request
  var res: Response
}

object ResponseData {
  @scala.inline
  def apply(req: Request, res: Response): ResponseData = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResponseData]
  }
}

