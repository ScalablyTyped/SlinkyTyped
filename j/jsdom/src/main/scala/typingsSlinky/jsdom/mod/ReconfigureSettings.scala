package typingsSlinky.jsdom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReconfigureSettings extends js.Object {
  var url: js.UndefOr[String] = js.native
  var windowTop: js.UndefOr[DOMWindow] = js.native
}

object ReconfigureSettings {
  @scala.inline
  def apply(): ReconfigureSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReconfigureSettings]
  }
  @scala.inline
  implicit class ReconfigureSettingsOps[Self <: ReconfigureSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowTop(value: DOMWindow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowTop")(js.undefined)
        ret
    }
  }
  
}

