package typingsSlinky.devextreme.mod.DevExpress

import typingsSlinky.devextreme.devextremeStrings.bottom
import typingsSlinky.devextreme.devextremeStrings.css
import typingsSlinky.devextreme.devextremeStrings.fade
import typingsSlinky.devextreme.devextremeStrings.fadeIn
import typingsSlinky.devextreme.devextremeStrings.fadeOut
import typingsSlinky.devextreme.devextremeStrings.left
import typingsSlinky.devextreme.devextremeStrings.pop
import typingsSlinky.devextreme.devextremeStrings.right
import typingsSlinky.devextreme.devextremeStrings.slide
import typingsSlinky.devextreme.devextremeStrings.slideIn
import typingsSlinky.devextreme.devextremeStrings.slideOut
import typingsSlinky.devextreme.devextremeStrings.top
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait animationConfig extends js.Object {
  /** A function called after animation is completed. */
  var complete: js.UndefOr[js.Function2[/* $element */ dxElement, /* config */ js.Any, _]] = js.native
  /** A number specifying wait time before animation execution. */
  var delay: js.UndefOr[Double] = js.native
  /** Specifies the animation direction for the "slideIn" and "slideOut" animation types. */
  var direction: js.UndefOr[bottom | left | right | top] = js.native
  /** A number specifying the time in milliseconds spent on animation. */
  var duration: js.UndefOr[Double] = js.native
  /** A string specifying the easing function for animation. */
  var easing: js.UndefOr[String] = js.native
  /** Specifies the initial animation state. */
  var from: js.UndefOr[Double | String | js.Any] = js.native
  /** A number specifying the time period to wait before the animation of the next stagger item starts. */
  var staggerDelay: js.UndefOr[Double] = js.native
  /** A function called before animation is started. */
  var start: js.UndefOr[js.Function2[/* $element */ dxElement, /* config */ js.Any, _]] = js.native
  /** Specifies a final animation state. */
  var to: js.UndefOr[Double | String | js.Any] = js.native
  /** A string value specifying the animation type. */
  var `type`: js.UndefOr[css | fade | fadeIn | fadeOut | pop | slide | slideIn | slideOut] = js.native
}

object animationConfig {
  @scala.inline
  def apply(): animationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[animationConfig]
  }
  @scala.inline
  implicit class animationConfigOps[Self <: animationConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplete(value: (/* $element */ dxElement, /* config */ js.Any) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: bottom | left | right | top): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withEasing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(js.undefined)
        ret
    }
    @scala.inline
    def withFrom(value: Double | String | js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
    @scala.inline
    def withStaggerDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staggerDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaggerDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staggerDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: (/* $element */ dxElement, /* config */ js.Any) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withTo(value: Double | String | js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: css | fade | fadeIn | fadeOut | pop | slide | slideIn | slideOut): Self = {
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

