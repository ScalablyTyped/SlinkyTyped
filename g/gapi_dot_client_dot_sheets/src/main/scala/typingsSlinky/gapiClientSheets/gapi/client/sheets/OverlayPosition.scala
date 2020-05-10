package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverlayPosition extends js.Object {
  /** The cell the object is anchored to. */
  var anchorCell: js.UndefOr[GridCoordinate] = js.native
  /** The height of the object, in pixels. Defaults to 371. */
  var heightPixels: js.UndefOr[Double] = js.native
  /**
    * The horizontal offset, in pixels, that the object is offset
    * from the anchor cell.
    */
  var offsetXPixels: js.UndefOr[Double] = js.native
  /**
    * The vertical offset, in pixels, that the object is offset
    * from the anchor cell.
    */
  var offsetYPixels: js.UndefOr[Double] = js.native
  /** The width of the object, in pixels. Defaults to 600. */
  var widthPixels: js.UndefOr[Double] = js.native
}

object OverlayPosition {
  @scala.inline
  def apply(): OverlayPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverlayPosition]
  }
  @scala.inline
  implicit class OverlayPositionOps[Self <: OverlayPosition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchorCell(value: GridCoordinate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchorCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorCell")(js.undefined)
        ret
    }
    @scala.inline
    def withHeightPixels(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightPixels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeightPixels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightPixels")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetXPixels(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetXPixels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetXPixels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetXPixels")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetYPixels(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetYPixels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetYPixels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetYPixels")(js.undefined)
        ret
    }
    @scala.inline
    def withWidthPixels(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widthPixels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidthPixels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widthPixels")(js.undefined)
        ret
    }
  }
  
}

