package typingsSlinky.browserBunyan.mod.BrowserBunyan

import typingsSlinky.browserBunyan.PartialConsoleFormattedStDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConsoleFormattedStreamOptions extends js.Object {
  var css: js.UndefOr[PartialConsoleFormattedStDef] = js.native
  var logByLevel: js.UndefOr[Boolean] = js.native
}

object ConsoleFormattedStreamOptions {
  @scala.inline
  def apply(): ConsoleFormattedStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsoleFormattedStreamOptions]
  }
  @scala.inline
  implicit class ConsoleFormattedStreamOptionsOps[Self <: ConsoleFormattedStreamOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCss(value: PartialConsoleFormattedStDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(js.undefined)
        ret
    }
    @scala.inline
    def withLogByLevel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logByLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogByLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logByLevel")(js.undefined)
        ret
    }
  }
  
}

