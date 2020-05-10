package typingsSlinky.promClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultMetricsCollectorConfiguration extends js.Object {
  var prefix: js.UndefOr[String] = js.native
  var register: js.UndefOr[Registry] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var timestamps: js.UndefOr[Boolean] = js.native
}

object DefaultMetricsCollectorConfiguration {
  @scala.inline
  def apply(): DefaultMetricsCollectorConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultMetricsCollectorConfiguration]
  }
  @scala.inline
  implicit class DefaultMetricsCollectorConfigurationOps[Self <: DefaultMetricsCollectorConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withRegister(value: Registry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegister: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamps")(js.undefined)
        ret
    }
  }
  
}

