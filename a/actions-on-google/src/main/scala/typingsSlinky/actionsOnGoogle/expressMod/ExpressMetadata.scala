package typingsSlinky.actionsOnGoogle.expressMod

import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpressMetadata extends js.Object {
  /** @public */
  var request: Request_[ParamsDictionary, _, _, Query] = js.native
  /** @public */
  var response: Response_[_] = js.native
}

object ExpressMetadata {
  @scala.inline
  def apply(request: Request_[ParamsDictionary, _, _, Query], response: Response_[_]): ExpressMetadata = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressMetadata]
  }
  @scala.inline
  implicit class ExpressMetadataOps[Self <: ExpressMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRequest(value: Request_[ParamsDictionary, _, _, Query]): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: Response_[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

