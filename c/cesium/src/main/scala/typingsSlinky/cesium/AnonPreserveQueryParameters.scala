package typingsSlinky.cesium

import org.scalajs.dom.experimental.Request
import typingsSlinky.cesium.mod.DefaultProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPreserveQueryParameters extends js.Object {
  var headers: js.UndefOr[js.Any] = js.native
  var preserveQueryParameters: js.UndefOr[Boolean] = js.native
  var proxy: js.UndefOr[DefaultProxy] = js.native
  var queryParameters: js.UndefOr[js.Any] = js.native
  var request: js.UndefOr[Request] = js.native
  var retryAttempts: js.UndefOr[Double] = js.native
  var retryCallback: js.UndefOr[js.Any] = js.native
  var templateValues: js.UndefOr[js.Any] = js.native
  var url: js.UndefOr[String] = js.native
}

object AnonPreserveQueryParameters {
  @scala.inline
  def apply(): AnonPreserveQueryParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonPreserveQueryParameters]
  }
  @scala.inline
  implicit class AnonPreserveQueryParametersOps[Self <: AnonPreserveQueryParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeaders(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveQueryParameters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveQueryParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveQueryParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveQueryParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withProxy(value: DefaultProxy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryParameters(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withRequest(value: Request): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.undefined)
        ret
    }
    @scala.inline
    def withRetryAttempts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryAttempts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetryAttempts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryAttempts")(js.undefined)
        ret
    }
    @scala.inline
    def withRetryCallback(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetryCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateValues(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateValues")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

