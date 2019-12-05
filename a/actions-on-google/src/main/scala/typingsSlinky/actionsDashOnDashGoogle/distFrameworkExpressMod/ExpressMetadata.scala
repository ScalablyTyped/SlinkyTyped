package typingsSlinky.actionsDashOnDashGoogle.distFrameworkExpressMod

import typingsSlinky.express.expressMod.Request
import typingsSlinky.express.expressMod.Response
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressMetadata extends js.Object {
  /** @public */
  var request: Request[ParamsDictionary]
  /** @public */
  var response: Response
}

object ExpressMetadata {
  @scala.inline
  def apply(request: Request[ParamsDictionary], response: Response): ExpressMetadata = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExpressMetadata]
  }
}

