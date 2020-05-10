package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Windows10CustomConfiguration extends DeviceConfiguration {
  // OMA settings. This collection can contain a maximum of 1000 elements.
  var omaSettings: js.UndefOr[js.Array[OmaSetting]] = js.native
}

object Windows10CustomConfiguration {
  @scala.inline
  def apply(): Windows10CustomConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Windows10CustomConfiguration]
  }
  @scala.inline
  implicit class Windows10CustomConfigurationOps[Self <: Windows10CustomConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOmaSettings(value: js.Array[OmaSetting]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omaSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOmaSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omaSettings")(js.undefined)
        ret
    }
  }
  
}

