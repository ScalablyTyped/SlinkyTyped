package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThumbDragMoveEventUIParam extends js.Object {
  /**
  	 * Gets which scrollbar thumb is being used - horizontal(true) or vertical(false).
  	 */
  var horizontal: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets a reference to the igScroll.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets how much the content will be scrolled horizontally.
  	 */
  var stepX: js.UndefOr[Double] = js.native
  /**
  	 * Gets how much the content will be scrolled vertically.
  	 */
  var stepY: js.UndefOr[Double] = js.native
}

object ThumbDragMoveEventUIParam {
  @scala.inline
  def apply(): ThumbDragMoveEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThumbDragMoveEventUIParam]
  }
  @scala.inline
  implicit class ThumbDragMoveEventUIParamOps[Self <: ThumbDragMoveEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHorizontal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(js.undefined)
        ret
    }
    @scala.inline
    def withStepX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepX")(js.undefined)
        ret
    }
    @scala.inline
    def withStepY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepY")(js.undefined)
        ret
    }
  }
  
}

