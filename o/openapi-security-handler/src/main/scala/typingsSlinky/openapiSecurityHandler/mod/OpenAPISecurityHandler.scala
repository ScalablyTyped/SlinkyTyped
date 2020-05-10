package typingsSlinky.openapiSecurityHandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenAPISecurityHandler extends IOpenAPISecurityHandler {
  var operationSecurity: js.Any = js.native
  var securitySets: js.Any = js.native
  def handle(request: js.Any): js.Promise[Unit] = js.native
}

object OpenAPISecurityHandler {
  @scala.inline
  def apply(handle: js.Any => js.Promise[Unit], operationSecurity: js.Any, securitySets: js.Any): OpenAPISecurityHandler = {
    val __obj = js.Dynamic.literal(handle = js.Any.fromFunction1(handle), operationSecurity = operationSecurity.asInstanceOf[js.Any], securitySets = securitySets.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenAPISecurityHandler]
  }
  @scala.inline
  implicit class OpenAPISecurityHandlerOps[Self <: OpenAPISecurityHandler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandle(value: js.Any => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOperationSecurity(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationSecurity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecuritySets(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securitySets")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

