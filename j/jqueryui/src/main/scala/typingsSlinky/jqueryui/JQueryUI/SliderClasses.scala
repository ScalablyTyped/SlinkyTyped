package typingsSlinky.jqueryui.JQueryUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SliderClasses extends js.Object {
  var `ui-slider`: js.UndefOr[String] = js.native
  var `ui-slider-handle`: js.UndefOr[String] = js.native
  var `ui-slider-horizontal`: js.UndefOr[String] = js.native
  var `ui-slider-range`: js.UndefOr[String] = js.native
  var `ui-slider-range-max`: js.UndefOr[String] = js.native
  var `ui-slider-range-min`: js.UndefOr[String] = js.native
  var `ui-slider-vertical`: js.UndefOr[String] = js.native
}

object SliderClasses {
  @scala.inline
  def apply(): SliderClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderClasses]
  }
  @scala.inline
  implicit class SliderClassesOps[Self <: SliderClasses] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withUi-slider`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-slider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUi-slider`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-slider")(js.undefined)
        ret
    }
    @scala.inline
    def `withUi-slider-handle`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-slider-handle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUi-slider-handle`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-slider-handle")(js.undefined)
        ret
    }
    @scala.inline
    def `withUi-slider-horizontal`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-slider-horizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUi-slider-horizontal`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-slider-horizontal")(js.undefined)
        ret
    }
    @scala.inline
    def `withUi-slider-range`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-slider-range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUi-slider-range`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-slider-range")(js.undefined)
        ret
    }
    @scala.inline
    def `withUi-slider-range-max`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-slider-range-max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUi-slider-range-max`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-slider-range-max")(js.undefined)
        ret
    }
    @scala.inline
    def `withUi-slider-range-min`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-slider-range-min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUi-slider-range-min`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-slider-range-min")(js.undefined)
        ret
    }
    @scala.inline
    def `withUi-slider-vertical`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-slider-vertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUi-slider-vertical`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-slider-vertical")(js.undefined)
        ret
    }
  }
  
}

