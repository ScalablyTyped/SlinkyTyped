package typingsSlinky.reactToolbox.iconButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconButtonTheme extends js.Object {
  /**
    * Used for the root in case button is accent.
    */
  var accent: js.UndefOr[String] = js.native
  /**
    * Used for the root element in any button.
    */
  var button: js.UndefOr[String] = js.native
  /**
    * For the icon inside a button.
    */
  var icon: js.UndefOr[String] = js.native
  /**
    * Used when colors are inverted.
    */
  var inverse: js.UndefOr[String] = js.native
  /**
    * Used for neutral colored buttons.
    */
  var neutral: js.UndefOr[String] = js.native
  /**
    * Used for primary buttons when button is primary.
    */
  var primary: js.UndefOr[String] = js.native
  /**
    * Used for the ripple element.
    */
  var rippleWrapper: js.UndefOr[String] = js.native
  /**
    * Used for toggle buttons in the root element.
    */
  var toggle: js.UndefOr[String] = js.native
}

object IconButtonTheme {
  @scala.inline
  def apply(): IconButtonTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconButtonTheme]
  }
  @scala.inline
  implicit class IconButtonThemeOps[Self <: IconButtonTheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accent")(js.undefined)
        ret
    }
    @scala.inline
    def withButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withInverse(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInverse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverse")(js.undefined)
        ret
    }
    @scala.inline
    def withNeutral(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neutral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeutral: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neutral")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary")(js.undefined)
        ret
    }
    @scala.inline
    def withRippleWrapper(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rippleWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRippleWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rippleWrapper")(js.undefined)
        ret
    }
    @scala.inline
    def withToggle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(js.undefined)
        ret
    }
  }
  
}

