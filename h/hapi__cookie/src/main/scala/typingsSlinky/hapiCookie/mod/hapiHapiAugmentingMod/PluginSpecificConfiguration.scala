package typingsSlinky.hapiCookie.mod.hapiHapiAugmentingMod

import typingsSlinky.hapiCookie.AnonRedirectTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginSpecificConfiguration extends js.Object {
  var `hapi-auth-cookie`: js.UndefOr[AnonRedirectTo] = js.native
}

object PluginSpecificConfiguration {
  @scala.inline
  def apply(): PluginSpecificConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluginSpecificConfiguration]
  }
  @scala.inline
  implicit class PluginSpecificConfigurationOps[Self <: PluginSpecificConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withHapi-auth-cookie`(value: AnonRedirectTo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hapi-auth-cookie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutHapi-auth-cookie`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hapi-auth-cookie")(js.undefined)
        ret
    }
  }
  
}

