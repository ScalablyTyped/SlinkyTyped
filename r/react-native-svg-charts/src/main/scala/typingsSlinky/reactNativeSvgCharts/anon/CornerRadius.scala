package typingsSlinky.reactNativeSvgCharts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CornerRadius extends js.Object {
  var cornerRadius: js.UndefOr[Double | String] = js.native
  var outerRadius: js.UndefOr[Double | String] = js.native
}

object CornerRadius {
  @scala.inline
  def apply(): CornerRadius = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CornerRadius]
  }
  @scala.inline
  implicit class CornerRadiusOps[Self <: CornerRadius] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCornerRadius(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCornerRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withOuterRadius(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOuterRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerRadius")(js.undefined)
        ret
    }
  }
  
}

