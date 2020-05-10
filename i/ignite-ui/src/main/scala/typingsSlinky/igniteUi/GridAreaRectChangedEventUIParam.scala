package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridAreaRectChangedEventUIParam extends js.Object {
  /**
  	 * Used to get reference to chart object.
  	 */
  var chart: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to get new height value.
  	 */
  var newHeight: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to get new left value.
  	 */
  var newLeft: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to get new top value.
  	 */
  var newTop: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to get new top value.
  	 */
  var newWidth: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to get old height value.
  	 */
  var oldHeight: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to get old left value.
  	 */
  var oldLeft: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to get old top value.
  	 */
  var oldTop: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to get old top value.
  	 */
  var oldWidth: js.UndefOr[js.Any] = js.native
}

object GridAreaRectChangedEventUIParam {
  @scala.inline
  def apply(): GridAreaRectChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridAreaRectChangedEventUIParam]
  }
  @scala.inline
  implicit class GridAreaRectChangedEventUIParamOps[Self <: GridAreaRectChangedEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChart(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chart")(js.undefined)
        ret
    }
    @scala.inline
    def withNewHeight(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withNewLeft(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withNewTop(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTop")(js.undefined)
        ret
    }
    @scala.inline
    def withNewWidth(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withOldHeight(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withOldLeft(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withOldTop(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldTop")(js.undefined)
        ret
    }
    @scala.inline
    def withOldWidth(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldWidth")(js.undefined)
        ret
    }
  }
  
}

