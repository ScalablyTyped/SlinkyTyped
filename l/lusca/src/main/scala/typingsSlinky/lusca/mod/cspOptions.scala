package typingsSlinky.lusca.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait cspOptions extends js.Object {
  var policy: js.UndefOr[String | js.Object | (js.Array[js.Object | String])] = js.native
  var reportOnly: js.UndefOr[Boolean] = js.native
  var reportUri: js.UndefOr[String] = js.native
  var scriptNonce: js.UndefOr[Boolean] = js.native
  var styleNonce: js.UndefOr[Boolean] = js.native
}

object cspOptions {
  @scala.inline
  def apply(): cspOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[cspOptions]
  }
  @scala.inline
  implicit class cspOptionsOps[Self <: cspOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolicy(value: String | js.Object | (js.Array[js.Object | String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(js.undefined)
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
    def withScriptNonce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptNonce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScriptNonce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptNonce")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleNonce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleNonce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyleNonce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleNonce")(js.undefined)
        ret
    }
  }
  
}

