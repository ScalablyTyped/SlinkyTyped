package typingsSlinky.reactEmailEditor.mod

import typingsSlinky.reactEmailEditor.anon.Tools
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppearanceConfig extends js.Object {
  val panels: js.UndefOr[Tools] = js.native
  val theme: js.UndefOr[ThemeColor] = js.native
}

object AppearanceConfig {
  @scala.inline
  def apply(): AppearanceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppearanceConfig]
  }
  @scala.inline
  implicit class AppearanceConfigOps[Self <: AppearanceConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPanels(value: Tools): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panels")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: ThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
  }
  
}

