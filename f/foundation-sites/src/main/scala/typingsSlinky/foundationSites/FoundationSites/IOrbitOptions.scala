package typingsSlinky.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOrbitOptions extends js.Object {
  var accessible: js.UndefOr[Boolean] = js.native
  var animInFromLeft: js.UndefOr[String] = js.native
  var animInFromRight: js.UndefOr[String] = js.native
  var animOutToLeft: js.UndefOr[String] = js.native
  var animOutToRight: js.UndefOr[String] = js.native
  var autoPlay: js.UndefOr[Boolean] = js.native
  var boxOfBullets: js.UndefOr[String] = js.native
  var bullets: js.UndefOr[Boolean] = js.native
  var containerClass: js.UndefOr[String] = js.native
  var infiniteWrap: js.UndefOr[Boolean] = js.native
  var navButtons: js.UndefOr[Boolean] = js.native
  var nextClass: js.UndefOr[String] = js.native
  var pauseOnHover: js.UndefOr[Boolean] = js.native
  var prevClass: js.UndefOr[String] = js.native
  var slideClass: js.UndefOr[String] = js.native
  var swipe: js.UndefOr[Boolean] = js.native
  var timerDelay: js.UndefOr[Double] = js.native
  var useMUI: js.UndefOr[Boolean] = js.native
}

object IOrbitOptions {
  @scala.inline
  def apply(): IOrbitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOrbitOptions]
  }
  @scala.inline
  implicit class IOrbitOptionsOps[Self <: IOrbitOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessible")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimInFromLeft(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animInFromLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimInFromLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animInFromLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimInFromRight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animInFromRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimInFromRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animInFromRight")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimOutToLeft(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animOutToLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimOutToLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animOutToLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimOutToRight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animOutToRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimOutToRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animOutToRight")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoPlay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoPlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPlay")(js.undefined)
        ret
    }
    @scala.inline
    def withBoxOfBullets(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxOfBullets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxOfBullets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxOfBullets")(js.undefined)
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
    def withContainerClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerClass")(js.undefined)
        ret
    }
    @scala.inline
    def withInfiniteWrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infiniteWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfiniteWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infiniteWrap")(js.undefined)
        ret
    }
    @scala.inline
    def withNavButtons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navButtons")(js.undefined)
        ret
    }
    @scala.inline
    def withNextClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextClass")(js.undefined)
        ret
    }
    @scala.inline
    def withPauseOnHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseOnHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPauseOnHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseOnHover")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevClass")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideClass")(js.undefined)
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
    def withTimerDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timerDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimerDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timerDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withUseMUI(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMUI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseMUI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMUI")(js.undefined)
        ret
    }
  }
  
}

