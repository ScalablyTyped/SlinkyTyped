package typingsSlinky.googleAppsScript.GoogleAppsScript.Events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppsScriptHttpRequestEvent extends js.Object {
  var contentLength: Double = js.native
  var contextPath: String = js.native
  var parameter: js.Object = js.native
  var parameters: js.Object = js.native
  var queryString: String = js.native
}

object AppsScriptHttpRequestEvent {
  @scala.inline
  def apply(
    contentLength: Double,
    contextPath: String,
    parameter: js.Object,
    parameters: js.Object,
    queryString: String
  ): AppsScriptHttpRequestEvent = {
    val __obj = js.Dynamic.literal(contentLength = contentLength.asInstanceOf[js.Any], contextPath = contextPath.asInstanceOf[js.Any], parameter = parameter.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsScriptHttpRequestEvent]
  }
  @scala.inline
  implicit class AppsScriptHttpRequestEventOps[Self <: AppsScriptHttpRequestEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContextPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameter(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameters(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryString")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

