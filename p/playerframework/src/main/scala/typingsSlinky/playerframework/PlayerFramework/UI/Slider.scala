package typingsSlinky.playerframework.PlayerFramework.UI

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Slider extends js.Object {
  var altStep1: Double = js.native
  var altStep2: Double = js.native
  var altStep3: Double = js.native
  var disabled: Boolean = js.native
  var element: HTMLElement = js.native
  var hidden: Boolean = js.native
  var isThumbnailVisible: Boolean = js.native
  var label: String = js.native
  var markers: js.Array[_] = js.native
  var max: Double = js.native
  var min: Double = js.native
  var progress: Double = js.native
  var step: Double = js.native
  var thumbnailImageSrc: String = js.native
  var tooltip: String = js.native
  var value: Double = js.native
  var vertical: Boolean = js.native
}

object Slider {
  @scala.inline
  def apply(
    altStep1: Double,
    altStep2: Double,
    altStep3: Double,
    disabled: Boolean,
    element: HTMLElement,
    hidden: Boolean,
    isThumbnailVisible: Boolean,
    label: String,
    markers: js.Array[_],
    max: Double,
    min: Double,
    progress: Double,
    step: Double,
    thumbnailImageSrc: String,
    tooltip: String,
    value: Double,
    vertical: Boolean
  ): Slider = {
    val __obj = js.Dynamic.literal(altStep1 = altStep1.asInstanceOf[js.Any], altStep2 = altStep2.asInstanceOf[js.Any], altStep3 = altStep3.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], isThumbnailVisible = isThumbnailVisible.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], markers = markers.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], thumbnailImageSrc = thumbnailImageSrc.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[Slider]
  }
  @scala.inline
  implicit class SliderOps[Self <: Slider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAltStep1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altStep1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAltStep2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altStep2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAltStep3(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altStep3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsThumbnailVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isThumbnailVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkers(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThumbnailImageSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailImageSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

