package typingsSlinky.firefoxWebextBrowser

import typingsSlinky.firefoxWebextBrowser.browser.manifest.ExtensionURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonApiscript extends js.Object {
  var api_script: js.UndefOr[ExtensionURL] = js.native
}

object AnonApiscript {
  @scala.inline
  def apply(): AnonApiscript = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonApiscript]
  }
  @scala.inline
  implicit class AnonApiscriptOps[Self <: AnonApiscript] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApi_script(value: ExtensionURL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api_script")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApi_script: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api_script")(js.undefined)
        ret
    }
  }
  
}

