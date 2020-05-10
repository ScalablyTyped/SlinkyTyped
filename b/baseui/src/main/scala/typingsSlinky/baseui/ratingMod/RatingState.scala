package typingsSlinky.baseui.ratingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RatingState extends js.Object {
  var previewIndex: js.UndefOr[Double] = js.native
}

object RatingState {
  @scala.inline
  def apply(): RatingState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RatingState]
  }
  @scala.inline
  implicit class RatingStateOps[Self <: RatingState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPreviewIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviewIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewIndex")(js.undefined)
        ret
    }
  }
  
}

