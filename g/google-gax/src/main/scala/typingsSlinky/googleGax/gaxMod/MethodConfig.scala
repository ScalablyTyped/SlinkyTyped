package typingsSlinky.googleGax.gaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MethodConfig extends js.Object {
  var bundling: js.UndefOr[BundlingConfig | Null] = js.native
  var retry_codes_name: js.UndefOr[String] = js.native
  var retry_params_name: js.UndefOr[String] = js.native
  var timeout_millis: js.UndefOr[Double] = js.native
}

object MethodConfig {
  @scala.inline
  def apply(): MethodConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MethodConfig]
  }
  @scala.inline
  implicit class MethodConfigOps[Self <: MethodConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBundling(value: BundlingConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBundling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundling")(js.undefined)
        ret
    }
    @scala.inline
    def withBundlingNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundling")(null)
        ret
    }
    @scala.inline
    def withRetry_codes_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry_codes_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetry_codes_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry_codes_name")(js.undefined)
        ret
    }
    @scala.inline
    def withRetry_params_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry_params_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetry_params_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry_params_name")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout_millis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout_millis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout_millis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout_millis")(js.undefined)
        ret
    }
  }
  
}

