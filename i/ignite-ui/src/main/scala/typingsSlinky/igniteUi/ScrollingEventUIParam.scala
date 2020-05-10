package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollingEventUIParam extends js.Object {
  /**
  	 * Gets if the content is scrolled by the scrollbar track areas. 0 - none used, -1 - Scrolled Up/Left, 1 - Scrolled Down/Right.
  	 */
  var bigIncrement: js.UndefOr[Double] = js.native
  /**
  	 * Gets which axis is being used to scroll - horizontal(true) or vertical(false).
  	 */
  var horizontal: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets a reference to the igScroll.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets if the content is scrolled by the arrows. 0 - none used, -1 - Arrow Up/Left, 1 - Arrow Down/Right.
  	 */
  var smallIncrement: js.UndefOr[Double] = js.native
  /**
  	 * Gets how much the content will be scrolled horizontally.
  	 */
  var stepX: js.UndefOr[Double] = js.native
  /**
  	 * Gets how much the content will be scrolled vertically.
  	 */
  var stepY: js.UndefOr[Double] = js.native
}

object ScrollingEventUIParam {
  @scala.inline
  def apply(): ScrollingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollingEventUIParam]
  }
  @scala.inline
  implicit class ScrollingEventUIParamOps[Self <: ScrollingEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBigIncrement(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bigIncrement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBigIncrement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bigIncrement")(js.undefined)
        ret
    }
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
    def withSmallIncrement(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallIncrement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmallIncrement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallIncrement")(js.undefined)
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

