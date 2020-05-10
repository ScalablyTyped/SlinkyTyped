package typingsSlinky.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * The contour layer options
  */
@js.native
trait IContourLayerOptions extends js.Object {
  /** A callback function which defines the color of the contour line fill. */
  var colorCallback: js.UndefOr[js.Function1[/* contourValue */ Double | String, String | Color]] = js.native
  /** The polygon options that apply to all contour lines of this layer */
  var polygonOptions: js.UndefOr[IPolygonOptions] = js.native
  /** Whether the layer is visible */
  var visible: js.UndefOr[Boolean] = js.native
  /** The z-index of this layer */
  var zIndex: js.UndefOr[Double] = js.native
}

object IContourLayerOptions {
  @scala.inline
  def apply(): IContourLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IContourLayerOptions]
  }
  @scala.inline
  implicit class IContourLayerOptionsOps[Self <: IContourLayerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColorCallback(value: /* contourValue */ Double | String => String | Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutColorCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withPolygonOptions(value: IPolygonOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygonOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolygonOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygonOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
  }
  
}

