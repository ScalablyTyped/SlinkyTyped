package typingsSlinky.dockerode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointsConfig extends js.Object {
  var EndpointsConfig: js.UndefOr[typingsSlinky.dockerode.mod.EndpointsConfig] = js.native
}

object EndpointsConfig {
  @scala.inline
  def apply(): EndpointsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointsConfig]
  }
  @scala.inline
  implicit class EndpointsConfigOps[Self <: EndpointsConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpointsConfig(value: typingsSlinky.dockerode.mod.EndpointsConfig): Self = {
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

