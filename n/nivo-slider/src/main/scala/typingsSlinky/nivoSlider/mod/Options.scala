package typingsSlinky.nivoSlider.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var afterChange: js.UndefOr[js.Function0[Unit]] = js.native
  var afterLoad: js.UndefOr[js.Function0[Unit]] = js.native
  var animSpeed: js.UndefOr[Double] = js.native
  var beforeChange: js.UndefOr[js.Function0[Unit]] = js.native
  var boxCols: js.UndefOr[Double] = js.native
  var boxRows: js.UndefOr[Double] = js.native
  var controlNav: js.UndefOr[Boolean] = js.native
  var controlNavThumbs: js.UndefOr[Boolean] = js.native
  var directionNav: js.UndefOr[Boolean] = js.native
  var effect: js.UndefOr[EffectType] = js.native
  var lastSlide: js.UndefOr[js.Function0[Unit]] = js.native
  var manualAdvance: js.UndefOr[Boolean] = js.native
  var nextText: js.UndefOr[String] = js.native
  var pauseOnHover: js.UndefOr[Boolean] = js.native
  var pauseTime: js.UndefOr[Double] = js.native
  var prevText: js.UndefOr[String] = js.native
  var randomStart: js.UndefOr[Boolean] = js.native
  var slices: js.UndefOr[Double] = js.native
  var slideshowEnd: js.UndefOr[js.Function0[Unit]] = js.native
  var startSlide: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterChange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAfterChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterChange")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterLoad(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterLoad")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAfterLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeChange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutBeforeChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeChange")(js.undefined)
        ret
    }
    @scala.inline
    def withBoxCols(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxCols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxCols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxCols")(js.undefined)
        ret
    }
    @scala.inline
    def withBoxRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxRows")(js.undefined)
        ret
    }
    @scala.inline
    def withControlNav(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlNav")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControlNav: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlNav")(js.undefined)
        ret
    }
    @scala.inline
    def withControlNavThumbs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlNavThumbs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControlNavThumbs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlNavThumbs")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectionNav(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionNav")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectionNav: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionNav")(js.undefined)
        ret
    }
    @scala.inline
    def withEffect(value: EffectType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effect")(js.undefined)
        ret
    }
    @scala.inline
    def withLastSlide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSlide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutLastSlide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSlide")(js.undefined)
        ret
    }
    @scala.inline
    def withManualAdvance(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualAdvance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManualAdvance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualAdvance")(js.undefined)
        ret
    }
    @scala.inline
    def withNextText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextText")(js.undefined)
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
    def withPauseTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPauseTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseTime")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevText")(js.undefined)
        ret
    }
    @scala.inline
    def withRandomStart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("randomStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRandomStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("randomStart")(js.undefined)
        ret
    }
    @scala.inline
    def withSlices(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slices")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideshowEnd(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideshowEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSlideshowEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideshowEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withStartSlide(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startSlide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartSlide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startSlide")(js.undefined)
        ret
    }
  }
  
}

