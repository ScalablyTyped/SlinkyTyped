package typingsSlinky.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contents of manifest.json for a static theme */
@js.native
trait ThemeManifest extends js.Object {
  var dark_theme: js.UndefOr[ThemeType] = js.native
  var default_locale: js.UndefOr[String] = js.native
  var icons: js.UndefOr[NumberDictionary[String]] = js.native
  var theme: ThemeType = js.native
  var theme_experiment: js.UndefOr[ThemeExperiment] = js.native
}

object ThemeManifest {
  @scala.inline
  def apply(theme: ThemeType): ThemeManifest = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeManifest]
  }
  @scala.inline
  implicit class ThemeManifestOps[Self <: ThemeManifest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTheme(value: ThemeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDark_theme(value: ThemeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dark_theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDark_theme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dark_theme")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault_locale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault_locale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_locale")(js.undefined)
        ret
    }
    @scala.inline
    def withIcons(value: NumberDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme_experiment(value: ThemeExperiment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme_experiment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme_experiment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme_experiment")(js.undefined)
        ret
    }
  }
  
}

