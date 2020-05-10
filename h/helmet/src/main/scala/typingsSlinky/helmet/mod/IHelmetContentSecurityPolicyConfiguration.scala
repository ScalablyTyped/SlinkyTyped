package typingsSlinky.helmet.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHelmetContentSecurityPolicyConfiguration extends js.Object {
  var browserSniff: js.UndefOr[Boolean] = js.native
  var directives: js.UndefOr[IHelmetContentSecurityPolicyDirectives] = js.native
  var disableAndroid: js.UndefOr[Boolean] = js.native
  var loose: js.UndefOr[Boolean] = js.native
  var reportOnly: js.UndefOr[
    Boolean | (js.Function2[/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_], Boolean])
  ] = js.native
  var setAllHeaders: js.UndefOr[Boolean] = js.native
}

object IHelmetContentSecurityPolicyConfiguration {
  @scala.inline
  def apply(): IHelmetContentSecurityPolicyConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHelmetContentSecurityPolicyConfiguration]
  }
  @scala.inline
  implicit class IHelmetContentSecurityPolicyConfigurationOps[Self <: IHelmetContentSecurityPolicyConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrowserSniff(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserSniff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowserSniff: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserSniff")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectives(value: IHelmetContentSecurityPolicyDirectives): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directives")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableAndroid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAndroid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableAndroid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAndroid")(js.undefined)
        ret
    }
    @scala.inline
    def withLoose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loose")(js.undefined)
        ret
    }
    @scala.inline
    def withReportOnlyFunction2(value: (/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportOnly")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withReportOnly(
      value: Boolean | (js.Function2[/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_], Boolean])
    ): Self = {
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
    def withSetAllHeaders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAllHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetAllHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAllHeaders")(js.undefined)
        ret
    }
  }
  
}

