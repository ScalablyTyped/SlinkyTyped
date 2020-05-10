package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateBordersRequest extends js.Object {
  /** The border to put at the bottom of the range. */
  var bottom: js.UndefOr[Border] = js.native
  /** The horizontal border to put within the range. */
  var innerHorizontal: js.UndefOr[Border] = js.native
  /** The vertical border to put within the range. */
  var innerVertical: js.UndefOr[Border] = js.native
  /** The border to put at the left of the range. */
  var left: js.UndefOr[Border] = js.native
  /** The range whose borders should be updated. */
  var range: js.UndefOr[GridRange] = js.native
  /** The border to put at the right of the range. */
  var right: js.UndefOr[Border] = js.native
  /** The border to put at the top of the range. */
  var top: js.UndefOr[Border] = js.native
}

object UpdateBordersRequest {
  @scala.inline
  def apply(): UpdateBordersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateBordersRequest]
  }
  @scala.inline
  implicit class UpdateBordersRequestOps[Self <: UpdateBordersRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBottom(value: Border): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerHorizontal(value: Border): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerHorizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerHorizontal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerHorizontal")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerVertical(value: Border): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerVertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerVertical")(js.undefined)
        ret
    }
    @scala.inline
    def withLeft(value: Border): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
        ret
    }
    @scala.inline
    def withRange(value: GridRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
    @scala.inline
    def withRight(value: Border): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(js.undefined)
        ret
    }
    @scala.inline
    def withTop(value: Border): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.undefined)
        ret
    }
  }
  
}

