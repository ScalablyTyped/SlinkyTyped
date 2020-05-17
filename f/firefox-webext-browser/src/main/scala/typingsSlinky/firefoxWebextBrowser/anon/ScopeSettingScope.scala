package typingsSlinky.firefoxWebextBrowser.anon

import typingsSlinky.firefoxWebextBrowser.browser.types.SettingScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScopeSettingScope extends js.Object {
  /** Where to clear the setting (default: regular). */
  var scope: js.UndefOr[SettingScope] = js.native
}

object ScopeSettingScope {
  @scala.inline
  def apply(): ScopeSettingScope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScopeSettingScope]
  }
  @scala.inline
  implicit class ScopeSettingScopeOps[Self <: ScopeSettingScope] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScope(value: SettingScope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
  }
  
}

