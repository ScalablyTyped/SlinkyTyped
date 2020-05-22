package typingsSlinky.keystonejsKeystone.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeystonePrepareResult extends js.Object {
  var middlewares: js.Array[RequestHandler[ParamsDictionary, _, _, Query]]
}

object KeystonePrepareResult {
  @scala.inline
  def apply(middlewares: js.Array[RequestHandler[ParamsDictionary, _, _, Query]]): KeystonePrepareResult = {
    val __obj = js.Dynamic.literal(middlewares = middlewares.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeystonePrepareResult]
  }
}

