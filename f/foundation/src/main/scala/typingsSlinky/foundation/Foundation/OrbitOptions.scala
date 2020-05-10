package typingsSlinky.foundation.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/docs/components/orbit.html#advanced
@js.native
trait OrbitOptions extends js.Object {
  var active_slide_class: js.UndefOr[String] = js.native
  var after_slide_change: js.UndefOr[js.Function0[_]] = js.native
  var animation: js.UndefOr[String] = js.native
  var animation_speed: js.UndefOr[Double] = js.native
  var before_slide_change: js.UndefOr[js.Function0[_]] = js.native
  var bullets: js.UndefOr[Boolean] = js.native
  var bullets_active_class: js.UndefOr[String] = js.native
  var bullets_container_class: js.UndefOr[String] = js.native
  var caption_class: js.UndefOr[String] = js.native
  var circular: js.UndefOr[Boolean] = js.native
  var container_class: js.UndefOr[String] = js.native
  var navigation_arrows: js.UndefOr[Boolean] = js.native
  var next_class: js.UndefOr[String] = js.native
  var next_on_click: js.UndefOr[Boolean] = js.native
  var orbit_transition_class: js.UndefOr[String] = js.native
  var pause_on_hover: js.UndefOr[Boolean] = js.native
  var preloader_class: js.UndefOr[String] = js.native
  var prev_class: js.UndefOr[String] = js.native
  var resume_on_mouseout: js.UndefOr[Boolean] = js.native
  var slide_number: js.UndefOr[Boolean] = js.native
  var slide_number_class: js.UndefOr[String] = js.native
  var slide_number_text: js.UndefOr[String] = js.native
  var slide_selector: js.UndefOr[String] = js.native
  var slides_container_class: js.UndefOr[String] = js.native
  var stack_on_small: js.UndefOr[Boolean] = js.native
  var stack_on_small_class: js.UndefOr[String] = js.native
  var swipe: js.UndefOr[Boolean] = js.native
  var timer: js.UndefOr[Boolean] = js.native
  var timer_container_class: js.UndefOr[String] = js.native
  var timer_paused_class: js.UndefOr[String] = js.native
  var timer_progress_class: js.UndefOr[String] = js.native
  var timer_speed: js.UndefOr[Double] = js.native
  var variable_height: js.UndefOr[Boolean] = js.native
}

object OrbitOptions {
  @scala.inline
  def apply(): OrbitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrbitOptions]
  }
  @scala.inline
  implicit class OrbitOptionsOps[Self <: OrbitOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive_slide_class(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active_slide_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive_slide_class: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active_slide_class")(js.undefined)
        ret
    }
    @scala.inline
    def withAfter_slide_change(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after_slide_change")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAfter_slide_change: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after_slide_change")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimation(value: String): Self = {
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
    def withAnimation_speed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation_speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation_speed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation_speed")(js.undefined)
        ret
    }
    @scala.inline
    def withBefore_slide_change(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before_slide_change")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutBefore_slide_change: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before_slide_change")(js.undefined)
        ret
    }
    @scala.inline
    def withBullets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bullets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBullets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bullets")(js.undefined)
        ret
    }
    @scala.inline
    def withBullets_active_class(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bullets_active_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBullets_active_class: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bullets_active_class")(js.undefined)
        ret
    }
    @scala.inline
    def withBullets_container_class(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bullets_container_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBullets_container_class: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bullets_container_class")(js.undefined)
        ret
    }
    @scala.inline
    def withCaption_class(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaption_class: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption_class")(js.undefined)
        ret
    }
    @scala.inline
    def withCircular(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circular")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCircular: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circular")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer_class(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer_class: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container_class")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigation_arrows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigation_arrows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigation_arrows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigation_arrows")(js.undefined)
        ret
    }
    @scala.inline
    def withNext_class(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNext_class: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next_class")(js.undefined)
        ret
    }
    @scala.inline
    def withNext_on_click(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next_on_click")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNext_on_click: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next_on_click")(js.undefined)
        ret
    }
    @scala.inline
    def withOrbit_transition_class(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orbit_transition_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrbit_transition_class: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orbit_transition_class")(js.undefined)
        ret
    }
    @scala.inline
    def withPause_on_hover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause_on_hover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPause_on_hover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause_on_hover")(js.undefined)
        ret
    }
    @scala.inline
    def withPreloader_class(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloader_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreloader_class: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloader_class")(js.undefined)
        ret
    }
    @scala.inline
    def withPrev_class(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrev_class: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev_class")(js.undefined)
        ret
    }
    @scala.inline
    def withResume_on_mouseout(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resume_on_mouseout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResume_on_mouseout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resume_on_mouseout")(js.undefined)
        ret
    }
    @scala.inline
    def withSlide_number(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slide_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlide_number: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slide_number")(js.undefined)
        ret
    }
    @scala.inline
    def withSlide_number_class(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slide_number_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlide_number_class: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slide_number_class")(js.undefined)
        ret
    }
    @scala.inline
    def withSlide_number_text(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slide_number_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlide_number_text: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slide_number_text")(js.undefined)
        ret
    }
    @scala.inline
    def withSlide_selector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slide_selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlide_selector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slide_selector")(js.undefined)
        ret
    }
    @scala.inline
    def withSlides_container_class(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slides_container_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlides_container_class: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slides_container_class")(js.undefined)
        ret
    }
    @scala.inline
    def withStack_on_small(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack_on_small")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStack_on_small: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack_on_small")(js.undefined)
        ret
    }
    @scala.inline
    def withStack_on_small_class(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack_on_small_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStack_on_small_class: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack_on_small_class")(js.undefined)
        ret
    }
    @scala.inline
    def withSwipe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwipe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipe")(js.undefined)
        ret
    }
    @scala.inline
    def withTimer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timer")(js.undefined)
        ret
    }
    @scala.inline
    def withTimer_container_class(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timer_container_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimer_container_class: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timer_container_class")(js.undefined)
        ret
    }
    @scala.inline
    def withTimer_paused_class(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timer_paused_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimer_paused_class: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timer_paused_class")(js.undefined)
        ret
    }
    @scala.inline
    def withTimer_progress_class(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timer_progress_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimer_progress_class: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timer_progress_class")(js.undefined)
        ret
    }
    @scala.inline
    def withTimer_speed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timer_speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimer_speed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timer_speed")(js.undefined)
        ret
    }
    @scala.inline
    def withVariable_height(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variable_height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariable_height: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variable_height")(js.undefined)
        ret
    }
  }
  
}

