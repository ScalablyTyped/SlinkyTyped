package typingsSlinky.d3pie.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasHeight extends js.Object {
  var canvasHeight: js.UndefOr[Double] = js.native
  var canvasWidth: js.UndefOr[Double] = js.native
  var pieInnerRadius: js.UndefOr[String | Double] = js.native
  var pieOuterRadius: js.UndefOr[String | Double] = js.native
}

object CanvasHeight {
  @scala.inline
  def apply(): CanvasHeight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanvasHeight]
  }
  @scala.inline
  implicit class CanvasHeightOps[Self <: CanvasHeight] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanvasHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvasHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanvasHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvasHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withCanvasWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvasWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanvasWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvasWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withPieInnerRadius(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pieInnerRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPieInnerRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pieInnerRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withPieOuterRadius(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pieOuterRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPieOuterRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pieOuterRadius")(js.undefined)
        ret
    }
  }
  
}

