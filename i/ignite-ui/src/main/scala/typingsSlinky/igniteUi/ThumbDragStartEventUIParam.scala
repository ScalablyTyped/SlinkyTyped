package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThumbDragStartEventUIParam extends js.Object {
  /**
  	 * Gets which axis is being used to scroll - horizontal(true) or vertical(false).
  	 */
  var horizontal: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets a reference to the igScroll.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
}

object ThumbDragStartEventUIParam {
  @scala.inline
  def apply(): ThumbDragStartEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThumbDragStartEventUIParam]
  }
  @scala.inline
  implicit class ThumbDragStartEventUIParamOps[Self <: ThumbDragStartEventUIParam] (val x: Self) extends AnyVal {
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
  }
  
}

