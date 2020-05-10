package typingsSlinky.restangular

import typingsSlinky.angular.mod.IRequestShortcutConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHeaders extends js.Object {
  var element: js.Any = js.native
  var headers: js.Any = js.native
  var httpConfig: IRequestShortcutConfig = js.native
  var params: js.Any = js.native
}

object AnonHeaders {
  @scala.inline
  def apply(element: js.Any, headers: js.Any, httpConfig: IRequestShortcutConfig, params: js.Any): AnonHeaders = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], httpConfig = httpConfig.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeaders]
  }
  @scala.inline
  implicit class AnonHeadersOps[Self <: AnonHeaders] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElement(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttpConfig(value: IRequestShortcutConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

