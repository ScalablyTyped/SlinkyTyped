package typingsSlinky.gijgo.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Checkbox
@js.native
trait CheckboxSettings extends js.Object {
  //Events
  var change: js.UndefOr[js.Function2[/* e */ js.Any, /* state */ String, _]] = js.native
  var iconsLibrary: js.UndefOr[String] = js.native
  var uiLibrary: js.UndefOr[String] = js.native
}

object CheckboxSettings {
  @scala.inline
  def apply(): CheckboxSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckboxSettings]
  }
  @scala.inline
  implicit class CheckboxSettingsOps[Self <: CheckboxSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChange(value: (/* e */ js.Any, /* state */ String) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.undefined)
        ret
    }
    @scala.inline
    def withIconsLibrary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconsLibrary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconsLibrary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconsLibrary")(js.undefined)
        ret
    }
    @scala.inline
    def withUiLibrary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uiLibrary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUiLibrary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uiLibrary")(js.undefined)
        ret
    }
  }
  
}

