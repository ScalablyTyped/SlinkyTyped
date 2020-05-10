package typingsSlinky.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.leaflet.mod.PanOptions because var conflicts: animate. Inlined duration, easeLinearity, noMoveStart */ @js.native
trait FitBoundsOptions extends ZoomOptions {
  var duration: js.UndefOr[Double] = js.native
  var easeLinearity: js.UndefOr[Double] = js.native
  var maxZoom: js.UndefOr[Double] = js.native
  var noMoveStart: js.UndefOr[Boolean] = js.native
  var padding: js.UndefOr[PointExpression] = js.native
  var paddingBottomRight: js.UndefOr[PointExpression] = js.native
  var paddingTopLeft: js.UndefOr[PointExpression] = js.native
}

object FitBoundsOptions {
  @scala.inline
  def apply(): FitBoundsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FitBoundsOptions]
  }
  @scala.inline
  implicit class FitBoundsOptionsOps[Self <: FitBoundsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withEaseLinearity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeLinearity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEaseLinearity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeLinearity")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withNoMoveStart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noMoveStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoMoveStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noMoveStart")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: PointExpression): Self = {
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
    def withPaddingBottomRight(value: PointExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingBottomRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingBottomRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingBottomRight")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingTopLeft(value: PointExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingTopLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingTopLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingTopLeft")(js.undefined)
        ret
    }
  }
  
}

