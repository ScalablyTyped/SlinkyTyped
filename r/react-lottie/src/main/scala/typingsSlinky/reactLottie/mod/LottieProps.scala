package typingsSlinky.reactLottie.mod

import typingsSlinky.reactLottie.reactLottieStrings.animation
import typingsSlinky.reactLottie.reactLottieStrings.button
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LottieProps extends js.Object {
  var ariaLabel: js.UndefOr[String | animation] = js.native
  var ariaRole: js.UndefOr[String | button] = js.native
  var direction: js.UndefOr[Double] = js.native
  /**
    * Array of objects containing eventName and a callback function that will be registered as eventListeners on the animation object.
    * Refer to Lottie documentation for a list of available events.
    */
  var eventListeners: js.UndefOr[js.Array[EventListener]] = js.native
  /**
    * Height size in pixels
    * @default '100%'
    */
  var height: js.UndefOr[Double | String] = js.native
  var isClickToPauseDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Describes if the animation must be in paused mode
    */
  var isPaused: js.UndefOr[Boolean] = js.native
  /**
    * Describes if the animation must be in stopped mode
    */
  var isStopped: js.UndefOr[Boolean] = js.native
  /**
    * Object representing animation settings
    */
  var options: Options = js.native
  var segments: js.UndefOr[js.Array[Double]] = js.native
  var speed: js.UndefOr[Double] = js.native
  var title: js.UndefOr[String] = js.native
  /**
    * Width size in pixels
    * @default '100%'
    */
  var width: js.UndefOr[Double | String] = js.native
}

object LottieProps {
  @scala.inline
  def apply(options: Options): LottieProps = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[LottieProps]
  }
  @scala.inline
  implicit class LottiePropsOps[Self <: LottieProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptions(value: Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAriaLabel(value: String | animation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaRole(value: String | button): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaRole")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: Double): Self = {
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
    def withEventListeners(value: js.Array[EventListener]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventListeners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventListeners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventListeners")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withIsClickToPauseDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isClickToPauseDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsClickToPauseDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isClickToPauseDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPaused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPaused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPaused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPaused")(js.undefined)
        ret
    }
    @scala.inline
    def withIsStopped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStopped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsStopped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStopped")(js.undefined)
        ret
    }
    @scala.inline
    def withSegments(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segments")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

