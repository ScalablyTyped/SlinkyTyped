package typingsSlinky.operationRetrier.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Initial extends js.Object {
  var initial: js.UndefOr[Double] = js.native
  var max: Double = js.native
  var maxAttemptsCount: js.UndefOr[Double] = js.native
  var maxAttemptsTime: js.UndefOr[Double] = js.native
  var min: Double = js.native
  var randomness: js.UndefOr[Double] = js.native
}

object Initial {
  @scala.inline
  def apply(max: Double, min: Double): Initial = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Initial]
  }
  @scala.inline
  implicit class InitialOps[Self <: Initial] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitial(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initial")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAttemptsCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAttemptsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAttemptsCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAttemptsCount")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAttemptsTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAttemptsTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAttemptsTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAttemptsTime")(js.undefined)
        ret
    }
    @scala.inline
    def withRandomness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("randomness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRandomness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("randomness")(js.undefined)
        ret
    }
  }
  
}

