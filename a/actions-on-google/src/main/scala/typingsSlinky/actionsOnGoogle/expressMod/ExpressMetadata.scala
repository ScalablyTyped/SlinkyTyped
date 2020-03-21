package typingsSlinky.actionsOnGoogle.expressMod

import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressMetadata extends js.Object {
  /** @public */
  var request: Request_[ParamsDictionary]
  /** @public */
  var response: Response_
}

object ExpressMetadata {
  @scala.inline
  def apply(request: Request_[ParamsDictionary], response: Response_): ExpressMetadata = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExpressMetadata]
  }
}

