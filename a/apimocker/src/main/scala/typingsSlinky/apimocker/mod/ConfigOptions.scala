package typingsSlinky.apimocker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigOptions extends js.Object {
  var allowAvoidPreFlight: js.UndefOr[Boolean] = js.native
  var allowedDomains: js.UndefOr[js.Array[String]] = js.native
  var allowedHeaders: js.UndefOr[js.Array[String]] = js.native
  var logRequestHeaders: js.UndefOr[Boolean] = js.native
  var mockDirectory: js.UndefOr[String] = js.native
  var port: js.UndefOr[String] = js.native
  var quiet: js.UndefOr[Boolean] = js.native
  var useUploadFieldname: js.UndefOr[Boolean] = js.native
  var webServices: js.UndefOr[js.Any] = js.native
}

object ConfigOptions {
  @scala.inline
  def apply(): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigOptions]
  }
  @scala.inline
  implicit class ConfigOptionsOps[Self <: ConfigOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowAvoidPreFlight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAvoidPreFlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowAvoidPreFlight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAvoidPreFlight")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowedDomains(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedDomains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedDomains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedDomains")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowedHeaders(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withLogRequestHeaders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logRequestHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogRequestHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logRequestHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withMockDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mockDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMockDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mockDirectory")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withQuiet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quiet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuiet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quiet")(js.undefined)
        ret
    }
    @scala.inline
    def withUseUploadFieldname(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useUploadFieldname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseUploadFieldname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useUploadFieldname")(js.undefined)
        ret
    }
    @scala.inline
    def withWebServices(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webServices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebServices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webServices")(js.undefined)
        ret
    }
  }
  
}

