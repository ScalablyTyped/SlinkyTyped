package typingsSlinky.foundation.Foundation

import typingsSlinky.foundation.anon.Bottom
import typingsSlinky.foundation.anon.Button
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/docs/components/joyride.html#optional-javascript-configuration
@js.native
trait JoyrideOptions extends js.Object {
  var cookie_domain: js.UndefOr[Boolean] = js.native
  var cookie_expires: js.UndefOr[Double] = js.native
  var cookie_monster: js.UndefOr[Boolean] = js.native
  var cookie_name: js.UndefOr[String] = js.native
  var expose: js.UndefOr[Boolean] = js.native
  var expose_add_class: js.UndefOr[String] = js.native
  var exposed: js.UndefOr[js.Array[String]] = js.native
  var keyboard: js.UndefOr[Boolean] = js.native
  var modal: js.UndefOr[Boolean] = js.native
  var next_button: js.UndefOr[Boolean] = js.native
  var nub_position: js.UndefOr[String] = js.native
  var pause_after: js.UndefOr[js.Array[Double]] = js.native
  var post_expose_callback: js.UndefOr[js.Function0[Unit]] = js.native
  var post_ride_callback: js.UndefOr[js.Function0[Unit]] = js.native
  var post_step_callback: js.UndefOr[js.Function0[Unit]] = js.native
  var pre_ride_callback: js.UndefOr[js.Function0[Unit]] = js.native
  var pre_step_callback: js.UndefOr[js.Function0[Unit]] = js.native
  var prev_button: js.UndefOr[Boolean] = js.native
  var scroll_animation: js.UndefOr[String] = js.native
  var scroll_speed: js.UndefOr[Double] = js.native
  var start_offset: js.UndefOr[Double] = js.native
  var start_timer_on_click: js.UndefOr[Boolean] = js.native
  var template: js.UndefOr[Button] = js.native
  var timer: js.UndefOr[Double] = js.native
  var tip_animation: js.UndefOr[String] = js.native
  var tip_animation_fade_speed: js.UndefOr[Double] = js.native
  var tip_container: js.UndefOr[String] = js.native
  var tip_location: js.UndefOr[String] = js.native
  var tip_location_patterns: js.UndefOr[Bottom] = js.native
}

object JoyrideOptions {
  @scala.inline
  def apply(): JoyrideOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JoyrideOptions]
  }
  @scala.inline
  implicit class JoyrideOptionsOps[Self <: JoyrideOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCookie_domain(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie_domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookie_domain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie_domain")(js.undefined)
        ret
    }
    @scala.inline
    def withCookie_expires(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie_expires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookie_expires: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie_expires")(js.undefined)
        ret
    }
    @scala.inline
    def withCookie_monster(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie_monster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookie_monster: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie_monster")(js.undefined)
        ret
    }
    @scala.inline
    def withCookie_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookie_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie_name")(js.undefined)
        ret
    }
    @scala.inline
    def withExpose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expose")(js.undefined)
        ret
    }
    @scala.inline
    def withExpose_add_class(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expose_add_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpose_add_class: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expose_add_class")(js.undefined)
        ret
    }
    @scala.inline
    def withExposed(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExposed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposed")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboard")(js.undefined)
        ret
    }
    @scala.inline
    def withModal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modal")(js.undefined)
        ret
    }
    @scala.inline
    def withNext_button(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next_button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNext_button: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next_button")(js.undefined)
        ret
    }
    @scala.inline
    def withNub_position(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nub_position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNub_position: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nub_position")(js.undefined)
        ret
    }
    @scala.inline
    def withPause_after(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause_after")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPause_after: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause_after")(js.undefined)
        ret
    }
    @scala.inline
    def withPost_expose_callback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post_expose_callback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutPost_expose_callback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post_expose_callback")(js.undefined)
        ret
    }
    @scala.inline
    def withPost_ride_callback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post_ride_callback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutPost_ride_callback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post_ride_callback")(js.undefined)
        ret
    }
    @scala.inline
    def withPost_step_callback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post_step_callback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutPost_step_callback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post_step_callback")(js.undefined)
        ret
    }
    @scala.inline
    def withPre_ride_callback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pre_ride_callback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutPre_ride_callback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pre_ride_callback")(js.undefined)
        ret
    }
    @scala.inline
    def withPre_step_callback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pre_step_callback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutPre_step_callback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pre_step_callback")(js.undefined)
        ret
    }
    @scala.inline
    def withPrev_button(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev_button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrev_button: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev_button")(js.undefined)
        ret
    }
    @scala.inline
    def withScroll_animation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll_animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScroll_animation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll_animation")(js.undefined)
        ret
    }
    @scala.inline
    def withScroll_speed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll_speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScroll_speed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll_speed")(js.undefined)
        ret
    }
    @scala.inline
    def withStart_offset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart_offset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_offset")(js.undefined)
        ret
    }
    @scala.inline
    def withStart_timer_on_click(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_timer_on_click")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart_timer_on_click: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_timer_on_click")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: Button): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
    @scala.inline
    def withTimer(value: Double): Self = {
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
    def withTip_animation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tip_animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTip_animation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tip_animation")(js.undefined)
        ret
    }
    @scala.inline
    def withTip_animation_fade_speed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tip_animation_fade_speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTip_animation_fade_speed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tip_animation_fade_speed")(js.undefined)
        ret
    }
    @scala.inline
    def withTip_container(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tip_container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTip_container: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tip_container")(js.undefined)
        ret
    }
    @scala.inline
    def withTip_location(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tip_location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTip_location: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tip_location")(js.undefined)
        ret
    }
    @scala.inline
    def withTip_location_patterns(value: Bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tip_location_patterns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTip_location_patterns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tip_location_patterns")(js.undefined)
        ret
    }
  }
  
}

