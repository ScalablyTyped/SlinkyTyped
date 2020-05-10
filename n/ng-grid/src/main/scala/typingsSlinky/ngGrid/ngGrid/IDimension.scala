package typingsSlinky.ngGrid.ngGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDimension extends js.Object {
  var autoFitHeight: js.UndefOr[Boolean] = js.native
  var outerHeight: js.UndefOr[Double] = js.native
  var outerWidth: js.UndefOr[Double] = js.native
}

object IDimension {
  @scala.inline
  def apply(): IDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDimension]
  }
  @scala.inline
  implicit class IDimensionOps[Self <: IDimension] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoFitHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFitHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFitHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFitHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withOuterHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOuterHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withOuterWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOuterWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerWidth")(js.undefined)
        ret
    }
  }
  
}

