package typingsSlinky.reactToolbox.tabsTabMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabTheme extends js.Object {
  /**
    * Added to the navigation tab element in case it's active.
    */
  var active: js.UndefOr[String] = js.native
  /**
    * Added to the navigation tab element in case it's disabled.
    */
  var disabled: js.UndefOr[String] = js.native
  /**
    * Added to the navigation tab element in case it's hidden.
    */
  var hidden: js.UndefOr[String] = js.native
  /**
    * Added to the navigation tab element in case it's active.
    */
  var label: js.UndefOr[String] = js.native
  /**
    * Class added when icon is set.
    */
  var withIcon: js.UndefOr[String] = js.native
  /**
    * Class added when label is set.
    */
  var withText: js.UndefOr[String] = js.native
}

object TabTheme {
  @scala.inline
  def apply(): TabTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabTheme]
  }
  @scala.inline
  implicit class TabThemeOps[Self <: TabTheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHidden(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withWithIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withWithText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withText")(js.undefined)
        ret
    }
  }
  
}

