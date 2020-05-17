package typingsSlinky.firefoxWebextBrowser.anon

import typingsSlinky.firefoxWebextBrowser.browser.manifest.ExtensionURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Apiscript extends js.Object {
  var api_script: js.UndefOr[ExtensionURL] = js.native
}

object Apiscript {
  @scala.inline
  def apply(): Apiscript = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Apiscript]
  }
  @scala.inline
  implicit class ApiscriptOps[Self <: Apiscript] (val x: Self) extends AnyVal {
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

