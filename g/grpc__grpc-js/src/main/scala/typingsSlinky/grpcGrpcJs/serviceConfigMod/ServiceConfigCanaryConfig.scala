package typingsSlinky.grpcGrpcJs.serviceConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceConfigCanaryConfig extends js.Object {
  var clientHostname: js.UndefOr[js.Array[String]] = js.native
  var clientLanguage: js.UndefOr[js.Array[String]] = js.native
  var percentage: js.UndefOr[Double] = js.native
  var serviceConfig: ServiceConfig = js.native
}

object ServiceConfigCanaryConfig {
  @scala.inline
  def apply(serviceConfig: ServiceConfig): ServiceConfigCanaryConfig = {
    val __obj = js.Dynamic.literal(serviceConfig = serviceConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceConfigCanaryConfig]
  }
  @scala.inline
  implicit class ServiceConfigCanaryConfigOps[Self <: ServiceConfigCanaryConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServiceConfig(value: ServiceConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientHostname(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientHostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientHostname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientHostname")(js.undefined)
        ret
    }
    @scala.inline
    def withClientLanguage(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientLanguage")(js.undefined)
        ret
    }
    @scala.inline
    def withPercentage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentage")(js.undefined)
        ret
    }
  }
  
}

