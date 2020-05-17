package typingsSlinky.jointjs.mod.dia.Paper

import typingsSlinky.jointjs.mod.dia.BBox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScaleContentOptions extends js.Object {
  var contentArea: js.UndefOr[BBox] = js.native
  var fittingBBox: js.UndefOr[BBox] = js.native
  var maxScale: js.UndefOr[Double] = js.native
  var maxScaleX: js.UndefOr[Double] = js.native
  var maxScaleY: js.UndefOr[Double] = js.native
  var minScale: js.UndefOr[Double] = js.native
  var minScaleX: js.UndefOr[Double] = js.native
  var minScaleY: js.UndefOr[Double] = js.native
  var padding: js.UndefOr[Double] = js.native
  var preserveAspectRatio: js.UndefOr[Boolean] = js.native
  var scaleGrid: js.UndefOr[Double] = js.native
  var useModelGeometry: js.UndefOr[Boolean] = js.native
}

object ScaleContentOptions {
  @scala.inline
  def apply(): ScaleContentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScaleContentOptions]
  }
  @scala.inline
  implicit class ScaleContentOptionsOps[Self <: ScaleContentOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentArea(value: BBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentArea")(js.undefined)
        ret
    }
    @scala.inline
    def withFittingBBox(value: BBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fittingBBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFittingBBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fittingBBox")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxScale")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxScaleX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxScaleX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxScaleX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxScaleX")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxScaleY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxScaleY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxScaleY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxScaleY")(js.undefined)
        ret
    }
    @scala.inline
    def withMinScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minScale")(js.undefined)
        ret
    }
    @scala.inline
    def withMinScaleX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minScaleX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinScaleX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minScaleX")(js.undefined)
        ret
    }
    @scala.inline
    def withMinScaleY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minScaleY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinScaleY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minScaleY")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveAspectRatio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveAspectRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveAspectRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveAspectRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleGrid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleGrid")(js.undefined)
        ret
    }
    @scala.inline
    def withUseModelGeometry(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useModelGeometry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseModelGeometry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useModelGeometry")(js.undefined)
        ret
    }
  }
  
}

