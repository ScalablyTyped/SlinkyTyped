package typingsSlinky.gapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiEndpointHandler extends js.Object {
  /** Path to the script from the application root directory. */
  var scriptPath: js.UndefOr[String] = js.native
}

object ApiEndpointHandler {
  @scala.inline
  def apply(): ApiEndpointHandler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiEndpointHandler]
  }
  @scala.inline
  implicit class ApiEndpointHandlerOps[Self <: ApiEndpointHandler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScriptPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScriptPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptPath")(js.undefined)
        ret
    }
  }
  
}

