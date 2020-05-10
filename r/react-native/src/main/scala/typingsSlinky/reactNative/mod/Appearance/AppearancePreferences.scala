package typingsSlinky.reactNative.mod.Appearance

import typingsSlinky.reactNative.mod.ColorSchemeName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppearancePreferences extends js.Object {
  var colorScheme: ColorSchemeName = js.native
}

object AppearancePreferences {
  @scala.inline
  def apply(): AppearancePreferences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppearancePreferences]
  }
  @scala.inline
  implicit class AppearancePreferencesOps[Self <: AppearancePreferences] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColorScheme(value: ColorSchemeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorScheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorScheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorScheme")(js.undefined)
        ret
    }
    @scala.inline
    def withColorSchemeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorScheme")(null)
        ret
    }
  }
  
}

