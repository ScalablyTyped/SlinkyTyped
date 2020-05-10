package typingsSlinky.firefoxWebextBrowser

import typingsSlinky.firefoxWebextBrowser.browser.manifest.IconPath
import typingsSlinky.firefoxWebextBrowser.browser.manifest.ThemeIcons
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDefaultIcon_ extends js.Object {
  /** Specifies the default icon to use in the contextual tip. */
  var defaultIcon: String | IconPath = js.native
  /**
    * Specifies icons to use for dark and light themes. Each item in the array is for a specified icon size.
    */
  var themeIcons: js.UndefOr[js.Array[ThemeIcons]] = js.native
}

object AnonDefaultIcon_ {
  @scala.inline
  def apply(defaultIcon: String | IconPath): AnonDefaultIcon_ = {
    val __obj = js.Dynamic.literal(defaultIcon = defaultIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefaultIcon_]
  }
  @scala.inline
  implicit class AnonDefaultIcon_Ops[Self <: AnonDefaultIcon_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultIcon(value: String | IconPath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThemeIcons(value: js.Array[ThemeIcons]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeIcons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThemeIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeIcons")(js.undefined)
        ret
    }
  }
  
}

