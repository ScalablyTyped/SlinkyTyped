package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SessionAffinityConfig represents the configurations of session affinity.
  */
@js.native
trait SessionAffinityConfig extends js.Object {
  /**
    * clientIP contains the configurations of Client IP based session affinity.
    */
  var clientIP: js.UndefOr[Input[ClientIPConfig]] = js.native
}

object SessionAffinityConfig {
  @scala.inline
  def apply(): SessionAffinityConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionAffinityConfig]
  }
  @scala.inline
  implicit class SessionAffinityConfigOps[Self <: SessionAffinityConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientIP(value: Input[ClientIPConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientIP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientIP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientIP")(js.undefined)
        ret
    }
  }
  
}

