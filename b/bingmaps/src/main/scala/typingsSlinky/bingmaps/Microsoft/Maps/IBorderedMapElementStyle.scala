package typingsSlinky.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBorderedMapElementStyle extends IMapElementStyle {
  /**
    * Secondary/casing line hex color of the border of a filled polygon.
    */
  var borderOutlineColor: js.UndefOr[String] = js.native
  /**
    * Primary line hex color of the border of a filled polygon.
    */
  var borderStrokeColor: js.UndefOr[String] = js.native
  /**
    * Specifies if a border is visible or not.
    */
  var borderVisible: js.UndefOr[Boolean] = js.native
}

object IBorderedMapElementStyle {
  @scala.inline
  def apply(): IBorderedMapElementStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBorderedMapElementStyle]
  }
  @scala.inline
  implicit class IBorderedMapElementStyleOps[Self <: IBorderedMapElementStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderOutlineColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderOutlineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderOutlineColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderOutlineColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderStrokeColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderStrokeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderStrokeColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderStrokeColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderVisible")(js.undefined)
        ret
    }
  }
  
}

