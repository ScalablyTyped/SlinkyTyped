package typingsSlinky.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMapElementStyle extends js.Object {
  /**
    * Hex color used for filling polygons, the background of point icons, and for the center of lines if they have split.
    */
  var fillColor: js.UndefOr[String] = js.native
  /**
    * The hex color of a map label.
    */
  var labelColor: js.UndefOr[String] = js.native
  /**
    * The outline hex color of a map label.
    */
  var labelOutlineColor: js.UndefOr[String] = js.native
  /**
    * Species if a map label type is visible or not.
    */
  var labelVisible: js.UndefOr[Boolean] = js.native
  /**
    * Hex color used for the outline around polygons, the outline around point icons, and the color of lines.
    */
  var strokeColor: js.UndefOr[String] = js.native
  /**
    * Specifies if the map element is visible or not.
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object IMapElementStyle {
  @scala.inline
  def apply(): IMapElementStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMapElementStyle]
  }
  @scala.inline
  implicit class IMapElementStyleOps[Self <: IMapElementStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFillColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillColor")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelColor")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelOutlineColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelOutlineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelOutlineColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelOutlineColor")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeColor")(js.undefined)
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
  }
  
}

