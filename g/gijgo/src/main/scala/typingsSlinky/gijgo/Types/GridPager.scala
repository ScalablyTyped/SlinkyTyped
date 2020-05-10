package typingsSlinky.gijgo.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//Grid
@js.native
trait GridPager extends js.Object {
  var leftControls: js.UndefOr[js.Array[_]] = js.native
  var limit: js.UndefOr[Double] = js.native
  var rightControls: js.UndefOr[js.Array[_]] = js.native
  var sizes: js.UndefOr[js.Array[Double]] = js.native
}

object GridPager {
  @scala.inline
  def apply(): GridPager = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridPager]
  }
  @scala.inline
  implicit class GridPagerOps[Self <: GridPager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeftControls(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftControls")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withRightControls(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightControls")(js.undefined)
        ret
    }
    @scala.inline
    def withSizes(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizes")(js.undefined)
        ret
    }
  }
  
}

