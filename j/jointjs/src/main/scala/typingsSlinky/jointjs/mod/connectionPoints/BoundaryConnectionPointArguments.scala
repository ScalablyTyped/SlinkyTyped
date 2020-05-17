package typingsSlinky.jointjs.mod.connectionPoints

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoundaryConnectionPointArguments extends StrokeConnectionPointArguments {
  var extrapolate: js.UndefOr[Boolean] = js.native
  var insideout: js.UndefOr[Boolean] = js.native
  var precision: js.UndefOr[Double] = js.native
  var selector: js.UndefOr[(js.Array[String | Double]) | String] = js.native
  var sticky: js.UndefOr[Boolean] = js.native
}

object BoundaryConnectionPointArguments {
  @scala.inline
  def apply(): BoundaryConnectionPointArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoundaryConnectionPointArguments]
  }
  @scala.inline
  implicit class BoundaryConnectionPointArgumentsOps[Self <: BoundaryConnectionPointArguments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtrapolate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extrapolate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtrapolate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extrapolate")(js.undefined)
        ret
    }
    @scala.inline
    def withInsideout(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insideout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsideout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insideout")(js.undefined)
        ret
    }
    @scala.inline
    def withPrecision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(js.undefined)
        ret
    }
    @scala.inline
    def withSelector(value: (js.Array[String | Double]) | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(js.undefined)
        ret
    }
    @scala.inline
    def withSticky(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sticky")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSticky: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sticky")(js.undefined)
        ret
    }
  }
  
}

