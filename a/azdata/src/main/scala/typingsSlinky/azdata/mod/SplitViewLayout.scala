package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SplitViewLayout extends FlexLayout {
  /**
  		 * Orientation of the views inside split
  		 */
  var orientation: String = js.native
  /**
  		 * SplitView height
  		 */
  var splitViewHeight: Double | String = js.native
}

object SplitViewLayout {
  @scala.inline
  def apply(orientation: String, splitViewHeight: Double | String): SplitViewLayout = {
    val __obj = js.Dynamic.literal(orientation = orientation.asInstanceOf[js.Any], splitViewHeight = splitViewHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitViewLayout]
  }
  @scala.inline
  implicit class SplitViewLayoutOps[Self <: SplitViewLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrientation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSplitViewHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitViewHeight")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

