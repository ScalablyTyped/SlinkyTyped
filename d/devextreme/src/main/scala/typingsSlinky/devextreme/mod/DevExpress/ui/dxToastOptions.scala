package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.devextremeStrings.custom
import typingsSlinky.devextreme.devextremeStrings.error
import typingsSlinky.devextreme.devextremeStrings.info
import typingsSlinky.devextreme.devextremeStrings.success
import typingsSlinky.devextreme.devextremeStrings.warning
import typingsSlinky.devextreme.mod.DevExpress.positionConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxToastOptions extends dxOverlayOptions[dxToast] {
  /** Configures widget visibility animations. This object contains two fields: show and hide. */
  @JSName("animation")
  var animation_dxToastOptions: js.UndefOr[dxToastAnimation] = js.native
  /** A Boolean value specifying whether or not the toast is closed if a user clicks it. */
  var closeOnClick: js.UndefOr[Boolean] = js.native
  /** A Boolean value specifying whether or not the toast is closed if a user swipes it out of the screen boundaries. */
  var closeOnSwipe: js.UndefOr[Boolean] = js.native
  /** The time span in milliseconds during which the Toast widget is visible. */
  var displayTime: js.UndefOr[Double] = js.native
  /** The Toast message text. */
  var message: js.UndefOr[String] = js.native
  /** Positions the widget. */
  @JSName("position")
  var position_dxToastOptions: js.UndefOr[positionConfig | String] = js.native
  /** Specifies the Toast widget type. */
  var `type`: js.UndefOr[custom | error | info | success | warning] = js.native
}

object dxToastOptions {
  @scala.inline
  def apply(): dxToastOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxToastOptions]
  }
  @scala.inline
  implicit class dxToastOptionsOps[Self <: dxToastOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimation(value: dxToastAnimation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseOnClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnClick")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseOnSwipe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnSwipe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOnSwipe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnSwipe")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayTime")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: positionConfig | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: custom | error | info | success | warning): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

