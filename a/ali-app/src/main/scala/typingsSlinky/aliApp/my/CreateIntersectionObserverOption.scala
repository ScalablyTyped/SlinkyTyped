package typingsSlinky.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateIntersectionObserverOption extends js.Object {
  var initialRatio: js.UndefOr[Double] = js.native
  var selectAll: js.UndefOr[Boolean] = js.native
  var thresholds: js.UndefOr[js.Tuple2[Double, Double]] = js.native
}

object CreateIntersectionObserverOption {
  @scala.inline
  def apply(): CreateIntersectionObserverOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateIntersectionObserverOption]
  }
  @scala.inline
  implicit class CreateIntersectionObserverOptionOps[Self <: CreateIntersectionObserverOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitialRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAll")(js.undefined)
        ret
    }
    @scala.inline
    def withThresholds(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thresholds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThresholds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thresholds")(js.undefined)
        ret
    }
  }
  
}

