package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridScrollSettings
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Sets gets the modifier for how long the inertia last on touch devices.
  	 *
  	 */
  var inertiaDuration: js.UndefOr[Double] = js.native
  /**
  	 * Sets gets the modifier for how much the inertia scrolls on touch devices. Note: Value set to 0 would disable touch movements. Value set to -1 would invert them.
  	 *
  	 */
  var inertiaStep: js.UndefOr[Double] = js.native
  /**
  	 * Sets gets current horizontal position.
  	 *
  	 */
  var scrollLeft: js.UndefOr[Double] = js.native
  /**
  	 * Sets gets current vertical position.
  	 *
  	 */
  var scrollTop: js.UndefOr[Double] = js.native
  /**
  	 * Sets gets if smoother scrolling with small intertia should be used when using the mouse wheel.
  	 *
  	 */
  var smoothing: js.UndefOr[Boolean] = js.native
  /**
  	 * Sets or gets the modifier for how long the scroll ‘animation’ lasts when using the mouse wheel once. This is used only for the [smooth scrolling behavior](ui.iggrid#options:scrollSettings.smoothing).
  	 *
  	 */
  var smoothingDuration: js.UndefOr[Double] = js.native
  /**
  	 * Sets or gets the modifier for how many pixels will be scrolled when using the mouse wheel once. This is used only for the [smooth scrolling behavior](ui.iggrid#options:scrollSettings.smoothing).
  	 *
  	 */
  var smoothingStep: js.UndefOr[Double] = js.native
  /**
  	 * Sets gets the step of the default scrolling behavior when using the mouse wheel.
  	 *
  	 */
  var wheelStep: js.UndefOr[Double] = js.native
}

object IgGridScrollSettings {
  @scala.inline
  def apply(): IgGridScrollSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridScrollSettings]
  }
  @scala.inline
  implicit class IgGridScrollSettingsOps[Self <: IgGridScrollSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInertiaDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inertiaDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInertiaDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inertiaDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withInertiaStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inertiaStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInertiaStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inertiaStep")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTop")(js.undefined)
        ret
    }
    @scala.inline
    def withSmoothing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smoothing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmoothing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smoothing")(js.undefined)
        ret
    }
    @scala.inline
    def withSmoothingDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smoothingDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmoothingDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smoothingDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withSmoothingStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smoothingStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmoothingStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smoothingStep")(js.undefined)
        ret
    }
    @scala.inline
    def withWheelStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWheelStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelStep")(js.undefined)
        ret
    }
  }
  
}

