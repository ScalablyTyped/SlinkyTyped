package typingsSlinky.reactToolbox.libRadioBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadioTheme extends js.Object {
  /**
    * Used to for the radio element.
    */
  var radio: js.UndefOr[String] = js.native
  /**
    * Used for the radio element when it's checked.
    */
  var radioChecked: js.UndefOr[String] = js.native
  /**
    * To provide styles for the ripple.
    */
  var ripple: js.UndefOr[String] = js.native
}

object RadioTheme {
  @scala.inline
  def apply(): RadioTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadioTheme]
  }
  @scala.inline
  implicit class RadioThemeOps[Self <: RadioTheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRadio(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radio")(js.undefined)
        ret
    }
    @scala.inline
    def withRadioChecked(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radioChecked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadioChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radioChecked")(js.undefined)
        ret
    }
    @scala.inline
    def withRipple(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ripple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRipple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ripple")(js.undefined)
        ret
    }
  }
  
}

