package typingsSlinky.helmet.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHelmetHpkpConfiguration extends js.Object {
  var includeSubDomains: js.UndefOr[Boolean] = js.native
  /**
    * @deprecated Use includeSubDomains instead. (Uppercase "D")
    */
  var includeSubdomains: js.UndefOr[Boolean] = js.native
  var maxAge: Double = js.native
  var reportOnly: js.UndefOr[Boolean] = js.native
  var reportUri: js.UndefOr[String] = js.native
  var setIf: js.UndefOr[IHelmetSetIfFunction] = js.native
  var sha256s: js.Array[String] = js.native
}

object IHelmetHpkpConfiguration {
  @scala.inline
  def apply(maxAge: Double, sha256s: js.Array[String]): IHelmetHpkpConfiguration = {
    val __obj = js.Dynamic.literal(maxAge = maxAge.asInstanceOf[js.Any], sha256s = sha256s.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHelmetHpkpConfiguration]
  }
  @scala.inline
  implicit class IHelmetHpkpConfigurationOps[Self <: IHelmetHpkpConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxAge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSha256s(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha256s")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeSubDomains(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeSubDomains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeSubDomains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeSubDomains")(js.undefined)
        ret
    }
    @scala.inline
    def withReportOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withReportUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportUri")(js.undefined)
        ret
    }
    @scala.inline
    def withSetIf(
      value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any]) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIf")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetIf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIf")(js.undefined)
        ret
    }
  }
  
}

