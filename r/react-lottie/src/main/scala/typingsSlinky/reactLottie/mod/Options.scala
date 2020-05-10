package typingsSlinky.reactLottie.mod

import typingsSlinky.reactLottie.AnonClassName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * The JSON data exported from Adobe After Effects using the Bodymovin plugin
    */
  var animationData: js.Any = js.native
  /**
    * Defines if the animation should immediately play when the component enters the DOM
    */
  var autoplay: js.UndefOr[Boolean] = js.native
  /**
    * Defines if the animation should play only once or repeatedly in an endless loop
    * or the number of loops that should be completed before the animation ends
    */
  var loop: js.UndefOr[Boolean | Double] = js.native
  var rendererSettings: js.UndefOr[AnonClassName] = js.native
}

object Options {
  @scala.inline
  def apply(animationData: js.Any): Options = {
    val __obj = js.Dynamic.literal(animationData = animationData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoplay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(js.undefined)
        ret
    }
    @scala.inline
    def withLoop(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(js.undefined)
        ret
    }
    @scala.inline
    def withRendererSettings(value: AnonClassName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendererSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRendererSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendererSettings")(js.undefined)
        ret
    }
  }
  
}

