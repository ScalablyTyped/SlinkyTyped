package typingsSlinky.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigureHealthCheckOutput extends js.Object {
  /**
    * The updated health check.
    */
  var HealthCheck: js.UndefOr[typingsSlinky.awsSdk.elbMod.HealthCheck] = js.native
}

object ConfigureHealthCheckOutput {
  @scala.inline
  def apply(): ConfigureHealthCheckOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigureHealthCheckOutput]
  }
  @scala.inline
  implicit class ConfigureHealthCheckOutputOps[Self <: ConfigureHealthCheckOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHealthCheck(value: HealthCheck): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HealthCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HealthCheck")(js.undefined)
        ret
    }
  }
  
}

