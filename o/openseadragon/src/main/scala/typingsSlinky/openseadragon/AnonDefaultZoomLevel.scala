package typingsSlinky.openseadragon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDefaultZoomLevel extends js.Object {
  var animationTime: js.UndefOr[Double] = js.native
  var defaultZoomLevel: js.UndefOr[Double] = js.native
  var degrees: js.UndefOr[Double] = js.native
  var homeFillsViewer: js.UndefOr[Boolean] = js.native
  var margins: js.Object = js.native
  var maxZoomLevel: js.UndefOr[Double] = js.native
  var maxZoomPixelRatio: js.UndefOr[Double] = js.native
  var minZoomImageRatio: js.UndefOr[Double] = js.native
  var minZoomLevel: js.UndefOr[Double] = js.native
  var springStiffness: js.UndefOr[Double] = js.native
  var visibilityRatio: js.UndefOr[Double] = js.native
  var wrapHorizontal: js.UndefOr[Boolean] = js.native
  var wrapVertical: js.UndefOr[Boolean] = js.native
}

object AnonDefaultZoomLevel {
  @scala.inline
  def apply(margins: js.Object): AnonDefaultZoomLevel = {
    val __obj = js.Dynamic.literal(margins = margins.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefaultZoomLevel]
  }
  @scala.inline
  implicit class AnonDefaultZoomLevelOps[Self <: AnonDefaultZoomLevel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMargins(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimationTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultZoomLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultZoomLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultZoomLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultZoomLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withDegrees(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("degrees")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDegrees: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("degrees")(js.undefined)
        ret
    }
    @scala.inline
    def withHomeFillsViewer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homeFillsViewer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHomeFillsViewer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homeFillsViewer")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxZoomLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoomLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxZoomLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoomLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxZoomPixelRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoomPixelRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxZoomPixelRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoomPixelRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withMinZoomImageRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoomImageRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinZoomImageRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoomImageRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withMinZoomLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoomLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinZoomLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoomLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withSpringStiffness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("springStiffness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpringStiffness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("springStiffness")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibilityRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibilityRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibilityRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibilityRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapHorizontal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapHorizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapHorizontal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapHorizontal")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapVertical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapVertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapVertical")(js.undefined)
        ret
    }
  }
  
}

