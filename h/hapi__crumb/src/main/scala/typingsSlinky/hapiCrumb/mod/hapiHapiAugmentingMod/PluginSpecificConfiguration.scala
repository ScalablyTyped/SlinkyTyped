package typingsSlinky.hapiCrumb.mod.hapiHapiAugmentingMod

import typingsSlinky.hapiCrumb.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginSpecificConfiguration extends js.Object {
  var crumb: js.UndefOr[Boolean | Key] = js.native
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
    def withCrumb(value: Boolean | Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crumb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrumb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crumb")(js.undefined)
        ret
    }
  }
  
}

