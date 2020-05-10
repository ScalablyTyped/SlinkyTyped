package typingsSlinky.cesium

import org.scalajs.dom.experimental.Request
import typingsSlinky.cesium.mod.DefaultProxy
import typingsSlinky.cesium.mod.Resource
import typingsSlinky.cesium.mod.Resource.RetryCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOverrideMimeType extends js.Object {
  var data: js.UndefOr[js.Any] = js.native
  var headers: js.UndefOr[js.Any] = js.native
  var overrideMimeType: js.UndefOr[String] = js.native
  var proxy: js.UndefOr[DefaultProxy] = js.native
  var queryParameters: js.UndefOr[js.Any] = js.native
  var request: js.UndefOr[Request] = js.native
  var responseType: js.UndefOr[String] = js.native
  var retryAttempts: js.UndefOr[Double] = js.native
  var retryCallback: js.UndefOr[RetryCallback] = js.native
  var templateValues: js.UndefOr[js.Any] = js.native
  var url: String = js.native
}

object AnonOverrideMimeType {
  @scala.inline
  def apply(url: String): AnonOverrideMimeType = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOverrideMimeType]
  }
  @scala.inline
  implicit class AnonOverrideMimeTypeOps[Self <: AnonOverrideMimeType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
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
    def withOverrideMimeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideMimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrideMimeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideMimeType")(js.undefined)
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
    def withResponseType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseType")(js.undefined)
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
    def withRetryCallback(value: (/* resource */ Resource, /* error */ js.Error) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryCallback")(js.Any.fromFunction2(value))
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
  }
  
}

