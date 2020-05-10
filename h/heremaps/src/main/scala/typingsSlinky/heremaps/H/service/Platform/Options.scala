package typingsSlinky.heremaps.H.service.Platform

import typingsSlinky.heremaps.H.service.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @property app_id {string} - The application ID to identify the client against the platform (mandatory to provide)
  * @property app_code {string} - The application code to identify the client against the platform (mandatory to provide)
  * @property baseUrl {H.service.Url=} - The base URL of the platform, default is http://api.here.com
  * @property useCIT {boolean=} - Indicates whether the Customer Integration Testing should be used, default is false
  * @property useHTTPS {boolean=} - Indicates whether secure communication should be used, default is false
  */
@js.native
trait Options extends js.Object {
  var apikey: String = js.native
  var baseUrl: js.UndefOr[Url] = js.native
  var useCIT: js.UndefOr[Boolean] = js.native
  var useHTTPS: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(apikey: String): Options = {
    val __obj = js.Dynamic.literal(apikey = apikey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApikey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apikey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseUrl(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withUseCIT(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCIT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseCIT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCIT")(js.undefined)
        ret
    }
    @scala.inline
    def withUseHTTPS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useHTTPS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseHTTPS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useHTTPS")(js.undefined)
        ret
    }
  }
  
}

