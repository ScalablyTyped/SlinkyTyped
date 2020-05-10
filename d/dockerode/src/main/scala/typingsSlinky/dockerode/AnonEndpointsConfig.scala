package typingsSlinky.dockerode

import typingsSlinky.dockerode.mod.EndpointsConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEndpointsConfig extends js.Object {
  var EndpointsConfig: js.UndefOr[typingsSlinky.dockerode.mod.EndpointsConfig] = js.native
}

object AnonEndpointsConfig {
  @scala.inline
  def apply(): AnonEndpointsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonEndpointsConfig]
  }
  @scala.inline
  implicit class AnonEndpointsConfigOps[Self <: AnonEndpointsConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpointsConfig(value: EndpointsConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointsConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointsConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointsConfig")(js.undefined)
        ret
    }
  }
  
}

