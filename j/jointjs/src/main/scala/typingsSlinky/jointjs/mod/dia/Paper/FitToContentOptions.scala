package typingsSlinky.jointjs.mod.dia.Paper

import typingsSlinky.jointjs.jointjsStrings.any
import typingsSlinky.jointjs.jointjsStrings.negative
import typingsSlinky.jointjs.jointjsStrings.positive
import typingsSlinky.jointjs.mod.dia.BBox
import typingsSlinky.jointjs.mod.dia.Padding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FitToContentOptions extends js.Object {
  var allowNewOrigin: js.UndefOr[negative | positive | any] = js.native
  var contentArea: js.UndefOr[BBox] = js.native
  var gridHeight: js.UndefOr[Double] = js.native
  var gridWidth: js.UndefOr[Double] = js.native
  var maxHeight: js.UndefOr[Double] = js.native
  var maxWidth: js.UndefOr[Double] = js.native
  var minHeight: js.UndefOr[Double] = js.native
  var minWidth: js.UndefOr[Double] = js.native
  var padding: js.UndefOr[Padding] = js.native
  var useModelGeometry: js.UndefOr[Boolean] = js.native
}

object FitToContentOptions {
  @scala.inline
  def apply(): FitToContentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FitToContentOptions]
  }
  @scala.inline
  implicit class FitToContentOptionsOps[Self <: FitToContentOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowNewOrigin(value: negative | positive | any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNewOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowNewOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNewOrigin")(js.undefined)
        ret
    }
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
    def withGridHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withGridWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Padding): Self = {
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

