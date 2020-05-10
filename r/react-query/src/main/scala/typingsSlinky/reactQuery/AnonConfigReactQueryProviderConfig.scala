package typingsSlinky.reactQuery

import typingsSlinky.reactQuery.mod.ReactQueryProviderConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonConfigReactQueryProviderConfig extends js.Object {
  var config: js.UndefOr[ReactQueryProviderConfig] = js.native
}

object AnonConfigReactQueryProviderConfig {
  @scala.inline
  def apply(): AnonConfigReactQueryProviderConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonConfigReactQueryProviderConfig]
  }
  @scala.inline
  implicit class AnonConfigReactQueryProviderConfigOps[Self <: AnonConfigReactQueryProviderConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: ReactQueryProviderConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
  }
  
}

